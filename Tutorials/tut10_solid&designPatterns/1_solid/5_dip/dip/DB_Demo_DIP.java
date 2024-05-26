package dip;
abstract class DB {
    
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

class DB1 extends DB {
    DB1(String url, String username, String password){}
}


class DB2 extends DB {
    DB2(String token){}
}

class PasswordManager {

    
    DB db;

    PasswordManager(DB db){
        this.db = db;
    }

    void insert(){
        db.insert();
    }

}

public class DB_Demo_DIP {

    // DB db1 = new DB1(null, null, null);
    DB db2 = new DB2(null);
    PasswordManager user = new PasswordManager(db2);
    
}

