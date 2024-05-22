public class PrimeMatcher implements Matcher {
  /**
   * @brief класс для определение взаимной простоты чисел
   *
   * @param Первое число
   * @param Второе число
   *
   * Взаимно простыми считаются числа, НОД которых равен 1.
   * В данной программе используется алгоритм Евклида для нахождения НОД.
   * Берутся модули 2 чисел, чтобы работать только с положительными числами.
   * Перед началом рассчетов выбираем наибольшее число и используем алгоритм Евклида.
   *
   * @return Равен ли НОД чисел 1
   *
   */

  public boolean match(int number1, int number2) {
    Matcher matcher = (n1, n2) -> {
      n1 = Math.abs(n1);
      n2 = Math.abs(n2);
      if (n1 < n2) {
        int tmp = n1;
        n1 = n2;
        n2 = tmp;
      }
      while (n2 != 0) {
        int tmp = n1 % n2;
        n1 = n2;
        n2 = tmp;
      }
      return n1 == 1;
    };
    return matcher.match(number1, number2);
  }
}
