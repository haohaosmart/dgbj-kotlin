package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/8.
 */

public class LoadTowerListResponse {
    public String code;
    public String msg;
    public LoadTowerListResponseData data;

    public static class LoadTowerListResponseData {
        public List<TowerResultData> towerResultList = new ArrayList<>();
    }
}
