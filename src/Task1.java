public class Task1 {

  static class calculate{

    static int sum (int sum1, int sum2, int sum3){

        int arif = (sum1+sum2+sum3)/3;
        return arif;
    }

    public static void main(String[] args) {
        int num1 = 2, num2 = 5, num3 = 10;


        int arif = sum(num1, num2, num3);

        System.out.println("Среднее арифметическое - "+ arif );
    }

}
}
