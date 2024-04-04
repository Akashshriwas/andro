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

final class y
implements ad {
    y() {
    }

    @Override
    public void a(ev object, Map map) {
        if ((object = object.c()) == null) {
            et.e("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
        object.a();
    }
}

