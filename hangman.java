import java.util.Scanner;

public class hangman{																			

	private static String[] words = {"Garrett", "Kehardip", "Lindsay", "Tarik" };				//todo Add words or link to dict like before
	private static String word = words[(int)(Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");	//randomizer
	private static int count = 0;																//number of wrong guesses

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 6 && asterisk.contains("*")) {
			hangmanImage();
			System.out.println("Guess a letter in the word:");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		if (count == 6)
			hangmanImage();
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			if (count == 6)
				return;
			System.out.println("Wrong letter, try again!");
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Congratulations, you actually survived!");
			System.out.println("The word was " + word);
		}
	}


//Output notification and image with each bad guess.
//todo
//try to make it so each output will occupy approx a screen
//Maybe clear screen then draw after each input
//Display a word bank with words available to choose from
//Vet input! Only chars, one at a time. Disallow chars already tried. Recognize both upper and lower case.
	public static void hangmanImage() {
		if (count == 0) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
		    	System.out.println("|     |                  | |");
       	    		System.out.println("|     |                  |_|");
			System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|_ _ _|\n");
		}
		if (count == 1) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
		    	System.out.println("|     |                  | |");
       	    		System.out.println("|     |                 _|_|_");
        		System.out.println("|     |               /       \\");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |               \\_ _ _ _/");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|_ _ _|\n");
		}
		if (count == 2) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
		    	System.out.println("|     |                  | |");
       	    		System.out.println("|     |                 _|_|_");
        		System.out.println("|     |               /       \\");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |               \\_ _ _ _/");
        		System.out.println("|     |                 (---)");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 | _ |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|_ _ _|\n");
		}
		if (count == 3) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
		    	System.out.println("|     |                  | |");
       	    		System.out.println("|     |                 _|_|_");
        		System.out.println("|     |               /       \\");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |               \\_ _ _ _/");
        		System.out.println("|     |              _ _(---)");
        		System.out.println("|     |             /       |");
        		System.out.println("|     |            /   /|   |");
        		System.out.println("|     |           /   / |   |");
        		System.out.println("|     |          /   /  |   |");
        		System.out.println("|     |         (_ _/   |   |");
        		System.out.println("|     |                 |   |");
        		System.out.println("|     |                 | _ |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |");
      			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|_ _ _|\n");
		}
		if (count == 4) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
      	 		System.out.println("|                                   |");
       			System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
       			System.out.println("|     |                  | |");
	        	System.out.println("|     |                  | |");
           		System.out.println("|     |                 _|_|_");
       			System.out.println("|     |               /       \\");
       			System.out.println("|     |              |         |");
       			System.out.println("|     |              |         |");
       			System.out.println("|     |               \\_ _ _ _/");
       			System.out.println("|     |              _ _(---)_ _");
       			System.out.println("|     |             /           \\");
       			System.out.println("|     |            /   /|   |\\   \\");
        		System.out.println("|     |           /   / |   | \\   \\");
        		System.out.println("|     |          /   /  |   |  \\   \\");
        		System.out.println("|     |         (_ _/   |   |   \\_ _)");
       			System.out.println("|     |                 |   |");
       			System.out.println("|     |                 | _ |");
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|     |"); 
       			System.out.println("|     |");
       			System.out.println("|     |");
       			System.out.println("|_ _ _|\n");
		}
		if (count == 5) {
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
	        	System.out.println("|     |                  | |");
            		System.out.println("|     |                 _|_|_");
        		System.out.println("|     |               /       \\");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |              |         |");
        		System.out.println("|     |               \\_ _ _ _/");
        		System.out.println("|     |              _ _(---)_ _");
        		System.out.println("|     |             /           \\");
        		System.out.println("|     |            /   /|   |\\   \\");
        		System.out.println("|     |           /   / |   | \\   \\");
        		System.out.println("|     |          /   /  |   |  \\   \\");
        		System.out.println("|     |         (_ _/   |   |   \\_ _)");
        		System.out.println("|     |                /    |");
        		System.out.println("|     |               /   _ |");
        		System.out.println("|     |              /   /");
        		System.out.println("|     |             /   /");
        		System.out.println("|     |            /   /");
        		System.out.println("|     |           /   /");
        		System.out.println("|     |          (_ _/");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|_ _ _|\n");
		}
		if (count == 6) {
			System.out.println("GAME OVER!");
			System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
       			System.out.println("|                                   |");
        		System.out.println("|      __ __ __ __ __ __ __ __ __ __|");
        		System.out.println("|     |                  | |");
			System.out.println("|     |                  | |");
       	 	   	System.out.println("|     |                 _|_|_");
        		System.out.println("|     |               /       \\");
       			System.out.println("|     |              |  X   X  |");
       			System.out.println("|     |              |         |");
       			System.out.println("|     |               \\_ _ _ _/");
       			System.out.println("|     |              _ _(---)_ _");
       			System.out.println("|     |             /           \\");
       			System.out.println("|     |            /   /|   |\\   \\");
        		System.out.println("|     |           /   / |   | \\   \\");
        		System.out.println("|     |          /   /  |   |  \\   \\");
        		System.out.println("|     |         (_ _/   |   |   \\_ _)");
        		System.out.println("|     |                /     \\");
        		System.out.println("|     |               /   _   \\");
        		System.out.println("|     |              /   / \\   \\");
        		System.out.println("|     |             /   /   \\   \\");
        		System.out.println("|     |            /   /     \\   \\");
        		System.out.println("|     |           /   /       \\   \\");
        		System.out.println("|     |          (_ _/         \\_ _)");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|     |");
        		System.out.println("|_ _ _|\n");
			System.out.println("YOU'VE BEEN HUNG!");
			System.out.println("The word was " + word);
		}
	}
}
