// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

public class im
{
    private static int a;
    private static int b;
    private final BlockingQueue c;
    
    static {
        im.a = 10000;
        im.b = 1000;
    }
    
    public void a(final String s, final String s2, final String s3) {
        this.c.offer(new in(this, s, s2, s3));
    }
}
