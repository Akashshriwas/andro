/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.jj;
import java.util.Map;

final class w
implements ad {
    w() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(ev ev2, Map object) {
        String string = (String)object.get((Object)"u");
        if (string == null) {
            et.e("URL missing from click GMSG.");
            return;
        }
        object = Uri.parse((String)string);
        try {
            is is2 = ev2.f();
            if (is2 != null && is2.a((Uri)object)) {
                is2 = is2.a((Uri)object, ev2.getContext());
                object = is2;
            }
        }
        catch (jj jj2) {
            et.e("Unable to append parameter to URL: " + string);
        }
        object = object.toString();
        new er(ev2.getContext(), ev2.g().c, (String)object).e();
    }
}

