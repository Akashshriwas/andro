/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jg;

public final class h
extends jg {
    public static final h[] a = new h[0];
    public int b = 1;
    public String c = "";
    public long d = -1L;
    public long e = -1L;
    private int g = -1;

    @Override
    public int a() {
        int n2;
        this.g = n2 = 0 + je.b(1, this.b) + je.b(2, this.c) + je.c(3, this.d) + je.c(4, this.e);
        return n2;
    }

    @Override
    public void a(je je2) {
        je2.a(1, this.b);
        je2.a(2, this.c);
        je2.b(3, this.d);
        je2.b(4, this.e);
    }
}

