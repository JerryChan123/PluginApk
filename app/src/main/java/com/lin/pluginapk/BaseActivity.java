package com.lin.pluginapk;

import com.sogou.plugandhotfix.ProxyPluginCallback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by linchen on 18-12-12.
 * mail: linchen@sogou-inc.com
 */
@SuppressLint("Registered")
public class BaseActivity extends Activity implements ProxyPluginCallback {
    private Activity mHostActivity;

    @Override
    public Context getApplicationContext() {
        if (PluginConstant.IS_PLUGIN) {
            return mHostActivity.getApplicationContext();
        }
        return super.getApplicationContext();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onCreate(savedInstanceState);
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        if (PluginConstant.IS_PLUGIN) {
            mHostActivity.setContentView(layoutResID);
        } else {
            super.setContentView(layoutResID);
        }
    }

    @Override
    public void setContentView(View view) {
        if (PluginConstant.IS_PLUGIN) {
            mHostActivity.setContentView(view);
        } else {
            super.setContentView(view);
        }

    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        if (PluginConstant.IS_PLUGIN) {
            mHostActivity.setContentView(view, params);
        } else {
            super.setContentView(view, params);
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
    public void attachHost(Activity activity, Resources resources) {
        mHostActivity = activity;
        mResources = resources;
    }

    private Resources mResources;

    @Override
    public Resources getResources() {
        if (PluginConstant.IS_PLUGIN) {
            return mResources;
        }
        return super.getResources();
    }

    @Override
    public AssetManager getAssets() {
        if (PluginConstant.IS_PLUGIN) {
            return mHostActivity.getAssets();
        }
        return super.getAssets();
    }

    @Override
    public ClassLoader getClassLoader() {
        if (PluginConstant.IS_PLUGIN) {
            return mHostActivity.getClassLoader();
        }
        return super.getClassLoader();
    }


    @Override
    public void onDestroy() {
        if (PluginConstant.IS_PLUGIN) {

        } else {
            super.onDestroy();
        }
    }
}
