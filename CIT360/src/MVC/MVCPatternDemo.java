package MVC;

public class MVCPatternDemo {
	   public static void main(String[] args) {

	     
	      Student model  = retriveStudentFromDatabase();
	      StudentView view = new StudentView();
	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      
	      controller.setStudentName("Nate");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Nathan");
	      student.setRollNo("1");
	      return student;
	   }
	}
