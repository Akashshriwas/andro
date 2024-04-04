// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

public final class r implements ad
{
    private final s a;
    
    public r(final s a) {
        this.a = a;
    }
    
    @Override
    public void a(final ev ev, final Map map) {
        final String s = map.get("name");
        if (s == null) {
            et.e("App event with no name parameter.");
            return;
        }
        this.a.a(s, map.get("info"));
    }
}
