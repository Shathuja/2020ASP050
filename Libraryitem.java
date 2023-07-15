abstract class Libraryitem{
	private String title;
	private String itemid;
	private boolean checkout;
	
	public Libraryitem(String title, String itemid){
		this.title=title;
		this.itemid=itemid;
		this.checkout=false;
	} 
	
	public void checkout(){
		this.checkout=true;
	} 
	
	public void checkin(){
		this.checkout=false;
	} 
	public void displayitemdetails(){
		System.out.println("Title:"+title);
		System.out.println("ItemId:"+itemid);
		System.out.println("check out"+checkout);
		
	}  
	
	public String gettitle(){
		return title;
	} 
	
	public void settitle(String title){
		this.title=title;
	} 
	
	public String getitemid(){
		return itemid;
	} 
	
	public void setitemid(String itemid){
		this.itemid=itemid;
	} 
	
	

}	
	
