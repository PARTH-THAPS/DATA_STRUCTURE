package LinkList;

public class InsertNodeAtFirst {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
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
    public void InsertNode(int value)
    {
        ListNode newNode = new ListNode(value);

        newNode.next=head;
        head=newNode;

    }


    public static void main(String[] args) {
        InsertNodeAtFirst linkList = new InsertNodeAtFirst();
        linkList.head= new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        linkList.head.next = second;
        second.next = third;
        third.next = fourth;

        linkList.InsertNode(12);
        linkList.display();
    }
}
