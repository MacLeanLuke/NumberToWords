public class NumberToWords {
    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseDigitCount = getDigitCount(reverseNumber);
            int diffDigitCount = numberDigitCount - reverseDigitCount;
            while (reverseNumber > 0){
                int digit = reverseNumber % 10;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Number");
                        break;
                }
                reverseNumber /= 10;
            }
            for (int i = 0; i < diffDigitCount; i++){
                System.out.println("Zero");
            }

        }
    }
    public static int reverse(int number){
        int reverseNumber = 0;
        if (number > 0){
            while (number > 0){
                int digit = number % 10;
                number /= 10;
                reverseNumber *= 10;
                reverseNumber += digit;
            }
        } else {
            while (number < 0) {
                int digit = number % 10;
                number /= 10;
                reverseNumber *= 10;
                reverseNumber += digit;
            }
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number == 0){
            count = 1;
        } else if (number < 0){
            count = -1;
        } else {
            while (number > 0){
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
