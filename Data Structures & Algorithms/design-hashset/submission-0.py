class MyHashSet:
    # Possible improvements:
    # - Implement resizing when the load factor gets too high.
    # - Track element count and calculate load factor.
    # - Use a larger (preferably prime) number of buckets.
    # - Consider replacing linked lists with trees for heavy     collisions.

    def __init__(self):
        self.size = 1000
        self.buckets = [None] * self.size


    def add(self, key: int) -> None:
        hashed = key % self.size
        curr = self.buckets[hashed]

        if curr is None:
            self.buckets[hashed] = Node(key)
            return
        
        
        while curr:
            if curr.value == key:
                return
            curr = curr.next
        
        new_node = Node(key)
        new_node.next = self.buckets[hashed]
        self.buckets[hashed] = new_node

        
        

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
    def __init__(self,value):
        self.value = value
        self.next = None

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)