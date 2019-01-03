package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/7.
 */

public class LoadVillageIOPhotosResponse {
    public String code;
    public String msg;
    public PhotoData data;

    public static class PhotoData {
        public List<PhotoDetailWithLocationData> villagePhotoResultList = new ArrayList<>();
    }
}
