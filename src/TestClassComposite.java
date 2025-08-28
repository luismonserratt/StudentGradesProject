/////////Written by ..: Luis Augusto Monserratt Alvarado //////////////////////
// //////Date Written.: Fall 2024 /////////////////////////////////////////////
// //////Purpose......: Demonstrate the creation and manipulation of Student  //
// //////               objects using composite classes (Date, Name, Student) //
// //////               with an ArrayList in Java.                           //
// TestClassComposite.java


import java.util.ArrayList;

public class TestClassComposite {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Create Name, Date, and Student objects, and add them to the ArrayList
        Name name1 = new Name("John", "A", "Doe");
        Date dob1 = new Date(3, 15, 2000);
        Student student1 = new Student(name1, dob1, 3.8f, 120);

        Name name2 = new Name("Jane", null, "Smith");
        Date dob2 = new Date(7, 22, 1998);
        Student student2 = new Student(name2, dob2, 4.2f, 180);

        students.add(student1);
        students.add(student2);

        // Output the list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
