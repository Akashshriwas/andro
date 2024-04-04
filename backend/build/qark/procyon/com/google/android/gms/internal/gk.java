// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Message;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.Handler;
import java.util.HashMap;
import android.content.Context;
import android.os.Handler$Callback;

public final class gk implements Handler$Callback
{
    private static final Object a;
    private static gk b;
    private final Context c;
    private final HashMap d;
    private final Handler e;
    
    static {
        a = new Object();
    }
    
    private gk(final Context context) {
        this.e = new Handler(context.getMainLooper(), (Handler$Callback)this);
        this.d = new HashMap();
        this.c = context.getApplicationContext();
    }
    
    public static gk a(final Context context) {
        synchronized (gk.a) {
            if (gk.b == null) {
                gk.b = new gk(context.getApplicationContext());
            }
            return gk.b;
        }
    }
    
    public boolean a(final String str, ge setPackage) {
        while (true) {
            while (true) {
                gl value;
                synchronized (this.d) {
                    value = this.d.get(str);
                    if (value == null) {
                        value = new gl(this, str);
                        value.a(setPackage);
                        setPackage = (ge)new Intent(str).setPackage("com.google.android.gms");
                        value.a(this.c.bindService((Intent)setPackage, (ServiceConnection)value.a(), 129));
                        this.d.put(str, value);
                        final gl gl = value;
                        return gl.c();
                    }
                    this.e.removeMessages(0, (Object)value);
                    if (value.c(setPackage)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                    }
                }
                value.a(setPackage);
                switch (value.d()) {
                    case 1: {
                        setPackage.onServiceConnected(value.g(), value.f());
                        final gl gl = value;
                        continue;
                    }
                    case 2: {
                        final String s;
                        value.a(this.c.bindService(new Intent(s).setPackage("com.google.android.gms"), (ServiceConnection)value.a(), 129));
                        final gl gl = value;
                        continue;
                    }
                    default: {
                        final gl gl = value;
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public void b(final String s, final ge ge) {
        final gl gl;
        synchronized (this.d) {
            gl = this.d.get(s);
            if (gl == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + s);
            }
        }
        if (!gl.c(ge)) {
            final String str;
            throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
        }
        gl.b(ge);
        if (gl.e()) {
            this.e.sendMessageDelayed(this.e.obtainMessage(0, (Object)gl), 5000L);
        }
    }
    // monitorexit(hashMap)
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                final gl gl = (gl)message.obj;
                synchronized (this.d) {
                    if (gl.e()) {
                        this.c.unbindService((ServiceConnection)gl.a());
                        this.d.remove(gl.b());
                    }
                    return true;
                }
                break;
            }
        }
    }
}
