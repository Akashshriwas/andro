/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.x;

public final class e {
    public static final e a = new e(320, 50, "320x50_mb");
    public static final e b = new e(468, 60, "468x60_as");
    public static final e c = new e(728, 90, "728x90_as");
    public static final e d = new e(300, 250, "300x250_as");
    public static final e e = new e(160, 600, "160x600_as");
    public static final e f = new e(-1, -2, "smart_banner");
    private final int g;
    private final int h;
    private final String i;

    /*
     * Enabled aggressive block sorting
     */
    public e(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = n2 == -1 ? "FULL" : String.valueOf((int)n2);
        stringBuilder = stringBuilder.append(string).append("x");
        string = n3 == -2 ? "AUTO" : String.valueOf((int)n3);
        this(n2, n3, stringBuilder.append(string).append("_as").toString());
    }

    e(int n2, int n3, String string) {
        if (n2 < 0 && n2 != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + n2);
        }
        if (n3 < 0 && n3 != -2) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + n3);
        }
        this.g = n2;
        this.h = n3;
        this.i = string;
    }

    public int a() {
        return this.h;
    }

    public int a(Context context) {
        if (this.h == -2) {
            return x.b(context.getResources().getDisplayMetrics());
        }
        return es.a(context, this.h);
    }

    public int b() {
        return this.g;
    }

    public int b(Context context) {
        if (this.g == -1) {
            return x.a(context.getResources().getDisplayMetrics());
        }
        return es.a(context, this.g);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (object == this) break block4;
                if (!(object instanceof e)) {
                    return false;
                }
                object = (e)object;
                if (this.g != object.g || this.h != object.h || !this.i.equals((Object)object.i)) break block5;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String toString() {
        return this.i;
    }
}

