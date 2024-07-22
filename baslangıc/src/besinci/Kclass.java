package besinci;

public class Kclass {

public static int VerileriAl(int m,int n) {
	int c=0;
	c=nFaktoriyel(m)/(nFaktoriyel(n)*nFaktoriyel(m-n));
	return c;
}
public static int nFaktoriyel(int k) {
	int nFakt=1;
	for(int i=1; i<=k;i++) 
		nFakt*=i;
		return nFakt;

}

}
