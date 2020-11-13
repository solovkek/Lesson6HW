public class Task2 {


    static class Conversion {

        static int cur(int cur1, int cur2) {

            int a = (cur1 / cur2);
            return a;
        }


        public static void main(String[] args) {

            int currUAH = 3000, curr = 28;

            int a = cur(currUAH, curr);

            System.out.println(a);


        }
    }
}
