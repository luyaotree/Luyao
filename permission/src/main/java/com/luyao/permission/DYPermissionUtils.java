package com.luyao.permission;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.douyu.app.user.permission.R;

/**
 * 描述：权限工具类
 * 用于检查权限，申请权限，判断权限等操作
 * @author luyao
 * @date 2017/12/19 20:47
 */
public class DYPermissionUtils {

    private static final String TAG = DYPermissionUtils.class.getSimpleName();

    public static final String PERMISSION_READ_PHONE_STATE = Manifest.permission.READ_PHONE_STATE;
    public static final String PERMISSION_READ_EXTERNAL_STORAGE = Manifest.permission.READ_EXTERNAL_STORAGE;
    public static final String PERMISSION_WRITE_EXTERNAL_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    public static final String PERMISSION_CAMERA = Manifest.permission.CAMERA;
    public static final String PERMISSION_RECORD_AUDIO = Manifest.permission.RECORD_AUDIO;
    public static final String PERMISSION_ACCESS_FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    public static final String PERMISSION_ACCESS_COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    public static final String PERMISSION_GET_ACCOUNTS = Manifest.permission.GET_ACCOUNTS;
    public static final String PERMISSION_WRITE_SETTINGS = Manifest.permission.WRITE_SETTINGS;

    /**
     * 启动app申请权限CODE
     */
    public static final int REQ_CODE_LAUNCHER = 11;

    /**
     * 扫一扫申请权限CODE
     */
    public static final int REQ_CODE_SCANNER = 12;

    /**
     * 启动手播申请权限CODE
     */
    public static final int REQ_CODE_LIVE = 13;

    /**
     * 启动录播申请权限CODE
     */
    public static final int REQ_CODE_RECORD = 14;

    /**
     * 定位功能申请权限CODE
     */
    public static final int REQ_CODE_LOCATION = 15;

    /**
     * 设置亮度功能申请权限CODE
     */
    public static final int REQ_CODE_CHANGE_BRIGHTNESS = 16;

    /**
     * 画中画申请的权限CODE
     */
    public static final int REQ_CODE_SYSTEM_ALERT_WINDOW = 17;

    /**
     * 画中画申请的权限CODE
     */
    public static final int REQ_CODE_CAMERA_AND_MIC = 18;

    /**
     * 手游直播申请权限CODE
     */
    public static final int REQ_CODE_MOBILE_GAME_LIVE = 19;

    /**
     * 麦克风权限
     */
    public static final int REQ_CODE_MICROPHONE = 20;


    /**
     * 音频直播申请权限code
     */
    public static final int REQ_CODE_VOICE_LIVE = 21;

    /**
     * 启动时必须申请的权限
     */
    public static final String[] launcherPermissions = new String[]{
            PERMISSION_READ_PHONE_STATE,
            PERMISSION_READ_EXTERNAL_STORAGE,
            PERMISSION_WRITE_EXTERNAL_STORAGE};

    /**
     * 扫一扫必须申请的权限
     */
    public static final String[] scannerPermissions = new String[]{
            PERMISSION_CAMERA};

    /**
     * 手播必须申请的权限
     */
    public static final String[] livePermissions = new String[]{
            PERMISSION_CAMERA,
            PERMISSION_RECORD_AUDIO,
            PERMISSION_ACCESS_FINE_LOCATION,
            PERMISSION_ACCESS_COARSE_LOCATION
    };

    /**
     * 音频直播主播端必须的权限
     */
    public static final String[] voiceLivePremissions = new String[]{
            PERMISSION_CAMERA,
            PERMISSION_RECORD_AUDIO,
    };

    /**
     * 录制视频必须申请的权限
     */
    public static final String[] videoRecordPermission = new String[]{
            PERMISSION_CAMERA,
            PERMISSION_RECORD_AUDIO,
    };

    /**
     * 定位必须申请的权限
     */
    public static final String[] locationPermissions = new String[]{
            PERMISSION_ACCESS_FINE_LOCATION,
            PERMISSION_ACCESS_COARSE_LOCATION
    };

    public static final String[] changeBrightness = new String[]{
            PERMISSION_WRITE_SETTINGS
    };

    /**
     * 摄像头和麦克风权限 (连麦小窗)
     */
    public static final String[] cameraAndMicPermissions = new String[]{
            PERMISSION_CAMERA,
            PERMISSION_RECORD_AUDIO,
    };
    /**
     * 麦克风
     */
    public static final String[] microphonePermissions = new String[]{
            PERMISSION_RECORD_AUDIO,
    };

    /**
     * 检查并请求文件权限、安卓6.0生效
     *
     * @param activity
     * @param code
     * @return
     */
    public static boolean requestPermissions(Activity activity, String permissionname, int code) {
        if (ContextCompat.checkSelfPermission(activity, permissionname)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{permissionname},
                    code);
            return true;
        }
        return false;
    }

    /**
     * 检查权限
     *
     * @param context
     * @param permissionNames
     * @return
     */
    public static boolean checkPermission(Context context, String[] permissionNames) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }

        for (String name : permissionNames) {
            if (context != null && name != null) {
                if (ContextCompat.checkSelfPermission(context, name) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * activity检查并申请权限
     *
     * @param activity
     * @param requestCode
     * @return
     */
    public static boolean checkPermissionAct(Activity activity, int requestCode) {
        String[] permissions = getPermissions(requestCode);
        if (permissions == null || permissions.length == 0) {
            return true;
        }

        //申请前先检查权限
        boolean result = checkPermission(activity, permissions);
        if (!result) {
            ActivityCompat.requestPermissions(activity, permissions, requestCode);
        }

        return result;
    }

    /**
     * 根据申请code，获取对应申请的权限名
     *
     * @param requestCode
     * @return
     */
    public static String[] getPermissions(int requestCode) {
        switch (requestCode) {
            case REQ_CODE_LAUNCHER:
                return launcherPermissions;
            case REQ_CODE_SCANNER:
                return scannerPermissions;
            case REQ_CODE_VOICE_LIVE:
                return voiceLivePremissions;
            case REQ_CODE_MOBILE_GAME_LIVE:
                return livePermissions;
            case REQ_CODE_LIVE:
                return videoRecordPermission;   //摄像头开播只需要音频+摄像头权限，跟拍摄视频一样
            case REQ_CODE_RECORD:
                return videoRecordPermission;
            case REQ_CODE_LOCATION:
                return locationPermissions;
            case REQ_CODE_CHANGE_BRIGHTNESS:
                return changeBrightness;
            case REQ_CODE_CAMERA_AND_MIC:
                return cameraAndMicPermissions;
            case REQ_CODE_MICROPHONE:
                return microphonePermissions;
            default:
                return null;
        }
    }

    /**
     * fragment检查并申请权限
     *
     * @param fragment
     * @param requestCode
     * @return
     */
    public static boolean checkPermissionFragment(Fragment fragment, int requestCode) {
        String[] permissions = getPermissions(requestCode);
        if (permissions == null || permissions.length == 0) {
            return true;
        }

        //申请前先检查权限
        boolean result = checkPermission(fragment.getContext(), permissions);
        if (!result) {
            fragment.requestPermissions(permissions, requestCode);
        }

        return result;
    }

    /**
     * 验证申请权限结果
     *
     * @param grantResults
     * @return
     */
    public static boolean verifyPermissions(int[] grantResults) {
        if (grantResults.length < 1) {
            return false;
        }

        for (int result : grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    /**
     * 是否有权限被勾选永久拒绝
     *
     * @param activity
     * @param permissions
     * @return
     */
    public static boolean checkPermissionPermanentRefuse(Activity activity, String[] permissions) {

        if (permissions == null || permissions.length == 0) {

            return false;
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {

            return false;
        }
        for (String permission : permissions) {

            //权限已获取
            if (ContextCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED) {

                continue;
            }
            //检查是否勾选了拒绝后不再提示
            if (!activity.shouldShowRequestPermissionRationale(permission)) {

                return true;
            }
        }
        return false;
    }

    /**
     * 弹出无启动权限提示
     *
     * @param permanentRefuse  用户是否选择勾选后不再提示
     * @param activity
     * @param negativeListener
     * @param positiveListener
     */
    public static void showLaunchPermissionRemind(boolean permanentRefuse, final Activity activity,
                                                  DialogInterface.OnClickListener negativeListener, DialogInterface.OnClickListener positiveListener) {
        if (activity !=null && activity.isFinishing()) {//如果页面已经退出了就不要再弹框了
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Base_Theme_AppCompat_Light_Dialog_Alert);
        if (permanentRefuse) {

            builder.setNegativeButton("去开启", negativeListener);
            builder.setMessage("无法获取启动应用需要的相关权限，请前往应用设置开启权限");
        } else {

            builder.setNegativeButton("去允许", negativeListener);
            builder.setMessage("为保证您正常、安全的使用斗鱼，需要获取相关权限，请允许");
        }
        builder.setPositiveButton("退出", positiveListener);
        builder.setCancelable(false);
        builder.create().show();
    }
}
