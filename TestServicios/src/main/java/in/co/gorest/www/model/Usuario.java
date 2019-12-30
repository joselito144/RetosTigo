package in.co.gorest.www.model;

public class Usuario {

	private String first_name;
	private String last_name;
	private String gender;
	private String email;
	private String status;
	
	public Usuario(	String first_name, String last_name, String gender, String email, String status) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.email = email;
		this.status = status;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getStatus() {
		return this.status;
	}
	
}
