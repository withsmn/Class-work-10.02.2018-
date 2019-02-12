package javaassociation2;

public class Publisher {

	
	private String Publication;
	private String Address;
	public Publisher(String publication, String address) {
		super();
		Publication = publication;
		Address = address;
	}
	public String getPublication() {
		return Publication;
	}
	public void setPublication(String publication) {
		Publication = publication;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Publisher [Publication=" + Publication + ", Address=" + Address + "]";
	}
	
}
