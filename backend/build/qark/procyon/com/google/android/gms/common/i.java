// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

public class i implements ServiceConnection
{
    boolean a;
    private final BlockingQueue b;
    
    public i() {
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }
    
    public IBinder a() {
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        return this.b.take();
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        try {
            this.b.put(binder);
        }
        catch (InterruptedException ex) {}
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
    }
}
