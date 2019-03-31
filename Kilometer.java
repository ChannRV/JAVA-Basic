public class Kilometer{
	public static void main (String args[]){
		int miles, yards;
		double kilometers;

		miles = 26;
		yards = 385;

		kilometers = (26*1.609)+((385/1760.0)*1.609);
		System.out.print("26 miles + 385 yards equal to "+ kilometers);
	}
}