import  java.util.Random;
import static javax.swing.JOptionPane.*;
	public class hemmatest {
		public static void main (String[] arg) { 
			
			Random rand = new Random();
			int lopp = 0;
			int rätt = 0;
			int fel = 10;
			boolean rätta;
		 while(lopp == 10){
			int räknäsätt = rand.nextInt(4)+1; // slummar räknäsett
			int svar = 0 ;
			
			if (räknäsätt == 1){ 
					int talet = rand.nextInt(100)+1;
					int talet2 = rand.nextInt(100)+1;
					svar = talet + talet2;
			}
			else if (räknäsätt == 2){
						int talet = rand.nextInt(100)+1;
						int talet2 = rand.nextInt(100)+1;
					 if (talet2>talet){ //för att svaret inte ska vara negativt
						while (talet> talet2){
						talet2 = rand.nextInt(100)+1;
						}
					}
					svar = talet - talet2;
			
			}
						
			
			
			if (räknäsätt ==3){
					int talet = rand.nextInt(100)+1;
					int talet2 = rand.nextInt(100)+1;
					svar = talet*talet2;
			}
			else if (räknäsätt == 4){ // skpa spärr för desemal tal 
					int talet = rand.nextInt(100)+1;
					int talet2 = rand.nextInt(100)+1;
					svar = talet/talet2	;
				}
				/*if (rätta = true){
				rätt = rätt+1;}*/
				
				
				lopp = lopp+1;   } 
				//fel = fel-rätt;
				showMessageDialog(null, fel+rätt );

			/*skapa variabler
			två
			loppa tills variabel = 10 
			slummpa nummer 
			slummpa bry ut, supptrahera , addera, faktoresera,
			
			skriv ut slummpa summa?summa=tal, teljare? nämnare= kvot, multiplerera, supptrahera
			ha fyra ruter med ett rätt svaras alternativ
			om rätt läggg till nummer på tal 
			lägg till ett nummer på lopen
			skriv ut så här många rätt och fel*/
		 }
	}
			
			
		    
		 
		 
			 