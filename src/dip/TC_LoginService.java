package dip;

class TC_LoginService {
    TC_UserService userService = new TC_UserService(); // Dependency on TC_UserService

    public boolean authenticate(String username, String password) {
        return userService.isValidUser(username, password);
    }
}

/*
TC_LoginService class depends directly on the TC_UserService class, creating tight coupling.
If you decide to change the implementation of TC_UserService,
you would need to modify the TC_LoginService class as well.
*/
