class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
      words = list(s.split())
      if k < len(words):
        words=words[:k]
      return " ".join(words)