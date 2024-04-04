// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

class dx implements ad
{
    final /* synthetic */ dv a;
    
    dx(final dv a) {
        this.a = a;
    }
    
    @Override
    public void a(final ev ev, final Map map) {
        synchronized (this.a.c) {
            final String s = map.get("url");
            if (s == null) {
                et.e("URL missing in loadAdUrl GMSG.");
                return;
            }
            this.a.f = s;
            this.a.c.notify();
        }
    }
}
