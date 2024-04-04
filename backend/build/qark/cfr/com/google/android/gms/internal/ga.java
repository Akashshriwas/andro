/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.internal.fx;
import java.util.ArrayList;

public abstract class ga {
    final /* synthetic */ fx a;
    private Object b;
    private boolean c;

    public ga(fx fx2, Object object) {
        this.a = fx2;
        this.b = object;
        this.c = false;
    }

    protected abstract void a();

    protected abstract void a(Object var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b() {
        // MONITORENTER : this
        Object object = this.b;
        if (this.c) {
            Log.w((String)"GmsClient", (String)("Callback proxy " + this + " being reused. This is not safe."));
        }
        // MONITOREXIT : this
        if (object != null) {
            try {
                this.a(object);
            }
            catch (RuntimeException runtimeException) {
                this.a();
                throw runtimeException;
            }
        } else {
            this.a();
        }
        // MONITORENTER : this
        this.c = true;
        // MONITOREXIT : this
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        this.d();
        ArrayList arrayList = fx.c(this.a);
        synchronized (arrayList) {
            fx.c(this.a).remove((Object)this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        synchronized (this) {
            this.b = null;
            return;
        }
    }
}

