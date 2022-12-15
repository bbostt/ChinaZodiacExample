import java.util.Scanner;
public class ChinaZodiacExample {
/*
 * Çin Zodyaðý nedir ?
 * 4000 bin yýldýr kullanýlan bir astroloji çeþididir.
 * Çin astrolojisi ve insanlarý 12 deðiþik burç ve sembollerle tanýmlar.
 * Çin Zodyaðý bu 12 burcun eþit aralýklarla(10 derece geniþliðinde) sýralandýðý bir hayvan halkasýdýr ve yýldýzlarla pek bir ilgisi yoktur.
 * Çin Zodyaðý nasýl hesaplanýr ?
 * Çin zodyaðý hesaplanýrken kiþinin doðum yýlýnýn 12 ile bölümünde kalana göre bulunur	
 */

	public static void main(String[] args) {
		
		int birthYear;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birth year : ");
		birthYear = input.nextInt();
		
		if(birthYear % 12 == 0) {
			System.out.println("Çin zodyak burcunuz : At ");
		}
		else if(birthYear % 12 == 1) {
			System.out.println("Çin zodyak burcunuz : Horoz ");
		}
		else if(birthYear % 12 == 2) {
			System.out.println("Çin zodyak burcunuz : Köpek ");
		}
		else if(birthYear % 12 == 3) {
			System.out.println("Çin zodyak burcunuz : Domuz ");
		}
		else if(birthYear % 12 == 4) {
			System.out.println("Çin zodyak burcunuz : Fare ");
		}
		else if(birthYear % 12 == 5) {
			System.out.println("Çin zodyak burcunuz : Öküz ");
		}
		else if(birthYear % 12 == 6) {
			System.out.println("Çin zodyak burcunuz : Kaplan ");
		}
		else if(birthYear % 12 == 7) {
			System.out.println("Çin zodyak burcunuz : Tavþan ");
		}
		else if(birthYear % 12 == 8) {
			System.out.println("Çin zodyak burcunuz : Ejderha ");
		}
		else if(birthYear % 12 == 9) {
			System.out.println("Çin zodyak burcunuz : Yýlan ");
		}
		else if(birthYear % 12 == 10) {
			System.out.println("Çin zodyak burcunuz : At ");
		}
		else if(birthYear % 12 == 11) {
			System.out.println("Çin zodyak burcunuz : Koyun ");
		}

	}

}
