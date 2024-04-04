/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import java.util.Map;

public final class ae
implements ad {
    private static boolean a(Map map) {
        return "1".equals(map.get((Object)"custom_close"));
    }

    private static int b(Map object) {
        if ((object = (String)object.get((Object)"o")) != null) {
            if ("p".equalsIgnoreCase((String)object)) {
                return em.c();
            }
            if ("l".equalsIgnoreCase((String)object)) {
                return em.b();
            }
        }
        return -1;
    }

    @Override
    public void a(ev object, Map map) {
        String string = (String)map.get((Object)"a");
        if (string == null) {
            et.e("Action missing from an open GMSG.");
            return;
        }
        ex ex2 = object.e();
        if ("expand".equalsIgnoreCase(string)) {
            if (object.h()) {
                et.e("Cannot expand WebView that is already expanded.");
                return;
            }
            ex2.a(ae.a(map), ae.b(map));
            return;
        }
        if ("webapp".equalsIgnoreCase(string)) {
            object = (String)map.get((Object)"u");
            if (object != null) {
                ex2.a(ae.a(map), ae.b(map), (String)object);
                return;
            }
            ex2.a(ae.a(map), ae.b(map), (String)map.get((Object)"html"), (String)map.get((Object)"baseurl"));
            return;
        }
        ex2.a(new bj((String)map.get((Object)"i"), (String)map.get((Object)"u"), (String)map.get((Object)"m"), (String)map.get((Object)"p"), (String)map.get((Object)"c"), (String)map.get((Object)"f"), (String)map.get((Object)"e")));
    }
}

