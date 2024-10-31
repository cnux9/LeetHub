class Solution {
    public long countPairs(int n, int[][] edges) {
        if(edges.length==0) {
            return (long)n*(n-1);
        }

        Node[] nodes = new Node[n];
        for (int i=0;i<n;i++) {
            nodes[i] = new Node();
        }
        
        // 엣지를 담은 배열을 forEach로 그래프들을 연결
        for (int[] edge : edges) {
            int nodeIndex1 = edge[0];
            int nodeIndex2 = edge[1];
            nodes[nodeIndex1].linked.add(nodeIndex2);
            nodes[nodeIndex2].linked.add(nodeIndex1);
        }

        // 그래프를 구성 노드의 번호의 셋으로 정리
        ArrayList<Integer> sizes = new ArrayList<>();
        HashSet<Integer> queue = IntStream.range(0, n).boxed().collect(Collectors.toCollection(HashSet::new));
        
        while(!queue.isEmpty()) {
            int target = queue.iterator().next();
            queue.remove(target);
            
            HashSet<Integer> bfsQueue = new HashSet<>(); //사실 이건 중간을 삭제할 일이 없어서 진짜 큐인 링크드리스트 써도 될지도
            bfsQueue.add(target);
            int size=0;
            while (!bfsQueue.isEmpty()) {
                int node = bfsQueue.iterator().next();
                bfsQueue.remove(node);
                size++;

                for (int linkedNode : nodes[node].linked) {
                    if (queue.contains(linkedNode)) {
                        bfsQueue.add(linkedNode);
                        queue.remove(linkedNode); //연결된 그래프에 있는 노드들은 총 대기열에서도 검사할 필요없음
                    }
                }
            }
            sizes.add(size);
            //

        }



        // 그래프는 완성! 크기를 구한다.
        // int[] sizes = new int[graphs.size()];
        // int i=0;
        // for (HashSet<Integer> graph : graphs) {
        //     sizes[i] = graph.size();
        //     i++;
        // }

        // 마지막 연결되지 않은 페어의 개수를 구한다.
        System.out.println(sizes.toString());
        int sizeSum = sizes.stream().mapToInt(Integer::intValue).sum();
        long unlinkedParisNum = 0;
        for (int size : sizes) {
            unlinkedParisNum += (long)size * (sizeSum - size);
        }
        // System.out.println("sizes: " + sizes.toString());
        return unlinkedParisNum/2;
    }

    public class Node {
        public HashSet<Integer> linked = new HashSet<Integer>();
        public void Node() {
            // this.linked = new HashSet<Integer>();
        }
    }
}