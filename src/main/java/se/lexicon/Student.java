package se.lexicon;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setMajor(major);
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        if(studentId == 0){
            IO.println("Id cannot be null");
        }
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equalsIgnoreCase("null")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age<6 || age > 70){
            IO.println("Age cannot be less than 6 and greater than 30");
        }else {
            this.age = age;
        }

    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
