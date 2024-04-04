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

class dw
implements ad {
    final /* synthetic */ dv a;

    dw(dv dv2) {
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
            String string = (String)object2.get((Object)"type");
            object2 = (String)object2.get((Object)"errors");
            et.e("Invalid " + string + " request error: " + (String)object2);
            dv.a(this.a, 1);
            dv.a(this.a).notify();
            return;
        }
    }
}

