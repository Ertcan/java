package maceraOyunu;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Player {

	private int damage , health , money, rhealt;
	private String cName,name;
	private Inventory inv;
	Scanner input = new Scanner(System.in);
	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}
	public void selectCha() {
	switch(printCha()) {
	case 1:
		setCha("Samuray", 5, 21, 15);
		break;
	case 2: 
		setCha("Ok�u", 7, 18, 20);
		break;
	case 3:
		setCha("��valye", 8, 24, 5);
		break;
	}
	System.out.println("Karakter Se�ildi !");
	System.out.println("Karakter �zellikleri :");
	System.out.println("--------------------------------------------------------------------");
	System.out.println("�smi => "+getcName());
	System.out.println("Hasar� => "+getDamage());
	System.out.println("Sa�l��� => "+getHealth());
	System.out.println("Ba�lang�� Paran�z => "+getMoney());
	}
	public int printCha() throws InputMismatchException {
		System.out.println("Karakterinizi se�iniz.");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1 => Samuray \nHasar� => 5 \nSa�l��� => 21 \nBa�lang�� Paras� => 15");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2 => Ok�u \nHasar� => 7 \nSa�l��� => 18 \nBa�lang�� Paras� => 20");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("3 => ��valye \nHasar� => 8 \nSa�l��� => 24 \nBa�lang�� Paras� => 5");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Se�iminiz => ");
		int id = input.nextInt();
		while((id<1)||(id>3)) {
			System.out.println("L�tfen ge�erli bir say� giriniz!");
			System.out.print("Se�iminiz => ");
				id = input.nextInt();
		}
		return id;
	}
	public void setCha(String cName , int dmg,int hlt,int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealth(hlt);
		setMoney(mny);
		setRhealt(health);
	}
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public int getRhealt() {
		return rhealt;
	}
	public void setRhealt(int rhealt) {
		this.rhealt = rhealt;
	}
	
}
