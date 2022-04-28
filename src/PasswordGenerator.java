import java.util.Random;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class PasswordGenerator {
	
	//Method that returns a random page number using the length of the first dimension of the array.
	public static int randomPage(String[][][] array) {
		Random rand = new Random();
		int randomPage = rand.nextInt(array.length);
		
		return randomPage;
	}
	
	//Method that returns a random paragraph number using the length of the second dimension, however it uses the random page to make sure that it does not return a number out of bounds. 
	public static int randomParagraph(String[][][] array, int Page) {
		Random rand = new Random();	
		int randomParagraph = 0;
		
		switch(Page) {
		case 0:
			randomParagraph = rand.nextInt(array[Page].length);
			break;
		
		case 1:
			randomParagraph = rand.nextInt(array[Page].length);
			break;
			
		case 2:
			randomParagraph = rand.nextInt(array[Page].length);
			break;
		}

		return randomParagraph;
	}
	
	//Method that returns a random line number using the length of the third dimension, however it uses the random page and random paragraph to make sure that it does not return a number out of bounds.
	public static int randomLine(String[][][] array, int Page, int Paragraph) {
		Random rand = new Random();
		int randomLine = rand.nextInt(array[Page][Paragraph].length);
		
		return randomLine;
	}
	
	//Method that checks if there are any special characters in a string using regex. It returns true if it finds a special character.
	public static boolean checkSpecialChar(String word) {
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher(word);
		
		boolean containsSpecialChar = matcher.find();
		
		if(containsSpecialChar == true)
			return true;
		
		return false;
	}
	
	//Method that checks if there is an upper case character, it returns true if it finds one 
	public static boolean checkUpperCase(String word) { 
		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(word);
		
		boolean containsUpperCase = matcher.find();
		
		if(containsUpperCase == true)
			return true;
		
		return false;
	}
	
	//Method that checks if there is a lower case character, it returns true if it finds one. 
	public static boolean checkLowerCase(String word) { 
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(word);
		
		boolean containsLowerCase = matcher.find();
		
		if(containsLowerCase == true)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		//Initializing the 3 dimensional book array
		final String [][][] book = {
				{
					{"ALICE was beginning to get very tired of sitting by her sister on the\n",
					"bank, and of having nothing to do. Once or twice she had peeped into the\n",
					"book her sister was reading, but it had no pictures or conversations in\n",
					"it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
					"conversations?\"\n"},
					
					{"So she was considering in her own mind (as well as she could, for the\n",
					"day made her feel very sleepy and stupid), whether the pleasure of\n",
					"making a daisy-chain would be worth the trouble of getting up and\n",
					"picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
					"close by her.\n"},
					
					{"There was nothing so very remarkable in that, nor did Alice think it so\n",
					"very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
					"dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
					"out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
					"started to her feet, for it flashed across her mind that she had never\n",
					"before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
					"out of it, and, burning with curiosity, she ran across the field after\n",
					"it and was just in time to see it pop down a large rabbit-hole, under\n",
					"the hedge. In another moment, down went Alice after it!\n"}
				},
					
				{
					{"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
					"telescope!\"\n"},
					
					{"And so it was indeed! She was now only ten inches high, and her face\n",
					"brightened up at the thought that she was now the right size for going\n",
					"through the little door into that lovely garden.\n"},
					
					{"After awhile, finding that nothing more happened, she decided on going\n",
					"into the garden at once; but, alas for poor Alice! When she got to the\n",
					"door, she found she had forgotten the little golden key, and when she\n",
					"went back to the table for it, she found she could not possibly reach\n",
					"it: she could see it quite plainly through the glass and she tried her\n",
					"best to climb up one of the legs of the table, but it was too slippery,\n",
					"and when she had tired herself out with trying, the poor little thing\n",
					"sat down and cried.\n"},
					
					{"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
					"sharply. \"I advise you to leave off this minute!\" She generally gave\n",
					"herself very good advice (though she very seldom followed it), and\n",
					"sometimes she scolded herself so severely as to bring tears into her\n",
					"eyes.\n"},
					
					{"Soon her eye fell on a little glass box that was lying under the table:\n",
					"she opened it and found in it a very small cake, on which the words \"EAT\n",
					"ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
					"Alice, \"and if it makes me grow larger, I can reach the key; and if it\n",
					"makes me grow smaller, I can creep under the door: so either way I'll\n",
					"get into the garden, and I don't care which happens!\"\n"},
					
					{"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
					"way?\" holding her hand on the top of her head to feel which way she was\n",
					"growing; and she was quite surprised to find that she remained the same\n",
					"size. So she set to work and very soon finished off the cake.\n"}
				},
				
				{
					{"The King and Queen of Hearts were seated on their throne when they\n",
					"arrived, with a great crowd assembled about them--all sorts of little\n",
					"birds and beasts, as well as the whole pack of cards: the Knave was\n",
					"standing before them, in chains, with a soldier on each side to guard\n",
					"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
					"and a scroll of parchment in the other. In the very middle of the court\n",
					"was a table, with a large dish of tarts upon it. \"I wish they'd get the\n",
					"trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
					
					{"The judge, by the way, was the King and he wore his crown over his great\n",
					"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
					"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
					
					{"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
					
					{"\"HERALD, read the accusation!\" said the King.\n"}
				}
		};
		Random rand = new Random();
		
		//Welcome Message
		System.out.println("Welcome to the password generator game!");
		
		//Empty password string used to truncate the words to.
		String password = "";
		
		int passwordCondition = 0; //Password Condition that turns into 1 if the password respects the rules.
		int passwordCounter = 0; //Password counter that counts the number of passwords generated
		do {
			int wordCondition = 0; //Word Condition that turns into 1 if the word respects the rules. 
			int wordCounter = 0; //Word counter that counts the number of words generated. 
			
			//The counters for failing to respect a rule
			int newlineCounter = 0;
			int singleCounter = 0;
			int equalCounter = 0;
			int lengthCounter = 0;
			int upperCounter = 0;
			int lowerCounter = 0;
			int specialCounter = 0;
			
			do {
				
				//Generate 3 random numbers Page, Paragraph and Line. 
				int randomPage = randomPage(book);
				int randomParagraph = randomParagraph(book, randomPage);
				int randomLine = randomLine(book, randomPage, randomParagraph);
				
				//Grabs a line using the random numbers from the array and puts it into a string. 
				String line = book[randomPage][randomParagraph][randomLine];
				
				//Splits the string by the empty spaces and puts it into an array
				String[] arrayLine = line.split(" ");
				
				//Grab a random word using a random number from the new generated array of the line.
				String word = arrayLine[rand.nextInt(arrayLine.length)];
				
				//Checks if the word respects the single rule, the newline character rule and the equal rule.
				if(word.length() != 1 
						&& word.charAt(word.length() - 1) != '\n'
						&& password.contains(word) == false) {
					
					password += word; //If it does respect the rules, then the word is truncated to the password string. 
					wordCounter++; //Word counter goes up and we repeat the following steps.
				} else {
					if(word.length() == 1) //If single rule fails the fail counter goes up.
						singleCounter++;
					
					if(word.charAt(word.length() - 1) == '\n') //If newline character rule fails the counter goes up.
						newlineCounter++;
					
					if(password.contains(word) == false) //If equal rule fails the counter goes up
						equalCounter++;
				}
				
				if(wordCounter == 3) { //Once we have successfully truncated 3 words to the password string we check the other rules.
					
					//Checks if the word respects the length rule, special rule, upper rule and lower rule. 
					if((password.length() > 8 && password.length() < 16) 
							&& checkSpecialChar(password) == true 
							&& checkUpperCase(password) == true 
							&& checkLowerCase(password) == true) {
						
						passwordCounter++; //If it respects the rules the password counter goes up by 1.  
						wordCondition = 1; //If it respects the rules the wordCondition is now 1 and it breaks the do while loop.
						
					} else {
						
						if(password.length() < 8 && password.length() > 16) //If the length rule fails the counter goes up. 
							lengthCounter++;
						
						if(checkSpecialChar(password) == false) //If the special rule fails the counter goes up 
							specialCounter++;
						
						if(checkUpperCase(password) == false) //If the upper rule fails the counter goes up.
							upperCounter++;
						
						if(checkLowerCase(password) == false) { //If the lower rule fails the counter goes up, and the passwordCondition is now 1 and the main do while loop breaks.
							lowerCounter++;
							passwordCondition = 1;
							break;
						}
						
						wordCounter = 0; //If a rule is failed the word counter goes back to 0 and we restart the do while loop. 
						password = ""; //If a rule is failed the password is now empty and we restart the do while loop. 
					}
				}
				
			} while(wordCondition == 0);
			
			//Printing the passwords and the counters and formatting.
			System.out.printf("%s %-18s %s\n", "Password = ", password, "NewLine = " + newlineCounter + " Single = " + singleCounter + " Equal = " + equalCounter + " Length = " + lengthCounter + " Upper = " + upperCounter + " Lower = " + lowerCounter + " Special = " + specialCounter);
			
			if(passwordCounter == 10000 || lowerCounter == 1) {
				passwordCondition = 1;
			}

		} while(passwordCondition == 0);
		
		//Exiting message. 
		System.out.println("Total passwords generated: " + passwordCounter);
		System.out.println("Thanks for using the password generator game. Good Bye.");
	}

}
