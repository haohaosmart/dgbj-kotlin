package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/11.
 */

public class UserLoadUserInfoResponse {
    public String code;
    public String msg;
    public UserInfoData data;

    public static class UserInfoData{
        public String name;
        public String phone;
        public String photo;
    }
}
