package odev;

public class NumerikAnaliz {
	static double[] �kok = new double[11];
	static double[] �hata = new double[11];
	static double[] �nterkok = new double[11];
	static double[] �nterhata = new double[11];
	static double[] Nkok = new double[11];
	static double[] Nhata = new double[11];
	static int[] �dizi = new int[11];
	static int[] �nterdizi = new int[11];
	static int[] Ndizi = new int[11];
	static double function(double x0) {
		x0=(Math.pow(x0, 2)*0.85)-2.14*x0;
		
		return x0;
	}
	static double turev(double y) {
		y=y*1.7-2.14;
		return y;
	}
	static double interpolasyon() {
		double a=2 ,b=12,hata=0.0;
		int deger1,deger2, deger3;
		for(int i = 0; i <=10; i++) {
			if(function(a)<0) {
				deger1 = -1;
			}else {
				deger1 = 1;
			}
			if(function(b)<0) {
				deger2 = -1;
			}else {
				deger2=1;
			}
		double c = ((a*function(b))-(b*function(a)))/(function(b)-function(a));
		�nterkok[i]=c;
		if(function(c)<0) {
			deger3 = -1;
		}else {
			deger3 = 1;
		}
		if(deger3*deger2<0) {
		 hata = Math.abs(c-b);
		 b=c;
		 �nterhata[i] = hata;
		 if(hata<0.02) {
				�nterdizi[i]=i;
			}
		}else if(deger3*deger1<0) {
		hata = Math.abs(c-a);
		a=c;
		�nterhata[i] = hata;
		if(hata<0.02) {
			�nterdizi[i]=i;
		}
		}
		}
		return 0;
	}
	static void hata() {
		System.out.println("�terasyon\t\t�kiye B�lme Metodu\t\t\t\tNewton Raphson Metodu\t\t\t\t�nterpolasyon Metodu     ");
		System.out.println("N\t\tK�k\t\t\tHata\t\t\tK�k\t\t\tHata\t\t\tK�k\t\t\tHata");
		for(int i = 1; i<=10;i++) {
		System.out.println(i+"|\t|"+�kok[i-1]+"|\t\t\t|"+�hata[i-1]+"|\t\t\t|"+Nkok[i-1]+"|\t\t\t|"+Nhata[i-1]+"|\t\t\t|"+�nterkok[i-1]+"|\t\t\t"+�nterhata[i-1]);

		}
		for(int i =0;i<10;i++) {
			if(�dizi[i]!=0) {
		System.out.println("�kiye b�lme metodu ile 0.02 den daha k���k bir hata de�erine "+�dizi[i]+" ad�mda ula��lm��t�r");
		break;
		}
	}
		for(int i =0;i<10;i++) {
			if(Ndizi[i]!=0) {
			System.out.println("Newton Raphson Metodu ile 0.02 den daha k���k bir hata de�erine "+Ndizi[i]+" ad�mda ula��lm��t�r");
		break;
		}
	}
		for(int i =0;i<10;i++) {
			if(�dizi[i]!=0) {
				System.out.println("�nterpolasyon Metodu ile 0.02 den daha k���k bir hata de�erine "+�nterdizi[i]+" ad�mda ula��lm��t�r");
		break;
		}
	}
		
	}
	
	static double ikiyeBolme() {
		double a = 2, b = 12,hata;
		for(int i = 0; i <=10; i++) {
			double c = (a+b)/2;
			�kok[i] = c;
			if(function(c)*function(a)<0) {
				b=c;
			 hata = (c-a)/Math.pow(2, i);
			�hata[i] = hata;
			if(hata<0.02) {
				�dizi[i]=i;
			}
			}else {
				a=c;
			hata = (b-c)/Math.pow(2, i);
			�hata[i] = hata;
			if(hata<0.02) {
				�dizi[i]=i;
			}
			}
			}
			return 0;
	}
	static double newton() {
		double x0 = 2,hata = 0.0,x1=0;
		int i = 1;
		while(i<=10) {
		x1 = x0-(function(x0)/turev(x0));
		Nkok[i-1] = x1;
		hata = Math.abs(x1-x0);
		x0 = x1;
		Nhata[i-1] = hata;
		if(hata<0.02) {
			Ndizi[i-1]=i;
		}
		i++;
		}
		return 0;
	}

	public static void main(String[] args) {
		ikiyeBolme();
	
		interpolasyon();
	
		newton();
	
	
		hata();
		if(0.078125<0.02) {
			System.out.println("girdi");
		}
	}

}
