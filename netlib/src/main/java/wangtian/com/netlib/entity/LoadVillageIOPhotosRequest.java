package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/7.
 */

public class LoadVillageIOPhotosRequest {
    public int innerOrOuter;
    public int villageId;

    public LoadVillageIOPhotosRequest(int villageId, int innerOrOuter) {
        this.villageId = villageId;
        this.innerOrOuter = innerOrOuter;
    }
}
