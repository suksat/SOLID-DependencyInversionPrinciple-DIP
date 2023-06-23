package dip;

public class RTP_Main {
    public static void main(String[] args) {
        RTP_UserService adminUserService = new RTP_AdminUserService();
        RTP_LoginService adminLoginService = new RTP_LoginService(adminUserService);
        /*
        * the RTP_LoginService class depends on the abstract class RTP_UserService.
        * Different implementations of RTP_UserService can be used based
        * on the runtime type of the object,
        * allowing runtime polymorphism.
        * This enables flexibility and extensibility in the code.
        */
        boolean isAdminAuthenticated = adminLoginService.authenticate("admin", "password");
        // Perform admin-specific operations

        RTP_UserService normalUserService = new RTP_NormalUserService();
        RTP_LoginService normalLoginService = new RTP_LoginService(normalUserService);
        boolean isNormalUserAuthenticated = normalLoginService.authenticate("sukumarsatyen", "password");
        // Perform normal user-specific operations
    }
}
