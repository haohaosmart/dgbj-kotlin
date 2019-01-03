package wangtian.com.netlib.entity.api;

import  wangtian.com.netlib.entity.FuzzySearchVillageRequest;
import  wangtian.com.netlib.entity.FuzzySearchVillageResponse;
import  wangtian.com.netlib.entity.GetVillageIdByLocationRequest;
import  wangtian.com.netlib.entity.GetVillageIdByLocationResponse;
import  wangtian.com.netlib.entity.LoadIndexTowerInfoRequest;
import  wangtian.com.netlib.entity.LoadIndexTowerInfoResponse;
import  wangtian.com.netlib.entity.LoadIndexUnitInfoRequest;
import  wangtian.com.netlib.entity.LoadIndexUnitInfoResponse;
import  wangtian.com.netlib.entity.LoadIndexVillageInfoRequest;
import  wangtian.com.netlib.entity.LoadIndexVillageInfoResponse;
import  wangtian.com.netlib.entity.LoadIndexVillageListRequest;
import  wangtian.com.netlib.entity.LoadIndexVillageListResponse;
import  wangtian.com.netlib.entity.LoadMapIndexRequest;
import  wangtian.com.netlib.entity.LoadMapIndexResponse;
import  wangtian.com.netlib.entity.LoadMapMoveIndexRequest;
import  wangtian.com.netlib.entity.LoadMapMoveIndexResponse;
import  wangtian.com.netlib.entity.LoadVillageMapRequest;
import  wangtian.com.netlib.entity.LoadVillageMapResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by apple on 2018/12/11.
 */

public interface IndexApiService {
    @POST("/api/index/loadIndexVillageList")
    Observable<LoadIndexVillageListResponse> reqLoadVillageList(@Body LoadIndexVillageListRequest loadIndexVillageListRequest);


    @POST("/api/index/fuzzySearchVillage")
    Observable<FuzzySearchVillageResponse> reqFuzzySearch(@Body FuzzySearchVillageRequest fuzzySearchVillageRequest);


    @POST("/api/index/loadMapIndex")
    Observable<LoadMapIndexResponse> reqLoadMapIndex(@Body LoadMapIndexRequest loadMapIndexRequest);


    @POST("/api/index/getVillageIdByLocation")
    Observable<GetVillageIdByLocationResponse> reqGetVillageIdByLocation(@Body GetVillageIdByLocationRequest getVillageIdByLocationRequest);

    @POST("/api/index/loadIndexVillageInfo")
    Observable<LoadIndexVillageInfoResponse> reqVillageInfo(@Body LoadIndexVillageInfoRequest loadIndexVillageInfoRequest);

    @POST("/api/index/loadMapMoveIndex")
    Observable<LoadMapMoveIndexResponse> reqMapMoveInfo(@Body LoadMapMoveIndexRequest loadMapMoveIndexRequest);

    @POST("/api/index/loadVillageMap")
    Observable<LoadVillageMapResponse> reqLoadVillageMap(@Body LoadVillageMapRequest loadVillageMapRequest);

    @POST("/api/index/loadIndexTowerInfo")
    Observable<LoadIndexTowerInfoResponse> reqIndexTowerInfo(@Body LoadIndexTowerInfoRequest loadIndexTowerInfoRequest);

    @POST("/api/index/loadIndexUnitInfo")
    Observable<LoadIndexUnitInfoResponse> reqIndexUnitInfo(@Body LoadIndexUnitInfoRequest loadIndexUnitInfoRequest);
}
