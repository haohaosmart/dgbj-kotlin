package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/14.
 */

public class LoadFeedbackListResponse {

    public String code;
    public String msg;
    public FeedbackListData data;


    public static class FeedbackListData {
        public List<FeedbackItem> userFeedbackResultList = new ArrayList<>();
    }

    public static class FeedbackItem {
        public String content;
        public int feedType;
        public String updateTime;
    }
}
