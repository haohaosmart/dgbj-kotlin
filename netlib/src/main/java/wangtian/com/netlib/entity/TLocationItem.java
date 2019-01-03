package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/19.
 */

// 地上上楼栋相关的信息
public class TLocationItem {
    public List<LocationItem> tLocation = new ArrayList<>();
    public String centerLongitude;
    public String centerLatitude;
    public String towerId;
    public String towerName;

}
