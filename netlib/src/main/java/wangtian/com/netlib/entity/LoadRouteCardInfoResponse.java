package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/18.
 */

public class LoadRouteCardInfoResponse {

    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public String busiName;
        public int level;
        public String photoUrl;
    }
}
