package Student_Manangement;

import java.util.ArrayList;

public class StudentManager {


    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No students found");
            return;
        }

        for (Student student : students){
            student.displayStudent();
        }
    }

    public void updateMarks(int id, double newMarks){
        for(Student student : students) {
            if (student.getId() == id){
                student.setMarks(newMarks);
                System.out.println("Marks update successfully!");
                return;
            }
        }
        System.out.println("Student not found. ");
    }




}
