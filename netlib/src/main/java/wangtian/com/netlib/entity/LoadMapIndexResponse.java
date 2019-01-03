package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/19.
 */

public class LoadMapIndexResponse {

    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public String maxLongitude;
        public String minLongitude;
        public String maxLatitude;
        public String minLatitude;
        public List<VillageMapResultItem> villageMapResultList = new ArrayList<>();
        public Integer collectRange;
    }

}
