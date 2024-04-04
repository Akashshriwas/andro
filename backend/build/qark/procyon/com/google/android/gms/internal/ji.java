// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

public final class ji
{
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    public static final int[] e;
    public static final long[] f;
    public static final float[] g;
    public static final double[] h;
    public static final boolean[] i;
    public static final String[] j;
    public static final byte[][] k;
    public static final byte[] l;
    
    static {
        a = a(1, 3);
        b = a(1, 4);
        c = a(2, 0);
        d = a(3, 2);
        e = new int[0];
        f = new long[0];
        g = new float[0];
        h = new double[0];
        i = new boolean[0];
        j = new String[0];
        k = new byte[0][];
        l = new byte[0];
    }
    
    static int a(final int n, final int n2) {
        return n << 3 | n2;
    }
}
