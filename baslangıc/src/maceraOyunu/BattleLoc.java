package maceraOyunu;

public abstract class BattleLoc extends Location {
	Monster mns;
	protected String award;
	
	    public BattleLoc(Player player,String name,Monster monster,String award) {
		super(player);
		this.name=name;
		this.mns=monster;
		this.award=award;
	}
	    public boolean getLocation() {
	    	int mnsCount = mns.monsterCount();
	    	System.out.println("Þuan Bulunduðunuz Yer --> "+this.getName());
	    	System.out.println("Dikkat Karþýnýza "+mnsCount+" Tane"+mns.getName()+" Çýktý!!");
	    	System.out.println("<S>avaþ Veya <K>aç");
	    	String selCase=input.next();
	    	selCase = selCase.toUpperCase();
	    	if(selCase.equals("S")) {
	    		if(combat(mnsCount)) {
	    			System.out.println(this.getName()+" Bölgesini Yendiniz !!");
	    			if(this.award.equals("food") && player.getInv().isFood() == false) {
	    				System.out.println("Düþmanlarý Temizledikten Sonra Bölgeyi Araþtýrýp Bunu Buldun => Yemek");
	    				player.getInv().setFood(true);
	    			}
	    			if(this.award.equals("water") && player.getInv().isWater() == false) {
	    				System.out.println("Düþmanlarý Temizledikten Sonra Bölgeyi Araþtýrýp Bunu Buldun => Su");
	    				player.getInv().setWater(true);
	    			}
	    			if(this.award.equals("firewood") && player.getInv().isFirewood() == false) {
	    				System.out.println("Düþmanlarý Temizledikten Sonra Bölgeyi Araþtýrýp Bunu Buldun => Yakacak Odun");
	    				player.getInv().setFirewood(true);
	    			}
	    			return true;
	    		}
	    		else {
	    			System.out.println("---Kaçtýnýz---");
	    			return true;
	    		}
	    	}
	    	return true;
	    }
	    public boolean combat(int mnsCount) {
	    	for(int i=0; i < mnsCount; i++) {
	    		int mnsDefHealth = mns.getHealth();
	    		playerStats();
	    		enemyStats();
	    		while((player.getHealth()>0) && (mns.getHealth()>0)) {
	    			System.out.println("<V>ur veya <K>aç");
	    			String selCase = input.next();
	    			selCase = selCase.toUpperCase();
	    			if(selCase.equals("V")) {
	    		    	System.out.println("------------------------------------");
	    				System.out.println("Saldýrdý Gerçekleþti !");
	    				mns.setHealth(mns.getHealth()-player.getTotalDamage());
	    				if(mns.getHealth() > 0) {
	    				player.setHealth(player.getHealth()-(mns.getDamage()-player.getInv().getArmor()));
	    				System.out.println(mns.getName()+" Kalan Caný => "+mns.getHealth());
	    				System.out.println("Sizin Canýnýz => "+player.getHealth());
	    		    	System.out.println("------------------------------------");
	    				}
	    			}
	    			else {
	    				break;
	    			}
	    		}
	    	
	    		if(mns.getHealth() <= 0 && player.getHealth()>0) {
	    	    	System.out.println("------------------------------------");
	    			System.out.println("Tebrikler "+mns.getName() +" Düþmanýný Yendiniz !");
	    			player.setMoney(player.getMoney()+mns.getAward());
	    			System.out.println("Güncel Paranýz => "+player.getMoney());
	    			mns.setHealth(mns.getHealth());
	    	    	System.out.println("------------------------------------");
	    	   		mns.setHealth(mnsDefHealth);
	    		}
	    		else {
	    			return false;
	    		}
	    	}
	    return true;
	    }
	    public void playerStats() {
	    	System.out.println("------------------------------------");
	    	System.out.println("Canýn ==> "+player.getHealth());
	    	System.out.println("Hasarýn ==>"+player.getTotalDamage());
	    	if(player.getInv().getDamage()>0) {
	    		System.out.println("Þuanki Silahýn ==> "+player.getInv().getwName());
	    	}
	    	if(player.getInv().getArmor()>0) {
	    		System.out.println("Þuanki Zýrhýn ==> "+player.getInv().getaName());
	    	}
	    	System.out.println("------------------------------------");
	    }
	    public void enemyStats() {
	    	System.out.println("------------------------------------");
	    	System.out.println("Karþýndaki Düþman ==> "+mns.getName());
	    	System.out.println("Düþmanýn Caný ==> "+mns.getHealth());
	    	System.out.println("Düþmanýn Hasarý ==>"+mns.getDamage());
	    	System.out.println("------------------------------------");

	    }
}
