package LinkList;

public class FindLengthOfSingleLinkList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int Length() {
        if(head==null)
        {
            return 0;
        }

        ListNode currentNode = head;
        int length = 0;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next; // Fixed this typo
        }
        return length;
    }

    public static void main(String[] args) {
        FindLengthOfSingleLinkList linkList = new FindLengthOfSingleLinkList();
        linkList.head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        linkList.head.next = second;
        second.next = third;
        third.next = fourth;

        linkList.display();  // Displays the list
        System.out.println(); // For a new line after list display
        System.out.println("Length of the linked list: " + linkList.Length()); // Displays the length
    }
}
