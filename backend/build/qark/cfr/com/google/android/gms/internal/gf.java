/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.fx;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gk;

public final class gf
extends ga {
    public final int b;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ fx e;

    public gf(fx fx2, int n2, IBinder iBinder, Bundle bundle) {
        this.e = fx2;
        super(fx2, true);
        this.b = n2;
        this.d = iBinder;
        this.c = bundle;
    }

    @Override
    protected void a() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    protected void a(Boolean var1_1) {
        if (var1_1 == null) {
            return;
        }
        switch (this.b) {
            default: {
                if (this.c == null) break;
                var1_1 = (PendingIntent)this.c.getParcelable("pendingIntent");
lbl7: // 2 sources:
                do {
                    if (fx.e(this.e) != null) {
                        gk.a(fx.f(this.e)).b(this.e.a(), fx.e(this.e));
                        fx.a(this.e, null);
                    }
                    fx.a(this.e, null);
                    fx.a(this.e).a(new a(this.b, (PendingIntent)var1_1));
                    return;
                    break;
                } while (true);
            }
            case 0: {
                try {
                    var1_1 = this.d.getInterfaceDescriptor();
                    if (this.e.b().equals(var1_1)) {
                        fx.a(this.e, this.e.b(this.d));
                        if (fx.d(this.e) != null) {
                            fx.a(this.e).a();
                            return;
                        }
                    }
                }
                catch (RemoteException var1_2) {
                    // empty catch block
                }
                gk.a(fx.f(this.e)).b(this.e.a(), fx.e(this.e));
                fx.a(this.e, null);
                fx.a(this.e, null);
                fx.a(this.e).a(new a(8, null));
                return;
            }
            case 10: {
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }
        var1_1 = null;
        ** while (true)
    }
}

