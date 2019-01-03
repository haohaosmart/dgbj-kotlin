package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/11.
 */

public class FuzzySearchVillageResponse {
    public String code;
    public String msg;
    public SearchData data;

    public static class SearchData{
        public List<String> search_name = new ArrayList<>();
    }

}
