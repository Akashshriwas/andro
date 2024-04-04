// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.a;

import com.google.android.gms.ads.e;

@Deprecated
public final class c
{
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    private final e g;
    
    static {
        a = new c(-1, -2, "mb");
        b = new c(320, 50, "mb");
        c = new c(300, 250, "as");
        d = new c(468, 60, "as");
        e = new c(728, 90, "as");
        f = new c(160, 600, "as");
    }
    
    private c(final int n, final int n2, final String s) {
        this(new e(n, n2));
    }
    
    public c(final e g) {
        this.g = g;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof c && this.g.equals(((c)o).g);
    }
    
    @Override
    public int hashCode() {
        return this.g.hashCode();
    }
    
    @Override
    public String toString() {
        return this.g.toString();
    }
}
