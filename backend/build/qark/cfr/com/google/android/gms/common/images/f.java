/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 */
package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.gw;

public final class f {
    public final Uri a;

    public f(Uri uri) {
        this.a = uri;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = true;
        if (!(object instanceof f)) {
            return false;
        }
        boolean bl3 = bl2;
        if (this == object) return bl3;
        bl3 = bl2;
        if (((f)object).hashCode() == this.hashCode()) return bl3;
        return false;
    }

    public int hashCode() {
        return gw.a(new Object[]{this.a});
    }
}

