/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;

public abstract class e {
    protected final DataHolder a;
    protected final int b;
    private final int c;

    /*
     * Enabled aggressive block sorting
     */
    public e(DataHolder dataHolder, int n2) {
        this.a = (DataHolder)hc.a(dataHolder);
        boolean bl2 = n2 >= 0 && n2 < dataHolder.g();
        hc.a(bl2);
        this.b = n2;
        this.c = dataHolder.a(this.b);
    }

    protected long a(String string) {
        return this.a.a(string, this.b, this.c);
    }

    protected int b(String string) {
        return this.a.b(string, this.b, this.c);
    }

    protected boolean c(String string) {
        return this.a.d(string, this.b, this.c);
    }

    protected String d(String string) {
        return this.a.c(string, this.b, this.c);
    }

    protected byte[] e(String string) {
        return this.a.e(string, this.b, this.c);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (object instanceof e) {
            object = (e)object;
            bl3 = bl2;
            if (gw.a((Object)object.b, (Object)this.b)) {
                bl3 = bl2;
                if (gw.a((Object)object.c, (Object)this.c)) {
                    bl3 = bl2;
                    if (object.a == this.a) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    protected Uri f(String string) {
        return this.a.f(string, this.b, this.c);
    }

    protected boolean g(String string) {
        return this.a.g(string, this.b, this.c);
    }

    public int hashCode() {
        return gw.a(this.b, this.c, this.a);
    }
}

