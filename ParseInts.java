import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a line of input: ");
            String inputLine = scanner.nextLine();

            int sum = 0;
            try (Scanner tokenizer = new Scanner(inputLine)) {
                while (tokenizer.hasNext()) {
                    try {
                        int num = Integer.parseInt(tokenizer.next());
                        sum += num;
                    } catch (NumberFormatException e) {
                    }
                }
            }

            System.out.println("The sum of the integers on the line is " + sum + ".");
        }
    }
}

