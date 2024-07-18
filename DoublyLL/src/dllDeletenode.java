public class dllDeletenode {
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
        public dllDeletenode() {
            this.head = null;
        }

        // Add a node at the end of the list
        public void append(int new_data) {
            // 1. allocate node
            // 2. put in the data
            Node new_node = new Node(new_data);
            Node last = head; /* used in step 5 */
            // 3. This new node is going to be the last node, so
            // make next of it as NULL
            new_node.next = null;
            // 4. If the Linked List is empty, then make the new
            // node as head
            if (head == null) {
                new_node.prev = null;
                head = new_node;
                return;
            }
            // 5. Else traverse till the last node
            while (last.next != null)
                last = last.next;
            // 6. Change the next of last node
            last.next = new_node;
            // 7. Make last node as previous of new node
            new_node.prev = last;
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

        // Delete a node with the given key from the doubly linked list
        public void deleteNode(int key) {
            Node current = head;

            // Find the node to be deleted
            while (current != null && current.data != key) {
                current = current.next;
            }

            // If the node with the key is found
            if (current != null) {
                // Adjust the next of the previous node
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    // If the node to be deleted is the head
                    head = current.next;
                }

                // Adjust the prev of the next node
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }

        public static void main(String[] args) {
            dllDeletenode dll = new dllDeletenode();
            dll.append(5);
            dll.append(10);
            dll.append(15);

            System.out.println("Doubly Linked List before deletion:");
            dll.displayList();

            int keyToDelete = 10;
            dll.deleteNode(keyToDelete);

            System.out.println("Doubly Linked List after deleting node with key " + keyToDelete + ":");
            dll.displayList();
        }
    }


