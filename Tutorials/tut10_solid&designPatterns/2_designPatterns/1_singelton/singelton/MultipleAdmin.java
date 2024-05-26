package singelton;

public class MultipleAdmin {
    private static int counter = 0;
    private String adminName;
    static MultipleAdmin singleAdmin = null;

    private MultipleAdmin(){
        this.adminName = "admin" + MultipleAdmin.counter;
        MultipleAdmin.counter++;
    }

    static public MultipleAdmin getInstance(){

        if(singleAdmin == null){
            singleAdmin = new MultipleAdmin();
        }
        return singleAdmin;
    }

    public String getAdminName(){
        return this.adminName;
    }


}
