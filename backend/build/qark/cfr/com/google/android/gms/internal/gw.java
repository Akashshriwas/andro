/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.gz;
import java.util.Arrays;

public final class gw {
    public static /* varargs */ int a(Object ... arrobject) {
        return Arrays.hashCode((Object[])arrobject);
    }

    public static gz a(Object object) {
        return new gz(object, null);
    }

    public static boolean a(Object object, Object object2) {
        if (object == object2 || object != null && object.equals(object2)) {
            return true;
        }
        return false;
    }
}

