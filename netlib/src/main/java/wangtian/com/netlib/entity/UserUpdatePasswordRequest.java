package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/4.
 */

public class UserUpdatePasswordRequest {
    public String phone;
    public String code;
    public String newPassword;
    public String confirmNewPassword;

    public UserUpdatePasswordRequest(String phone, String code, String newPassword, String confirmNewPassword) {
        this.phone = phone;
        this.code = code;
        this.newPassword = newPassword;
        this.confirmNewPassword = confirmNewPassword;
    }
}
