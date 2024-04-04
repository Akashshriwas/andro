/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.util.Base64;

public final class hp {
    public static String a(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return Base64.encodeToString((byte[])arrby, (int)0);
    }

    public static String b(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return Base64.encodeToString((byte[])arrby, (int)10);
    }
}

