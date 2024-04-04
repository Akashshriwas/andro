// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.g;
import android.content.Context;

public final class dd
{
    public static ef a(final Context context, final bz bz, final de de) {
        if (bz.l.f) {
            return b(context, bz, de);
        }
        return c(context, bz, de);
    }
    
    private static ef b(final Context context, final bz bz, final de de) {
        et.a("Fetching ad response from local ad request service.");
        final dg dg = new dg(context, bz, de);
        dg.e();
        return dg;
    }
    
    private static ef c(final Context context, final bz bz, final de de) {
        et.a("Fetching ad response from remote ad request service.");
        if (g.a(context) != 0) {
            et.e("Failed to connect to remote ad request service.");
            return null;
        }
        return new di(context, bz, de);
    }
}
