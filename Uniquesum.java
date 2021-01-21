package conditionals;

public class Uniquesum {
	public static int unique(int Int1, int Int2, int Int3) {
		int answer = 0;
		if(Int1 == Int2 && Int2 == Int3) {
			answer = Int1;
		}
		if(Int1 == Int2 && Int2 != Int3) {
			answer = Int1 + Int3;
		}
		if(Int1 != Int2 && Int2 == Int3) {
			answer = Int1 + Int2;
		}
		if(Int1 == Int3 && Int2 != Int3) {
			answer = Int2 + Int3;
		}
		if(Int1 != Int2 && Int2 != Int3) {
			answer = Int1 + Int2 + Int3;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("Sum: "+unique(1,1,1));
	}
}
