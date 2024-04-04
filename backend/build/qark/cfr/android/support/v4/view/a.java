/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  java.lang.Object
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.b;
import android.support.v4.view.c;
import android.support.v4.view.d;
import android.view.KeyEvent;

public class a {
    static final d a = Build.VERSION.SDK_INT >= 11 ? new c() : new b();

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }

    public static boolean a(KeyEvent keyEvent, int n2) {
        return a.a(keyEvent.getMetaState(), n2);
    }
}

