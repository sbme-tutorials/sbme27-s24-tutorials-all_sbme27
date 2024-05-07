package singelton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<MultipleAdmin> multiplAdminList = new ArrayList<MultipleAdmin>();
        // for(int i = 0; i < 3; i++) {
        //     multiplAdminList.add(new MultipleAdmin());
        // }
        // for(MultipleAdmin admin : multiplAdminList) {
        //     System.out.println("");
        //     System.out.println(admin.getAdminName());
        // }

        List<Admin> adminList = new ArrayList<Admin>();
        for(int i = 0; i < 3; i++) {
            adminList.add(Admin.getInstance());
        }
        for(Admin admin : adminList) {
            System.out.println("");
            System.out.println(admin.getAdminName());
        }

        // SClass s1 = SClass.getInstance();
        // SClass s2 = SClass.getInstance();
    }
}