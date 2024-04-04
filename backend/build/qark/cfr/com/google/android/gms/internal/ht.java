/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.os.Build;

public final class ht {
    public static boolean a() {
        return ht.a(11);
    }

    private static boolean a(int n2) {
        if (Build.VERSION.SDK_INT >= n2) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        return ht.a(17);
    }
}

