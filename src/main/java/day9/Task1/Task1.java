package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "23");
        Teacher teacher = new Teacher("Vasiliy", "Music");
        student.printInfo();
        System.out.println(student.getGroupName());
        teacher.printInfo();
        System.out.println(teacher.getSubjectName());

    }
}
