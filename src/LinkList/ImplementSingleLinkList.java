package LinkList;

public class ImplementSingleLinkList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Display method to print the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ImplementSingleLinkList singleLinkList = new ImplementSingleLinkList();
        singleLinkList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(9);

        // Linking nodes
        singleLinkList.head.next = second;
        second.next = third;
        third.next = fourth;

        // Display the linked list
        singleLinkList.display();
    }
}
