package dip;

class TC_UserService {
    public boolean isValidUser(String username, String password) {
        // Check username and password validity
        // Return true if valid, false otherwise
        return false;
    }
}

/*
TC_LoginService class depends directly on the TC_UserService class, creating tight coupling.
If you decide to change the implementation of TC_UserService,
you would need to modify the TC_LoginService class as well.
*/