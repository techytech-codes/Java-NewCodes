public class Pattern1 {

	public static void main(String[] args) {
		for(int r=6;r>=1;r--) {
			for(int c=6;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
