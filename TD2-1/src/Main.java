//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Scanner keyb= new Scanner(System.in);
		int hdeb,mindeb,hfin,minfin, duree;
		
		System.out.println("Entrer l'heure de début");
		hdeb= keyb.nextInt();
		keyb.nextLine();
		
		System.out.println("Entrer les minutes de début");
		mindeb= keyb.nextInt();
		keyb.nextLine();
		
		System.out.println("Entrer l'heure de fin");
		hfin= keyb.nextInt();
		keyb.nextLine();
		
		System.out.println("Entrer les minutes de fin");
		minfin= keyb.nextInt();
		keyb.nextLine();*/
		
		int hdeb,mindeb,hfin,minfin, duree;
		
		hdeb=Integer.parseInt(args[0]);
		
		mindeb=Integer.parseInt(args[1]);
		
		hfin=Integer.parseInt(args[2]);
		
		minfin=Integer.parseInt(args[3]);
		
		duree= calculerDuree(hdeb,mindeb,hfin,minfin);
		if (duree==0) {
			System.out.println("Erreur; le début est après la fin");
		}
		else System.out.println("La durée de l'activité est de " + duree + " minutes.");
		//keyb.close();
	}
		static int calculerDuree(int h1, int m1, int h2, int m2) {
			int m3;
			m1=m1+60*h1;
			m2=m2+60*h2;
			if(m1<m2) {
				m3= m2-m1;
			}
			else m3=0;
			return m3;
		}
	
	
}
