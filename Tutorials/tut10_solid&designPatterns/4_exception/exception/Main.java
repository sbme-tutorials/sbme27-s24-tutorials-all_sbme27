

// link: https://www.javatpoint.com/exception-handling-in-java

public class Main {
    public static void main(String[] args) {
        try {
            getNull();
            divideByZero();
            System.out.println("End main");
        } 

        // catch (ArithmeticException e) {
        //     System.out.println("division by zero");
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // }

        // catch(ArithmeticException | NullPointerException e) {
        //     System.out.println(e.getMessage());
        // }

        catch(Exception e) {
            if(e instanceof ArithmeticException) {
                System.out.println("ArithmeticException");
            } else if(e instanceof NullPointerException) {
                System.out.println("NullPointerException");
            } else{
                System.out.println("General Exception");
            }
        } finally {
            System.out.println("Final Block");
        }


    }

    public static void divideByZero() throws ArithmeticException{
        throw new ArithmeticException("Hi from the division by zero exception");
    }

    public static void getNull(){
        throw new NullPointerException("Hi from the null exception");
    }
}
