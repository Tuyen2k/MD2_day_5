package bai_tap.bai_tap_2;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Kubo");
        student.setClasses("C06");
        System.out.println(student.getName());
        System.out.println(student.getClasses());

    }
}
