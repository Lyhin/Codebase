

import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    static UserManager manager=new UserManager();


    public static void main(String[] args) {

        while(true){

            System.out.println("请选择你的操作:");
            System.out.println("\t1用户注册，2用户登入，3退出程序");

            int choice = sc.nextInt();


        switch (choice) {
            case 1:
                //用户选择1，表示用户注册
                register();
                break;
            case 2:
                //用户选择2，表示登入
                login();
                break;
            default:
                return;


        }

        }
    }

    private static void login() {
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password=sc.next();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (manager.userExist(user)) {
            System.out.println("登入成功");
        } else {
            System.out.println("用户名或密码不正确");
        }


    }

    private static void register() {
        System.out.println("请输入用户名");
        String username = sc.next();

        while(manager.usernameExist(username)){
            System.out.println("用户名已存在，需要重新输入");
            username=sc.next();

        }
        System.out.println("请输入密码:");
        String password=sc.next();

        User user =new User();
        user.setUsername(username);
        user.setPassword(password);
        manager.add(user);
        System.out.println("注册成功");


    }
}
