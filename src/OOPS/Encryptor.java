package OOPS;

class ValidateSomething {
    // Already written for you — don't touch this
    public boolean validate(String input) {
        // imagine this checks something and returns true/false
        return true; // placeholder
    }
}

class Encryptor {
    public String encrypt(String input) {
        
        // Step 1 — create ValidateSomething object to call validate()
        ValidateSomething validator = new ValidateSomething();
        
        // Step 2 — call validate() and check result
        if (validator.validate(input)) {
            
            // Step 3a — reverse the string
            String reversed = new StringBuilder(input).reverse().toString();
            
            // Step 3b — convert to lowercase and return
            return reversed.toLowerCase();
            
        } else {
            
            // Step 3c — throw exception with exact message
            throw new IllegalArgumentException("Age is not valid");
        }
    }
}