package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 2018/12/13.
 */

public class LoadHouseListInfoResponse {
    public String code;
    public String msg;
    public HouseListInfoData data;

    public static class HouseListInfoData {
        public Map<String, Boolean> isMountainMap = new HashMap<>();
        public int maxLevel;
        public int maxHouseNo;
        public List<HouseItem> houseResultList = new ArrayList<>();
    }

    public static class HouseItem {
        public int id;
        public int houseLevel;
        public int houseNo;
        public String houseName;
    }
}
