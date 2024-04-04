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
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.s;
import java.util.Map;

public final class r
implements ad {
    private final s a;

    public r(s s2) {
        this.a = s2;
    }

    @Override
    public void a(ev object, Map map) {
        object = (String)map.get((Object)"name");
        if (object == null) {
            et.e("App event with no name parameter.");
            return;
        }
        this.a.a((String)object, (String)map.get((Object)"info"));
    }
}

