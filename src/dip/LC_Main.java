package dip;

public class LC_Main {
    public static void main(String[] args) {
        LC_UserService obj_lc_userService_interface = new LC_UserServiceImpl();
        LC_LoginService obj_lc_loginService = new LC_LoginService(obj_lc_userService_interface);
        System.out.println("User Auth : " + obj_lc_loginService.authenticate("sukumarsatyen", "password"));
    }
}


/*
* In this example, the LC_LoginService class depends on the LC_UserService interface
* instead of a specific implementation.
* This allows us to inject different implementations of LC_UserService
* without modifying the LC_LoginService class.
* It demonstrates loose coupling and follows the DIP,
* where both high-level and low-level modules depend on abstractions.
*
* Noted that the high-level module refers to the LC_LoginService class,
* which is responsible for the login functionality.
*
* The low-level module refers to the LC_UserService interface and
* its implementations (LC_UserServiceImpl).
*
* Abstractions, in this case, are represented by the LC_UserService interface.
* An abstraction is a way to define a contract or a set of methods that should be implemented by concrete classes.
* It provides a common interface that can be used by the high-level module to interact with different implementations
* without being tightly coupled to any specific implementation.
*
* By depending on the LC_UserService interface
* rather than a specific implementation,
* the LC_LoginService class follows the Dependency Inversion Principle (DIP).
* It relies on abstractions (the interface) instead of concrete implementations (specific classes),
* allowing for flexibility and modularity in the code.
*
* In this example, the LC_LoginService class depends on the abstraction (LC_UserService interface), and
* different implementations of LC_UserService can be injected into the LC_LoginService class without modifying it.
* This loose coupling allows to switch between different implementations of the LC_UserService interface easily,
* promoting flexibility, testability, and maintainability in this codebase.
* */