public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();


        bst.insert(new Student(101, "Kamal", 3.8));
        bst.insert(new Student(102, "Nimal", 3.5));
        bst.insert(new Student(103, "Sunil", 3.9));
        bst.insert(new Student(104, "Lalitha", 3.7));
        bst.insert(new Student(105, "Wimala", 4.0));

        Student searchedStudent = bst.search(103);
        if (searchedStudent != null) {
            System.out.println("Searched Student: ID - " + searchedStudent.studentId +
                    ", Name - " + searchedStudent.name + ", GPA - " + searchedStudent.gpa);
        } else {
            System.out.println("Student not found.");
        }


        bst.delete(102);


        bst.updateGPA(101, 4.2);


        double averageGPA = bst.calculateAverageGPA();
        System.out.println("Average GPA: " + averageGPA);


        Student highestGPAStudent = bst.findHighestGPAStudent();
        if (highestGPAStudent != null) {
            System.out.println("Student with the highest GPA: ID - " + highestGPAStudent.studentId +
                    ", Name - " + highestGPAStudent.name + ", GPA - " + highestGPAStudent.gpa);
        } else {
            System.out.println("No student found.");
        }

        // Additional functionalities:
        // Find students within a specified GPA range
        System.out.println("Students in GPA range 3.5 to 4.0:");
        bst.studentsInGPARange(bst.root, 3.5, 4.0);

        // Find students with GPA above a certain threshold
        System.out.println("Students with GPA above 3.8:");
        bst.studentsAboveThreshold(bst.root, 3.8);
    }


}

