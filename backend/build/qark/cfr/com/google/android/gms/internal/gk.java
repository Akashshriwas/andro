/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gm;
import java.util.HashMap;

public final class gk
implements Handler.Callback {
    private static final Object a = new Object();
    private static gk b;
    private final Context c;
    private final HashMap d;
    private final Handler e;

    private gk(Context context) {
        this.e = new Handler(context.getMainLooper(), (Handler.Callback)this);
        this.d = new HashMap();
        this.c = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static gk a(Context context) {
        Object object = a;
        synchronized (object) {
            if (b == null) {
                b = new gk(context.getApplicationContext());
            }
            return b;
        }
    }

    static /* synthetic */ HashMap a(gk gk2) {
        return gk2.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(String object, ge ge2) {
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            gl gl2 = (gl)this.d.get(object);
            if (gl2 == null) {
                gl2 = new gl(this, (String)object);
                gl2.a(ge2);
                ge2 = new Intent((String)object).setPackage("com.google.android.gms");
                gl2.a(this.c.bindService((Intent)ge2, (ServiceConnection)gl2.a(), 129));
                this.d.put(object, (Object)gl2);
                object = gl2;
                return object.c();
            } else {
                this.e.removeMessages(0, (Object)gl2);
                if (gl2.c(ge2)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + (String)object);
                }
                gl2.a(ge2);
                switch (gl2.d()) {
                    case 1: {
                        ge2.onServiceConnected(gl2.g(), gl2.f());
                        object = gl2;
                        return object.c();
                    }
                    case 2: {
                        object = new Intent((String)object).setPackage("com.google.android.gms");
                        gl2.a(this.c.bindService((Intent)object, (ServiceConnection)gl2.a(), 129));
                        object = gl2;
                        return object.c();
                    }
                    default: {
                        object = gl2;
                    }
                }
            }
            return object.c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(String string, ge ge2) {
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            gl gl2 = (gl)this.d.get((Object)string);
            if (gl2 == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + string);
            }
            if (!gl2.c(ge2)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + string);
            }
            gl2.b(ge2);
            if (gl2.e()) {
                string = this.e.obtainMessage(0, (Object)gl2);
                this.e.sendMessageDelayed((Message)string, 5000L);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: 
        }
        gl gl2 = (gl)message.obj;
        message = this.d;
        synchronized (message) {
            if (gl2.e()) {
                this.c.unbindService((ServiceConnection)gl2.a());
                this.d.remove((Object)gl2.b());
            }
            return true;
        }
    }
}

