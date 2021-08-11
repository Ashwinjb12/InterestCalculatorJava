public class InterestCalculator {
	public static void main(String[] args )	{
//		double x=simpleInterest(100.0,10.0,5.0);
//		System.out.println(x);
//		double y=compoundInterest(200.0,  15.0,5.0);
//		System.out.println(y);
		InterestCalculator ic=new InterestCalculator();
		
		double x=ic.simpleInterest(100.0,10.0,5.0);
		System.out.println(x);
		double y=ic.compoundInterest(200.0,  15.0,5.0);
	}
//	public  static double simpleInterest (double principal,double rate, double time) {
//		double si=(principal*rate*time)/100;
//		return si;
//	}
//	public static double compoundInterest (double principal,double rate,double time) {
//		double ci=(principal*(1+(rate/100)*time));
//		return ci;
//	}
	public   double simpleInterest (double principal,double rate, double time) {
		double si=(principal*rate*time)/100;
		return si;
	}
	public  double compoundInterest (double principal,double rate,double time) {
		double ci=(principal*(1+(rate/100)*time));
		return ci;
	}
}
