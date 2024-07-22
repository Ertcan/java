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
		System.out.println("Kýrmýzý Renkli Araba Yapýmýna Baþlandý !");
		aRenk.RenkKirmizi();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yapýmý Tamamlandý !");
	
	}
	public void BirlestirSiyah() {
		ArabaGovde.ArabaYap();
		System.out.println("Siyah Renkli Araba Yapýmýna Baþlandý !");
		aRenk.RenkSiyah();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yapýmý Tamamlandý !");
	
	}
	public void BirlestirVarsayilan() {
		ArabaGovde.ArabaYap();
		System.out.println("Beyaz Renkli Araba Yapýmýna Baþlandý !");
		aRenk.VarsayilanArabaRenk();
		aMotor.Hidrolik();
		aMotor.Sanzuman();
		aMotor.Turbo();
		aGovde.DisGovde();
		aGovde.IcGovde();
		aTekerlek.Balata();
		aTekerlek.Jant();
		aTekerlek.Lastik();
		System.out.println("Araba Yapýmý Tamamlandý !");
	
	}
	public void ArabaYoket() {
		ArabaGovde.ArabaYoket();
		System.out.println("Araba Parçalama Ýþlemi Baþladý !");
		aMotor.HidrolikYoket();
		aMotor.SanzumanYoket();
		aMotor.TurboYoket();
		aGovde.DýsGovdeYoket();
		aGovde.IcGovdeYoket();
		aTekerlek.BalataYokEt();
		aTekerlek.JantYokEt();
		aTekerlek.LastikYokEt();
		System.out.println("Araba Parçalama Ýþlemi Tamamlandý !");
	}
}
