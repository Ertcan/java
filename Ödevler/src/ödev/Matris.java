package ödev;
import java.util.Scanner;
public class Matris {
final public int[][] arr = {
{1,2,-1},
{2,3,1},
{-1,1,2}
};
final public int[][] arr2 = {
{1,4,9},
{0,1,-7},
{0,0,1}
};
double detsonuc=0;
int det=0,detn=0;
public int[][] toplam = new int[3][3];
public double[][] toplam2 = new double[3][3];
Scanner input = new Scanner(System.in);
Matris() {
}
public void toplama(){
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
		toplam[i][j] = arr[i][j]+arr2[i][j];	
		}
	}
toplamyazdir();
}
public void cıkarma() {
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
		toplam[i][j] = arr[i][j]-arr2[i][j];	
		}
	}
	toplamyazdir();
}
public void carpma() {
	for(int i =0; i<=2;i++) {
		toplam[i][0]=arr[i][0]*arr2[0][i];
	}
	for(int i =0; i<=2;i++) {
		toplam[i][1]=arr[i][1]*arr2[1][i];
	}
	for(int i =0; i<=2;i++) {
		toplam[i][2]=arr[i][2]*arr2[2][i];
	}
	toplamyazdir();
}
public void determinant() {
	int a=0;
	System.out.println("Hangi matrisin determinantı almak istersiniz?");
	a=input.nextInt();
	if(a==1) {
		detHesaparr();
	System.out.println("1.Matrisin determinantı => "+detsonuc);
	}
	if(a==2) {
		detHesaparr2();
		System.out.println("2.Matrisin determinantı => "+detsonuc);
	}	
}
public void ters() {
	int t=0;
	System.out.println("Hangi matrisin tersini istersiniz ?");
	t = input.nextInt();
	if(t==1) {
		detHesaparr();
		arrTersi();
		System.out.println(detsonuc);
		for(int i = 0; i<toplam2.length;i++) {
			for(int j=0;j<toplam2[0].length;j++) {
				if(toplam2[i][j]<10 && toplam2[i][j]>=0) {
					System.out.print(" ");
				}
				System.out.print(toplam2[i][j]+" ");
			}
			System.out.println("\t");
			System.out.println("\t");
		}
}
if(t==2) {

	detHesaparr2();
	arr2Tersi();
	for(int i = 0; i<toplam2.length;i++) {
		for(int j=0;j<toplam2[0].length;j++) {
			if(toplam2[i][j]<10 && toplam2[i][j]>=0) {
				System.out.print(" ");
			}
			System.out.print(toplam2[i][j]+" ");
		}
		System.out.println("\t");
		System.out.println("\t");
	}
}
}
public void sabitcarpma(int sayi) {
	int s=0;
	System.out.println("Hangi matrisin çarpılmasını istiyorsunuz ?");
	s = input.nextInt();
	System.out.println("Kaç ile çarpılsın ?");
	sayi = input.nextInt();
	if(s==1) {
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				toplam[i][j]=arr[i][j];
			}
		}
	for(int i = 0; i<=2;i++) {
		for(int j = 0; j<=2; j++) {
			toplam[i][j]*=sayi;	
		}	
	}
toplamyazdir();
}
	if(s==2) {
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				toplam[i][j]=arr[i][j];
			}
		}
		for(int i = 0; i<=2;i++) {
			for(int j = 0; j<=2; j++) {
			toplam[i][j]*=sayi;	
			}
		}
toplamyazdir();
	}
}
public void goster() {
	System.out.println("1.Matrisiniz bu şekildedir.");
arryazdir();
	System.out.println("2.Matrisiniz bu şekildedir.");
arr2yazdir();
}
public void involitif() {
	int secim=0;
	int[][] involtif = {
			{1 ,0 ,0},
			{0, 1, 0},
			{0, 0, 1}
	};
	System.out.println("Hangi matrisin involitifine bakmak istersiniz ?");
	secim = input.nextInt();
	if(secim==1) {
		for(int i =0; i<=2;i++) {
			toplam[i][0]=arr[i][0]*arr[0][i];
		}
		for(int i =0; i<=2;i++) {
			toplam[i][1]=arr[i][1]*arr[1][i];
		}
		for(int i =0; i<=2;i++) {
			toplam[i][2]=arr[i][2]*arr[2][i];
		}
		if((toplam[2][2]==involtif[2][2])&&(toplam[0][0]==involtif[0][0])&&(toplam[0][1]==involtif[0][1])&&(toplam[0][2]==involtif[0][2])&&(toplam[1][0]==involtif[1][0])&&(toplam[1][1]==involtif[1][1])&&(toplam[1][2]==involtif[2][0])&&(toplam[2][1]==involtif[2][1])) {
			System.out.println("Matris involtifdir.");
		}
		else {
			System.out.println("Matris involtif değildir.");
		}
	}
	if(secim==2) {
		for(int i =0; i<=2;i++) {
			toplam[i][0]=arr2[i][0]*arr2[0][i];
		}
		for(int i =0; i<=2;i++) {
			toplam[i][1]=arr2[i][1]*arr2[1][i];
		}
		for(int i =0; i<=2;i++) {
			toplam[i][2]=arr2[i][2]*arr2[2][i];
		}
		if((toplam[2][2]==involtif[2][2])&&(toplam[0][0]==involtif[0][0])&&(toplam[0][1]==involtif[0][1])&&(toplam[0][2]==involtif[0][2])&&(toplam[1][0]==involtif[1][0])&&(toplam[1][1]==involtif[1][1])&&(toplam[1][2]==involtif[2][0])&&(toplam[2][1]==involtif[2][1])) {
			System.out.println("Matris involtifdir.");
		}
		else {
			System.out.println("Matris involtif değildir.");
		}
	}
}
public void toplamyazdir() {
	for(int i = 0; i<toplam.length;i++) {
		for(int j=0;j<toplam[0].length;j++) {
			if(toplam[i][j]<10 && toplam[i][j]>=0) {
				System.out.print(" ");
			}
			System.out.print(toplam[i][j]+" ");
		}
		System.out.println("\t");
		System.out.println("\t");
	}
}
public void arryazdir() {
	for(int i = 0; i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]<10 && arr[i][j]>=0) {
				System.out.print(" ");
			}
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("\t");
		System.out.println("\t");
}
}
public void arr2yazdir() {
	for(int i = 0; i<arr2.length;i++) {
		for(int j=0;j<arr2[0].length;j++) {
			if(arr2[i][j]<10 && arr2[i][j]>=0) {
				System.out.print(" ");
			}
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println("\t");
		System.out.println("\t");
}
}
public void detHesaparr() {
	det=(arr[0][0]*arr[1][1]*arr[2][2])+(arr[1][0]*arr[2][1]*arr[0][2])+(arr[2][0]*arr[0][1]*arr[1][2]);
	detn=(arr[0][2]*arr[1][1]*arr[2][0])+(arr[1][2]*arr[2][1]*arr[0][0])+(arr[2][2]*arr[0][1]*arr[1][0]);
	detsonuc=det-detn;
}
public void detHesaparr2() {
	det=(arr2[0][0]*arr2[1][1]*arr2[2][2])+(arr2[1][0]*arr2[2][1]*arr2[0][2])+(arr2[2][0]*arr2[0][1]*arr2[1][2]);
	detn=(arr2[0][2]*arr2[1][1]*arr2[2][0])+(arr2[1][2]*arr2[2][1]*arr2[0][0])+(arr2[2][2]*arr2[0][1]*arr2[1][0]);
	detsonuc=det-detn;
}
public void arrTersi() {
	double[][] tersi = new double[3][3];
	tersi[0][0] = Math.pow(-1,2)*((arr[1][1]*arr[2][2])-(arr[1][2]*arr[2][1]));
	tersi[0][1] = Math.pow(-1,3)*((arr[1][0]*arr[2][2])-(arr[1][2]*arr[2][0]));
	tersi[0][2] = Math.pow(-1,4)*((arr[1][0]*arr[2][1])-(arr[1][1]*arr[2][0]));
	tersi[1][0] = Math.pow(-1,3)*((arr[0][1]*arr[2][2])-(arr[0][2]*arr[2][1]));
	tersi[1][1] = Math.pow(-1,4)*((arr[0][0]*arr[2][2])-(arr[0][2]*arr[2][0]));
	tersi[1][2] = Math.pow(-1,5)*((arr[0][0]*arr[2][1])-(arr[0][1]*arr[2][0]));
	tersi[2][0] = Math.pow(-1,4)*((arr[0][1]*arr[1][2])-(arr[0][2]*arr[1][1]));
	tersi[2][1] = Math.pow(-1,5)*((arr[0][0]*arr[1][2])-(arr[0][2]*arr[1][0]));
	tersi[2][2] = Math.pow(-1,6)*((arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]));
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			toplam2[i][j]=(1/detsonuc)*tersi[i][j];
		}
	}
}
public void arr2Tersi() {
	double[][] tersi = new double[3][3];
	tersi[0][0] = Math.pow(-1,2)*((arr2[1][1]*arr2[2][2])-(arr2[1][2]*arr2[2][1]));
	tersi[0][1] = Math.pow(-1,3)*((arr2[1][0]*arr2[2][2])-(arr2[1][2]*arr2[2][0]));
	tersi[0][2] = Math.pow(-1,4)*((arr2[1][0]*arr2[2][1])-(arr2[1][1]*arr2[2][0]));
	tersi[1][0] = Math.pow(-1,3)*((arr2[0][1]*arr2[2][2])-(arr2[0][2]*arr2[2][1]));
	tersi[1][1] = Math.pow(-1,4)*((arr2[0][0]*arr2[2][2])-(arr2[0][2]*arr2[2][0]));
	tersi[1][2] = Math.pow(-1,5)*((arr2[0][0]*arr2[2][1])-(arr2[0][1]*arr2[2][0]));
	tersi[2][0] = Math.pow(-1,4)*((arr2[0][1]*arr2[1][2])-(arr2[0][2]*arr2[1][1]));
	tersi[2][1] = Math.pow(-1,5)*((arr2[0][0]*arr2[1][2])-(arr2[0][2]*arr2[1][0]));
	tersi[2][2] = Math.pow(-1,6)*((arr2[0][0]*arr2[1][1])-(arr2[0][1]*arr2[1][0]));
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			toplam2[i][j]=(1/detsonuc)*tersi[i][j];
		}
	}
}
}
