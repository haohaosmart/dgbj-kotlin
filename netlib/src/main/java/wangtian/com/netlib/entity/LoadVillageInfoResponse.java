package wangtian.com.netlib.entity;

import java.util.List;

/**
 * Created by apple on 2018/12/6.
 */

public class LoadVillageInfoResponse {
    public String code;
    public String msg;
    public VillageInfoData data;

    public static class VillageInfoData {
        public String id;
        public String villageName;
        public String districName; // 行政区名称
        public String districCode; // 行政区编号
        public String configId; // 小区类型id；
        public String configName; // 小区类型名字
        public String othName; // 小区别名
        public String streetName; // 行政街区名称
        public String streetNo; // 行政街区号
        public String adStreet; // 相邻街道
        public String addr; // 详细地址
        public String compName; // 开发商
        public String buildYear; // 建筑年份
        public int equityYear; // 产权年限
        public String estateName;// 物业公司名字
        public String estatePhone; // 物业公司电话
        public String estateFee; // 物业费用
        public int heatingType; // 供暖类型
        public String heatingTypeName; // 供暖类型名字
        public int parkNumUp; // 地上车位数量
        public int parkNumDown; // 地下车位数量
        public String parkRatio; // 车位配比
        public String parkFee; // 停车费用
        public String villageDesc; // 小区配套
        public int auditState; // 当前审核状态
        public boolean close; // 是否是封闭小区
        public boolean shunt; // 是否是人车分流
        public List<PhotoDetailData> photoResultList; // 小区照片
        public String vlocation;
    }
}
