package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomEst = random.nextInt(4) + 2;

        String studentEstimate = "";
        switch (randomEst) {
            case 2:
                studentEstimate = "неудовлетворительно";
                break;
            case 3:
                studentEstimate = "удовлетворительно";
                break;
            case 4:
                studentEstimate = "хорошо";
                break;
            case 5:
                studentEstimate = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + studentEstimate);
    }
}
