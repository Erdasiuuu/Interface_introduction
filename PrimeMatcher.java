    public class PrimeMatcher implements Matcher {

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
	    System.out.println(n1);
	    return number1 == 1;
	    };
            return matcher.match(number1, number2);
        }

    }

