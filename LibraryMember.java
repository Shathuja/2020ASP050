class LibraryMember{
	private String memberid;
	private String name;
	
	public LibraryMember(String memberid, String name){
		this.memberid=memberid;
		this.name=name;
	}
	public void displayitemdetails(){
		System.out.println("Member ID:"+memberid);
		System.out.println("Name:"+name);
	}
}