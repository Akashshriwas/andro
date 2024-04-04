// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.c;

public class c
{
    private static final Object a;
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;
    
    static {
        a = new Object();
    }
    
    public c() {
        this(10);
    }
    
    public c(int h) {
        this.b = false;
        h = h(h);
        this.c = new int[h];
        this.d = new Object[h];
        this.e = 0;
    }
    
    private static int a(final int[] array, int n, final int n2, final int n3) {
        int n4 = n - 1;
        int n5 = n + n2;
        while (n5 - n4 > 1) {
            final int n6 = (n5 + n4) / 2;
            if (array[n6] < n3) {
                n4 = n6;
            }
            else {
                n5 = n6;
            }
        }
        if (n5 == n + n2) {
            n = ~(n + n2);
        }
        else {
            n = n5;
            if (array[n5] != n3) {
                return ~n5;
            }
        }
        return n;
    }
    
    private void c() {
        final int e = this.e;
        final int[] c = this.c;
        final Object[] d = this.d;
        int i = 0;
        int e2 = 0;
        while (i < e) {
            final Object o = d[i];
            int n = e2;
            if (o != android.support.v4.c.c.a) {
                if (i != e2) {
                    c[e2] = c[i];
                    d[e2] = o;
                }
                n = e2 + 1;
            }
            ++i;
            e2 = n;
        }
        this.b = false;
        this.e = e2;
    }
    
    static int g(final int n) {
        int n2 = 4;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= 32) {
                break;
            }
            if (n <= (1 << n2) - 12) {
                n3 = (1 << n2) - 12;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    static int h(final int n) {
        return g(n * 4) / 4;
    }
    
    public int a() {
        if (this.b) {
            this.c();
        }
        return this.e;
    }
    
    public Object a(final int n) {
        return this.a(n, null);
    }
    
    public Object a(int a, final Object o) {
        a = a(this.c, 0, this.e, a);
        if (a < 0 || this.d[a] == android.support.v4.c.c.a) {
            return o;
        }
        return this.d[a];
    }
    
    public void b() {
        final int e = this.e;
        final Object[] d = this.d;
        for (int i = 0; i < e; ++i) {
            d[i] = null;
        }
        this.e = 0;
        this.b = false;
    }
    
    public void b(int a) {
        a = a(this.c, 0, this.e, a);
        if (a >= 0 && this.d[a] != android.support.v4.c.c.a) {
            this.d[a] = android.support.v4.c.c.a;
            this.b = true;
        }
    }
    
    public void b(final int n, final Object o) {
        final int a = a(this.c, 0, this.e, n);
        if (a >= 0) {
            this.d[a] = o;
            return;
        }
        final int n2 = ~a;
        if (n2 < this.e && this.d[n2] == android.support.v4.c.c.a) {
            this.c[n2] = n;
            this.d[n2] = o;
            return;
        }
        int n3 = n2;
        if (this.b) {
            n3 = n2;
            if (this.e >= this.c.length) {
                this.c();
                n3 = ~a(this.c, 0, this.e, n);
            }
        }
        if (this.e >= this.c.length) {
            final int h = h(this.e + 1);
            final int[] c = new int[h];
            final Object[] d = new Object[h];
            System.arraycopy(this.c, 0, c, 0, this.c.length);
            System.arraycopy(this.d, 0, d, 0, this.d.length);
            this.c = c;
            this.d = d;
        }
        if (this.e - n3 != 0) {
            System.arraycopy(this.c, n3, this.c, n3 + 1, this.e - n3);
            System.arraycopy(this.d, n3, this.d, n3 + 1, this.e - n3);
        }
        this.c[n3] = n;
        this.d[n3] = o;
        ++this.e;
    }
    
    public void c(final int n) {
        this.b(n);
    }
    
    public void d(final int n) {
        if (this.d[n] != android.support.v4.c.c.a) {
            this.d[n] = android.support.v4.c.c.a;
            this.b = true;
        }
    }
    
    public int e(final int n) {
        if (this.b) {
            this.c();
        }
        return this.c[n];
    }
    
    public Object f(final int n) {
        if (this.b) {
            this.c();
        }
        return this.d[n];
    }
}
