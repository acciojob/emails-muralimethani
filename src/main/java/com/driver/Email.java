package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if (oldPassword.equals(this.password)) {
            boolean isUppercase = false, isLowercase = false, isDigit = false, isSpecial = false;

            for (int i = 0; i < newPassword.length(); i++) {
                if (newPassword.charAt(i) >= 65 && newPassword.charAt(i) <= 90) {
                    isUppercase = true;
                }
                if (newPassword.charAt(i) >= 97 && newPassword.charAt(i) <= 122) {
                    isLowercase = true;
                }

                if (newPassword.charAt(i) >= 48 && newPassword.charAt(i) <= 57) {
                    isDigit = true;
                }
                if (!Character.isLetterOrDigit(newPassword.charAt(i))) {
                    isSpecial = true;
                }
            }
            if (newPassword.length() >= 8 && isUppercase && isLowercase && isDigit && isSpecial) {
                this.password = newPassword;
            }


        }
    }
}
