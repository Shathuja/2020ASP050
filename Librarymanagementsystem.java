class Librarymanagementsystem{
	public static void main(String[] args){
		Book book1 = new Book("The catcher in the Rye","B001","J.D.Salinger",240);
		Book book2 = new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book book3 = new Book("1984","B003","George Orwell",328);
		Book book4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book book5 = new Book("The Hobbit","B005","Tolkien",320);
		
		Magazine magazine1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine magazine2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		Magazine magazine3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine magazine4=new Magazine("Vogue","M004","July 2023","Conde Nast");
		Magazine magazine5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember member1=new LibraryMember("L001","John Doe");
		LibraryMember member2=new LibraryMember("L002","Jane Smith");
		LibraryMember member3=new LibraryMember("L003","David Johnson");
		LibraryMember member4=new LibraryMember("L004","Emily Brown");
		LibraryMember member5=new LibraryMember("L005","Michael Wilson");
		
		
		book1.setauthor("J.D.Salinger");
		book2.setauthor("Harper Les");
		book3.setauthor("George Orwell");
		book4.setauthor("Jane Austen");
		book5.setauthor("J.R.R.Tolkien");
		
		
		book1.checkout();
		book1.checkin();
		
		System.out.println("Books details:");
		book1.displayitemdetails();
		
		book2.displayitemdetails();
		
		book3.displayitemdetails();
		System.out.println();
		book4.displayitemdetails();
		System.out.println();
		book5.displayitemdetails();
		System.out.println();
		
		System.out.println("Magazines:");
		magazine1.displayitemdetails();
		System.out.println();
		magazine2.displayitemdetails();
		System.out.println();
		magazine3.displayitemdetails();
		System.out.println();
		magazine4.displayitemdetails();
		System.out.println();
		magazine5.displayitemdetails();
		System.out.println();
		
		
		System.out.println("Library Members:");
		member1.displayitemdetails();
		System.out.println();
		member2.displayitemdetails();
		System.out.println();
		member3.displayitemdetails();
		System.out.println();
		member4.displayitemdetails();
		System.out.println();
		member5.displayitemdetails();
		System.out.println();
	}
}