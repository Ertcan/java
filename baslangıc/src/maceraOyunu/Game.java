package maceraOyunu;
import java.util.Scanner;

public class Game {
	private String pName;
	Location location; 
	Player  player;
	Scanner input = new Scanner(System.in);
	public void login() {
		System.out.println("Macera oyununa hoþgeldiniz !!");
		System.out.println("Devam etmeden önce karakterinizin ismini girin.");
		pName = input.nextLine();
		player = new Player(pName);
		player.selectCha();
		start();
	}
	public void start() {
		while(true) {
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println("Eylem Seçiniz.");
		System.out.println();
		System.out.println("Canýný Yenilemek Ýçin Güvenli Eve Git --> 1");
		System.out.println("--------------------------------");
		System.out.println("Maðarada Keþfe Çýk --> 2");
		System.out.println("--------------------------------");
		System.out.println("Ormanda Keþfe Çýk --> 3");
		System.out.println("--------------------------------");
		System.out.println("Nehirde Keþfe Çýk --> 4");
		System.out.println("--------------------------------");
		System.out.println("Markete Git --> 5");
		System.out.println("--------------------------------");
		System.out.print("Gitmek istediðiniz yer : ");
		int selloc = input.nextInt();
		while(selloc<1 || selloc>5) {
			System.out.println("Tekrar Deneyin.");
			selloc = input.nextInt();
		}
		switch(selloc) {
		case 1:
			location = new SafeHouse(player);
			break;
		case 2:
			location = new Cave(player);
			break;
		case 3:
			location = new Forest(player);
			break;
		case 4:
			location = new River(player);
			break;
		case 5:
			location = new ToolStore(player);
			break;
		}
		if(location.getName().equals("Güvenli Ev")) {
			if(player.getInv().isFirewood()&&player.getInv().isFood()&&player.getInv().isWater()) {
			System.out.println("!!! TEBRÝKLER HAYATTA KALDINIZ !!!");
			break;
			}
		}
		if(!location.getLocation()) {
			System.out.println("Öldünüz...");
			break;
		}

		}
	}
}
