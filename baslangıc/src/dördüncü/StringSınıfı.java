package d�rd�nc�;

public class StringS�n�f� {

	public static void main(String[] args) {
		//str.length() : Girilen karakterin say�s�n� d�nd�r�r.
		//str1.concat(str2) : String birle�tirme.
		//str.indexOf('K') : Karakterin konumunu verir.
		//str.charAt(5) : indexOf metoduna benzer�ekilde bu seferde konumu verilen karakteri okur.
		//str.compareTo("Kodlama") : b�y�k/k���k farkl� duyarl� olarak kar��la�t�r�r.
		//str.compareToIgnoreCase(KODlama) :b�y�k k���k harf duyarl�l��� olmadan kar��la�t�r�r.
		//str.contains("kod") : girilen de�er string i�inden ge�iyor mu diye kontrol eder.
		//str.endsWith("a") : belirtilen karakterler ile bitiyorsa true de�erini d�nd�r�r.
		//str.replace("Kodlama","Vakti") : String de�i�tirme i�in kullan�l�r.
		//str.toLowerCase() , str.toUpperCase();
		
		String metin ="JAVA �LE";
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
