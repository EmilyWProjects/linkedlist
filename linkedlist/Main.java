//Declare package
package linkedlist;

//Create the main class 
public class Main {

    //Declare arguments
    public static void main(String[] args) {

        //Create a new list
        List list = new List();
        System.out.println("");
        System.out.println("");

        //Add node data
        System.out.println("Added the following nodes:");
        System.out.println("");
        list.append(2);  
        System.out.println("Added 2");
        list.append(4);  
        System.out.println("Added 4");
        list.append(6);  
        System.out.println("Added 6");
        list.append(8);  
        System.out.println("Added 8");
        list.append(10);  
        System.out.println("Added 10");
        
        //Print the list
        System.out.println("");
        System.out.println("");
        System.out.println("Initial list: ");
        System.out.println("");
        list.printList();
        
        //Delete from the beginning
        System.out.println("");
        list.deleteBeginning();
        System.out.println("Deleted the first node: ");
        list.printList();
        
        //Delete from the end
        System.out.println("");
        list.deleteEnd();
        System.out.println("Deleted the end node: ");
        list.printList();
        
        //Delete by a specific value
        System.out.println("");
        list.deleteValue(6); 
        System.out.println("Deleted node 6: ");
        list.printList();
        System.out.println("");
        System.out.println("");
        
    }
}


