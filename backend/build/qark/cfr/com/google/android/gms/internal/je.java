/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.ji;
import java.io.UnsupportedEncodingException;

public final class je {
    private final byte[] a;
    private final int b;
    private int c;

    private je(byte[] arrby, int n2, int n3) {
        this.a = arrby;
        this.c = n2;
        this.b = n2 + n3;
    }

    public static je a(byte[] arrby) {
        return je.a(arrby, 0, arrby.length);
    }

    public static je a(byte[] arrby, int n2, int n3) {
        return new je(arrby, n2, n3);
    }

    public static int b(int n2) {
        if (n2 >= 0) {
            return je.f(n2);
        }
        return 10;
    }

    public static int b(int n2, int n3) {
        return je.d(n2) + je.b(n3);
    }

    public static int b(int n2, String string) {
        return je.d(n2) + je.b(string);
    }

    public static int b(String arrby) {
        int n2;
        int n3;
        try {
            arrby = arrby.getBytes("UTF-8");
            n3 = je.f(arrby.length);
            n2 = arrby.length;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return n2 + n3;
    }

    public static int c(int n2, long l2) {
        return je.d(n2) + je.c(l2);
    }

    public static int c(long l2) {
        return je.e(je.f(l2));
    }

    public static int d(int n2) {
        return je.f(ji.a(n2, 0));
    }

    public static int e(long l2) {
        if ((-128L & l2) == 0L) {
            return 1;
        }
        if ((-16384L & l2) == 0L) {
            return 2;
        }
        if ((-2097152L & l2) == 0L) {
            return 3;
        }
        if ((-268435456L & l2) == 0L) {
            return 4;
        }
        if ((-34359738368L & l2) == 0L) {
            return 5;
        }
        if ((-4398046511104L & l2) == 0L) {
            return 6;
        }
        if ((-562949953421312L & l2) == 0L) {
            return 7;
        }
        if ((-72057594037927936L & l2) == 0L) {
            return 8;
        }
        if ((Long.MIN_VALUE & l2) == 0L) {
            return 9;
        }
        return 10;
    }

    public static int f(int n2) {
        if ((n2 & -128) == 0) {
            return 1;
        }
        if ((n2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n2) == 0) {
            return 3;
        }
        if ((-268435456 & n2) == 0) {
            return 4;
        }
        return 5;
    }

    public static long f(long l2) {
        return l2 << 1 ^ l2 >> 63;
    }

    public int a() {
        return this.b - this.c;
    }

    public void a(byte by2) {
        if (this.c == this.b) {
            throw new jf(this.c, this.b);
        }
        byte[] arrby = this.a;
        int n2 = this.c;
        this.c = n2 + 1;
        arrby[n2] = by2;
    }

    public void a(int n2) {
        if (n2 >= 0) {
            this.e(n2);
            return;
        }
        this.d(n2);
    }

    public void a(int n2, int n3) {
        this.c(n2, 0);
        this.a(n3);
    }

    public void a(int n2, long l2) {
        this.c(n2, 0);
        this.a(l2);
    }

    public void a(int n2, String string) {
        this.c(n2, 2);
        this.a(string);
    }

    public void a(long l2) {
        this.d(l2);
    }

    public void a(String arrby) {
        arrby = arrby.getBytes("UTF-8");
        this.e(arrby.length);
        this.b(arrby);
    }

    public void b() {
        if (this.a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void b(int n2, long l2) {
        this.c(n2, 0);
        this.b(l2);
    }

    public void b(long l2) {
        this.d(je.f(l2));
    }

    public void b(byte[] arrby) {
        this.b(arrby, 0, arrby.length);
    }

    public void b(byte[] arrby, int n2, int n3) {
        if (this.b - this.c >= n3) {
            System.arraycopy((Object)arrby, (int)n2, (Object)this.a, (int)this.c, (int)n3);
            this.c += n3;
            return;
        }
        throw new jf(this.c, this.b);
    }

    public void c(int n2) {
        this.a((byte)n2);
    }

    public void c(int n2, int n3) {
        this.e(ji.a(n2, n3));
    }

    public void d(long l2) {
        do {
            if ((-128L & l2) == 0L) {
                this.c((int)l2);
                return;
            }
            this.c((int)l2 & 127 | 128);
            l2 >>>= 7;
        } while (true);
    }

    public void e(int n2) {
        do {
            if ((n2 & -128) == 0) {
                this.c(n2);
                return;
            }
            this.c(n2 & 127 | 128);
            n2 >>>= 7;
        } while (true);
    }
}

