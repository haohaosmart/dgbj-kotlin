package wangtian.com.netlib.entity.api;

import  wangtian.com.netlib.entity.DeleteHousesRequest;
import  wangtian.com.netlib.entity.DeleteHousesResponse;
import  wangtian.com.netlib.entity.DeleteOneDataRequest;
import  wangtian.com.netlib.entity.DeleteOneDataResponse;
import  wangtian.com.netlib.entity.LoadDistricListRequest;
import  wangtian.com.netlib.entity.LoadDistrictListResponse;
import  wangtian.com.netlib.entity.LoadHouseInfoRequest;
import  wangtian.com.netlib.entity.LoadHouseInfoResponse;
import  wangtian.com.netlib.entity.LoadHouseListInfoRequest;
import  wangtian.com.netlib.entity.LoadHouseListInfoResponse;
import  wangtian.com.netlib.entity.LoadNextLevelRequest;
import  wangtian.com.netlib.entity.LoadNextLevelResponse;
import  wangtian.com.netlib.entity.LoadRouteCardInfoRequest;
import  wangtian.com.netlib.entity.LoadRouteCardInfoResponse;
import  wangtian.com.netlib.entity.LoadTowerInfoRequest;
import  wangtian.com.netlib.entity.LoadTowerInfoResponse;
import  wangtian.com.netlib.entity.LoadTowerListRequest;
import  wangtian.com.netlib.entity.LoadTowerListResponse;
import  wangtian.com.netlib.entity.LoadUnitInfoRequest;
import  wangtian.com.netlib.entity.LoadUnitInfoResponse;
import  wangtian.com.netlib.entity.LoadUnitListRequest;
import  wangtian.com.netlib.entity.LoadUnitListResponse;
import  wangtian.com.netlib.entity.LoadVillageAllRouteListRequest;
import  wangtian.com.netlib.entity.LoadVillageAllRouteListResponse;
import  wangtian.com.netlib.entity.LoadVillageIOPhotosRequest;
import  wangtian.com.netlib.entity.LoadVillageIOPhotosResponse;
import  wangtian.com.netlib.entity.LoadVillageInfoRequest;
import  wangtian.com.netlib.entity.LoadVillageInfoResponse;
import  wangtian.com.netlib.entity.MountainSetRequest;
import  wangtian.com.netlib.entity.MountainSetResponse;
import  wangtian.com.netlib.entity.SaveCollectRouteRequest;
import  wangtian.com.netlib.entity.SaveCollectRouteResponse;
import  wangtian.com.netlib.entity.SaveHouseBatchInfoRequest;
import  wangtian.com.netlib.entity.SaveHouseBatchInfoResponse;
import  wangtian.com.netlib.entity.SaveHouseInfoRequest;
import  wangtian.com.netlib.entity.SaveHouseInfoResponse;
import  wangtian.com.netlib.entity.SaveTowerInfoRequest;
import  wangtian.com.netlib.entity.SaveTowerInfoResponse;
import  wangtian.com.netlib.entity.SaveTowerPolygonRequest;
import  wangtian.com.netlib.entity.SaveTowerPolygonResponse;
import  wangtian.com.netlib.entity.SaveUnitInfoRequest;
import  wangtian.com.netlib.entity.SaveUnitInfoResponse;
import  wangtian.com.netlib.entity.SaveUnitPointRequest;
import  wangtian.com.netlib.entity.SaveUnitPointResponse;
import  wangtian.com.netlib.entity.SaveVillageInfoRequest;
import  wangtian.com.netlib.entity.SaveVillageInfoResponse;
import  wangtian.com.netlib.entity.SaveVillagePhotosRequest;
import  wangtian.com.netlib.entity.SaveVillagePhotosResponse;
import  wangtian.com.netlib.entity.SaveVillagePolygonRequest;
import  wangtian.com.netlib.entity.SaveVillagePolygonResponse;
import  wangtian.com.netlib.entity.SaveVillagePropertyInfoRequest;
import  wangtian.com.netlib.entity.SaveVillagePropertyInfoResponse;
import  wangtian.com.netlib.entity.SubmitVillageRequest;
import  wangtian.com.netlib.entity.SubmitVillageResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by apple on 2018/12/5.
 */

public interface VillageApiService {
    @POST("/api/village/saveVillageInfo")
    Observable<SaveVillageInfoResponse> reqSaveVillageInfo(@Body SaveVillageInfoRequest saveVillageInfoRequest);

    @POST("/api/village/loadDistricList")
    Observable<LoadDistrictListResponse> reqLoadDistrictList(@Body LoadDistricListRequest loadDistricListRequest);

    @POST("/api/village/saveVillagePropertyInfo")
    Observable<SaveVillagePropertyInfoResponse> reqSaveVillagePropertyInfo(@Body SaveVillagePropertyInfoRequest saveVillagePropertyInfoRequest);

    @POST("/api/village/loadVillageInfo")
    Observable<LoadVillageInfoResponse> reqLoadVillageInfo(@Body LoadVillageInfoRequest loadVillageInfoRequest);

    @POST("/api/village/saveVillagePhotots")
    Observable<SaveVillagePhotosResponse> reqSaveVillagePhotos(@Body SaveVillagePhotosRequest saveVillagePhotosRequest);

    // 获取当前层级的下一层级会影响到列表显示 例如：在小区详情页面，如果该接口返回的是楼栋层级则显示所有楼栋列表，如果该接口返回的是单元层级则返回所有单元列表
    @POST("/api/village/loadNextLevel")
    Observable<LoadNextLevelResponse> reqLoadNextLevel(@Body LoadNextLevelRequest loadNextLevelRequest);

    @POST("/api/village/saveTowerInfo")
    Observable<SaveTowerInfoResponse> reqSaveTowerInfo(@Body SaveTowerInfoRequest saveTowerInfoRequest);

    @POST("/api/village/loadVillageIOPhotos")
    Observable<LoadVillageIOPhotosResponse> reqLoadVillageIOPhotos(@Body LoadVillageIOPhotosRequest loadVillageIOPhotosRequest);

    @POST("/api/village/loadTowerList")
    Observable<LoadTowerListResponse> reqLoadTowerList(@Body LoadTowerListRequest loadTowerListRequest);

    @POST("/api/village/loadTowerInfo")
    Observable<LoadTowerInfoResponse> reqLoadTowerInfo(@Body LoadTowerInfoRequest loadTowerInfoRequest);

    @POST("/api/village/loadUnitList")
    Observable<LoadUnitListResponse> reqLoadUnitList(@Body LoadUnitListRequest loadUnitListRequest);

    @POST("/api/village/saveUnitInfo")
    Observable<SaveUnitInfoResponse> reqSaveUnitInfo(@Body SaveUnitInfoRequest saveUnitInfoRequest);

    @POST("/api/village/loadUnitInfo")
    Observable<LoadUnitInfoResponse> reqLoadUnitInfo(@Body LoadUnitInfoRequest loadUnitInfoRequest);

    @POST("/api/village/saveUnitPoint")
    Observable<SaveUnitPointResponse> reqSaveUnitPoint(@Body SaveUnitPointRequest saveUnitPointRequest);

    @POST("/api/village/saveVillagePolygon")
    Observable<SaveVillagePolygonResponse> reqSaveVillagePolygon(@Body SaveVillagePolygonRequest saveVillagePolygonRequest);

    @POST("/api/village/saveTowerPolygon")
    Observable<SaveTowerPolygonResponse> reqSaveTowerPolygon(@Body SaveTowerPolygonRequest saveTowerPolygonRequest);

    @POST("/api/village/saveHouseInfo")
    Observable<SaveHouseInfoResponse> reqSaveHouseInfo(@Body SaveHouseInfoRequest saveHouseInfoRequest);

    @POST("/api/village/loadHouseInfo")
    Observable<LoadHouseInfoResponse> reqLoadHouseInfo(@Body LoadHouseInfoRequest loadHouseInfoRequest);

    @POST("/api/village/loadHouseListInfo")
    Observable<LoadHouseListInfoResponse> reqLoadHouseListInfo(@Body LoadHouseListInfoRequest loadHouseListInfoRequest);

    @POST("/api/village/deleteOneData")
    Observable<DeleteOneDataResponse> reqDeleteOneData(@Body DeleteOneDataRequest deleteOneDataRequest);

    @POST("/api/village/deleteHouses")
    Observable<DeleteHousesResponse> reqDeleteHouses(@Body DeleteHousesRequest deleteHousesRequest);

    @POST("/api/village/saveHouseBatchInfo")
    Observable<SaveHouseBatchInfoResponse> reqSaveHouseBatchInfo(@Body SaveHouseBatchInfoRequest saveHouseBatchInfoRequest);

    @POST("/api/village/submitVillage")
    Observable<SubmitVillageResponse> reqSubmitVillage(@Body SubmitVillageRequest submitVillageRequest);


    @POST("/api/village/loadVillageAllRouteList")
    Observable<LoadVillageAllRouteListResponse> reqLoadVillageAllRouteList(@Body LoadVillageAllRouteListRequest loadVillageAllRouteListRequest);

    @POST("/api/village/saveCollectRoute")
    Observable<SaveCollectRouteResponse> reqSaveCollectRoute(@Body SaveCollectRouteRequest saveCollectRouteRequest);

    @POST("/api/village/isMountainSet")
    Observable<MountainSetResponse> reqSetMountain(@Body MountainSetRequest mountainSetRequest);

    @POST("/api/village/loadRouteCardInfo")
    Observable<LoadRouteCardInfoResponse> reqLoadRouteCardInfo(@Body LoadRouteCardInfoRequest loadRouteCardInfoRequest);


}

