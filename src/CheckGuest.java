import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//Nel programma bisogna:
		//creare e inizializzare l’array contenente i nomi degli invitati
		//chiedere all’utente come si chiama
		//verificare che il nome sia presente nella lista
		//lasciarlo entrare o rispedirlo cortesemente da dove è venuto
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

		System.out.println("La lista degli invitati è: ");	

		int contatore = 0;
		while(contatore <listaInvitati.length) {
			System.out.println(listaInvitati[contatore]);
			contatore++;
		}	

		Scanner scan = new Scanner(System.in);		

		System.out.println("\nTu come ti chiami: ");		
		String nomeGuest = scan.nextLine();	


	
		int j = 0;		
		
		while( j < listaInvitati.length) {
				
			if(nomeGuest.equals(listaInvitati[j])) {					
				System.out.println("okay ci sei");					
				
				break;				

			}else if (j == listaInvitati.length-1) {				
				System.out.println("non sei nella lista");			
			
			}
			j++;

		}



		//		System.out.println("La lista degli invitati è: ");
		//		Scanner scan = new Scanner(System.in);
		//		
		//		for (int i = 0; i < listaInvitati.length; i++) {
		//			
		//			System.out.print(listaInvitati[i] + ", ");			
		//		}
		//		
		//		System.out.println("\nTu come ti chiami: ");		
		//		String nomeGuest = scan.nextLine();
		//			
		//		
		//			for(int j = 0; j < listaInvitati.length; j++) {
		//				
		//				if(nomeGuest.equals(listaInvitati[j])) {
		//					
		//					System.out.println("okay ci sei");				
		//				break;
		//				}else if (j == listaInvitati.length -1) {				
		//				System.out.println("non sei nella lista");
		//				}
		//			}


		scan.close();
	}
}







