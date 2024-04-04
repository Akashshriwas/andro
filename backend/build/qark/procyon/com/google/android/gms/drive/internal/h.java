// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jg;

public final class h extends jg
{
    public static final h[] a;
    public int b;
    public String c;
    public long d;
    public long e;
    private int g;
    
    static {
        a = new h[0];
    }
    
    public h() {
        this.b = 1;
        this.c = "";
        this.d = -1L;
        this.e = -1L;
        this.g = -1;
    }
    
    @Override
    public int a() {
        return this.g = 0 + je.b(1, this.b) + je.b(2, this.c) + je.c(3, this.d) + je.c(4, this.e);
    }
    
    @Override
    public void a(final je je) {
        je.a(1, this.b);
        je.a(2, this.c);
        je.b(3, this.d);
        je.b(4, this.e);
    }
}
