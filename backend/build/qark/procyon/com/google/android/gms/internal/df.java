// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.RemoteException;

public abstract class df extends ef
{
    private final bz a;
    private final de b;
    
    public df(final bz a, final de b) {
        this.a = a;
        this.b = b;
    }
    
    private static cb a(final dp dp, final bz bz) {
        try {
            return dp.a(bz);
        }
        catch (RemoteException ex) {
            et.b("Could not fetch ad response from ad request service.", (Throwable)ex);
            return null;
        }
    }
    
    @Override
    public final void a() {
        try {
            final dp d = this.d();
            cb a;
            if (d == null) {
                a = new cb(0);
            }
            else if ((a = a(d, this.a)) == null) {
                a = new cb(0);
            }
            this.c();
            this.b.a(a);
        }
        finally {
            this.c();
        }
    }
    
    @Override
    public final void b() {
        this.c();
    }
    
    public abstract void c();
    
    public abstract dp d();
}
