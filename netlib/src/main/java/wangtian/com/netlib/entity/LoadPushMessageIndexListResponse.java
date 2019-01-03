package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/14.
 */

public class LoadPushMessageIndexListResponse {

    public String code;
    public String msg;
    public PushMessageResultData data;

    public static class PushMessageResultData {
        public MessageItem passResult;
        public MessageItem refuseResult;
        public MessageItem versionResult;
    }

    public static class MessageItem {
        public int id;
        public String createTime;
        public String content;
        public int msgType;
        public String busiName;
    }
}


