

import javax.print.MultiDocPrintService;
import java.util.Arrays;
import java.util.SplittableRandom;

public class UserManager {
    private User[] usersss;            //定义一个数组保存用户信息
    private int size;                  //数组中 用户的数量

    //无参构造，对用户数组进行初始化
    public UserManager() {
        usersss = new User[5];
    }

    //通过构造方法，指定用户数组初始化的大小，在使用数组时尽量避免频繁扩容
    public UserManager(int capacity) {
        usersss = new User[capacity];
    }

    //定义一个方法add(User)向数组中添加一个用户
    public void add(User u) {
        //判断用户数组是否已满
        if (size >= usersss.length) {
            usersss = Arrays.copyOf(usersss, usersss.length * 2);
        }

        usersss[size] = u;
        size++;

    }

    //定义方法usernameExist(String)判断用户名是否存在
    public boolean usernameExist(String username) {
        for (int i = 0; i < size; i++) {
            if (usersss[i].getUsername().equals(username)) {

                return true;
            }

        }
        return false;
    }

    //定义方法userExist(User)判断用户是否存在
    public boolean userExist(User u) {

        for (int i = 0; i < size; i++) {
            if (usersss[i].equals(u)) {
                return true;
            }
        }
        return false;
    }


}
