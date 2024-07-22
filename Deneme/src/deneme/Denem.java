package deneme;

public class Denem {

	public static void main(String[] args) {
		int z=99 ,palindrom=0,terspalindrom =0,tmp=0;
		for(int i=11;i<=99;i++) {

		     palindrom = z*i;
		     tmp=palindrom;
			 int bb = tmp%10;
			 tmp=tmp/10;
			 int ob = tmp%10;
			 tmp/=10;
			 int yb = tmp%10;
			 int bnb = tmp/10;
			 terspalindrom = ((bb*1000)+(ob*100)+(yb*10)+bnb);
			 if(palindrom==terspalindrom){
			System.out.println(palindrom);
			}
			
		}
	}

}
