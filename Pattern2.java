public class Pattern2 {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=4;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
