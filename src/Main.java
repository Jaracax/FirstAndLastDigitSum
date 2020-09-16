public class Main {
    public static void main(String[] args) {

    }
    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        if(number < 0 ) {
            return -1;
        }
        int lastDigit = number % 10;

        while (number > 0 ){

            int firstDigit = number % 10;
            number /= 10;
            sum = firstDigit + lastDigit;

        }
        System.out.println(sum);
        return sum;
    }
}
