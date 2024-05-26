package d_interface;

public class Bat implements Animal, Bird{

    @Override
    public Boolean canFly() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Boolean giveBirth() {
        // TODO Auto-generated method stub
        return true; 
    }
    
}
