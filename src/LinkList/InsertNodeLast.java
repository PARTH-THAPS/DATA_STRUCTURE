package LinkList;

public class InsertNodeLast {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void InsertNode(int value) {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head=newNode;
            return;
        }


        ListNode current=head;
        while (current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;


    }

    // Method to display the list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertNodeLast linkList = new InsertNodeLast();
        linkList.head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        linkList.head.next = second;
        second.next = third;
        third.next = fourth;

        // Insert node at the end
        linkList.InsertNode(12);

        // Display the list
        linkList.display();
    }
}
