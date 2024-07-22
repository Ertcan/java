package üçüncü;

public class ÇokBoyutluDiziler {

	public static void main(String[] args) {
		int[][] yas = new int[][] {
		{1,75,10},
		{2,87,13},
		{3,95,15},		
		{4,103,17},
		{5,110,19},
		};
		for(int i = 0; i<yas.length;i++) {
			for(int k= 0; k<yas[0].length;k++) {
				System.out.print(yas[i][k]+" ");
				
			}
			System.out.println();
		}
		System.out.println("---------");
		for(int[] sutun : yas) {
			for(int value : sutun) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}
