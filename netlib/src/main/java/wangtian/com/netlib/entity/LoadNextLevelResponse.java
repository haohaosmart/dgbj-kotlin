package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/7.
 */

public class LoadNextLevelResponse {
    public String code;
    public String msg;
    public NextLevelData data;

    public static class NextLevelData{
        public int nextLevel; // 1、2、3、4分别对应小区、楼栋、单元、门户
    }
}
