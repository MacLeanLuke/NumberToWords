public class Main {
    public static void main(String[] args) {
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(505);
        NumberToWords.numberToWords(987654);
        NumberToWords.numberToWords(19846);
        NumberToWords.numberToWords(10000);
        System.out.println(NumberToWords.reverse(-10000));
        System.out.println(NumberToWords.reverse(-2));
        System.out.println(NumberToWords.reverse(-23456));
        System.out.println(NumberToWords.reverse(0));
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(-222));

    }
}
