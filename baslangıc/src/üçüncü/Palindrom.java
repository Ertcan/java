package üçüncü;

public class Palindrom {
static boolean p(int x) {
	int tmp=0;
	int p;
	int terssayi=0;
	x=tmp;
	while(tmp !=0) {
		p=tmp%10;
		terssayi=terssayi*10+p;
		tmp/=10;
	}
	if(tmp==terssayi) 
		return true;
	
	else
	return false;
}
	public static void main(String[] args) {
		
		System.out.println(p(121));
	}

}
