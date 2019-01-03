package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/17.
 */

public class LoadVillageAllRouteListResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public List<RouteResultListData> allListResult = new ArrayList<>();
        public int routeNum;
    }

    public static class RouteResultListData {
        public int routeNo;
        public List<CollectRouteItemData> collectRouteResultList = new ArrayList<>();
    }


    public static class CollectRouteItemData {
        public String id;
        public String locationTime;
        public Integer configLevel;
        public Integer busiId;
        public String longitude;
        public String latitude;
    }
}
