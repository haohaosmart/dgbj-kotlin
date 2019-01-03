package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/4.
 */

public class UserSaveFeedbackRequest {
    public String content;
    public int feedType;

    public UserSaveFeedbackRequest(String content,int feedType){
        this.content = content;
        this.feedType = feedType;
    }
}
