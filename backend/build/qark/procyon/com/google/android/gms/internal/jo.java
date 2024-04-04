// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.io.IOException;

class jo implements jl
{
    private je a;
    private byte[] b;
    private final int c;
    
    public jo(final int c) {
        this.c = c;
        this.a();
    }
    
    @Override
    public void a() {
        this.b = new byte[this.c];
        this.a = je.a(this.b);
    }
    
    @Override
    public void a(final int n, final long n2) {
        this.a.a(n, n2);
    }
    
    @Override
    public void a(final int n, final String s) {
        this.a.a(n, s);
    }
    
    @Override
    public byte[] b() {
        final int a = this.a.a();
        if (a < 0) {
            throw new IOException();
        }
        if (a == 0) {
            return this.b;
        }
        final byte[] array = new byte[this.b.length - a];
        System.arraycopy(this.b, 0, array, 0, array.length);
        return array;
    }
}
