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
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import java.util.Map;

class dx
implements ad {
    final /* synthetic */ dv a;

    dx(dv dv2) {
        this.a = dv2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(ev object, Map object2) {
        object = dv.a(this.a);
        synchronized (object) {
            object2 = (String)object2.get((Object)"url");
            if (object2 == null) {
                et.e("URL missing in loadAdUrl GMSG.");
                return;
            }
            dv.a(this.a, (String)object2);
            dv.a(this.a).notify();
            return;
        }
    }
}

