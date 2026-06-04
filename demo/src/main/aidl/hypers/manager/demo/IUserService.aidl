package hypers.manager.demo;

interface IUserService {

    void destroy() = 16777114; // Destroy method defined by Hypers server

    void exit() = 1; // Exit method defined by user

    String doSomething() = 2;
}