class LockingTree {
    int[] lockedUser;
    Node[] nodes;

    class Node {
        Node parent;
        List<Node> children = new ArrayList<>();
        int lockedUser = -1;

        // public Node(Node parent) {
        //     this.parent = parent;
        //     parent.children.append(this);
        // }

        public void upgrade() {
            for (Node child : children) {
                child.lockedUser = -1;
            }
            for (Node child : children) {
                child.upgrade();
            }
        }

        public boolean hasLockedDescendant() {
            for (Node child : children) {
                if (child.lockedUser != -1) {
                    return true;
                }
            }
            for (Node child : children) {
                if (child.hasLockedDescendant()) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasLockedAncestor() {
            if (parent == null) {
                return false;
            }
            if (parent.lockedUser != -1) {
                return true;
            }
            if (parent.hasLockedAncestor()) {
                return true;
            }
            return false;
        }
    }

    public LockingTree(int[] parent) {
        nodes = new Node[parent.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < nodes.length; i++) {
            if (parent[i] == -1) {
                nodes[i].parent = null;
            } else {
                nodes[i].parent = nodes[parent[i]];
                nodes[parent[i]].children.add(nodes[i]);
            }
        }
    }
    
    public boolean lock(int num, int user) {
        if (nodes[num].lockedUser == -1) {
            nodes[num].lockedUser = user;
            return true;
        }
        return false;
    }
    
    public boolean unlock(int num, int user) {
        if (nodes[num].lockedUser == user) {
            nodes[num].lockedUser = -1;
            return true;
        }
        return false;
    }
    
    public boolean upgrade(int num, int user) {
        if (nodes[num].lockedUser == -1 && nodes[num].hasLockedDescendant() && !nodes[num].hasLockedAncestor()) {
            nodes[num].upgrade();
            nodes[num].lockedUser = user;
            return true;
        }
        return false;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */