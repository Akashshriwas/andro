/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package com.google.android.gms.internal;

import com.google.a.a.a;
import com.google.a.b;
import com.google.a.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.g;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bx {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a a(v v2) {
        HashSet hashSet;
        if (v2.f != null) {
            hashSet = new HashSet((Collection)v2.f);
            do {
                return new a(new Date(v2.c), bx.a(v2.e), (Set)hashSet, v2.g);
                break;
            } while (true);
        }
        hashSet = null;
        return new a(new Date(v2.c), bx.a(v2.e), (Set)hashSet, v2.g);
    }

    public static b a(int n2) {
        switch (n2) {
            default: {
                return b.a;
            }
            case 2: {
                return b.c;
            }
            case 1: 
        }
        return b.b;
    }

    public static c a(x x2) {
        return new c(g.a(x2.g, x2.d, x2.c));
    }
}

