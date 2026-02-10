package Student_Manangement;

public class Student {


    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }

    public void displayStudent(){
        System.out.println(
                "ID: " + id +
                        ", Name: " + name +
                        ", Age: " + age +
                        ", Marks: " + marks
        );
    }

}
