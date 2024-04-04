/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.a;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;
import java.util.HashMap;

public class b {
    private final String[] a;
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    private b(String[] arrstring, String string) {
        this.a = (String[])hc.a(arrstring);
        this.b = new ArrayList();
        this.c = string;
        this.d = new HashMap();
        this.e = false;
        this.f = null;
    }

    /* synthetic */ b(String[] arrstring, String string, a a2) {
        this(arrstring, string);
    }
}

