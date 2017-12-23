
public class Hesaplama {

	public static void main (String[] args) {
		int elemanSayisi = 5;		
		int[]dizi=new int[elemanSayisi];
		dizi[0]=0;
		dizi[1]=1;
		for(int i=2;i<elemanSayisi;i++) {
			dizi[i]=dizi[i-1]+dizi[i-2];
		}
		for(int i=0;i<elemanSayisi;i++) {
			System.out.println(dizi[i]+" ");
		}
		}
		public static int fibonacciHesap(int elemanSayisi) {
			return elemanSayisi;
			
		}
}

	
	
	