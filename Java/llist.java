class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}



public class llist {
    Node head;
    public void InsertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void InsertAfter(Node d, int data) {
        if(d == null) { 
            System.out.println("The given previous node must be in Linked List");
        }

        Node node = new Node(data);
        node.next = d.next;
        d.next = node; 
    }

    public void InsertAtEnd(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        node.next = null;
        Node d = head;
        while(d.next != null) {
            d = d.next;   
        }

        d.next = node;
        return;
    }

    public void DeleteNode(int position) {
        if(head == null) {
            return;
        }

        Node temp = head;

        if(position == 0) {
            head = temp.next;
            temp = null;
            return;
        }

        for(int i = 0 ; i < position - 1; i++) {
            temp = temp.next;
            if(temp == null) {
                break;
            }
        }
        if(temp == null) {
            return;
        }

        if(temp.next == null) {
            return;
        }

        Node next = temp.next.next;

        

        temp.next = next;

        
    }

    public boolean Search(Node head,int key) {
        Node current = head;

        while(current != null) {
            if(current.data == key) {
                return true;
            } 
            current = current.next;
        }
        return false;
    }

    public void SortLinkedList(Node head) {
        Node current = head;
        Node index = null;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }

        }
        
    }

    public void PrintList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        llist list = new llist();
        list.InsertAtEnd(1);
        list.InsertAtBeginning(2);
        list.InsertAtBeginning(3);
        list.InsertAtEnd(4);
        list.InsertAfter(list.head.next, 5);

        System.out.println("Linked List: ");
        list.PrintList();

        System.out.println("\nAfter deleting an element: ");
        list.DeleteNode(3);
        list.PrintList();

        System.out.println();
        int item_to_find = 3;
        if(list.Search(list.head, item_to_find)) {
            System.out.println(item_to_find + " is found");
        }
        else {
            System.out.println(item_to_find + " is not found");
        }

        list.SortLinkedList(list.head);
        System.out.println("Sorted List: ");
        list.PrintList();

    }
}
