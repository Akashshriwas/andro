/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import java.util.Map;

final class aa
implements ad {
    aa() {
    }

    @Override
    public void a(ev ev2, Map object) {
        if ((object = (String)object.get((Object)"u")) == null) {
            et.e("URL missing from httpTrack GMSG.");
            return;
        }
        new er(ev2.getContext(), ev2.g().c, (String)object).e();
    }
}

