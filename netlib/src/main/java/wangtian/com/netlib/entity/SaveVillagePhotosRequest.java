package wangtian.com.netlib.entity;

import java.util.List;

/**
 * Created by apple on 2018/12/7.
 */

public class SaveVillagePhotosRequest {
    public int villageId;
    public int photoType;
    public List<PhotoDetailWithLocationData> photoDetailIOList;

    public SaveVillagePhotosRequest(int villageId,int photoType,List<PhotoDetailWithLocationData> photoDetailWithLocationData){
        this.villageId = villageId;
        this.photoType = photoType;
        this.photoDetailIOList = photoDetailWithLocationData;
    }
}
