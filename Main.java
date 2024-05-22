import java.util.Scanner;

public class Main {
    public static void main(String... args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.printf("Введите первое число");
	int n1 = scanner.nextInt();
	scanner.nextLine();
	 System.out.printf("Введите второе число");
	int n2 = scanner.nextInt();
	scanner.nextLine();
	Matcher matcher;
	matcher = new SimpleMatcher();
        System.out.printf("Первое число больше второго: %d", matcher.match(n1, n2));
	matcher = new PrimeMatcher();
        System.out.printf("Числа взаимно простые: %d", matcher.match(n1, n2));
    }
}
