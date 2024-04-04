// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.util.Log;
import android.app.PendingIntent;
import com.google.android.gms.common.a;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class fy extends Handler
{
    final /* synthetic */ fx a;
    
    public fy(final fx a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 1 && !this.a.f()) {
            final ga ga = (ga)message.obj;
            ga.a();
            ga.c();
            return;
        }
        synchronized (this.a.k) {
            this.a.c = false;
            // monitorexit(fx.b(this.a))
            if (message.what == 3) {
                this.a.j.a(new a((int)message.obj, null));
                return;
            }
        }
        final Message message2;
        if (message2.what == 2 && !this.a.e()) {
            final ga ga2 = (ga)message2.obj;
            ga2.a();
            ga2.c();
            return;
        }
        if (message2.what == 2 || message2.what == 1) {
            ((ga)message2.obj).b();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
}
