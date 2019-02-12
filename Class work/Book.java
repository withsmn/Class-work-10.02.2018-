package javaassociation2;

public class Book {

	
	private String name;
	private String price;
	private String editor;
	
	private Author author;
	private Publisher publication;
	
	public Book(String name, String price, String editor) {
		super();
		this.name = name;
		this.price = price;
		this.editor = editor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", editor=" + editor + "]";
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublication() {
		return publication;
	}
	public void setPublication(Publisher publication) {
		this.publication = publication;
	}
	
	
	
	
}
