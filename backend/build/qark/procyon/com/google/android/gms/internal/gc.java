// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class gc extends gp
{
    private fx a;
    
    public gc(final fx a) {
        this.a = a;
    }
    
    public void a(final int n, final IBinder binder, final Bundle bundle) {
        hc.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
        this.a.a(n, binder, bundle);
        this.a = null;
    }
}
