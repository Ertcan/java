package ödev;
import java.util.Scanner;
import java.util.Random;
public class ÖdevMain {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int[][] arr2 = new int[3][3];
		int tmp=0, tercih=0;
		boolean hesap=true;
		int secim=0 , tercihozel=0;
		int[][] toplam = new int[3][3];
		Scanner input =new Scanner(System.in);
		Random rand = new Random();
		Random rand2 = new Random();
		while(hesap=true) {
		System.out.println("Deðerleri Kendiniz girmek ister misiniz? (1/evet)(2/hayýr)");
		tercih=input.nextInt();
		if(tercih==1) {
		for(int i=0;i<=2;i++) {
			for(int j=0; j<=2;j++) {
			System.out.println(i+".Satýrý girin(1.Matris).");
			tmp = input.nextInt();
			arr[i][j]=tmp;
			}
		}

		for(int i=0;i<=2;i++) {
			for(int j=0; j<=2;j++) {
			System.out.println(i+".Satýrý girin.(2.Matris)");
			tmp = input.nextInt();
			arr2[i][j]=tmp;
			}
		}
		System.out.println("1.Matrisiniz bu þekildedir.");
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]<10 && arr[i][j]>0) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\t");
			System.out.println("\t");
		}
		System.out.println("2.Matrisiniz bu þekildedir.");
		for(int i = 0; i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				if(arr2[i][j]<10 && arr2[i][j]>0) {
					System.out.print(" ");
				}
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("\t");
			System.out.println("\t");
		}
		}
		if(tercih==2) {
			for(int i=0; i<=2;i++) {
				for(int j=0;j<=2;j++) {
					arr[i][j]=rand.nextInt(10);
				}
			}
			for(int i=0; i<=2;i++) {
				for(int j=0;j<=2;j++) {
					arr2[i][j]=rand2.nextInt(10);
				}
			}
			System.out.println("1.Matrisiniz bu þekildedir.");
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
			System.out.println("2.Matrisiniz bu þekildedir.");
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
		if(tercih>2) {
			System.out.println("Hatalý giriþ...");
			System.out.println("Sistem kapatýlýyor...");
			break;
		}
System.out.println("Ne yapmak istersiniz ?");
secim=input.nextInt();
if(secim==1) {
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
		toplam[i][j] = arr[i][j]+arr[i][j];	
		}
	}
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
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
}
if(secim==2) {
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
		toplam[i][j] = arr[i][j]-arr2[i][j];	
		}
	}
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
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
}
if(secim==3) {
	for(int i =0; i<=2;i++) {
		toplam[0][i]=arr[i][0]*arr2[0][i];
	}
	for(int i =0; i<=2;i++) {
		toplam[1][i]=arr[i][1]*arr2[1][i];
	}
	for(int i =0; i<=2;i++) {
		toplam[2][i]=arr[i][2]*arr2[2][i];
	}
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
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
}
if(secim==4) {
	int s=0;
	int  x=0;
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	s = input.nextInt();
	System.out.println("Kaç ile çarpýlsýn ?");
	x = input.nextInt();
	if(s==1) {
	for(int i = 0; i<=2;i++) {
		for(int j = 0; j<=2; j++) {
			arr[i][j]*=x;	
		}	
	}
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
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
	}
	if(s==2) {
		for(int i = 0; i<=2;i++) {
			for(int j = 0; j<=2; j++) {
			arr2[i][j]*=x;	
			}
		}
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
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
	}
if(secim==5) {
	int a=0;
	int det=0,detn=0,detsonuc=0;
	
	System.out.println("Hangi matrisin determinantý almak istersiniz?");
	a=input.nextInt();
	if(a==1) {
	det=(arr[0][0]*arr[1][1]*arr[2][2])+(arr[1][0]*arr[2][1]*arr[0][2])+(arr[2][0]*arr[0][1]*arr[1][2]);
	detn=(arr[0][2]*arr[1][1]*arr[2][0])+(arr[1][2]*arr[2][1]*arr[0][0])+(arr[2][2]*arr[0][1]*arr[1][0]);
	detsonuc=det-detn;
	System.out.println("1.Matrisin determinantý => "+detsonuc);
	}
	if(a==2) {
		det=(arr2[0][0]*arr2[1][1]*arr2[2][2])+(arr2[1][0]*arr2[2][1]*arr2[0][2])+(arr2[2][0]*arr2[0][1]*arr2[1][2]);
		detn=(arr2[0][2]*arr2[1][1]*arr2[2][0])+(arr2[1][2]*arr2[2][1]*arr2[0][0])+(arr2[2][2]*arr2[0][1]*arr2[1][0]);
		detsonuc=det-detn;
		System.out.println("2.Matrisin determinantý => "+detsonuc);	
	}
	System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
	tercihozel=input.nextInt();
	if(tercihozel==1) {
		System.out.println("Sistem tekrar baþlatýlýyor.");
	}
	if(tercihozel==2) {
		System.out.println("Çýkýþ yapýlýyor...");
		break;
	}
}
if(secim==6) {
	int t=0;
	int tmp2=0,tmp1=0;
	System.out.println("Hangi matrisin tersini almak istersiniz ?");
	t = input.nextInt();
	if(t==1) {
		tmp1=arr[1][0];
		tmp2=arr[0][1];
		arr[1][0]=tmp2;
		arr[0][1]=tmp1;
		tmp1=arr[2][0];
		tmp2=arr[0][2];
		arr[2][0]=tmp2;
		arr[0][2]=tmp1;
		tmp1=arr[2][1];
		tmp2=arr[1][2];
		arr[2][1]=tmp2;
		arr[1][2]=tmp1;
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
		System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
		tercihozel=input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem tekrar baþlatýlýyor.");
		}
		if(tercihozel==2) {
			System.out.println("Çýkýþ yapýlýyor...");
			break;
		}
	}
	if(t==2) {
		tmp1=arr2[1][0];
		tmp2=arr2[0][1];
		arr2[1][0]=tmp2;
		arr2[0][1]=tmp1;
		tmp1=arr2[2][0];
		tmp2=arr2[0][2];
		arr2[2][0]=tmp2;
		arr2[0][2]=tmp1;
		tmp1=arr2[2][1];
		tmp2=arr2[1][2];
		arr2[2][1]=tmp2;
		arr2[1][2]=tmp1;
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
		System.out.println("Baþka iþlem yapmak istiyor musunuz ? 1/evet 2/hayýr");
		tercihozel=input.nextInt();
		if(tercihozel==1) {
			System.out.println("Sistem tekrar baþlatýlýyor.");
		}
		if(tercihozel==2) {
			System.out.println("Çýkýþ yapýlýyor...");
			break;
		}
	}
}
if(secim==7) {
	
}
if(secim>7) {
	System.out.println("Hatalý giriþ.");
}
	}
	}
}