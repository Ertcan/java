package maceraOyunu;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player, "Market");
		
	}
	public boolean getLocation() {
		System.out.println();
		System.out.println("Mevcut Para --> "+player.getMoney());
		System.out.println("Silahlar --> 1 ");
		System.out.println("Z�rhlar --> 2 ");
		System.out.println("��k�� --> 3 ");
		System.out.print("Ne sat�n almak istiyorsunuz ? ");
		int selTool = input.nextInt();
		int selItemId;
		switch (selTool) {
		case 1: 
		selItemId = weaponMenu();
		buyWeapon(selItemId);
			break;
		case 2:
		selItemId = armorMenu();
		buyArmor(selItemId);
			break;
		default:
			break;
		}
		return true;
	}
	public int weaponMenu() {
		System.out.println("-----S�LAHLAR-----");
		System.out.println("Tabanca ==> 1");
		System.out.println("Hasar� ==> 2");
		System.out.println("Paras� ==> 25");
		System.out.println("-----------------------------");
		System.out.println("K�l�� ==> 2");
		System.out.println("Hasar� ==> 3");
		System.out.println("Paras� ==> 35");
		System.out.println("-----------------------------");
		System.out.println("T�fek ==> 3");
		System.out.println("Hasar� ==> 7");
		System.out.println("Paras� ==> 45");
		System.out.println("-----------------------------");
		System.out.println("��k�� ==> 4");
		System.out.println("-----------------------------");
		System.out.print("Sat�n Almak �stedi�inizi Se�iniz : ");
		int selWeapon = input.nextInt();
		return selWeapon;
	}
	public void buyWeapon(int itemId) {
		int damage=0,price=0;
		String wName = null;
			switch(itemId) {
			case 1:
				damage=2;
				price=25;
				wName="Tabanca";
				break;
			case 2:
				damage=3;
				price=35;
				wName="K�l��";
				break;
			case 3:
				damage=7;
				price=45;
				wName="T�fek";
				break;
			case 4:
				System.out.println("��k�l�yor...");
				break;
			default :
				System.out.println("Ge�ersiz ��lem !");
				break;
		}
			if(price>0) {
			if(player.getMoney()>=price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney()-price);
				System.out.println(wName+" Sat�n Ald�n�z !");
				System.out.println("Eski Hasar�n�z --> "+player.getDamage());
				System.out.println("Yeni Hasar�n�z --> "+player.getTotalDamage());
				System.out.println("Kalan Paran�z --> "+player.getMoney());
			}
			else {
				System.out.println("Yetersiz Bakiye !!");
			}
			}
	}
	public int armorMenu() {
		System.out.println("-----ZIRHLAR-----");
		System.out.println("Hafif Z�rh ==> 1");
		System.out.println("Engelleme ==> 1");
		System.out.println("Paras� ==> 15");
		System.out.println("-----------------------------");
		System.out.println("Orta Z�rh ==> 2");
		System.out.println("Engelleme ==> 3");
		System.out.println("Paras� ==> 25");
		System.out.println("-----------------------------");
		System.out.println("A��r Z�rh ==> 3");
		System.out.println("Engelleme ==> 5");
		System.out.println("Paras� ==> 40");
		System.out.println("-----------------------------");
		System.out.println("��k�� ==> 4");
		System.out.println("-----------------------------");
		System.out.print("Sat�n Almak �stedi�inizi Se�iniz : ");
		int selArmor = input.nextInt();
		return selArmor;
	}
	public void buyArmor(int itemId) {
		int defence=0,price=0;
		String aName = null;
			switch(itemId) {
			case 1:
				defence=1;
				price=15;
				aName="Hafif Z�rh";
				break;
			case 2:
				defence=3;
				price=25;
				aName="Orta Z�rh";
				break;
			case 3:
				defence=5;
				price=40;
				aName="A��r Z�rh";
				break;
			case 4:
				System.out.println("��k�l�yor...");
				break;
			default :
				System.out.println("Ge�ersiz ��lem !");
				break;
		}
			if(price>0) {
			if(player.getMoney()>=price) {
				player.getInv().setArmor(defence);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney()-price);
				System.out.println(aName+" Sat�n Ald�n�z !");
				System.out.println("Yeni Defans�n�z --> "+(+player.getInv().getArmor()));
				System.out.println("Kalan Paran�z --> "+player.getMoney());
			}
			else {
				System.out.println("Yetersiz Bakiye !!");
			}
			}
	}
}
