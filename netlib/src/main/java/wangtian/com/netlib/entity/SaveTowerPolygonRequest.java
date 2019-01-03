package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/12.
 */

public class SaveTowerPolygonRequest {
    public int id;
    public String towerLocation;

    public SaveTowerPolygonRequest(int id, String towerLocation) {
        this.id = id;
        this.towerLocation = towerLocation;
    }
}
