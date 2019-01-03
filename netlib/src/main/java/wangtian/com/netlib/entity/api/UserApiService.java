package wangtian.com.netlib.entity.api;

import  wangtian.com.netlib.entity.LoadFeedbackListRequest;
import  wangtian.com.netlib.entity.LoadFeedbackListResponse;
import  wangtian.com.netlib.entity.LoadPushMessageIndexListRequest;
import  wangtian.com.netlib.entity.LoadPushMessageIndexListResponse;
import  wangtian.com.netlib.entity.LoadPushMessageListRequest;
import  wangtian.com.netlib.entity.LoadPushMessageListResponse;
import  wangtian.com.netlib.entity.UserLoadUserInfoRequest;
import  wangtian.com.netlib.entity.UserLoadUserInfoResponse;
import  wangtian.com.netlib.entity.UserLoginRequest;
import  wangtian.com.netlib.entity.UserLoginResponse;
import  wangtian.com.netlib.entity.UserSaveFeedbackRequest;
import  wangtian.com.netlib.entity.UserSaveFeedbackResponse;
import  wangtian.com.netlib.entity.UserSendCodeRequest;
import  wangtian.com.netlib.entity.UserSendCodeResponse;
import  wangtian.com.netlib.entity.UserUpdatePasswordRequest;
import  wangtian.com.netlib.entity.UserUpdatePasswordResponse;
import  wangtian.com.netlib.entity.UserUpdatePhoneRequest;
import  wangtian.com.netlib.entity.UserUpdatePhoneResponse;
import  wangtian.com.netlib.entity.UserUpdateUserPhotoRequest;
import  wangtian.com.netlib.entity.UserUpdateUserPhotoResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface UserApiService {
    @POST("/api/user/login")
    Observable<UserLoginResponse> reqLogin(@Body UserLoginRequest userLoginRequest);

    @POST("/api/user/saveFeedback")
    Observable<UserSaveFeedbackResponse> reqSaveFeedback(@Body UserSaveFeedbackRequest userSaveFeedbackRequest);

    @POST("/api/user/sendCode")
    Observable<UserSendCodeResponse> reqSendCode(@Body UserSendCodeRequest userSendCodeRequest);

    @POST("/api/user/updatePhone")
    Observable<UserUpdatePhoneResponse> reqUpdatePhone(@Body UserUpdatePhoneRequest userUpdatePhoneRequest);

    @POST("/api/user/updatePassword")
    Observable<UserUpdatePasswordResponse> reqUpdatePassword(@Body UserUpdatePasswordRequest userUpdatePasswordRequest);


    @POST("/api/user/updateUserPhoto")
    Observable<UserUpdateUserPhotoResponse> reqUpdatePhoto(@Body UserUpdateUserPhotoRequest request);


    @POST("/api/user/loadUserInfo")
    Observable<UserLoadUserInfoResponse> reqUserInfo(@Body UserLoadUserInfoRequest request);

    @POST("/api/user/loadPushMessageIndexList")
    Observable<LoadPushMessageIndexListResponse> reqLoadPushMessageIndexList(@Body LoadPushMessageIndexListRequest request);

    @POST("/api/user/loadPushMessageList")
    Observable<LoadPushMessageListResponse> reqLoadPushMessageList(@Body LoadPushMessageListRequest request);

    @POST("/api/user/loadFeedbackList")
    Observable<LoadFeedbackListResponse> reqLoadFeedbackList(@Body LoadFeedbackListRequest loadFeedbackListRequest);

}
