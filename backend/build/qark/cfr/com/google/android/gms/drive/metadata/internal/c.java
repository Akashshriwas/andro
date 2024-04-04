/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.hw;
import java.util.HashMap;
import java.util.Map;

public final class c {
    private static Map a = new HashMap();

    static {
        c.a(hu.a);
        c.a(hu.b);
        c.a(hu.c);
        c.a(hu.d);
        c.a(hu.e);
        c.a(hu.f);
        c.a(hu.g);
        c.a(hu.h);
        c.a(hw.c);
        c.a(hw.a);
        c.a(hw.b);
        c.a(hw.d);
    }

    public static b a(String string) {
        return (b)a.get((Object)string);
    }

    private static void a(b b2) {
        if (a.containsKey((Object)b2.a())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + b2.a());
        }
        a.put((Object)b2.a(), (Object)b2);
    }
}

