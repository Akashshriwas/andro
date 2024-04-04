// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

final class aa implements ad
{
    @Override
    public void a(final ev ev, final Map map) {
        final String s = map.get("u");
        if (s == null) {
            et.e("URL missing from httpTrack GMSG.");
            return;
        }
        new er(ev.getContext(), ev.g().c, s).e();
    }
}
