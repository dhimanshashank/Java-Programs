import java.util.Arrays;

public class Course {
    String courseName;
    int enrolledStudents;
    static int maxCapacity = 10;

    String[] students;

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.students = new String[maxCapacity];
    }

    void enrollStudent(String studentName) {
        if (maxCapacity >= enrolledStudents) {
            System.out.println("Hurray!! " + studentName + " request for enrollment is fulfilled for " + this.courseName + "...." );
            students[enrolledStudents] = studentName;
            enrolledStudents++;
        } else {
            System.out.println("Enrollments are full, please try again later...");
        }
    }

    void unenrollStudent(String studentName) {
        System.out.println(studentName + " request to unenrollment is fulfilled for " + this.courseName +"....");
        students = deleteFromArray(students, studentName);
        this.enrolledStudents--;
    }

    String[] deleteFromArray(String[] students,String studentName) {
        if (students.length == 0) {
            return students;
        } else {
            String[] output = new String[students.length - 1];
            int count = 0;
            for (String i : students) {
                // To ignore the null pointer exception, we need to check whether i != null
                if (i != null && !i.equals(studentName)) {
                    output[count++] = i;
                }
            }
            return output;
        }
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Course");
        Course sqlCourse = new Course("SQL Course");
        javaCourse.enrollStudent("Shashank");
        javaCourse.enrollStudent("Anshika");

        System.out.println("\nTotal Number of students enrolled in " + javaCourse.courseName + " is: " + javaCourse.enrolledStudents);
        System.out.println("Total Number of students enrolled in " + sqlCourse.courseName + " is: " + sqlCourse.enrolledStudents + "\n");

        sqlCourse.enrollStudent("Shashank");
        System.out.println("\nTotal Number of students enrolled in " + sqlCourse.courseName + " is: " + sqlCourse.enrolledStudents + "\n");

        javaCourse.unenrollStudent("Shashank");

        // To further optimize this long list of array of students which have null values -> we can use List to optimize this for efficient memory management
        System.out.println("The students pursuing java course: " + Arrays.toString(javaCourse.students));

        // output here => The students pursuing java course: [Anshika, null, null, null, null, null, null, null, null]
        // Rather storing this in an Array, we can store this in List for dynamic memory allocation...
    }
}
