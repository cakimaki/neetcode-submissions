/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node, Node> oldToCopy = new HashMap<>();

        Node curr = head;
        while(curr != null){
            oldToCopy.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while(curr!=null){
            Node node = oldToCopy.get(curr);
            node.next = oldToCopy.get(curr.next);
            node.random = oldToCopy.get(curr.random);
            curr = curr.next;
        }

        return oldToCopy.get(head);
    }
}
