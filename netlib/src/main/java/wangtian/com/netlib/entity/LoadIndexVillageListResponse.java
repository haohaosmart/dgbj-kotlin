package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/11.
 */

public class LoadIndexVillageListResponse {
    public String code;
    public String msg;
    public VillageListData data;

    public static class VillageListData {
        public int total;
        public List<VillageData> list = new ArrayList<>();
    }


}
