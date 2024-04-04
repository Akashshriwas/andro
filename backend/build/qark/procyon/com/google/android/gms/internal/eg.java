// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

class eg implements Runnable
{
    final /* synthetic */ ef a;
    
    eg(final ef a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.b = Thread.currentThread();
        this.a.a();
    }
}
