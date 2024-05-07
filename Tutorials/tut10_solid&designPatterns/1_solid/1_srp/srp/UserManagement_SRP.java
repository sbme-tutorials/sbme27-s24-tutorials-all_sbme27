package srp;
class User {
    
}

// Corrected implementation following SRP
public class UserManagement_SRP {
    public void createUser(User user) {
        // Logic to create a new user
        // After user creation, send email notification
        EmailNotifier emailNotifier = new EmailNotifier(); // RECALL Dendency Inversion Principle
        emailNotifier.sendEmail(user, "Welcome to our platform!");
    }

    public void deleteUser(User user) {
        // Logic to delete a user
        // After user deletion, send email notification
        EmailNotifier emailNotifier = new EmailNotifier();
        emailNotifier.sendEmail(user, "Your account has been deleted.");
    }
}

// Email notifier class handling email notifications
class EmailNotifier {
    public void sendEmail(User user, String message) {
        // Logic to send email notification
    }
}
