package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/14.
 */

public class LoadPushMessageListResponse {
    public String code;
    public String msg;
    public PushMessageResultData data;

    public static class PushMessageResultData {
        public List<MessageItem> resultList = new ArrayList<>();
    }


    public static class MessageItem {
        public int id;
        public String createTime;
        public String content;
        public int msgType;
        public String busiName;
    }

}
