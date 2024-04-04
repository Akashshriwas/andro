// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class hc
{
    public static Object a(final Object o) {
        if (o == null) {
            throw new NullPointerException("null reference");
        }
        return o;
    }
    
    public static Object a(final Object o, final Object obj) {
        if (o == null) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return o;
    }
    
    public static String a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return s;
    }
    
    public static void a(final boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }
    
    public static void a(final boolean b, final Object obj) {
        if (!b) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
    
    public static void a(final boolean b, final String format, final Object... args) {
        if (!b) {
            throw new IllegalArgumentException(String.format(format, args));
        }
    }
    
    public static void b(final String s) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }
    
    public static void b(final boolean b) {
        if (!b) {
            throw new IllegalArgumentException();
        }
    }
    
    public static void b(final boolean b, final Object obj) {
        if (!b) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
    
    public static void c(final String s) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }
}
