package wangtian.com.netlib.entity.api;

import  wangtian.com.netlib.entity.TierLoadIsRequiredRequest;
import  wangtian.com.netlib.entity.TierLoadIsRequiredResponse;
import  wangtian.com.netlib.entity.TierLoadTUTypeRequest;
import  wangtian.com.netlib.entity.TierLoadTUTypeResponse;
import  wangtian.com.netlib.entity.TierLoadVTypeRequest;
import  wangtian.com.netlib.entity.TierLoadVTypeResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by apple on 2018/12/5.
 */

public interface TierApiService {
    @POST("/api/tier/loadVType")
    Observable<TierLoadVTypeResponse> reqTierLoadVType(@Body TierLoadVTypeRequest tierLoadVTypeRequest);

    @POST("/api/tier/loadIsRequired")
    Observable<TierLoadIsRequiredResponse> reqTierLoadIsRequired(@Body TierLoadIsRequiredRequest tierLoadIsRequiredRequest);

    @POST("/api/tier/loadTUType")
    Observable<TierLoadTUTypeResponse> reqTierLoadTUType(@Body TierLoadTUTypeRequest tierLoadTUTypeRequest);
}
