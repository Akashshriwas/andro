/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import java.util.Iterator;
import java.util.List;

public final class aj {
    private final bz a;
    private final bl b;
    private final Context c;
    private final Object d = new Object();
    private final am e;
    private boolean f = false;
    private ap g;

    public aj(Context context, bz bz2, bl bl2, am am2) {
        this.c = context;
        this.a = bz2;
        this.b = bl2;
        this.e = am2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ar a(long l2, long l3) {
        et.a("Starting mediation.");
        Iterator iterator = this.e.a.iterator();
        block3 : while (iterator.hasNext()) {
            al al2 = (al)iterator.next();
            et.c("Trying mediation network: " + al2.b);
            Iterator iterator2 = al2.c.iterator();
            do {
                if (!iterator2.hasNext()) continue block3;
                String string = (String)iterator2.next();
                Object object = this.d;
                synchronized (object) {
                    if (this.f) {
                        return new ar(-1);
                    }
                    this.g = new ap(this.c, string, this.b, this.e, al2, this.a.d, this.a.e);
                }
                object = this.g.a(l2, l3);
                if (object.a == 0) {
                    et.a("Adapter succeeded.");
                    return object;
                }
                if (object.c == null) continue;
                es.a.post((Runnable)new ak(this, (ar)object));
            } while (true);
            break;
        }
        return new ar(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object = this.d;
        synchronized (object) {
            this.f = true;
            if (this.g != null) {
                this.g.a();
            }
            return;
        }
    }
}

