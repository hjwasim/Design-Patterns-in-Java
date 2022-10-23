package Model;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String gender;

    public Student(String name, int rollNo, int age, String gender) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Student name='" + name + "', Student Roll No.=" + rollNo + ",Student age=" + age +",Student gender='" + gender + "'";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
