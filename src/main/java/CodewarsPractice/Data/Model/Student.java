package CodewarsPractice.Data.Model;

/**
 * Student - шаблон студента на основе User
 */
public class Student extends User {
   protected String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", group='" +
                ", age=" + age +
                '}';
    }

    public void getInfoStudent(String name, int age, String studentId) {
        System.out.println("Student:" + name + age + studentId);
    }
}
