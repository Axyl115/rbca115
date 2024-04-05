package git115;

public class program10 {
	public class StudentRBCA22115 {
	    private String name;
	    private int age;
	    private String address;

	    // Constructor with default values
	    public StudentRBCA22115 () {
	        this.name = "Unknown";
	        this.age = 0;
	        this.address = "Not Available";
	    }

	    // Method to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to print student information
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
}
}
// Main
package git115;

public class MainStudentRBCA22106 {
	
	    public static void main(String[] args) {
	        // Creating instances of Student class
	    	StudentRBCA22115  student1 = new StudentRBCA22115 ();
	    	StudentRBCA22115  student2 = new StudentRBCA22115 ();
	    	StudentRBCA22115  student3 = new StudentRBCA22115 ();

	        // Setting information for student1
	        student1.setInfo("John", 20);

	        // Setting information for student2
	        student2.setInfo("Alice", 22, "123 Main St");

	        // Setting information for student3
	        student3.setInfo("Bob", 21, "456 Oak Ave");

	        // Printing information of all students
	        System.out.println("Information of Student 1:");
	        student1.printInfo();

	        System.out.println("Information of Student 2:");
	        student2.printInfo();

	        System.out.println("Information of Student 3:");
	        student3.printInfo();;
	
	}


}
