class Book extends Libraryitem{
	private String author;
	private int numpages; 
		
	public Book(String title, String itemid,String author,int numpages){
			super(title,itemid);
			this.author=author;
			this.numpages=numpages;
	} 
		
	public void displayitemdetails(){
			super.displayitemdetails();
			System.out.println("Author:"+author);
			System.out.println("Number of pages:"+numpages);
	}
	
	public String getauthor(){
		return author;
	}  
	
	
	public void setauthor(String author){
		this.author=author;
	} 
	public int getnumpages(){
		return numpages;
	}
	public void setnumpages(int numpages){
		this.numpages=numpages;
	} 
}
	