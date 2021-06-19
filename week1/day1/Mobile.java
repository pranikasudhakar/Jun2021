package week1.day1;

public class Mobile {
	
	public String mobileModel = "Samsung";
	public int mobileWeight =0;
	public boolean isFullCharge = true;
	public double mobileCost = 100.00;
	
	public void makeCall() {
		  System.out.println("MakeCall");
	}

	public void sendMsg() {
		System.out.println("Send Message");
	}
	
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}
}