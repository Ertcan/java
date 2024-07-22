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
		setCha("Okçu", 7, 18, 20);
		break;
	case 3:
		setCha("Þövalye", 8, 24, 5);
		break;
	}
	System.out.println("Karakter Seçildi !");
	System.out.println("Karakter özellikleri :");
	System.out.println("--------------------------------------------------------------------");
	System.out.println("Ýsmi => "+getcName());
	System.out.println("Hasarý => "+getDamage());
	System.out.println("Saðlýðý => "+getHealth());
	System.out.println("Baþlangýç Paranýz => "+getMoney());
	}
	public int printCha() throws InputMismatchException {
		System.out.println("Karakterinizi seçiniz.");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1 => Samuray \nHasarý => 5 \nSaðlýðý => 21 \nBaþlangýç Parasý => 15");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2 => Okçu \nHasarý => 7 \nSaðlýðý => 18 \nBaþlangýç Parasý => 20");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("3 => Þövalye \nHasarý => 8 \nSaðlýðý => 24 \nBaþlangýç Parasý => 5");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Seçiminiz => ");
		int id = input.nextInt();
		while((id<1)||(id>3)) {
			System.out.println("Lütfen geçerli bir sayý giriniz!");
			System.out.print("Seçiminiz => ");
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
