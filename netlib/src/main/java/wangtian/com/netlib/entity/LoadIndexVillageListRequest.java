package wangtian.com.netlib.entity;

/**
 * Created by apple on 2018/12/11.
 */

public class LoadIndexVillageListRequest {
    public FormData formData;
    public PageData pageData;

    public static class FormData{
        public Integer auditState; // 0：待审核；1：已通过；2：已驳回；3：审核中；4：采集中
        public Integer orderBy; // 1:时间正序 2：时间倒序
        public Integer searchRange; // 1我的采集 2我的工作区;
        public String villageName;

    }

    public static class PageData{
        public int currentPage;
        public int pageSize;
    }
}
