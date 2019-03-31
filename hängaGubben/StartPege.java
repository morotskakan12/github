import java.util.Scanner;
public class StartPege{
	
	/**

	 * i main kommer anvendra infon och förusänigaran för spelet bestämas. 	  

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lopp= true;
		boolean innerLopp= true;
		// två funktoner om man vill starra om spelet och om men skriver in fel ska pogramet inte stängas ner 
		System.out.println("hej och välkomen.");
		while(lopp == true){
		innerLopp= true;
		System.out.println("vill du spela på Svenska eller Engelska");
		System.out.println("hello and welcome. you want to play on Swedish or English");
		String hiddenWord = sc.nextLine();
		if ((hiddenWord.equals("Svenska"))||(hiddenWord.equals("Swedish"))){
			while(innerLopp==true){
			System.out.println("vill du spela igen");
			System.out.println("svara Ja eller Nej");
			String playagen = sc.nextLine();
			if (playagen.equals("Nej")){
				lopp = false;
				innerLopp= false;
			}else if(playagen.equals("Ja")){
				break; 
			}else{
			System.out.println("fel gör om");
			
			}
			}
		}else if ((hiddenWord.equals("Engelska"))||(hiddenWord.equals("English"))){
			while(innerLopp==true){
				System.out.println("you want to play again");
				System.out.println("answer Yes or No");
				String playagen = sc.nextLine();
				if (playagen.equals("No")){
					lopp = false;
					innerLopp= false;
				}else if(playagen.equals("Yes")){
					break;
				}else{
				System.out.println("try again");
				System.out.println("");
				}
			}
		}else{
			System.out.println("Du kan bara skriva in Svenska eller Engelska. vänligen försök igen");
			System.out.println("You can only enter Swedish or English. please try again");
			System.out.println("");
		}
		
	}
		System.out.println("");
		System.out.println("basi basi");
}
}