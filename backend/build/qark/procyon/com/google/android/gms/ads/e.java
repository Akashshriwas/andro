// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.ads;

import com.google.android.gms.internal.es;
import com.google.android.gms.internal.x;
import android.content.Context;

public final class e
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    private final int g;
    private final int h;
    private final String i;
    
    static {
        a = new e(320, 50, "320x50_mb");
        b = new e(468, 60, "468x60_as");
        c = new e(728, 90, "728x90_as");
        d = new e(300, 250, "300x250_as");
        e = new e(160, 600, "160x600_as");
        f = new e(-1, -2, "smart_banner");
    }
    
    public e(final int i, final int j) {
        final StringBuilder sb = new StringBuilder();
        String value;
        if (i == -1) {
            value = "FULL";
        }
        else {
            value = String.valueOf(i);
        }
        final StringBuilder append = sb.append(value).append("x");
        String value2;
        if (j == -2) {
            value2 = "AUTO";
        }
        else {
            value2 = String.valueOf(j);
        }
        this(i, j, append.append(value2).append("_as").toString());
    }
    
    e(final int n, final int n2, final String i) {
        if (n < 0 && n != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + n);
        }
        if (n2 < 0 && n2 != -2) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + n2);
        }
        this.g = n;
        this.h = n2;
        this.i = i;
    }
    
    public int a() {
        return this.h;
    }
    
    public int a(final Context context) {
        if (this.h == -2) {
            return x.b(context.getResources().getDisplayMetrics());
        }
        return es.a(context, this.h);
    }
    
    public int b() {
        return this.g;
    }
    
    public int b(final Context context) {
        if (this.g == -1) {
            return x.a(context.getResources().getDisplayMetrics());
        }
        return es.a(context, this.g);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            if (this.g != e.g || this.h != e.h || !this.i.equals(e.i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return this.i.hashCode();
    }
    
    @Override
    public String toString() {
        return this.i;
    }
}
