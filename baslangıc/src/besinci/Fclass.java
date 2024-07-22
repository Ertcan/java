package besinci;

public class Fclass {
public static int toplama(int m) {
	int toplam=0,tmp=0;
	for(int i=1; i<=m;i++) 
		toplam+=faktor(i);
	
	return toplam;
}
public static int faktor(int f) {
	int faktor=1;
	for(int i=1;i<=f;i++) 
		faktor*=i;
	
	
	return faktor;
}
}
