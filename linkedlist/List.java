//Declare package
package linkedlist;

//Create the list class
class List {

    Node head;  

    //Define the node class used to construct the list
    class Node {

        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    //Create methods

    //Append node to list 
    void append(int data) {

        //Check if list is empty
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  
            return;
        }
        //Find the last node and define it for that list
        Node last = head;
        while (last.next != null) {
            last = last.next; 
        }
        last.next = newNode;  

    }

    //Print list 
    void printList() {

        //Indicate the procession of the list
        Node proceed = head;
        while (proceed != null) {
            System.out.print(proceed.data + " --> ");
            proceed = proceed.next;
        }
        System.out.println("End of the list");

    }

    //Delete first node 
    void deleteBeginning() {

        //Check if list is empty
        if (head == null) {
            System.out.println("There is nothing in the list");
            return;
        }
        head = head.next;

    }

    //Delete last node 
    void deleteEnd() {

        //Check if list is empty
        if (head == null) {
            System.out.println("There is nothing in the list");
            return;
        }
        if (head.next == null) { 
            head = null;
            return;
        }
        Node proceed = head;
        while (proceed.next.next != null) {
            proceed = proceed.next;
        }
        proceed.next = null;  

    }

    //Delete node by value
    void deleteValue(int value) {

        //Check if list empty
        if (head == null) {
            System.out.println("There is nothing in the list");
            return;
        }
        if (head.data == value) { 
            head = head.next;
            return;
        }
        //Check if location is empty
        Node proceed = head;
        while (proceed.next != null && proceed.next.data != value) {
            proceed = proceed.next;
        }
        if (proceed.next == null) {
            System.out.println("Node data is not found");
            return;
        }
        proceed.next = proceed.next.next;  

    }

}
