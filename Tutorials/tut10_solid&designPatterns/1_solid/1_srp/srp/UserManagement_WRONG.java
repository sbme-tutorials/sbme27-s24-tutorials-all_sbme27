package srp;
class User {
    
}

// Wrong implementation violating SRP
public class UserManagement_WRONG {
    // A class that holds logic to create/delete a new user. 
    // Also sends email notification, violating SRP
    
    public void createUser(User user) {
        // Logic to create a new user
        // Also sends email notification, violating SRP
        sendEmail(user, "Your account has been created.");
    }

    public void deleteUser(User user) {
        // Logic to delete a user
        // Also sends email notification, violating SRP
        sendEmail(user, "Your account has been deleted.");
    }

    private void sendEmail(User user, String message) {
        // Logic to send email notification
    }
}
