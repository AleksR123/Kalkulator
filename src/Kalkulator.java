


	import java.util.Scanner;

	public class Kalkulator {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			System.out.println("Vnesi go prviot broj: ");
			double a = input.nextDouble();
			System.out.println("Vnesi ja posakuvanata operacija: ");
			String operacija = scan.nextLine();
			System.out.println("Vnesi go vtoriot broj: ");
			double b = input.nextDouble();
			double c;
			switch (operacija) {
			
			case "+" :
				c=a+b;
				System.out.println(a+operacija+b+"="+c);
			  break;
			case "-" :
				c=a-b;
				System.out.println(a+operacija+b+"="+c);
			  break;
			case "*" :
				c=a*b;
				System.out.println(a+operacija+b+"="+c);
			  break;	
			case "/" :
				c=a/b;
				System.out.println(a+operacija+b+"="+c);
			  break;
			default:
				System.out.println("Proverete sto imate napisano");
			  break;
			}
		}
	}


