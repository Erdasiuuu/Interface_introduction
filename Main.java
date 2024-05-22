import java.util.Scanner;

public class Main {
    public static void main(String... args) {
	 Scanner scanner = new Scanner(System.in);
	int n1 = scanner.nextInt();
	int n2 = scanner.nextInt();
	Matcher matcher;
	matcher = new SimpleMatcher();
        System.out.println(matcher.match(n1, n2));
	matcher = new PrimeMatcher();
        System.out.print(matcher.match(n1, n2));
    }
}
