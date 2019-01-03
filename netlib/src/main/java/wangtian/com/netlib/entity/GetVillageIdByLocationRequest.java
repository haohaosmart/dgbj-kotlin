package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/19.
 */

public class GetVillageIdByLocationRequest {
    public String clickLocation; // 格式：纬度,经度

    public GetVillageIdByLocationRequest(String clickLocation){
        this.clickLocation = clickLocation;
    }
}
