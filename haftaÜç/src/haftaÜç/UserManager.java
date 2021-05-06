package haftaÜç;

public class UserManager {
	 public UserManager() {
	    }
	    
	    public void register(User user){
	        System.out.println(user.getId() + " idli kullanici " + user.getEmail() + " maili ile sisteme kaydoldu.");
	    }
	    public void login(User user){
	        System.out.println(user.getId() + " idli kullanici " + user.getEmail() + " maili ile sisteme giris yapti.");
	    }
	    public void logout(User user){
	        System.out.println(user.getId() + " idli kullanici " + user.getEmail() + " maili ile sistemden cikis yapti.");
	    }
	}
	
	
		
	
