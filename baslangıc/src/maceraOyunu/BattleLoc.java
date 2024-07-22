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
	    	System.out.println("�uan Bulundu�unuz Yer --> "+this.getName());
	    	System.out.println("Dikkat Kar��n�za "+mnsCount+" Tane"+mns.getName()+" ��kt�!!");
	    	System.out.println("<S>ava� Veya <K>a�");
	    	String selCase=input.next();
	    	selCase = selCase.toUpperCase();
	    	if(selCase.equals("S")) {
	    		if(combat(mnsCount)) {
	    			System.out.println(this.getName()+" B�lgesini Yendiniz !!");
	    			if(this.award.equals("food") && player.getInv().isFood() == false) {
	    				System.out.println("D��manlar� Temizledikten Sonra B�lgeyi Ara�t�r�p Bunu Buldun => Yemek");
	    				player.getInv().setFood(true);
	    			}
	    			if(this.award.equals("water") && player.getInv().isWater() == false) {
	    				System.out.println("D��manlar� Temizledikten Sonra B�lgeyi Ara�t�r�p Bunu Buldun => Su");
	    				player.getInv().setWater(true);
	    			}
	    			if(this.award.equals("firewood") && player.getInv().isFirewood() == false) {
	    				System.out.println("D��manlar� Temizledikten Sonra B�lgeyi Ara�t�r�p Bunu Buldun => Yakacak Odun");
	    				player.getInv().setFirewood(true);
	    			}
	    			return true;
	    		}
	    		else {
	    			System.out.println("---Ka�t�n�z---");
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
	    			System.out.println("<V>ur veya <K>a�");
	    			String selCase = input.next();
	    			selCase = selCase.toUpperCase();
	    			if(selCase.equals("V")) {
	    		    	System.out.println("------------------------------------");
	    				System.out.println("Sald�rd� Ger�ekle�ti !");
	    				mns.setHealth(mns.getHealth()-player.getTotalDamage());
	    				if(mns.getHealth() > 0) {
	    				player.setHealth(player.getHealth()-(mns.getDamage()-player.getInv().getArmor()));
	    				System.out.println(mns.getName()+" Kalan Can� => "+mns.getHealth());
	    				System.out.println("Sizin Can�n�z => "+player.getHealth());
	    		    	System.out.println("------------------------------------");
	    				}
	    			}
	    			else {
	    				break;
	    			}
	    		}
	    	
	    		if(mns.getHealth() <= 0 && player.getHealth()>0) {
	    	    	System.out.println("------------------------------------");
	    			System.out.println("Tebrikler "+mns.getName() +" D��man�n� Yendiniz !");
	    			player.setMoney(player.getMoney()+mns.getAward());
	    			System.out.println("G�ncel Paran�z => "+player.getMoney());
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
	    	System.out.println("Can�n ==> "+player.getHealth());
	    	System.out.println("Hasar�n ==>"+player.getTotalDamage());
	    	if(player.getInv().getDamage()>0) {
	    		System.out.println("�uanki Silah�n ==> "+player.getInv().getwName());
	    	}
	    	if(player.getInv().getArmor()>0) {
	    		System.out.println("�uanki Z�rh�n ==> "+player.getInv().getaName());
	    	}
	    	System.out.println("------------------------------------");
	    }
	    public void enemyStats() {
	    	System.out.println("------------------------------------");
	    	System.out.println("Kar��ndaki D��man ==> "+mns.getName());
	    	System.out.println("D��man�n Can� ==> "+mns.getHealth());
	    	System.out.println("D��man�n Hasar� ==>"+mns.getDamage());
	    	System.out.println("------------------------------------");

	    }
}
