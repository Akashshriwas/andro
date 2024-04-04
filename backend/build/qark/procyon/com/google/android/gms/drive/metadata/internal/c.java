// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.internal.hw;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.internal.hu;
import java.util.HashMap;
import java.util.Map;

public final class c
{
    private static Map a;
    
    static {
        c.a = new HashMap();
        a(hu.a);
        a(hu.b);
        a(hu.c);
        a(hu.d);
        a(hu.e);
        a(hu.f);
        a(hu.g);
        a(hu.h);
        a(hw.c);
        a(hw.a);
        a(hw.b);
        a(hw.d);
    }
    
    public static b a(final String s) {
        return c.a.get(s);
    }
    
    private static void a(final b b) {
        if (c.a.containsKey(b.a())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + b.a());
        }
        c.a.put(b.a(), b);
    }
}
