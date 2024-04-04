// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.ads.g;
import com.google.a.c;
import com.google.a.b;
import java.util.Set;
import java.util.Date;
import java.util.Collection;
import java.util.HashSet;
import com.google.a.a.a;

public final class bx
{
    public static a a(final v v) {
        HashSet set;
        if (v.f != null) {
            set = new HashSet(v.f);
        }
        else {
            set = null;
        }
        return new a(new Date(v.c), a(v.e), set, v.g);
    }
    
    public static b a(final int n) {
        switch (n) {
            default: {
                return b.a;
            }
            case 2: {
                return b.c;
            }
            case 1: {
                return b.b;
            }
        }
    }
    
    public static c a(final x x) {
        return new c(g.a(x.g, x.d, x.c));
    }
}
