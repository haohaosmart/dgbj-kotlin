package wangtian.com.netlib.entity.api;


import  wangtian.com.netlib.entity.FileUploadResponse;
import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by apple on 2018/12/4.
 */

public interface FileApiService {

    @Multipart
    @POST("api/file/upload")
    Observable<FileUploadResponse> uploadImg(@Part MultipartBody.Part file);
}
