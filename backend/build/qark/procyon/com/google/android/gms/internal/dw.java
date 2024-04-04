// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

class dw implements ad
{
    final /* synthetic */ dv a;
    
    dw(final dv a) {
        this.a = a;
    }
    
    @Override
    public void a(final ev ev, final Map map) {
        synchronized (this.a.c) {
            et.e("Invalid " + map.get("type") + " request error: " + map.get("errors"));
            this.a.e = 1;
            this.a.c.notify();
        }
    }
}
