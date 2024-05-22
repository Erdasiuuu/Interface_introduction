import java.util.Scanner;

public class Main {

	/**
	 * @brief Программа для работы с интерфейсами
	 *
	 * Программа принимает на вход 2 числа и выводит резултат вычислений
	 * 1. Больше ли первое число второго?
	 * 2. Являются ли числа взаимно простыми?
	 *
	 */

    public static void main(String... args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.printf("Введите первое число\n");
	int n1 = scanner.nextInt();
	scanner.nextLine();
	 System.out.printf("Введите второе число\n");
	int n2 = scanner.nextInt();
	scanner.nextLine();
	Matcher matcher;
	matcher = new SimpleMatcher();
        System.out.printf("Первое число больше второго: %b\n", matcher.match(n1, n2));
	matcher = new PrimeMatcher();
        System.out.printf("Числа взаимно простые: %b\n", matcher.match(n1, n2));
    }
}
