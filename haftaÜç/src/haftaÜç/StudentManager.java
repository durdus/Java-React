package haftaÜç;

public class StudentManager extends UserManager{
  

    public StudentManager() {
        
    }
    
    public void register(Student student){
        System.out.println(student.getFirstName() + "  " + student.getLastName() + " " + student.getEmail() + " maili ile sisteme kaydoldu.");
    }
    public void login(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getEmail() + " maili ile sisteme giris yapti.");
    }
    public void logout(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() +  " " + student.getEmail() + " maili ile sistemden cikis yapti.");
    }

    public void takeLesson(Student student) {
       System.out.println(student.getFirstName() + " " + student.getLastName() + " adli ogrenci " + student.getId() + " idli kullanici ders aldi.");
   }
    
   
}

