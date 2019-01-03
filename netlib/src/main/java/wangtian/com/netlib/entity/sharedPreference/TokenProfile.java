package wangtian.com.netlib.entity.sharedPreference;


import com.skydoves.preferenceroom.KeyName;
import com.skydoves.preferenceroom.PreferenceEntity;

@PreferenceEntity(name = "TokenProfile")
public class TokenProfile {
    @KeyName(name = "token")
    protected final String token = "";
}
