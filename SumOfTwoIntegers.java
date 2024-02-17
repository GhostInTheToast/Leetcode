public class SumOfTwoIntegers {

    // non binary method
    public int getSum(int a, int b) {
        if (a > b) {
            if (b >= 0) {
                for (int i = 0; i < b; i++) {
                    a++;
                }
                return a;
            }
            else {
                for (int i = 0; i > b; i--) {
                    a--;
                }
                return a;
            }

        }
        else {
            if (a >= 0) {
                for (int i = 0; i < a; i++) {
                    b++;
                }
                return b;
            }
            else {
                for (int i = 0; i > a; i--) {
                    b--;
                }
                return b;
            }

        }

    }

}
