// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.hc;
import java.util.HashMap;
import java.util.ArrayList;

public class b
{
    private final String[] a;
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;
    
    private b(final String[] array, final String c) {
        this.a = (String[])hc.a(array);
        this.b = new ArrayList();
        this.c = c;
        this.d = new HashMap();
        this.e = false;
        this.f = null;
    }
}
