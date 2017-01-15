import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            calculator calc = new calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg:");
                String first = sc.next();
                System.out.println("Enter second arg:");
                String second = sc.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no ");
                exit = sc.next();
            }
        } finally {
            sc.close();
        }
    }
}