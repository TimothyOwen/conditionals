package conditionals;

public class Flowcharts1 {
	public static int flow(int Int1, int Int2, boolean Bool) {
		if(Bool) {
			return Int1 + Int2;
		}
		else {
			return Int1 * Int2;
		}
	}
	public static void main(String[] args) {
		System.out.println(flow(1,2,false));
	}
}
