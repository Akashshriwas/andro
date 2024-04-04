// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

final class z implements ad
{
    @Override
    public void a(final ev ev, final Map map) {
        final cc c = ev.c();
        if (c == null) {
            et.e("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        }
        c.b("1".equals(map.get("custom_close")));
    }
}
