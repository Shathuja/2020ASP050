class Magazine extends Libraryitem{
	private String issuedate;
	private String publisher;
	
	public Magazine(String title, String itemid,String issuedate,String publisher){
		super(title,itemid);
		this.issuedate=issuedate;
		this.publisher=publisher;
	}
	

	public void displayitemdetails(){
		super.displayitemdetails();
		System.out.println("Issue Date"+issuedate);
		System.out.println("Publisher:"+publisher);
	
	}
}