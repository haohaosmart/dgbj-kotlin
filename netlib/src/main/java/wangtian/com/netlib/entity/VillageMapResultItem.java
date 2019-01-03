package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/19.
 */

public class VillageMapResultItem {
    public int villageId;
    public String villageName;
    public String villageStatus;
    public List<LocationItem> vLocation;
    public Double centerLongitude;
    public Double centerLatitude;
    public Integer collectRange;
    public List<ULocationItem> uLocationList = new ArrayList<>();
    public List<TLocationItem> tLocationList = new ArrayList<>();
}
