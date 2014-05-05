package fachlicheKlassen;

import java.util.ArrayList;
import java.util.List;

import Interfaces.UserInterface;

public class User implements UserInterface{
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
		return true;
	}
	
	public boolean deleteFriend(String uname){
		return true;
	}
	public boolean loadFriendsList(String uname){
		return true;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public void setOrt(Ort ort) {
		this.ort = ort;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
