package Data.Model;

public class Student extends User {
    String studentId;

    public Student(String name, String group, int age, String studentId) {
        super(name, group, age);
        this.studentId = studentId;
    }

    public Student(String studentId, String studentId1) {
        super(studentId);
        this.studentId = studentId1;
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
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }

    public void getInfoStudent(String name, String group, int age, String studentId) {
        System.out.println("Student:" + name + group + age + studentId);
    }
}
