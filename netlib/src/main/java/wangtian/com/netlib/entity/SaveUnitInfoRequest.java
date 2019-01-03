package wangtian.com.netlib.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/10.
 */

public class SaveUnitInfoRequest {
    public Integer configId; // 类型id
    public Integer elevatorNum; // 电梯数
    public Integer id; // 单元id 编辑的时候用到
    public String othName; // 别名
    public String streetName; // 行政街名字
    public String streetNo; // 行政街编号
    public Integer towerId; // 如果单元的上一级是楼栋  传递楼栋id
    public String unitLocation; // 单元位置
    public String unitName; // 单元名字
    public List<PhotoDetailData> unitPhoto = new ArrayList<>();
    public Integer villageId; //  如果单元的上一级是小区  传递小区id
}
