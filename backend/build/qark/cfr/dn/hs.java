/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package dn;

import android.app.Application;
import android.content.Context;

public class hs
extends Application {
    private static Context a;

    public static Context a() {
        return a;
    }

    public void onCreate() {
        super.onCreate();
        a = this.getApplicationContext();
    }
}

