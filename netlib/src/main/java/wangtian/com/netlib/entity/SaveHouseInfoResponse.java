package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/12.
 */

public class SaveHouseInfoResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData{
        public int id;
    }
}
