// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.a;
import android.os.IInterface;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Bundle;

public final class gf extends ga
{
    public final int b;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ fx e;
    
    public gf(final fx e, final int b, final IBinder d, final Bundle c) {
        this.e = e;
        super(e, true);
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    protected void a() {
    }
    
    protected void a(final Boolean b) {
        if (b == null) {
            return;
        }
        switch (this.b) {
            default: {
                PendingIntent pendingIntent;
                if (this.c != null) {
                    pendingIntent = (PendingIntent)this.c.getParcelable("pendingIntent");
                }
                else {
                    pendingIntent = null;
                }
                if (this.e.h != null) {
                    gk.a(this.e.e).b(this.e.a(), this.e.h);
                    this.e.h = null;
                }
                this.e.f = null;
                this.e.j.a(new a(this.b, pendingIntent));
            }
            case 0: {
                try {
                    if (this.e.b().equals(this.d.getInterfaceDescriptor())) {
                        this.e.f = this.e.b(this.d);
                        if (this.e.f != null) {
                            this.e.j.a();
                            return;
                        }
                    }
                }
                catch (RemoteException ex) {}
                gk.a(this.e.e).b(this.e.a(), this.e.h);
                this.e.h = null;
                this.e.f = null;
                this.e.j.a(new a(8, null));
            }
            case 10: {
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }
    }
}
