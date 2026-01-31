package Super_keyWord;

public class Main {
    public static void main(String[] args){

        //super = Refers to the parent class (subclass <- superclass)
        //        used in constructors and methods overriding
        //        Calls the parent constructor to initialize attributes

        Person person = new Person("Nyakallo", "Mahlakametsa");
        Student student = new Student("Tumisang", "Last", 3.5);
        Employee employee = new Employee("Hlapi", "Mpedi", 5444);

        person.showName();
        student.showName();
        System.out.println(student.gpa);

        employee.showSalary();
    }
}
