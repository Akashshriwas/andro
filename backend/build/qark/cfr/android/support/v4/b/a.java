/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package android.support.v4.b;

import android.os.Build;
import android.os.Parcelable;
import android.support.v4.b.b;
import android.support.v4.b.c;
import android.support.v4.b.e;

public class a {
    public static Parcelable.Creator a(c c2) {
        if (Build.VERSION.SDK_INT >= 13) {
            e.a(c2);
        }
        return new b(c2);
    }
}

