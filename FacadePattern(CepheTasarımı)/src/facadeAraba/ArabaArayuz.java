package facadeAraba;

public class ArabaArayuz {

	ArabaMotor aMotor;
	ArabaGovde aGovde;
	ArabaRenk aRenk;
	ArabaTekerlek aTekerlek;
	
	public ArabaArayuz() {
	aMotor = new ArabaMotor();
	aGovde = new ArabaGovde();
	aRenk = new ArabaRenk();
	aTekerlek = new ArabaTekerlek();
	}
	public void BirlestirKirmizi() {
		ArabaGovde.ArabaYap();
		System.out.println("K�rm�z� Renkli Araba Yap�m�na Ba�land� !");
		aRenk.RenkKirmizi();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yap�m� Tamamland� !");
	
	}
	public void BirlestirSiyah() {
		ArabaGovde.ArabaYap();
		System.out.println("Siyah Renkli Araba Yap�m�na Ba�land� !");
		aRenk.RenkSiyah();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yap�m� Tamamland� !");
	
	}
	public void BirlestirVarsayilan() {
		ArabaGovde.ArabaYap();
		System.out.println("Beyaz Renkli Araba Yap�m�na Ba�land� !");
		aRenk.VarsayilanArabaRenk();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yap�m� Tamamland� !");
	
	}
	public void ArabaYoket() {
		ArabaGovde.ArabaYoket();
		System.out.println("Araba Par�alama ��lemi Ba�lad� !");
		aMotor.HidrolikYoket();
		aMotor.SanzumanYoket();
		aMotor.TurboYoket();
		aGovde.D�sGovdeYoket();
		aGovde.IcGovdeYoket();
		aTekerlek.BalataYokEt();
		aTekerlek.JantYokEt();
		aTekerlek.LastikYokEt();
		System.out.println("Araba Par�alama ��lemi Tamamland� !");
	}
}
