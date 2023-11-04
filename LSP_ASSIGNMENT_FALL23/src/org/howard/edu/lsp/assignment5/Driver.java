package org.howard.edu.lsp.assignment5;


public class Driver {
    public static void main(String[] args) {
        // Create a new IntegerSet and add elements
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Display the contents of set1
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create another IntegerSet and add elements
        IntegerSet set2 = new IntegerSet();
        set2.add(2); // Adding a duplicate value
        set2.add(4);
        set2.add(5);

        // Display the contents of set2
        System.out.println("Value of Set2 is: " + set2.toString());

        // Perform union of Set1 and Set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 before union: " + set1.toString());
        System.out.println("Value of Set2 before union: " + set2.toString());
        set1.union(set2); // Union of set1 and set2
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Perform intersection of Set1 and Set2
        System.out.println("Intersection of Set1 and Set2");
        System.out.println("Value of Set1 before intersection: " + set1.toString());
        System.out.println("Value of Set2 before intersection: " + set2.toString());
        set1.intersect(set2); // Intersection of set1 and set2
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Remove an element from Set1
        int itemToRemove = 2;
        System.out.println("Removing " + itemToRemove + " from Set1");
        System.out.println("Value of Set1 before removal: " + set1.toString());
        set1.remove(itemToRemove); // Remove an element
        System.out.println("Value of Set1 after removal: " + set1.toString());

        // Check if Set1 is empty
        System.out.println("Is Set1 empty? " + set1.isEmpty());
    }
}
