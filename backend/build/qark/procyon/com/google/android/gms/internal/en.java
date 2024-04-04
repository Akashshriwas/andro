// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.content.Context;

final class en implements Runnable
{
    final /* synthetic */ Context a;
    
    en(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        synchronized (em.a) {
            em.c = d(this.a);
            em.a.notifyAll();
        }
    }
}
