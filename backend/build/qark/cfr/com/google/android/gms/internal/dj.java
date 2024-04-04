/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 */
package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class dj
implements SafeParcelable {
    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d = false;

    private static boolean a(Class class_) {
        try {
            boolean bl2 = "SAFE_PARCELABLE_NULL_STRING".equals(class_.getField("NULL").get((Object)null));
            return bl2;
        }
        catch (IllegalAccessException illegalAccessException) {
            return false;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return false;
        }
    }

    protected static boolean b(String string) {
        ClassLoader classLoader = dj.v();
        if (classLoader == null) {
            return true;
        }
        try {
            boolean bl2 = dj.a(classLoader.loadClass(string));
            return bl2;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static ClassLoader v() {
        Object object = a;
        synchronized (object) {
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static Integer w() {
        Object object = a;
        synchronized (object) {
            return c;
        }
    }

    protected boolean x() {
        return this.d;
    }
}

