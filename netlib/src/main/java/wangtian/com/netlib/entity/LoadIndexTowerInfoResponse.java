package wangtian.com.netlib.entity;

import java.util.List;

/**
 * Created by apple on 2018/12/20.
 */

public class LoadIndexTowerInfoResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public List<LocationItem> tLocation;
        public String centerLongitude;
        public String centerLatitude;
        public String towerId;
        public String towerName;
        public Integer unitNum;
        public String configName;
        public Boolean photo;
    }
}
