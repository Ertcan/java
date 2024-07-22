package dördüncü;

public class StringSýnýfý {

	public static void main(String[] args) {
		//str.length() : Girilen karakterin sayýsýný döndürür.
		//str1.concat(str2) : String birleþtirme.
		//str.indexOf('K') : Karakterin konumunu verir.
		//str.charAt(5) : indexOf metoduna benzerþekilde bu seferde konumu verilen karakteri okur.
		//str.compareTo("Kodlama") : büyük/küçük farklý duyarlý olarak karþýlaþtýrýr.
		//str.compareToIgnoreCase(KODlama) :büyük küçük harf duyarlýlýðý olmadan karþýlaþtýrýr.
		//str.contains("kod") : girilen deðer string içinden geçiyor mu diye kontrol eder.
		//str.endsWith("a") : belirtilen karakterler ile bitiyorsa true deðerini döndürür.
		//str.replace("Kodlama","Vakti") : String deðiþtirme için kullanýlýr.
		//str.toLowerCase() , str.toUpperCase();
		
		String metin ="JAVA ÝLE";
		String metin1 ="KODLAMA";
		System.out.println(metin.length());
		System.out.println(metin.concat(metin1));
		System.out.println(metin.indexOf(5));
		System.out.println(metin.charAt(6));
		System.out.println(metin.compareTo(metin1));
		System.out.println(metin.compareToIgnoreCase(metin1));
		System.out.println(metin.contains(metin1));
		System.out.println(metin.endsWith(metin1));
		System.out.println(metin.replace(metin, metin1));
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());

	}

}
