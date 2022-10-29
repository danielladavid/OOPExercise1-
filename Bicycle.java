import java.security.acl.*; class Bicycle
{
	private String ownerName;
	private String tagNo;
	public Bicycle(){
		ownerName="unkown";
		tagNo="unknown";
	}
	public Bicycle(String TagNo2, String name){
	    tagNo=TagNo2;
		ownerName=name;
	}
	public String getTagNo(){
		return tagNo;
	}
    public void setTagNo(String TagNo){
		tagNo=TagNo;
	}
	public String getOwnerName(){
		return ownerName;
	}

	public void setOwnerName(String name){
		ownerName= name;


	}
}
