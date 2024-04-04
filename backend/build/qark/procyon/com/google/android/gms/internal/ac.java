// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

final class ac implements ad
{
    @Override
    public void a(final ev ev, final Map map) {
        final String s = map.get("tx");
        final String s2 = map.get("ty");
        final String s3 = map.get("td");
        try {
            final int int1 = Integer.parseInt(s);
            final int int2 = Integer.parseInt(s2);
            final int int3 = Integer.parseInt(s3);
            final is f = ev.f();
            if (f != null) {
                f.a().a(int1, int2, int3);
            }
        }
        catch (NumberFormatException ex) {
            et.e("Could not parse touch parameters from gmsg.");
        }
    }
}
