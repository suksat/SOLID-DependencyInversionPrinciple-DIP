package dip;

class RTP_LoginService {
    RTP_UserService userService;

    public RTP_LoginService(RTP_UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String username, String password) {
        return userService.isValidUser(username, password);
    }
}
