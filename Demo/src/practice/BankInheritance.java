package practice;

class Book {
	String Author_name = "Robert Kiyosaki";
	String title = "Rich Dad Poor Dad";
	int cost_price = 150, sale_price = 200, pages = 207;

	Book(String an, String tit, int cp, int sp, int pg) {
		Author_name = an;
		title = tit;
		cost_price = cp;
		sale_price = sp;
		pages = pg;
	}

	void netProfit() {
		int t = (sale_price - cost_price);
		System.out.println("Total profit :: " + t);
	}

	void getTax() {
		System.out.println("Tax on book :: 3%");
	}

}

class EBook extends Book {
	String downloadSite = "PdfDrive";
	int sizeMB = 50;

	EBook(String an, String tit, int cp, int sp, int pg, int sz, String ds) {
		super(an, tit, cp, sp, pg);
		downloadSite = ds;
		sizeMB = sz;
	}

	void pageSize() {
		System.out.println("Total pages in Book:: " + pages);
	}

	void getTax() {
		System.out.println("Tax on book :: 5%");
	}

}

public class BankInheritance {

	public static void main(String[] args) {
		EBook ebook = new EBook("Robert Kiyosaki", "Rich Dad Poor Dad", 250, 300, 1008, 50, "PDFDrive");
		System.out.println("Author name:: " + ebook.Author_name);
		System.out.println("Title:: " + ebook.title);
		System.out.println("Download Site:: " + ebook.downloadSite);
		System.out.println("Size of Book:: " + ebook.sizeMB + " MB");
		ebook.pageSize();
		ebook.getTax();
		ebook.netProfit();

	}

}
