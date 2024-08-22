package objectOrientedProgramming;

public class Book {
     
	String title, author;
    int price;
    
    //Default Constructor
	public Book() {
		this.title="Java";
		this.author="James Gosling";
		this.price=1500;
		
	}
	//Parameterized Constructor
	public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

	// create a Method Called displayInfo()
	public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
	


	public static void main(String[] args) {
		Book b = new Book();
		b.displayInfo();
		
		Book book2 = new Book("1984", "George Orwell", 90);
        System.out.println("\nBook 2 (Parameterized Constructor):");
        book2.displayInfo();

        // Using copy constructor
        Book book3 = new Book(book2);
        System.out.println("\nBook 3 (Copy Constructor):");
        book3.displayInfo();

		
		

	}

}
