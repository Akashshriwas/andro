// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

final class y implements ad
{
    @Override
    public void a(final ev ev, final Map map) {
        final cc c = ev.c();
        if (c == null) {
            et.e("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
        c.a();
    }
}
