package wangtian.com.netlib.entity;

import java.util.List;

/**
 * Created by apple on 2018/12/17.
 */

public class SaveCollectRouteRequest {
    public int villageId;
    public List<LocationData> collectRouteDetailIOS;

    public SaveCollectRouteRequest(int villageId,List<LocationData> collectRouteDetailIOS){
        this.villageId = villageId;
        this.collectRouteDetailIOS = collectRouteDetailIOS;
    }
}
