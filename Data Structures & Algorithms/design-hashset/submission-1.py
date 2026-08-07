class MyHashSet:

    def __init__(self):
        self.size = 769
        self.buckets = [None] * self.size

    def add(self, key: int) -> None:
        hashed = key % self.size
        curr = self.buckets[hashed]
        
        if curr is None:
            self.buckets[hashed] = Node(key)
            return

        prev = None
        while curr:
            if curr.value == key:
                return
            prev = curr
            curr = curr.next

        prev.next = Node(key)
            
        #[1], [2], [3]

    def remove(self, key: int) -> None:
        hashed = key % self.size
        curr = self.buckets[hashed] 
        
        if curr is None:
            return

        if curr.value == key:
            self.buckets[hashed] = curr.next
            return
        
        prev = curr
        curr = curr.next
        while curr:
            if curr.value == key:
                prev.next = curr.next
                return

            prev = curr
            curr = curr.next


    def contains(self, key: int) -> bool:
        hashed = key % self.size
        curr = self.buckets[hashed]

        if curr is None:
            return False

        while curr:
            if curr.value == key:
                return True
            curr = curr.next
        
        return False


        
class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)