// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.d;
import com.google.android.gms.common.c;
import android.content.Context;

public class dk extends fx
{
    private final int e;
    
    public dk(final Context context, final c c, final d d, final int e) {
        super(context, c, d, new String[0]);
        this.e = e;
    }
    
    protected dp a(final IBinder binder) {
        return dq.a(binder);
    }
    
    @Override
    protected String a() {
        return "com.google.android.gms.ads.service.START";
    }
    
    @Override
    protected void a(final gr gr, final gc gc) {
        gr.g(gc, this.e, this.h().getPackageName(), new Bundle());
    }
    
    @Override
    protected String b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }
    
    public dp c() {
        return (dp)super.k();
    }
}
