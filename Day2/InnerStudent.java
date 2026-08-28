class Student {

    String name;
    int usn;
    String grade;
    int total_marks;

    private Student(){
        
    }
    void marks() {
        total_marks += 60;
    }

    void details() {

        
        System.out.println(
            "Name : " + name +
            " USN : " + usn +
            " Grade : " + grade +
            " Total marks : " + total_marks
        );
    }
}

public class InnerStudent {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "jagannath";
        student2.name = "darshan";

        student1.usn = 21;
        student2.usn = 14;

        student1.grade = "7th sem";
        student2.grade = "7th sem";

        student1.total_marks = 480;
        student2.total_marks = 500;

        

        System.out.println("------------Details of the student---------");

        student1.marks();

        student1.details();
        student2.details();
    }
}