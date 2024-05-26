package singelton;

public class Admin {
    private static int counter = 0;
    private String adminName;
    public static Admin instance  = null; 

    private Admin(){
        this.adminName = "admin" + Admin.counter;
        Admin.counter++;
    }

    public String getAdminName(){
        return this.adminName;
    }

    public static Admin getInstance(){
        if(instance == null){
            instance = new Admin();
        }
        return instance;
    }

}
