package conditionals;

public class Taxes {
	public static double percentage(double salary) {
		int rate = 0;
		if(salary>14999) {
			rate = 10;
			if(salary>19999) {
				rate = 15; 
				if(salary>29999) {
					rate = 20;
					if(salary>44999) {
						rate = 25;
					}
				}
			}
		}
		return rate;
	}
	public static double tax(double salary) {
		double rate = percentage(salary);
		double tax = rate/100 * salary;
		return tax;
	}
	public static void main(String[] args) {
		System.out.println("Percentage: "+percentage(270000)+"%"+"\n");
		System.out.println("Tax to pay: "+tax(270000)+"\n");
	}
}
