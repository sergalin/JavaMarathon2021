package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Sergey");
        Teacher teacher = new Teacher("Ivan", "Music");

        teacher.evaluate(student);

    }
}
