package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/7.
 */

public class SaveTowerInfoRequest {
    public Integer id;// 楼栋id  编辑的时候用到
    public Integer villageId; // 所属小区id
    public Integer configId; // 所选建筑类型id
    public String nonameReason = ""; // 无法命名原因
    public String othName = ""; // 别名
    public String streetName = "";// 行政街名字
    public String streetNo = ""; // 行政街号
    public List<PhotoDetailData> towerAroundPhoto = new ArrayList<>(); // 建筑周围照片
    public String towerName = ""; // 名字
    public List<PhotoDetailData> towerPhoto = new ArrayList<>(); // 建筑照片
}
