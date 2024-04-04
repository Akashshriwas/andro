// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public final class ec
{
    public final v a;
    public final ev b;
    public final List c;
    public final int d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final String i;
    public final boolean j;
    public final al k;
    public final bp l;
    public final String m;
    public final am n;
    public final ao o;
    public final long p;
    public final x q;
    public final long r;
    
    public ec(final v a, final ev b, final List list, final int d, final List list2, final List list3, final int g, final long h, final String i, final boolean j, final al k, final bp l, final String m, final am n, final ao o, final long p18, final x q, final long r) {
        this.a = a;
        this.b = b;
        List<Object> unmodifiableList;
        if (list != null) {
            unmodifiableList = Collections.unmodifiableList((List<?>)list);
        }
        else {
            unmodifiableList = null;
        }
        this.c = unmodifiableList;
        this.d = d;
        List<Object> unmodifiableList2;
        if (list2 != null) {
            unmodifiableList2 = Collections.unmodifiableList((List<?>)list2);
        }
        else {
            unmodifiableList2 = null;
        }
        this.e = unmodifiableList2;
        List<Object> unmodifiableList3;
        if (list3 != null) {
            unmodifiableList3 = Collections.unmodifiableList((List<?>)list3);
        }
        else {
            unmodifiableList3 = null;
        }
        this.f = unmodifiableList3;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
}
