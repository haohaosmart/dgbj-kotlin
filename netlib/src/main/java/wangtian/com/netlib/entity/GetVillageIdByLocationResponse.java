package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/19.
 */

public class GetVillageIdByLocationResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData{
        public Integer id;
    }
}
