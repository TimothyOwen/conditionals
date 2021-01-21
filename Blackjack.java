package conditionals;

public class Blackjack {
	public static int play(int Int1, int Int2) {
		int diff1 = 21 - Int1;
		int diff2 = 21 - Int2;
		int answer = 0;
		if (Int1 > 0 && Int2 > 0) {
			if (diff1 < diff2 && diff1 > 0) {
				answer = Int1;
			}
			if (diff2 < diff1  && diff2 > 0) {
				answer = Int2;
			}
			if(diff1 < 0) {
				answer = Int2;
			}
			if(diff2 < 0) {
				answer = Int1;
			}
			if (diff1 == diff2) {
				answer = Int1;
			}
		} 
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("BLACKJACK \n Closest number: "+play(30,19));
	}
}
