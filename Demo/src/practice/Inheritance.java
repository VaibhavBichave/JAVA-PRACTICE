package practice;
 class Bank{
	 int a=4;
	protected  Bank(){
		//System.out.println("hello");
	}
	protected String s;
	protected void RateOfInterest(){
		System.out.println("Rate of Interest for "+s);
	}

}
class SBI extends Bank{
	int a =6;
	SBI(){s="SBI is 7%";}
}
class ICICI extends Bank{
	ICICI(){s="ICICI is 8%";}
}
class Union extends Bank{
	Union(){s="Union is 9%";}
}
public class Inheritance {

	public static void main(String[] args) {
		Bank sbi =new SBI();
		sbi.RateOfInterest();
		System.out.println(sbi.a);
		Bank icici =new ICICI();
		icici.RateOfInterest();
		Bank union =new Union();
		union.RateOfInterest();
	}

}
