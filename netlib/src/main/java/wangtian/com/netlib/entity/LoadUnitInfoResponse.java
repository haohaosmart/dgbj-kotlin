package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/10.
 */

public class LoadUnitInfoResponse {
    public String code;
    public String msg;
    public UnitInfoData data;

    public static class UnitInfoData{
        public String id;
        public String villageId; // 当前单元所属小区id
        public String towerId; // 当前单元所属楼栋id
        public String configId;
        public String configName;
        public String unitName;
        public String othName;
        public String streetName;
        public String streetNo;
        public String longitude;
        public String latitude;
        public Integer elevatorNum;
        public List<PhotoDetailData> photoResultList = new ArrayList<>();
    }
}
