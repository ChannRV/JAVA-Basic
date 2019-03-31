public class Day{
	public static void main(String[] args){
		int value;
		String day;
		for (value=1;value>8;value++){
			System.out.print("Value of the Day ="+ value);
			switch(value){
				case 1:day="Monday";
				break;
				case 2:day="Tuesday";
				break;
				case 3:day="Wednesday";
				break;
				case 4:day="Thursday";
				break;
				case 5:day="Friday";
				break;
				case 6:day="Saturday";
				break;
				case 7:day="Sunday";
				break;
				default:System.out.print("Invalid day!");
			}
			System.out.print("Day of the week = "+ day);
			System.out.print("Good Bye!");
		}
	}
}