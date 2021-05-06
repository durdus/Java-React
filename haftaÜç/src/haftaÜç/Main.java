package haftaÜç;



public class Main {
	 public static void main(String[] args) {
	        
	        
	        User user = new User(12345, "tane@gmail.com");
	        
	        Student student1 = new Student("Dürdane","Aynur","Matematik",2222,"da@gmaill.com");
	        Student student2 = new Student("Mert","Öztürk","Türkçe",5991,"mö@gmail.com");
	        
	        Instructor instructor = new Instructor("Engin", "Demiroğ", "Matematik", 1, "engin.demirog@gmail.com");
	        
	        
	        UserManager userManager = new UserManager();
	        StudentManager studentManager = new StudentManager();
	        InstructorManager instructorManager = new InstructorManager();
	        
	        
	        
	        userManager.register(student1);
	        userManager.login(student1);
	        userManager.logout(student1);
	        
	        
	        System.out.println("*****************");
	        
	        userManager.register(student2);
	        userManager.login(student2);
	        userManager.logout(student2);
	        
	        System.out.println("*****************");
	         
	        userManager.register(instructor);
	        userManager.login(instructor);
	        userManager.logout(instructor);
	        
	        System.out.println("*****************");
	        
	        
	        userManager.register(user);
	        userManager.login(user);
	        userManager.logout(user);
	        
	        System.out.println("*****************");
	        
	        
	        studentManager.register(user);
	        studentManager.register(student1);
	        studentManager.login(student1);
	        studentManager.logout(student1);
	        studentManager.takeLesson(student1);
	        studentManager.takeLesson(student2);
	        
	        System.out.println("*****************");
	         
	        
	        instructorManager.register(instructor);
	        instructorManager.login(instructor);
	        instructorManager.logout(instructor);
	    }
	    
	}