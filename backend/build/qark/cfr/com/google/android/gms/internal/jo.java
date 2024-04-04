/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jl;
import java.io.IOException;

class jo
implements jl {
    private je a;
    private byte[] b;
    private final int c;

    public jo(int n2) {
        this.c = n2;
        this.a();
    }

    @Override
    public void a() {
        this.b = new byte[this.c];
        this.a = je.a(this.b);
    }

    @Override
    public void a(int n2, long l2) {
        this.a.a(n2, l2);
    }

    @Override
    public void a(int n2, String string) {
        this.a.a(n2, string);
    }

    @Override
    public byte[] b() {
        int n2 = this.a.a();
        if (n2 < 0) {
            throw new IOException();
        }
        if (n2 == 0) {
            return this.b;
        }
        byte[] arrby = new byte[this.b.length - n2];
        System.arraycopy((Object)this.b, (int)0, (Object)arrby, (int)0, (int)arrby.length);
        return arrby;
    }
}

