package javaassociation2;
  
public class Author {

	private String name;
	private String contactInfo;
	private String email;
	public Author(String name, String contactInfo, String email) {
		super();
		this.name = name;
		this.contactInfo = contactInfo;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", contactInfo=" + contactInfo + ", email=" + email + "]";
	}
	
	
}
