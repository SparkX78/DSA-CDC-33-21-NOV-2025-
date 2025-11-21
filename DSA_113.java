public class DSA_113 {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
            this.next = null; 
        }
    
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(0);
            ListNode prev = dummy;
            dummy.next = head;
            ListNode curr = head;
            while(curr != null){
                if(curr.next != null && curr.val == curr.next.val){
                    while(curr.next != null && curr.val == curr.next.val){
                        curr = curr.next;
                    }
                    prev.next = curr.next;
                }
                else{
                    prev = prev.next;
                }
                curr = curr.next;
            }
            return dummy.next;
        }
        public static void printList(ListNode Head){
            ListNode Temp = Head;
            while(Temp != null){
                System.out.print(Temp.val+"->");
                Temp = Temp.next;
            }
            System.out.println("null");

        }
    }

    public static void main(String[] args){
        ListNode node = new ListNode(2);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next.next = new ListNode(8);
        node.next.next.next.next.next.next.next = new ListNode(7);

        System.out.println("ORIGINAL LINKED LIST");
        ListNode.printList(node);

        System.out.println("AFTER DELTELING THE DUPLICATES");
        ListNode.printList(ListNode.deleteDuplicates(node));
        

    }
}
