public class dllAddnodefront{
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node with the given data
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


        private Node head; // head of the doubly linked list

        // Constructor to initialize an empty doubly linked list
        public dllAddnodefront() {
            this.head = null;
        }

        // Adding a node at the front of the list
        public void push(int new_data) {
            // 1. Allocate node
            // 2. Put in the data
            Node new_Node = new Node(new_data);

            // 3. Make next of new node as head and previous as null
            new_Node.next = head;
            new_Node.prev = null;

            // 4. Change prev of the head node to new node
            if (head != null)
                head.prev = new_Node;

            // 5. Move the head to point to the new node
            head = new_Node;
        }

        // Display the doubly linked list
        public void displayList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void main(String[] args) {
            dllAddnodefront dll = new dllAddnodefront();
            dll.push(5);
            dll.push(10);
            dll.push(15);

            System.out.println("Doubly Linked List:");
            dll.displayList();
        }
    }


