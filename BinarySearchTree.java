public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) {
            root = new Node(student);
            return root;
        }

        if (student.studentId < root.student.studentId)
            root.left = insertRec(root.left, student);
        else if (student.studentId > root.student.studentId)
            root.right = insertRec(root.right, student);

        return root;
    }

    public Student search(int studentId) {
        return searchRec(root, studentId);
    }

    private Student searchRec(Node root, int studentId) {
        if (root == null || root.student.studentId == studentId)
            return root == null ? null : root.student;

        if (studentId < root.student.studentId)
            return searchRec(root.left, studentId);
        else
            return searchRec(root.right, studentId);
    }

    public void delete(int studentId) {
        root = deleteRec(root, studentId);
    }

    private Node deleteRec(Node root, int studentId) {
        if (root == null)
            return root;

        if (studentId < root.student.studentId)
            root.left = deleteRec(root.left, studentId);
        else if (studentId > root.student.studentId)
            root.right = deleteRec(root.right, studentId);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.student = minValue(root.right);
            root.right = deleteRec(root.right, root.student.studentId);
        }
        return root;
    }

    private Student minValue(Node root) {
        Student minv = root.student;
        while (root.left != null) {
            minv = root.left.student;
            root = root.left;
        }
        return minv;
    }

    public void updateGPA(int studentId, double newGPA) {
        Student student = search(studentId);
        if (student != null) {
            student.gpa = newGPA;
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public double calculateAverageGPA() {
        int[] count = new int[1];
        double totalGPA = calculateTotalGPA(root, count);
        return totalGPA / count[0];
    }

    private double calculateTotalGPA(Node root, int[] count) {
        if (root == null) {
            return 0;
        }

        count[0]++;
        return root.student.gpa + calculateTotalGPA(root.left, count) + calculateTotalGPA(root.right, count);
    }

    public Student findHighestGPAStudent() {
        Node highestNode = findHighestGPA(root);
        return highestNode == null ? null : highestNode.student;
    }

    private Node findHighestGPA(Node root) {
        if (root == null || root.right == null)
            return root;

        return findHighestGPA(root.right);
    }




    public void studentsInGPARange(Node root, double minGPA, double maxGPA) {
        if (root == null)
            return;

        if (root.student.gpa >= minGPA && root.student.gpa <= maxGPA) {
            System.out.println("ID: " + root.student.studentId + ", Name: " + root.student.name + ", GPA: " + root.student.gpa);
        }

        if (root.student.gpa > minGPA)
            studentsInGPARange(root.left, minGPA, maxGPA);

        if (root.student.gpa < maxGPA)
            studentsInGPARange(root.right, minGPA, maxGPA);
    }


    public void studentsAboveThreshold(Node root, double threshold) {
        if (root == null)
            return;

        if (root.student.gpa > threshold) {
            System.out.println("ID: " + root.student.studentId + ", Name: " + root.student.name + ", GPA: " + root.student.gpa);
        }

        studentsAboveThreshold(root.left, threshold);
        studentsAboveThreshold(root.right, threshold);
    }


}
