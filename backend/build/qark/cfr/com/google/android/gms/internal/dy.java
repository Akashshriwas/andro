/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class dy {
    private String a;
    private String b;
    private String c;
    private List d;
    private List e;
    private long f = -1L;
    private boolean g = false;
    private final long h = -1L;
    private List i;
    private long j = -1L;
    private int k = -1;

    private static long a(Map object, String string) {
        if ((object = (List)object.get((Object)string)) != null && !object.isEmpty()) {
            float f2;
            object = (String)object.get(0);
            try {
                f2 = Float.parseFloat((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                et.e("Could not parse float from " + string + " header: " + (String)object);
            }
            return (long)(f2 * 1000.0f);
        }
        return -1L;
    }

    private static List b(Map object, String string) {
        if ((object = (List)object.get((Object)string)) != null && !object.isEmpty() && (object = (String)object.get(0)) != null) {
            return Arrays.asList((Object[])object.trim().split("\\s+"));
        }
        return null;
    }

    private void b(Map map) {
        if ((map = (List)map.get((Object)"X-Afma-Ad-Size")) != null && !map.isEmpty()) {
            this.a = (String)map.get(0);
        }
    }

    private void c(Map map) {
        if ((map = dy.b(map, "X-Afma-Click-Tracking-Urls")) != null) {
            this.d = map;
        }
    }

    private void d(Map map) {
        if ((map = dy.b(map, "X-Afma-Tracking-Urls")) != null) {
            this.e = map;
        }
    }

    private void e(Map map) {
        long l2 = dy.a(map, "X-Afma-Interstitial-Timeout");
        if (l2 != -1L) {
            this.f = l2;
        }
    }

    private void f(Map map) {
        if ((map = (List)map.get((Object)"X-Afma-Mediation")) != null && !map.isEmpty()) {
            this.g = Boolean.valueOf((String)((String)map.get(0)));
        }
    }

    private void g(Map map) {
        if ((map = dy.b(map, "X-Afma-Manual-Tracking-Urls")) != null) {
            this.i = map;
        }
    }

    private void h(Map map) {
        long l2 = dy.a(map, "X-Afma-Refresh-Rate");
        if (l2 != -1L) {
            this.j = l2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i(Map object) {
        if ((object = (List)object.get((Object)"X-Afma-Orientation")) == null || object.isEmpty()) return;
        {
            if ("portrait".equalsIgnoreCase((String)(object = (String)object.get(0)))) {
                this.k = em.c();
                return;
            } else {
                if (!"landscape".equalsIgnoreCase((String)object)) return;
                {
                    this.k = em.b();
                    return;
                }
            }
        }
    }

    public cb a() {
        return new cb(this.b, this.c, this.d, this.e, this.f, this.g, -1L, this.i, this.j, this.k, this.a);
    }

    public void a(String string, Map map, String string2) {
        this.b = string;
        this.c = string2;
        this.a(map);
    }

    public void a(Map map) {
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

