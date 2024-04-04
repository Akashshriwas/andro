/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.t;
import android.support.v4.view.u;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.view.View;

public class q {
    static final w a;

    static {
        int n2 = Build.VERSION.SDK_INT;
        a = n2 >= 16 || Build.VERSION.CODENAME.equals((Object)"JellyBean") ? new v() : (n2 >= 14 ? new u() : (n2 >= 11 ? new t() : (n2 >= 9 ? new s() : new r())));
    }

    public static int a(View view) {
        return a.a(view);
    }

    public static boolean a(View view, int n2) {
        return a.a(view, n2);
    }

    public static void b(View view) {
        a.b(view);
    }
}

