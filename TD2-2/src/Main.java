//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner keyb= new Scanner(System.in);
		int debut, fin, nbAnneesBis;
		
		System.out.println("Entrer le début de l'intervale");
		debut= keyb.nextInt();
		keyb.nextLine();
		
		System.out.println("Entrer la fin de l'intervale");
		fin= keyb.nextInt();
		keyb.nextLine();*/
		
		int debut, fin, nbAnneesBis;
		
		debut=Integer.parseInt(args[0]);
		
		fin=Integer.parseInt(args[1]);
		
		nbAnneesBis=0;
		
		for (int i=debut;i<fin;i++ ) {
			if (estBissextile(i)==true) {
				nbAnneesBis++;
			}
		}
		System.out.println("Il y a " + nbAnneesBis + " année(s) bissextile(s) dans l'intervale de " + debut + " et " + fin);
		
		//keyb.close();
	}
	
	static boolean estBissextile(int x) {
		if ((x%400)==0) {
			return true;
		}
		else {
			if ((x%4)==0) {
				if ((x%100)!=0) {
					return true;
				}
				else return false;
			}
			else return false;
		}
	}
	//allllllllllllllllllloooooooo
	
}
