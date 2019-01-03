package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/7.
 */

public class PhotoDetailWithLocationData {
    public String id;
    public String photoDesc;
    public String photoLocation; // 提交的时候 用到的经纬度字段
    public String photoName;
    public String url;
    public String longitude; // 显示的时候 用到的经度字段
    public String latitude; // 显示的时候 用到的纬度字段
}
