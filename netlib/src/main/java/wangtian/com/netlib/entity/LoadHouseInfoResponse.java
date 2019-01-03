package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/12.
 */

public class LoadHouseInfoResponse {
    public String code;
    public String msg;
    public HouseInfoData data;

    public static class HouseInfoData {
        public Integer id;
        public Integer unitId;
        public Integer configId;
        public String configName;
        public Integer houseLevel;
        public Integer houseNo;
        public String houseName;
        public String othName;
        public String streetName;
        public String streetNo;
        public Integer bedromNum;
        public Integer sittingNum;
        public Integer ketchenNum;
        public Integer toiletNum;
        public String toward;
        public String buildArea;
        public String useArea;
        public Double height;
        public Integer houseNature;
        public String houseNatureName;
        public Integer towerId;
        public Integer villageId;
        public List<PhotoDetailData> housePhoto = new ArrayList<>();
        public PhotoDetailData houseModelPhoto;
        public Boolean top;
    }
}
