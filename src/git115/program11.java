package git115;

public class program11 {
	
	public class TeachersRBCA22106 {
	    protected String type;

	    // Constructor
	    public TeachersRBCA22106 (String type) {
	        this.type = type;
	    }

	    // Method to print what the teacher teaches
	    public void teaches() {
	        System.out.println("The teacher is teaching " + type);
	    }
	}

	// Subclass
	class TeacherTeaches extends TeachersRBCA22106 {
	    private String name;

	    // Constructor
	    public TeacherTeaches(String type, String name) {
	        super(type);
	        this.name = name;
	    }

	    // Method to print the subject
	    public void subjects() {
	  System.out.println("The teacher " + name + " is teaching " + type);
	    }
	}
// Main
package Program;

import java.util.Scanner;

public class MainTeachersRBCA22106 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the type of teacher: ");
	        String type = scanner.nextLine();

	        System.out.print("Enter the name of teacher: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter the subject: ");
	        String subject = scanner.nextLine();

	        git115.program11.TeacherTeaches teacher = new git115.program11.TeacherTeaches(subject, name);

	        teacher.teaches();
	        teacher.subjects();
	        
	        scanner.close();
	    }
	}


}
