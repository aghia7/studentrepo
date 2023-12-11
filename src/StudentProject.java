import models.Student;

public class StudentProject {
    public static void main(String[] args)
    {
        Student[] students = new Student[] {
                new Student("Bake", "Bakebayev", 3.5),
                new Student("Sake", "Sakebayev", 3.5),
                new Student("Dake", "Dakebayev", 3.5)
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}