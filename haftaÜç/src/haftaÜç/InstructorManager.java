package haftaÜç;

public class InstructorManager extends UserManager{
	
	public InstructorManager() {
    }
    

    public void register(Instructor instructor){
        System.out.println(instructor.getFirstName() + "  " + instructor.getLastName() + " adli öðretmen " + instructor.getEmail() + " maili ile sisteme kaydoldu.");
    }
    public void login(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adli öðretmen " + instructor.getEmail() + " maili ile sisteme giris yapti.");
    }
    public void logout(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adli öðretmen " + instructor.getEmail() + " maili ile sistemden cikis yapti.");
    }

    
    
    
}

