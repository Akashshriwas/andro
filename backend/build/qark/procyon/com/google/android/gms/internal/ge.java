// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

final class ge implements ServiceConnection
{
    final /* synthetic */ fx a;
    
    ge(final fx a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.a.c(binder);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.a.f = null;
        this.a.j.b();
    }
}
