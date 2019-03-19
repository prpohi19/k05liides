import java.util.*;

public class CalcMain {
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		Calculator calc = new Calculator();
		ReadNumbers readNumbers = new ReadNumbers();
		boolean check = false;
		String input = "";
		System.out.println("---");
		System.out.println("Kalkulaator");
		System.out.println("---");
		System.out.println("Võimalikud valikud: liida, lahuta, korruta, jaga");
		System.out.print("Sisestage valik: ");
		while(check != true){
			input = reader.nextLine();
			if(input.equals("liida")){
				int[] numbers = readNumbers.ReadNumbers();
				calc.Add(numbers);
				check = true;
			}
			else if(input.equals("lahuta")){
				int[] numbers = readNumbers.ReadNumbers();
				calc.Deduct(numbers);
				check = true;
			}
			else if(input.equals("korruta")){
				int[] numbers = readNumbers.ReadNumbers();
				calc.Multiply(numbers);
				check = true;
			}
			else if(input.equals("jaga")){
				int[] numbers = readNumbers.ReadNumbers();
				calc.Divide(numbers);
				check = true;
			}
			else
			{
				System.out.print("Tundmatu valik, sisestage valik uuesti: ");
			}
		}
		System.out.println("---");
	}
}
