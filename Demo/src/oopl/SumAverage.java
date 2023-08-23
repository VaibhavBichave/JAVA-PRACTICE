package oopl;
class Cal{
	int i,sumo,sume,avgo,avge,n=30;
	Cal(){
		sumo=0;sume=0;
		avgo=0;avge=0;
	}
	
	void sum(){
		for (int i=0;i<=n;i++) {
			if (i%2==0) {
				sume+=i;
			}
			else {
				sumo+=i;
			}
	}}	
	void avg(){
		avgo=sumo/15;
		avge=sume/15;
	}
	void displaye() {
		System.out.println("Average of Even Number::"+avge);
		System.out.println("Sum of Even Number::"+sume);
		System.out.println("Even number are:");
		for (i=0;i<=n;i+=2) {
		System.out.print(i+" ");
	}System.out.println("");
		}
	void displayo() {
		System.out.println("Average of odd Number::"+avgo);
		System.out.println("Sum of odd Number::"+sumo);
		System.out.println("odd number are:");
		for (i=1;i<=n;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
	
}
public class SumAverage {

	public static void main(String[] args) {
		Cal cal=new Cal();
		cal.sum();
		cal.avg();
		cal.displaye();
		System.out.println("");
		cal.displayo();
		
	}
	
	

}
