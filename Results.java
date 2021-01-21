package operator;

public class Results {
	private int Physics;
	private int Chemistry;
	private int Biology;
	private int total;
	private double percentage;
	private int examsFailed = 0;
	public Results(int Physics, int Chemistry, int Biology) {
		this.Physics = Physics;
		this.Chemistry = Chemistry;
		this.Biology = Biology;
		this.total = Physics + Biology + Chemistry;
		double total2 = total;
		this.percentage = (total2/450)*100;
		displayPercentage();
	}
	//
	public void displayResults() {
		System.out.println("Physics: "+this.Physics+"/150 \n");
		System.out.println("Biology: "+this.Biology+"/150 \n");
		System.out.println("Chemistry: "+this.Chemistry+"/150 \n");
		System.out.println("Total: "+this.total+"/450 \n");
		System.out.println("Exams failed: "+examsFailed+"\n");
	}
	//
	public void displayPercentage() {
		if(Physics<90) {
			System.out.println("(FAIL) Physics result lower than 60%.\n");
			examsFailed++;
		}
		if(Biology<90) {
			System.out.println("(FAIL) Biology result lower than 60%.\n");
			examsFailed++;
		}
		if(Chemistry<90) {
			System.out.println("(FAIL) Chemistry result lower than 60%.\n");
			examsFailed++;
		}
		if(this.percentage<60) {
			System.out.println("(FAIL) Overall Percentage lower than 60%.\n");
			System.out.printf("Percentage: %.2f %n",this.percentage);
			displayResults();
		}
		if(this.percentage>60){
			displayResults();
			System.out.printf("Percentage: %.2f %n",this.percentage);
			System.out.println("(PERCENTAGE PASS)");
		}
	}
	//
	public static void main(String[] args) {
		
	}
}
