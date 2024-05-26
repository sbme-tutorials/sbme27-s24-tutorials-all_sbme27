public class Test {
    int x;
    int y;
    static int z;
    Test(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(y);
        System.out.println(Test.z);
    }
}
