package miniProjeAsalSayi;

public class Main {
	public static void main (String[] args) {
		int number = -1;
		int reminder = number % 2;
		boolean durum=true;
		if (number ==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if(number==2)
			System.out.println("Geçersiz sayı");
		for(int i=2;i<number;i=i+2)
		{
			if(number % i ==0) {
				durum=false;
			}
		}
		if(durum==true) {
			System.out.println("Sayı asal");
		}
		else
			System.out.println("Sayı asal değil");
		
		
	}

}
