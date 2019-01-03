package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/4.
 */

public class UserUpdatePhoneRequest {
    public String phone;
    public String code;

    public UserUpdatePhoneRequest(String phone,String code){
        this.phone = phone;
        this.code = code;
    }
}
