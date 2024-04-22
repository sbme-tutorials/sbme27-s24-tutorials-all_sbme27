package d_interface;

public interface Bird {
    default Boolean canFly(){
        return true;
    }
}
