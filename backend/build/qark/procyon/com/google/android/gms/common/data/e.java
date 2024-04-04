// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;

public abstract class e
{
    protected final DataHolder a;
    protected final int b;
    private final int c;
    
    public e(final DataHolder dataHolder, final int b) {
        this.a = (DataHolder)hc.a(dataHolder);
        hc.a(b >= 0 && b < dataHolder.g());
        this.b = b;
        this.c = dataHolder.a(this.b);
    }
    
    protected long a(final String s) {
        return this.a.a(s, this.b, this.c);
    }
    
    protected int b(final String s) {
        return this.a.b(s, this.b, this.c);
    }
    
    protected boolean c(final String s) {
        return this.a.d(s, this.b, this.c);
    }
    
    protected String d(final String s) {
        return this.a.c(s, this.b, this.c);
    }
    
    protected byte[] e(final String s) {
        return this.a.e(s, this.b, this.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b2;
        final boolean b = b2 = false;
        if (o instanceof e) {
            final e e = (e)o;
            b2 = b;
            if (gw.a((Object)e.b, this.b)) {
                b2 = b;
                if (gw.a((Object)e.c, this.c)) {
                    b2 = b;
                    if (e.a == this.a) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    protected Uri f(final String s) {
        return this.a.f(s, this.b, this.c);
    }
    
    protected boolean g(final String s) {
        return this.a.g(s, this.b, this.c);
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.b, this.c, this.a);
    }
}
