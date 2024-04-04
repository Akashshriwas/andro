/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class hc {
    public static Object a(Object object) {
        if (object == null) {
            throw new NullPointerException("null reference");
        }
        return object;
    }

    public static Object a(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException(String.valueOf((Object)object2));
        }
        return object;
    }

    public static String a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return string;
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(String.valueOf((Object)object));
        }
    }

    public static /* varargs */ void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalArgumentException(String.format((String)string, (Object[])arrobject));
        }
    }

    public static void b(String string) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(string);
        }
    }

    public static void b(boolean bl2) {
        if (!bl2) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(String.valueOf((Object)object));
        }
    }

    public static void c(String string) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(string);
        }
    }
}

