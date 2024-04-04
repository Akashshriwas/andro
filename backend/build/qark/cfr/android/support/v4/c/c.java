/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package android.support.v4.c;

public class c {
    private static final Object a = new Object();
    private boolean b = false;
    private int[] c;
    private Object[] d;
    private int e;

    public c() {
        this(10);
    }

    public c(int n2) {
        n2 = c.h(n2);
        this.c = new int[n2];
        this.d = new Object[n2];
        this.e = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(int[] arrn, int n2, int n3, int n4) {
        int n5 = n2 - 1;
        int n6 = n2 + n3;
        while (n6 - n5 > 1) {
            int n7 = (n6 + n5) / 2;
            if (arrn[n7] < n4) {
                n5 = n7;
                continue;
            }
            n6 = n7;
        }
        if (n6 == n2 + n3) {
            return ~ (n2 + n3);
        }
        n2 = n6;
        if (arrn[n6] == n4) return n2;
        return ~ n6;
    }

    private void c() {
        int n2 = this.e;
        int[] arrn = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            int n4 = n3;
            if (object != a) {
                if (i2 != n3) {
                    arrn[n3] = arrn[i2];
                    arrobject[n3] = object;
                }
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        this.b = false;
        this.e = n3;
    }

    static int g(int n2) {
        int n3 = 4;
        do {
            block4 : {
                int n4;
                block3 : {
                    n4 = n2;
                    if (n3 >= 32) break block3;
                    if (n2 > (1 << n3) - 12) break block4;
                    n4 = (1 << n3) - 12;
                }
                return n4;
            }
            ++n3;
        } while (true);
    }

    static int h(int n2) {
        return c.g(n2 * 4) / 4;
    }

    public int a() {
        if (this.b) {
            this.c();
        }
        return this.e;
    }

    public Object a(int n2) {
        return this.a(n2, null);
    }

    public Object a(int n2, Object object) {
        if ((n2 = c.a(this.c, 0, this.e, n2)) < 0 || this.d[n2] == a) {
            return object;
        }
        return this.d[n2];
    }

    public void b() {
        int n2 = this.e;
        Object[] arrobject = this.d;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrobject[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public void b(int n2) {
        if ((n2 = c.a(this.c, 0, this.e, n2)) >= 0 && this.d[n2] != a) {
            this.d[n2] = a;
            this.b = true;
        }
    }

    public void b(int n2, Object object) {
        int n3 = c.a(this.c, 0, this.e, n2);
        if (n3 >= 0) {
            this.d[n3] = object;
            return;
        }
        int n4 = ~ n3;
        if (n4 < this.e && this.d[n4] == a) {
            this.c[n4] = n2;
            this.d[n4] = object;
            return;
        }
        n3 = n4;
        if (this.b) {
            n3 = n4;
            if (this.e >= this.c.length) {
                this.c();
                n3 = ~ c.a(this.c, 0, this.e, n2);
            }
        }
        if (this.e >= this.c.length) {
            n4 = c.h(this.e + 1);
            int[] arrn = new int[n4];
            Object[] arrobject = new Object[n4];
            System.arraycopy((Object)this.c, (int)0, (Object)arrn, (int)0, (int)this.c.length);
            System.arraycopy((Object)this.d, (int)0, (Object)arrobject, (int)0, (int)this.d.length);
            this.c = arrn;
            this.d = arrobject;
        }
        if (this.e - n3 != 0) {
            System.arraycopy((Object)this.c, (int)n3, (Object)this.c, (int)(n3 + 1), (int)(this.e - n3));
            System.arraycopy((Object)this.d, (int)n3, (Object)this.d, (int)(n3 + 1), (int)(this.e - n3));
        }
        this.c[n3] = n2;
        this.d[n3] = object;
        ++this.e;
    }

    public void c(int n2) {
        this.b(n2);
    }

    public void d(int n2) {
        if (this.d[n2] != a) {
            this.d[n2] = a;
            this.b = true;
        }
    }

    public int e(int n2) {
        if (this.b) {
            this.c();
        }
        return this.c[n2];
    }

    public Object f(int n2) {
        if (this.b) {
            this.c();
        }
        return this.d[n2];
    }
}

