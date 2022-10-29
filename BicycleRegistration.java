public class BicycleRegistration
{
	public static void main(String[] args){
		Bicycle bike1,bike2,bike3,bike4;
		String owner1,owner2,tagNo,owner,tagNo1;


		bike1=new Bicycle();
		bike1.setOwnerName("Adam Smith");

		bike2=new Bicycle();
		bike2.setOwnerName("Ben Jones");

		bike3= new Bicycle();
		bike3.setTagNo("2004-134R");

		bike4=new Bicycle();
		bike4.setOwnerName("Daniella A. David");
	    bike4.setTagNo("10-16-02");


		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();
		tagNo=bike3.getTagNo();

		owner=bike4.getOwnerName();
		tagNo1=bike4.getTagNo();



	    System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
		System.out.println(tagNo);
	    System.out.println(owner+ " " + tagNo1);
	}
}

