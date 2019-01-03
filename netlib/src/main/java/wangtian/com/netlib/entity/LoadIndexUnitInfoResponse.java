package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/21.
 */

public class LoadIndexUnitInfoResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public String unitName;
        public String configName;
        public Integer unitHouseNum;
        public Integer unitId;
    }
}
