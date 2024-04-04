/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal;

public class jd {
    private final byte[] a = new byte[256];
    private int b;
    private int c;

    public jd(byte[] arrby) {
        int n2;
        for (n2 = 0; n2 < 256; ++n2) {
            this.a[n2] = (byte)n2;
        }
        int n3 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            n3 = n3 + this.a[n2] + arrby[n2 % arrby.length] & 255;
            byte by2 = this.a[n2];
            this.a[n2] = this.a[n3];
            this.a[n3] = by2;
        }
        this.b = 0;
        this.c = 0;
    }

    public void a(byte[] arrby) {
        int n2 = this.b;
        int n3 = this.c;
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            n2 = n2 + 1 & 255;
            n3 = n3 + this.a[n2] & 255;
            byte by2 = this.a[n2];
            this.a[n2] = this.a[n3];
            this.a[n3] = by2;
            arrby[i2] = (byte)(arrby[i2] ^ this.a[this.a[n2] + this.a[n3] & 255]);
        }
        this.b = n2;
        this.c = n3;
    }
}

