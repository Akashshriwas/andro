// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.h;

import android.content.Context;

class d implements Runnable
{
    final /* synthetic */ c a;
    private final /* synthetic */ Context b;
    
    d(final c a, final Context b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        c(this.b);
    }
}
