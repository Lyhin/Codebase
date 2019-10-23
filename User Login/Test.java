package HomeWork01.P1;

import java.util.Scanner;

public class Test {

       static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){

            System.out.println("请选择你的操作:");

            int choice = sc.nextInt();


        switch (choice) {
            case 1:
                register();
                break;
            case 2:
                login();
                break;
            default:
                return;


        }

        }
    }

    private static void login() {
    }

    private static void register() {
        System.out.println("请输入用户名");
        String username = sc.next();

        UserManager manager=new UserManager();
        manager.usernameExist(username);

    }
}
