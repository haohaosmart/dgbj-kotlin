package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/10.
 */

public class LoadTowerInfoResponse {
    public String code;
    public String msg;
    public TowerInfoData data;

    public static class TowerInfoData {
        public String id;
        public String villageId; // 当前楼栋所属小区id
        public String configId;
        public String configName;
        public String towerName;
        public String othName;
        public String streetName;
        public String streetNo;
        public String towerLocation; // 楼栋的坐标面
        public String nonameReason;
        public List<PhotoDetailData> photoResultList = new ArrayList<>();
    }
}
