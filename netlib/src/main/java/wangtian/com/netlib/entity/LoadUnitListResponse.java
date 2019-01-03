package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/10.
 */

public class LoadUnitListResponse {
    public String code;
    public String msg;
    public UnitListData data;

    public static class UnitListData {
        public List<UnitData> unitListResult = new ArrayList<>();
    }

    public static class UnitData {
        public String id;
        public String unitName; // 单元名字
        public int elevatorNum; // 电梯数
        public int houseLevel; // 楼层数
        public int levelHouseNum;
    }
}
