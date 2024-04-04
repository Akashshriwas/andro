/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.bz;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.et;

public final class dd {
    public static ef a(Context context, bz bz2, de de2) {
        if (bz2.l.f) {
            return dd.b(context, bz2, de2);
        }
        return dd.c(context, bz2, de2);
    }

    private static ef b(Context object, bz bz2, de de2) {
        et.a("Fetching ad response from local ad request service.");
        object = new dg((Context)object, bz2, de2);
        object.e();
        return object;
    }

    private static ef c(Context context, bz bz2, de de2) {
        et.a("Fetching ad response from remote ad request service.");
        if (g.a(context) != 0) {
            et.e("Failed to connect to remote ad request service.");
            return null;
        }
        return new di(context, bz2, de2);
    }
}

