// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.c;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class gi extends Handler
{
    final /* synthetic */ gh a;
    
    public gi(final gh a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 1) {
            synchronized (this.a.c) {
                if (this.a.b.l() && this.a.b.e() && this.a.c.contains(message.obj)) {
                    ((c)message.obj).a(this.a.b.j());
                }
                return;
            }
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    }
}
