// link: https://www.javatpoint.com/exception-handling-in-java


// 1. Exception Hierarchy
// 2. Error vs Checked vs UnChecked
// 3. throw errors
// 4. extends exceptions

package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class MyException extends RuntimeException {

    public MyException(String errorMessage){
        super(errorMessage);
    }
}

public class Main {
    public static void main(String[] args) {
        
        try {
            fileNotFound();
            // String s = null;
            getNull();
            // int x = 100 / 0;
            // s.length();
            divideByZero();
            System.out.println("End main");
        } 
        
        // catch(Exception e) {
        //     if(e instanceof ArithmeticException) {
        //         System.out.println("ArithmeticException");
        //     } else if(e instanceof NullPointerException) {
        //         System.out.println("NullPointerException");
        //     } else{
        //         System.out.println("General Exception");
        //     }
        // }

        // catch (ArithmeticException e) {
        //     // System.out.println("division by zero");
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // } catch (NullPointerException e){
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // }

        catch(ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final Block");
        }


    }

    // throws should be used with checked exceptions
    // either throws the checked exception (FileNotFoundException in this case) or handle it 
    public static void fileNotFound() throws FileNotFoundException{
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    public static void divideByZero(){
        // int x = 100 / 0;
        throw new ArithmeticException("Hi from the division by zero exception");
    }

    public static void getNull(){
        // String s = null;
        // s.length();
        throw new NullPointerException("Hi from the null exception");
    }

    public static void getMyError(){
        throw new MyException("Hi From my error");
        // throw new RuntimeException("lkdsajflkdsajf");
    }
}
