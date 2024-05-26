public class SubClass extends SuperClass {

    private static int id_generator = 0;
    private int id = 0;

    public SubClass(){
        this.id = ++SubClass.id_generator;
    }

    @Override
    protected void display(){
        System.out.println("SubClass Display Function");
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
