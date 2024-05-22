public class SimpleMatcher implements Matcher {
  public boolean match(int number1, int number2) {
    Matcher matcher = (n1, n2) -> n1 > n2;
    return matcher.match(number1, number2);
  }
}
