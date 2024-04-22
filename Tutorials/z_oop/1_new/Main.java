public class Main{

    public static void test1(int[] numbers){
        int number1 = 4;
        System.out.println("Hi from test1");
        test2(numbers);
    }

    public static void test2(int [] numbers2){
        int number2 = 5;
        int[] numbers = new int[6];
        System.out.println("Hi from test");
    }

    public static void main(String[] args){
        int number = 3;
        int[] nums = new int[5];
        test1(nums);
    }
}