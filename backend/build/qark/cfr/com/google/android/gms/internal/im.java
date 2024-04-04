/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.BlockingQueue
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.in;
import java.util.concurrent.BlockingQueue;

public class im {
    private static int a = 10000;
    private static int b = 1000;
    private final BlockingQueue c;

    public void a(String string, String string2, String string3) {
        this.c.offer((Object)new in(this, string, string2, string3));
    }
}

