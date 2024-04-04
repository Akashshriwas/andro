// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Build$VERSION;

public final class ht
{
    public static boolean a() {
        return a(11);
    }
    
    private static boolean a(final int n) {
        return Build$VERSION.SDK_INT >= n;
    }
    
    public static boolean b() {
        return a(17);
    }
}
