package gun5_Odev1_ETicaret.dataAccess.concretes;

import java.util.List;

import gun5_Odev1_ETicaret.dataAccess.abstracts.UserDao;
import gun5_Odev1_ETicaret.entities.concretes.User;

public class InstructorUserDao implements UserDao{

	@Override
	public void signIn(User user) {
		System.out.println("E�itmen, basarili bir �ekilde giri� yapt�.");				
	}

	@Override
	public void signUp(User user) {
		
		System.out.println("E�itmen: '"+user.getEmail()+"' kaydoldu.");		
	}

	@Override
	public User get(int email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
