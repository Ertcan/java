package maceraOyunu;
import java.util.Scanner;

public class Game {
	private String pName;
	Location location; 
	Player  player;
	Scanner input = new Scanner(System.in);
	public void login() {
		System.out.println("Macera oyununa ho�geldiniz !!");
		System.out.println("Devam etmeden �nce karakterinizin ismini girin.");
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
		System.out.println("Eylem Se�iniz.");
		System.out.println();
		System.out.println("Can�n� Yenilemek ��in G�venli Eve Git --> 1");
		System.out.println("--------------------------------");
		System.out.println("Ma�arada Ke�fe ��k --> 2");
		System.out.println("--------------------------------");
		System.out.println("Ormanda Ke�fe ��k --> 3");
		System.out.println("--------------------------------");
		System.out.println("Nehirde Ke�fe ��k --> 4");
		System.out.println("--------------------------------");
		System.out.println("Markete Git --> 5");
		System.out.println("--------------------------------");
		System.out.print("Gitmek istedi�iniz yer : ");
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
		if(location.getName().equals("G�venli Ev")) {
			if(player.getInv().isFirewood()&&player.getInv().isFood()&&player.getInv().isWater()) {
			System.out.println("!!! TEBR�KLER HAYATTA KALDINIZ !!!");
			break;
			}
		}
		if(!location.getLocation()) {
			System.out.println("�ld�n�z...");
			break;
		}

		}
	}
}
