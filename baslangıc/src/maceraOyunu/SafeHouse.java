package maceraOyunu;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	
	}
	public boolean getLocation() {
		player.setHealth(player.getRhealt());
		System.out.println("Canýnýz doldu ! ");
		System.out.println("Þuan Güvenli Evdesiniz .");
		return true;
	}
}
