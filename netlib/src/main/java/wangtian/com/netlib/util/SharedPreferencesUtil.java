package wangtian.com.netlib.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtil {

    private static final String SHARED_NAME = "react-native";


    /**
     * 获取String类型数据从SP中
     *
     * @param context      当前上下文
     * @param key          存放的名称key
     * @param defaultValue 存放的内容value
     * @return 通过key取得value返回
     */
    public static String getPrefString(Context context, String key,
                                       final String defaultValue) {
        if (context != null) {
            final SharedPreferences settings = context.getSharedPreferences
                    (SHARED_NAME, Context.MODE_PRIVATE);//如果所有的get都是通过“config”这个名称获取，那么其实可以看做单例模式
            return settings.getString(key, defaultValue);
        } else {
            return null;
        }

    }

    /**
     * 将String类型数据存放到SP中
     *
     * @param context 当前上下文
     * @param key     存放数据的名称key
     * @param value   存放的内容value
     */
    public static void setPrefString(Context context, final String key,
                                     final String value) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        settings.edit().putString(key, value).apply();
    }

    /**
     * 获取String类型数据从SP中
     *
     * @param context      当前上下文
     * @param key          存放的名称key
     * @param key2         存放的名称key2
     * @param defaultValue 存放的内容value
     * @return 通过key取得value返回
     */
    public static String getPrefString(Context context, String key, String key2,
                                       final String defaultValue) {
        if (context != null) {
            final SharedPreferences settings = context.getSharedPreferences
                    (SHARED_NAME, Context.MODE_PRIVATE);//如果所有的get都是通过“config”这个名称获取，那么其实可以看做单例模式
            return settings.getString(key + key2, defaultValue);
        } else {
            return null;
        }
    }

    /**
     * 将String类型数据存放到SP中
     *
     * @param context 当前上下文
     * @param key     存放数据的名称key
     * @param key2    存放的名称key2
     * @param value   存放的内容value
     */
    public static void setPrefString(Context context, final String key, String key2,
                                     final String value) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        settings.edit().putString(key + key2, value).apply();
    }

    /**
     * 将int类型数据存放到SP中
     *
     * @param context 当前上下文
     * @param key     存放数据的名称key
     * @param value   存放的内容value
     */
    public static void setPrefInt(Context context, final String key,
                                  final int value) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        settings.edit().putInt(key, value).apply();
    }

    /**
     * 将Boolean类型数据从SP中
     *
     * @param context 当前上下文
     * @param key     存放数据的名称key
     * @param value   存放的内容value
     */
    public static void setPreBool(Context context, final String key,
                                  final Boolean value) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        settings.edit().putBoolean(key, value).apply();
    }


    /**
     * 获取Boolean类型数据从SP中
     *
     * @param context      当前上下文
     * @param key          存放的名称key
     * @param defaultValue 存放的内容value
     * @return 通过key取得value返回
     */
    public static boolean getPrefBool(Context context, final String key,
                                      final Boolean defaultValue) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        return settings.getBoolean(key, defaultValue);
    }

    /**
     * 获取int类型数据从SP中
     *
     * @param context      当前上下文
     * @param key          存放的名称key
     * @param defaultValue 存放的内容value
     * @return 通过key取得value返回
     */
    public static int getPrefInt(Context context, final String key,
                                 final int defaultValue) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        return settings.getInt(key, defaultValue);
    }


    /**
     * 清除SP
     *
     * @param context 当前上下文
     * @param p       要清除的sp
     */
    public static void clearPreference(Context context) {
        final SharedPreferences settings = context.getSharedPreferences
                (SHARED_NAME, Context.MODE_PRIVATE);
        final Editor editor = settings.edit();
        editor.clear();
        editor.apply();
    }


}
