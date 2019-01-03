package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/10.
 */

public class SaveUnitInfoResponse {

    public String code;
    public String msg;
    public SaveUnitInfoData data;

    public static class SaveUnitInfoData {
        public String id;
    }
}
