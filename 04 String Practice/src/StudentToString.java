public class StudentToString {
    int age, rollNumber;
    String name, address;

    public StudentToString(int age, int rollNumber, String name, String address) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student Details: " +
                "{Name: " + name +
                ", Roll number:" + rollNumber +
                ", Age: " + age +
                ", Address: " + address +
                "}";
    }

    public static void main(String[] args) {
        StudentToString student1 = new StudentToString(21,2104,"Shashank", "Delhi");

        // By default, toString method will return ClassName@{HashCode of object}

        // Calling the by default toString() method -> StudentToString@7b23ec81
        // System.out.println(student1);

        // toString() method which is overwritten -> Student Details: {Name: Shashank, Roll number:2104, Age: 21, Address: Delhi}
        System.out.println(student1);
    }
}
