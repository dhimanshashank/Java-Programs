public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Shashank";
        String lastName = "Dhiman";
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("Your full name is: " + fullName.toUpperCase());
    }
}
