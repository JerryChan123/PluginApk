package com.lin.pluginapk;

import com.sogou.plugandhotfix.ProxyPluginCallback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by linchen on 18-12-12.
 * mail: linchen@sogou-inc.com
 */
@SuppressLint("Registered")
public class BaseActivity extends Activity implements ProxyPluginCallback {
    private Activity mHostActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onStart();
        }
    }

    @Override
    public void onResume() {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onResume();
        }
    }

    @Override
    public void onStop() {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onStop();
        }
    }

    @Override
    public ClassLoader getClassLoader() {
        if (PluginConstant.IS_PLUGIN) {
            return mHostActivity.getClassLoader();
        }
        return super.getClassLoader();
    }

    @Override
    public void attachBaseContext(Context context) {
        if (PluginConstant.IS_PLUGIN) {
            mHostActivity = (Activity) context;
        } else {
            super.attachBaseContext(context);
        }
    }


    @Override
    public void onDestroy() {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onDestroy();
        }
    }
}
