package com.rnshortcutbadger;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;

/**
 * Created by Kun on 2017/3/6.
 */

public class rnShortcutBadgerModule extends ReactContextBaseJavaModule {
    public rnShortcutBadgerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ShortcutBadgerAndroid";
    }

    @ReactMethod
    public void setNumber(int number){
        ShortcutBadger.applyCount(getReactApplicationContext(),number);
    }

    @ReactMethod
    public void removeNumber(){
        ShortcutBadger.removeCount(getReactApplicationContext());
    }

}
