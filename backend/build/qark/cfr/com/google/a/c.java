/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.a;

import com.google.android.gms.ads.e;

@Deprecated
public final class c {
    public static final c a = new c(-1, -2, "mb");
    public static final c b = new c(320, 50, "mb");
    public static final c c = new c(300, 250, "as");
    public static final c d = new c(468, 60, "as");
    public static final c e = new c(728, 90, "as");
    public static final c f = new c(160, 600, "as");
    private final e g;

    private c(int n2, int n3, String string) {
        this(new e(n2, n3));
    }

    public c(e e2) {
        this.g = e2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.g.equals(object.g);
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public String toString() {
        return this.g.toString();
    }
}

