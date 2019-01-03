package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/5.
 */

public class SaveVillageInfoResponse {
    public String code;
    public String msg;
    public SaveVillageInfoData data;

    public static class SaveVillageInfoData{
        public String id;
    }
}
