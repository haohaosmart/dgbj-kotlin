package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/14.
 */

public class DeleteHousesRequest {
    public List<Integer> houseIds = new ArrayList<>();

    public DeleteHousesRequest(List<Integer> houseIds) {
        this.houseIds = houseIds;
    }
}
