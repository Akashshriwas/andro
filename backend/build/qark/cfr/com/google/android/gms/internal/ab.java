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
import java.util.Map;

final class ab
implements ad {
    ab() {
    }

    @Override
    public void a(ev ev2, Map map) {
        et.c("Received log message: " + (String)map.get((Object)"string"));
    }
}

