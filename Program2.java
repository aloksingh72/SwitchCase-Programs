import java.util.Scanner;
public class Program2 {


		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your character");
			char c = sc.next().charAt(0);
			getCharacter(c);


    sc.close();
		}
	public static void getCharacter(char c){
        switch(c){

		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(c+" is the Vowel character");
				break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println(c+" is the number");
			break;
		default:
			System.out.println("Another character");



        }

    }  
}
