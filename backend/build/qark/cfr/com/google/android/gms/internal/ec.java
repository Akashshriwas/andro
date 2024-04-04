/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.Collections;
import java.util.List;

public final class ec {
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

    /*
     * Enabled aggressive block sorting
     */
    public ec(v v2, ev ev2, List list, int n2, List list2, List list3, int n3, long l2, String string, boolean bl2, al al2, bp bp2, String string2, am am2, ao ao2, long l3, x x2, long l4) {
        this.a = v2;
        this.b = ev2;
        v2 = list != null ? Collections.unmodifiableList((List)list) : null;
        this.c = v2;
        this.d = n2;
        v2 = list2 != null ? Collections.unmodifiableList((List)list2) : null;
        this.e = v2;
        v2 = list3 != null ? Collections.unmodifiableList((List)list3) : null;
        this.f = v2;
        this.g = n3;
        this.h = l2;
        this.i = string;
        this.j = bl2;
        this.k = al2;
        this.l = bp2;
        this.m = string2;
        this.n = am2;
        this.o = ao2;
        this.p = l3;
        this.q = x2;
        this.r = l4;
    }
}

