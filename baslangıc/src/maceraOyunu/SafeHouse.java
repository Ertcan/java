package maceraOyunu;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "G�venli Ev");
	
	}
	public boolean getLocation() {
		player.setHealth(player.getRhealt());
		System.out.println("Can�n�z doldu ! ");
		System.out.println("�uan G�venli Evdesiniz .");
		return true;
	}
}
