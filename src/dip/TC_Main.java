package dip;

public class TC_Main {
    public static void main(String[] args) {
        TC_LoginService loginService = new TC_LoginService();
        boolean isAuthenticated = loginService.authenticate("sukumarsatyen", "password");
        // Perform further operations
    }
}

/*
TC_LoginService class depends directly on the TC_UserService class, creating tight coupling.
If you decide to change the implementation of TC_UserService,
you would need to modify the TC_LoginService class as well.
*/