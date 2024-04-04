// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;

public final class ae implements ad
{
    private static boolean a(final Map map) {
        return "1".equals(map.get("custom_close"));
    }
    
    private static int b(final Map map) {
        final String s = map.get("o");
        if (s != null) {
            if ("p".equalsIgnoreCase(s)) {
                return em.c();
            }
            if ("l".equalsIgnoreCase(s)) {
                return em.b();
            }
        }
        return -1;
    }
    
    @Override
    public void a(final ev ev, final Map map) {
        final String s = map.get("a");
        if (s == null) {
            et.e("Action missing from an open GMSG.");
            return;
        }
        final ex e = ev.e();
        if ("expand".equalsIgnoreCase(s)) {
            if (ev.h()) {
                et.e("Cannot expand WebView that is already expanded.");
                return;
            }
            e.a(a(map), b(map));
        }
        else {
            if (!"webapp".equalsIgnoreCase(s)) {
                e.a(new bj(map.get("i"), map.get("u"), map.get("m"), map.get("p"), map.get("c"), map.get("f"), map.get("e")));
                return;
            }
            final String s2 = map.get("u");
            if (s2 != null) {
                e.a(a(map), b(map), s2);
                return;
            }
            e.a(a(map), b(map), map.get("html"), map.get("baseurl"));
        }
    }
}
