/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.google.android.gms.maps.a;

public final class a {
    public static byte a(Boolean bl2) {
        if (bl2 != null) {
            if (bl2.booleanValue()) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static Boolean a(byte by2) {
        switch (by2) {
            default: {
                return null;
            }
            case 1: {
                return Boolean.TRUE;
            }
            case 0: 
        }
        return Boolean.FALSE;
    }
}

