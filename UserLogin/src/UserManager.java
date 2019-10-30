

import javax.print.MultiDocPrintService;
import java.util.Arrays;
import java.util.SplittableRandom;

public class UserManager {
    private User[] usersss;
    private int size;

    public UserManager() {
        usersss = new User[5];
    }

    public UserManager(int capacity) {
        usersss = new User[capacity];
    }

    public void add(User u) {
        if (size >= usersss.length) {
            usersss = Arrays.copyOf(usersss, usersss.length * 2);
        }

        usersss[size] = u;
        size++;


    }

    public boolean usernameExist(String username) {
        for (int i = 0; i < size; i++) {
            if (usersss[i].getUsername().equals(username)) {

                return true;
            }

        }
        return false;
    }

    public boolean userExist(User u) {

        for (int i = 0; i < size; i++) {
            if (usersss[i].equals(u)) {
                return true;
            }
        }
        return false;
    }


}
