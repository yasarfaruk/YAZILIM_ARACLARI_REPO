public class Hesaplama {

	public static void main(String[] args){
		islemler(19,25);
	}

	public static int islemler(int sayi1, int sayi2) {
		int sonuc1 = topla(sayi1, sayi2);
		int sonuc2 = carpma(sayi1, sayi2);
		int sonuc = bolme(sonuc2, sonuc1);
		System.out.println(sonuc);
		return sonuc;
	}
	
	public static int /* (4) */ topla( /* (1) */ int sayi1, /* (2) */ int sayi2 /* (3) */ ) 
			throws UnsupportedOperationException // (5) Firlatilan hata */
	{
		if(sayi1>=10000000 || sayi2>=10000000) {
			throw new UnsupportedOperationException();
		}
		
		return sayi1 + sayi2;
	}
	
	public static int carpma(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public static int bolme(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}

	
	
	