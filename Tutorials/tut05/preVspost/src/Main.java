public class Main {
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.printf("x1 = %d\n".formatted(++x));
        System.out.printf("x2 = %d\n".formatted(x++));
        System.out.printf("x3 = %d\n".formatted(x));
        int result1 = add(x++, ++y);
        System.out.printf("x4 = %d\n".formatted(x));
        System.out.printf("y1 = %d\n".formatted(y));
        System.out.printf("result1 = %d\n".formatted(result1++));
    }
}