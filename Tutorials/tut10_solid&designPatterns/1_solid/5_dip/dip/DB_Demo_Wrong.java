package dip;
class DB1 {

    DB1(String url, String username, String password){
        
    }
    
    void insert(){
        // insert record
    }
    void update(){
        // update record
    }
    void delete(){
        // delete record
    }
    void select(){
        // select record
    }
}

class PasswordManager {

    
    DB1 db = new DB1("url", "username", "password");


    void insert(){
        db.insert();
    }

}

public class DB_Demo_Wrong {

    // what if I want to replace DB1 with another faster and more secure db like DB2?
    
}
