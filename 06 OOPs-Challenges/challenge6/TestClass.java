package kgcoding.challenge6;

public class TestClass {
    public static void main(String[] args) {

        // Different Person objects are created to check whether they are equal or not
        Person person1 = new Person("Shashank", 21, "001");
        Person person2 = new Person("Shashank", 21, "001");
        Person person3 = new Person("Shashank", 23, "001");

        // Checking for same values of each attributes of objects
        if (person1.equals(person2)){
            System.out.println("Person 1 Id is : " + person1.getId());
            System.out.println("Both the persons objects are equal..");     // output
        } else {
            System.out.println("They are different persons");
        }

        // Checking for the different values of objects
        if (person1.equals(person3)){
            System.out.println("Both the persons objects are equal..");
        } else {
            System.out.println("They are different persons");   // output
        }



        // --------------------------------------------------------------------------------------


        // Checking for same values of each attributes of objects -> HASHCODE
        if (person1.hashCode() == person2.hashCode()){
            System.out.println("\nBoth the persons objects are have same HASHCODE and hence may or may not be the same person..");     // output
            // Checking for same values of each attributes of objects
            if (person1.equals(person2)){
                System.out.println("Both the persons objects are equal..");     // output
            } else {
                System.out.println("They are different persons");
            }
        } else {
            System.out.println("\nThey are different persons and have different HASHCODE..");
        }


        // Checking for same values of each attributes of objects -> HASHCODE
        if (person1.hashCode() == person3.hashCode()){
            System.out.println("\nBoth the persons objects are have same HASHCODE and hence may or may not be the same person..\n");     // output
            // Checking for same values of each attributes of objects
            if (person1.equals(person3)){
                System.out.println("Both the persons objects are equal..");
            } else {
                System.out.println("They are different persons");       // output
            }
        } else {
            System.out.println("\nThey are different persons and have different HASHCODE..");
        }


    }
}
