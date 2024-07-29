public class MVCTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Argha Ghosh", 1, "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Animesh Shah");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
