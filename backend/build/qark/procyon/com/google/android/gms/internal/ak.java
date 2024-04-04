// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.RemoteException;

class ak implements Runnable
{
    final /* synthetic */ ar a;
    final /* synthetic */ aj b;
    
    ak(final aj b, final ar a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            this.a.c.c();
        }
        catch (RemoteException ex) {
            et.b("Could not destroy mediation adapter.", (Throwable)ex);
        }
    }
}
