public class lesson_2 {
    public static void main(String[] args){
        System.out.println("Находиться ли сумма чисел в заданном промежутке ? " + checkSum(3,7));
        System.out.println("Мое число " + (numbersPositiveOrNegative (-3) ? "Положительное число" : "Отрицательное число"));
        System.out.println(isNegative(4));
        String s = "Илья Орлов";
        int count = 5;
        wordNumber(s,5);

    }

    private static boolean checkSum(int x, int y){
        int sum = x + y;
        boolean result = sum <=20 && sum >= 10;
        return result;
    }
    private static boolean numbersPositiveOrNegative(int d){
        return d >= 0;}

    private static  boolean isNegative(int a) {
        return a < 0;
    }
    private static void wordNumber(String s,int count){
        for(int c = 0; c < count; c++){
            System.out.println(s);
        }
    }
}
