import java.util.Scanner;
public class ChinaZodiacExample {
/*
 * �in Zodya�� nedir ?
 * 4000 bin y�ld�r kullan�lan bir astroloji �e�ididir.
 * �in astrolojisi ve insanlar� 12 de�i�ik bur� ve sembollerle tan�mlar.
 * �in Zodya�� bu 12 burcun e�it aral�klarla(10 derece geni�li�inde) s�raland��� bir hayvan halkas�d�r ve y�ld�zlarla pek bir ilgisi yoktur.
 * �in Zodya�� nas�l hesaplan�r ?
 * �in zodya�� hesaplan�rken ki�inin do�um y�l�n�n 12 ile b�l�m�nde kalana g�re bulunur	
 */

	public static void main(String[] args) {
		
		int birthYear;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birth year : ");
		birthYear = input.nextInt();
		
		if(birthYear % 12 == 0) {
			System.out.println("�in zodyak burcunuz : At ");
		}
		else if(birthYear % 12 == 1) {
			System.out.println("�in zodyak burcunuz : Horoz ");
		}
		else if(birthYear % 12 == 2) {
			System.out.println("�in zodyak burcunuz : K�pek ");
		}
		else if(birthYear % 12 == 3) {
			System.out.println("�in zodyak burcunuz : Domuz ");
		}
		else if(birthYear % 12 == 4) {
			System.out.println("�in zodyak burcunuz : Fare ");
		}
		else if(birthYear % 12 == 5) {
			System.out.println("�in zodyak burcunuz : �k�z ");
		}
		else if(birthYear % 12 == 6) {
			System.out.println("�in zodyak burcunuz : Kaplan ");
		}
		else if(birthYear % 12 == 7) {
			System.out.println("�in zodyak burcunuz : Tav�an ");
		}
		else if(birthYear % 12 == 8) {
			System.out.println("�in zodyak burcunuz : Ejderha ");
		}
		else if(birthYear % 12 == 9) {
			System.out.println("�in zodyak burcunuz : Y�lan ");
		}
		else if(birthYear % 12 == 10) {
			System.out.println("�in zodyak burcunuz : At ");
		}
		else if(birthYear % 12 == 11) {
			System.out.println("�in zodyak burcunuz : Koyun ");
		}

	}

}
