/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import java.util.Map;

final class z
implements ad {
    z() {
    }

    @Override
    public void a(ev object, Map map) {
        if ((object = object.c()) == null) {
            et.e("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        }
        object.b("1".equals(map.get((Object)"custom_close")));
    }
}

