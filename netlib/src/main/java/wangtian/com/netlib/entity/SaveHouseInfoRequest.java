package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/12.
 */

public class SaveHouseInfoRequest {
    public Integer bedromNum;
    public String buildArea;
    public String height;
    public Integer houseLevel;
    public PhotoDetailData houseModelPhoto;
    public String houseName;
    public Integer houseNature;
    public Integer houseNo;
    public List<PhotoDetailData> housePhoto = new ArrayList<>();
    public Integer id; // 更新的时候用到
    public Integer ketchenNum;
    public String othName;
    public Integer sittingNum;
    public String streetName;
    public String streetNo;
    public Integer toiletNum;
    public String topMountain;
    public String toward;
    public Integer towerId;
    public Integer unitId;
    public String useArea;
    public Integer villageId;
}
