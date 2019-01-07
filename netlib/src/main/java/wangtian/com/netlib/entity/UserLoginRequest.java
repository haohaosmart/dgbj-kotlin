package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/4.
 */

public class UserLoginRequest {
    public String password;
    public String phone;
    public String phoneCode;

    public UserLoginRequest(String phone,String password,String phoneCode){
        this.phone = phone;
        this.password = password;
        this.phoneCode = phoneCode;
    }
}
