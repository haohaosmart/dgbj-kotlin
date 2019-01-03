package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/4.
 */

public class UserLoginResponse {

    public String code;
    public String msg;
    public UserLoginData data;

    public static class UserLoginData {
        public String id = "";

        public String username = "";

        public String photo = "";

        public String token = "";
    }
}
