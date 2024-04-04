// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public final class dy
{
    private String a;
    private String b;
    private String c;
    private List d;
    private List e;
    private long f;
    private boolean g;
    private final long h;
    private List i;
    private long j;
    private int k;
    
    public dy() {
        this.f = -1L;
        this.g = false;
        this.h = -1L;
        this.j = -1L;
        this.k = -1;
    }
    
    private static long a(Map s, final String str) {
        final List<String> list = ((Map<K, List<String>>)s).get(str);
        if (list != null && !list.isEmpty()) {
            s = list.get(0);
            try {
                return (long)(Float.parseFloat(s) * 1000.0f);
            }
            catch (NumberFormatException ex) {
                et.e("Could not parse float from " + str + " header: " + s);
            }
        }
        return -1L;
    }
    
    private static List b(final Map map, final String s) {
        final List<String> list = map.get(s);
        if (list != null && !list.isEmpty()) {
            final String s2 = list.get(0);
            if (s2 != null) {
                return Arrays.asList(s2.trim().split("\\s+"));
            }
        }
        return null;
    }
    
    private void b(final Map map) {
        final List<String> list = map.get("X-Afma-Ad-Size");
        if (list != null && !list.isEmpty()) {
            this.a = list.get(0);
        }
    }
    
    private void c(final Map map) {
        final List b = b(map, "X-Afma-Click-Tracking-Urls");
        if (b != null) {
            this.d = b;
        }
    }
    
    private void d(final Map map) {
        final List b = b(map, "X-Afma-Tracking-Urls");
        if (b != null) {
            this.e = b;
        }
    }
    
    private void e(final Map map) {
        final long a = a(map, "X-Afma-Interstitial-Timeout");
        if (a != -1L) {
            this.f = a;
        }
    }
    
    private void f(final Map map) {
        final List<String> list = map.get("X-Afma-Mediation");
        if (list != null && !list.isEmpty()) {
            this.g = Boolean.valueOf(list.get(0));
        }
    }
    
    private void g(final Map map) {
        final List b = b(map, "X-Afma-Manual-Tracking-Urls");
        if (b != null) {
            this.i = b;
        }
    }
    
    private void h(final Map map) {
        final long a = a(map, "X-Afma-Refresh-Rate");
        if (a != -1L) {
            this.j = a;
        }
    }
    
    private void i(final Map map) {
        final List<String> list = map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            final String s = list.get(0);
            if ("portrait".equalsIgnoreCase(s)) {
                this.k = em.c();
            }
            else if ("landscape".equalsIgnoreCase(s)) {
                this.k = em.b();
            }
        }
    }
    
    public cb a() {
        return new cb(this.b, this.c, this.d, this.e, this.f, this.g, -1L, this.i, this.j, this.k, this.a);
    }
    
    public void a(final String b, final Map map, final String c) {
        this.b = b;
        this.c = c;
        this.a(map);
    }
    
    public void a(final Map map) {
        this.b(map);
        this.c(map);
        this.d(map);
        this.e(map);
        this.f(map);
        this.g(map);
        this.h(map);
        this.i(map);
    }
}
