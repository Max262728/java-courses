import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            calculator calc = new calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg:");
                int first = sc.nextInt();
                System.out.println("Enter second arg:");
                int second = sc.nextInt();
                System.out.println("Enter action:");
                String action = sc.next();
                if(action.equals("plus"))
                {
                    calc.add(first,second);
                    System.out.println("Result: " + calc.getResult());
                }
                if (action.equals("minus"))
                {
                    calc.minus(first,second);
                    System.out.println("Result: " + calc.getResult());
                }
                if (action.equals("share"))
                {
                    calc.share(first,second);
                    System.out.println("Result: " + calc.getResult());
                }

                if (action.equals("multiply"))
                {
                    calc.multiply(first,second);
                    System.out.println("Result: " + calc.getResult());
                }
                if(action.equals("stepen"))
                {
                    calc.stepen(first,second);
                    System.out.println("Result: " + calc.getResult());
                }
                System.out.println("Clean resutl : yes/no");
                String clres = sc.next();
                if(clres.equals("yes")) {
                    calc.cleanResult();
                    System.out.println("Exit : yes/no ");
                    exit = sc.next();
                }
            }
        } finally {
            sc.close();
        }
    }

}