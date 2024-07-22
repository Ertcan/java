package maceraOyunu;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player, "Market");
		
	}
	public boolean getLocation() {
		System.out.println();
		System.out.println("Mevcut Para --> "+player.getMoney());
		System.out.println("Silahlar --> 1 ");
		System.out.println("Zýrhlar --> 2 ");
		System.out.println("Çýkýþ --> 3 ");
		System.out.print("Ne satýn almak istiyorsunuz ? ");
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
		System.out.println("-----SÝLAHLAR-----");
		System.out.println("Tabanca ==> 1");
		System.out.println("Hasarý ==> 2");
		System.out.println("Parasý ==> 25");
		System.out.println("-----------------------------");
		System.out.println("Kýlýç ==> 2");
		System.out.println("Hasarý ==> 3");
		System.out.println("Parasý ==> 35");
		System.out.println("-----------------------------");
		System.out.println("Tüfek ==> 3");
		System.out.println("Hasarý ==> 7");
		System.out.println("Parasý ==> 45");
		System.out.println("-----------------------------");
		System.out.println("Çýkýþ ==> 4");
		System.out.println("-----------------------------");
		System.out.print("Satýn Almak Ýstediðinizi Seçiniz : ");
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
				wName="Kýlýç";
				break;
			case 3:
				damage=7;
				price=45;
				wName="Tüfek";
				break;
			case 4:
				System.out.println("Çýkýlýyor...");
				break;
			default :
				System.out.println("Geçersiz Ýþlem !");
				break;
		}
			if(price>0) {
			if(player.getMoney()>=price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney()-price);
				System.out.println(wName+" Satýn Aldýnýz !");
				System.out.println("Eski Hasarýnýz --> "+player.getDamage());
				System.out.println("Yeni Hasarýnýz --> "+player.getTotalDamage());
				System.out.println("Kalan Paranýz --> "+player.getMoney());
			}
			else {
				System.out.println("Yetersiz Bakiye !!");
			}
			}
	}
	public int armorMenu() {
		System.out.println("-----ZIRHLAR-----");
		System.out.println("Hafif Zýrh ==> 1");
		System.out.println("Engelleme ==> 1");
		System.out.println("Parasý ==> 15");
		System.out.println("-----------------------------");
		System.out.println("Orta Zýrh ==> 2");
		System.out.println("Engelleme ==> 3");
		System.out.println("Parasý ==> 25");
		System.out.println("-----------------------------");
		System.out.println("Aðýr Zýrh ==> 3");
		System.out.println("Engelleme ==> 5");
		System.out.println("Parasý ==> 40");
		System.out.println("-----------------------------");
		System.out.println("Çýkýþ ==> 4");
		System.out.println("-----------------------------");
		System.out.print("Satýn Almak Ýstediðinizi Seçiniz : ");
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
				aName="Hafif Zýrh";
				break;
			case 2:
				defence=3;
				price=25;
				aName="Orta Zýrh";
				break;
			case 3:
				defence=5;
				price=40;
				aName="Aðýr Zýrh";
				break;
			case 4:
				System.out.println("Çýkýlýyor...");
				break;
			default :
				System.out.println("Geçersiz Ýþlem !");
				break;
		}
			if(price>0) {
			if(player.getMoney()>=price) {
				player.getInv().setArmor(defence);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney()-price);
				System.out.println(aName+" Satýn Aldýnýz !");
				System.out.println("Yeni Defansýnýz --> "+(+player.getInv().getArmor()));
				System.out.println("Kalan Paranýz --> "+player.getMoney());
			}
			else {
				System.out.println("Yetersiz Bakiye !!");
			}
			}
	}
}
