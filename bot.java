import java.io.*;
import java.util.*;
public class bot {
	public static void main(String args[]) throws IOException{
		String msg = "";
		String temp = "";
		Random rand = new Random();
		while(msg != null){
			System.out.println("Enter Message:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			msg = br.readLine();
			if(msg.equals("bye")){
				System.out.println("Good bye!");
				break;
			}
			else if(msg.equals("Hi")){
				int ran = rand.nextInt(5);
				switch(ran){
				case 0:
					temp = "Hi too";
					break;
				case 1:
					temp = "Feeling great!";
					break;
				case 2:
					temp = "It's going to be a great day.";
					break;
				case 3:
					temp = "Salutations!";
					break;
				case 4:
					temp = "Greetings!";
					break;
				}
				System.out.println("bot: "+temp);
			}
			else if(msg.equals("How are you"))
				System.out.println("bot:I'm fine. How about you");
			else{
				int dom = rand.nextInt(20);
				switch(dom){
				case 0:
					temp = "I am a coding lover. What about you?";
					break;
				case 1:
					temp = "You must have a unique dream. Your dreams are the things that makes you much stronger";
					break;
				case 2:
					temp = "It's boring na.. Speak something.";
					break;
				case 3:
					temp = "What do u think about me?";
					break;
				case 4:
					temp = "That's a nice thing.";
					break;
				case 5:
					temp = "Hmmm.. What doing?";
					break;
				case 6:
					temp = "What is your passion?";
					break;
				case 7:
					temp = "What are all your hobbies?";
					break;
				case 8:
					temp = "Tell me some thing. I'm bored..";
					break;
				case 9:
					temp = "Nice to hear from you.";
					break;
				case 10:
					temp = "Hmm..";
					break;
				case 11:
					temp = "Ok";
					break;
				case 12:
					temp = "I like Steve Jobs very much. What about you?";
					break;
				case 13:
					temp = "What are you doing now?";
					break;
				case 14:
					temp = "Uff.. That's a great thing..";
					break;
				case 15:
					temp = "LoL!..";
					break;
				case 16:
					temp = "Sorry! I can't understand what you said";
					break;
				case 17:
					temp = "Do you hear songs??";
					break;
				case 18:
					temp = "Tell me about your profession..";
					break;
				case 19:
					temp = "When I start typing few lines of code, I used to get hell lot of errors..LoL..";
					break;
				}
				System.out.println("bot: "+temp);
			}
		}
	}
}

