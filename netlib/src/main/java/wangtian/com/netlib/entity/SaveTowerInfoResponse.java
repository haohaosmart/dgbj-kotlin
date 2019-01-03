package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/7.
 */

public class SaveTowerInfoResponse {
    public String code;
    public String msg;
    public SaveTowerInfoData data;

    public static class SaveTowerInfoData{
        public String id;
    }
}
