    public class PrimeMatcher implements Matcher {

        public int findModule(int foo, int bar) {
            int r = foo % bar;
            if (r < 0) {
                r += Math.abs(bar);
            }
            return r;
        }

        public boolean match(int number1, int number2) {
	    Matcher matcher = (n1, n2) -> {
            while (n2 != 0) {
                int tmp = n1;
                n1 = n2;
                n2 = findModule(tmp, n2);
            }
	    return number1 == 1;
	    };
            return matcher.match(number1, number2);
        }

    }

