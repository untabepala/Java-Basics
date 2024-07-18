public class dllAddnodebeforegivennode {
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
        public dllAddnodebeforegivennode() {
            this.head = null;
        }

        // Given a node as next_node, insert a new node before the given node
        public void InsertBefore(Node next_Node, int new_data) {
            // Check if the given next_node is NULL
            if (next_Node == null) {
                System.out.println("The given next node cannot be NULL ");
                return;
            }
            // 1. Allocate node
            // 2. Put in the data
            Node new_node = new Node(new_data);
            // 3. Make previous of new node as previous of next_node
            new_node.prev = next_Node.prev;
            // 4. Make the prev of next_node as new_node
            next_Node.prev = new_node;
            // 5. Make next_node as next of new_node
            new_node.next = next_Node;
            // 6. Change next of new_node's previous node
            if (new_node.prev != null)
                new_node.prev.next = new_node;
            else
                head = new_node;
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

        public static void main(String[] args) {
            dllAddnodebeforegivennode dll = new dllAddnodebeforegivennode();
            dll.InsertBefore(dll.head, 5);
            dll.InsertBefore(dll.head, 10);
            dll.InsertBefore(dll.head.next, 15);

            System.out.println("Doubly Linked List:");
            dll.displayList();
        }
    }



