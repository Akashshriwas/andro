// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.a;
import android.os.Bundle;
import android.content.Context;
import com.google.android.gms.common.d;
import com.google.android.gms.common.c;

public final class di extends df implements c, d
{
    private final de a;
    private final dk b;
    private final Object c;
    
    public di(final Context context, final bz bz, final de a) {
        super(bz, a);
        this.c = new Object();
        this.a = a;
        (this.b = new dk(context, this, this, bz.l.e)).d();
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.e();
    }
    
    @Override
    public void a(final a a) {
        this.a.a(new cb(0));
    }
    
    @Override
    public void a_() {
        et.a("Disconnected from remote ad request service.");
    }
    
    @Override
    public void c() {
        synchronized (this.c) {
            if (this.b.e() || this.b.f()) {
                this.b.g();
            }
        }
    }
    
    @Override
    public dp d() {
        synchronized (this.c) {
            try {
                return this.b.c();
            }
            catch (IllegalStateException ex) {
                return null;
            }
        }
    }
}
