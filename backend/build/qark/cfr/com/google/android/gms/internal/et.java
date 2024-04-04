/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.util.Log;

public final class et {
    public static void a(String string) {
        if (et.a(3)) {
            Log.d((String)"Ads", (String)string);
        }
    }

    public static void a(String string, Throwable throwable) {
        if (et.a(3)) {
            Log.d((String)"Ads", (String)string, (Throwable)throwable);
        }
    }

    public static boolean a(int n2) {
        if (n2 < 5 && !Log.isLoggable((String)"Ads", (int)n2) || n2 == 2) {
            return false;
        }
        return true;
    }

    public static void b(String string) {
        if (et.a(6)) {
            Log.e((String)"Ads", (String)string);
        }
    }

    public static void b(String string, Throwable throwable) {
        if (et.a(5)) {
            Log.w((String)"Ads", (String)string, (Throwable)throwable);
        }
    }

    public static void c(String string) {
        if (et.a(4)) {
            Log.i((String)"Ads", (String)string);
        }
    }

    public static void d(String string) {
        if (et.a(2)) {
            Log.v((String)"Ads", (String)string);
        }
    }

    public static void e(String string) {
        if (et.a(5)) {
            Log.w((String)"Ads", (String)string);
        }
    }
}

