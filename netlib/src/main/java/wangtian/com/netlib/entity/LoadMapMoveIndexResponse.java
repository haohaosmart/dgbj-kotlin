package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/19.
 */

public class LoadMapMoveIndexResponse {
    public String code;
    public String msg;
    public ResponseData data;

    public static class ResponseData {
        public List<VillageMapResultItem> villageMapResultList = new ArrayList<>();
    }
}
