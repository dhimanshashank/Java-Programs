import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getGrade(), o1.getGrade());
            }
        });

        queue.offer(new Student("Shashank", 100));
        queue.offer(new Student("Anshika", 90));

        // Iterate and print student information
        System.out.println("Queue:");
        for (Student student : queue) {
            System.out.println(student);
        }
    }

    private static class Student {
        private final String name;
        private final int grade;

        @Override
        public String toString() {
            return name + ": " + grade;
        }

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }
    }
}