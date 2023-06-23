package dip;

class LC_LoginService {
    LC_UserService userService; // Dependency on the interface, not a specific implementation

    public LC_LoginService(LC_UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String username, String password) {
        return userService.authenticate(username, password);
    }
}
