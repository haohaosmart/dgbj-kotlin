package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/5.
 */

public class SaveVillageInfoRequest {
    public Integer id; // 小区id 编辑的时候用到
    public int configId; // 小区类型id
    public String villageName;// 小区名字
    public String othName; // 别名
    public String streetName;// 行政街名称
    public String streetNo; // 行政街编号
    public String adStreet;// 相邻街道
    public List<PhotoDetailData> villagePhoto = new ArrayList<>(); // 小区图片

    public SaveVillageInfoRequest(int configId,String villageName, String othName, String streetName, String streetNo, String adStreet, List<PhotoDetailData> villagePhoto) {
        this.configId = configId;
        this.villageName = villageName;
        this.othName = othName;
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.adStreet = adStreet;
        this.villagePhoto = villagePhoto;
    }


    public SaveVillageInfoRequest(Integer id,int configId,String villageName, String othName, String streetName, String streetNo, String adStreet, List<PhotoDetailData> villagePhoto) {
        this.id = id;
        this.configId = configId;
        this.villageName = villageName;
        this.othName = othName;
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.adStreet = adStreet;
        this.villagePhoto = villagePhoto;
    }
}
