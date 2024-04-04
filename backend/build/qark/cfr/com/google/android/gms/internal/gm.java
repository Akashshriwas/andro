/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Iterator
 */
package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.gl;
import java.util.HashMap;
import java.util.Iterator;

public class gm
implements ServiceConnection {
    final /* synthetic */ gl a;

    public gm(gl gl2) {
        this.a = gl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap = gk.a(this.a.a);
        synchronized (hashMap) {
            gl.a(this.a, iBinder);
            gl.a(this.a, componentName);
            Iterator iterator = gl.a(this.a).iterator();
            do {
                if (!iterator.hasNext()) {
                    gl.a(this.a, 1);
                    return;
                }
                ((ge)iterator.next()).onServiceConnected(componentName, iBinder);
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap = gk.a(this.a.a);
        synchronized (hashMap) {
            gl.a(this.a, null);
            gl.a(this.a, componentName);
            Iterator iterator = gl.a(this.a).iterator();
            do {
                if (!iterator.hasNext()) {
                    gl.a(this.a, 2);
                    return;
                }
                ((ge)iterator.next()).onServiceDisconnected(componentName);
            } while (true);
        }
    }
}

