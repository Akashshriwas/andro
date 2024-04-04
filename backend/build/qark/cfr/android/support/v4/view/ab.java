/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.ViewConfiguration
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.ac;
import android.support.v4.view.ad;
import android.support.v4.view.ae;
import android.view.ViewConfiguration;

public class ab {
    static final ae a = Build.VERSION.SDK_INT >= 11 ? new ad() : new ac();

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }
}

