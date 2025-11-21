public class DSA_114 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }

        public static ListNode rotateLinked(ListNode head, int k){
            if(head == null || head.next == null || k == 0){
                return head;
            }
            ListNode tail = head;
            int length = 1;
            while(tail.next != null){
                tail = tail.next;
                length++;
            }
            tail.next = head;
            int steps = length - (k % length);
            ListNode newTail = head;
            while(steps-- > 1){
                newTail = newTail.next;
            }
            ListNode newHead = newTail.next;
            newTail.next = null;
            return newHead;



        }
        public static void Printlist(ListNode head){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val+ "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        System.out.println("------Original linked list ------");
        ListNode.Printlist(node);

        System.out.println("-----ROTATED LINKED LIST-------");
        ListNode.Printlist(ListNode.rotateLinked(node, 2));

    }

}
