package dördüncü;

public class Book {
public String name,authors,publisher;
private int numberOfPage;
Book(String name,String authors,String publisher,int numberOfPage){
	this.name=name;
	this.authors=authors;
	this.publisher=publisher;
	if(numberOfPage<1) {
		this.numberOfPage=(numberOfPage=100);
	}else {
	this.numberOfPage=numberOfPage;
	}
}
public void print() {
	System.out.println(numberOfPage);
}

}
