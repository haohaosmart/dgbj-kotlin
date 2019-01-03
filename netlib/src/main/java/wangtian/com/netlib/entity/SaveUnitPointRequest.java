package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/10.
 */

public class SaveUnitPointRequest {
    public int id;
    public String unitLocation;

    public SaveUnitPointRequest(int id, String unitLocation) {
        this.id = id;
        this.unitLocation = unitLocation;
    }
}
