// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.io.IOException;

public abstract class jg
{
    protected int f;
    
    public jg() {
        this.f = -1;
    }
    
    public static final void a(final jg jg, final byte[] array, final int n, final int n2) {
        try {
            final je a = je.a(array, n, n2);
            jg.a(a);
            a.b();
        }
        catch (IOException cause) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", cause);
        }
    }
    
    public static final byte[] a(final jg jg) {
        final byte[] array = new byte[jg.a()];
        a(jg, array, 0, array.length);
        return array;
    }
    
    public int a() {
        return this.f = 0;
    }
    
    public abstract void a(final je p0);
    
    @Override
    public String toString() {
        return jh.a(this);
    }
}
