package fachlicheKlassen;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String user_name;
	private String password;
	private String email;
	private String vname;
	private String nname;
	private Ort ort;
	
	/* Should be filled only by request with a query*/
	private List<String> friends = new ArrayList<String>();

	/**
	 * Constructor to create a new user, without asking for surname and name
	 * @param uname	Username of the new user
	 * @param password Password of the new user
	 * @param email
	 */
	public User(String uname, String password, String email){
		this.user_name = uname;
		this.password = password;
		this.email = email;
		this.vname = null;
		this.nname = null;
	}
	
	/**
	 * Constructor to create a new user, with asking for surname and name
	 * @param uname	Username of the new user
	 * @param password Password of the new user
	 * @param email Email of the new user
	 * @param vname surname of the new user
	 * @param nname name of the new user
	 */
	public User(String uname, String password, String email, String vname, String nname){
		this.user_name = uname;
		this.password = password;
		this.email = email;
		this.vname = vname;
		this.nname = nname;
	}
	
	/**
	 * This function allows to add a friend to a user.
	 * It checks 
	 * @param uname Username 
	 * @return
	 */
	public boolean addFriend(String uname){
		return false;
	}
	

}
