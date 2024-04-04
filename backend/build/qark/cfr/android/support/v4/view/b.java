/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.view;

import android.support.v4.view.d;

class b
implements d {
    b() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = 1;
        boolean bl2 = (n3 & n4) != 0;
        n3 = (n3 & (n5 |= n6)) != 0 ? n7 : 0;
        if (bl2) {
            if (n3 == 0) return n2 & ~ n5;
            throw new IllegalArgumentException("bad arguments");
        }
        n5 = n2;
        if (n3 == 0) return n5;
        return n2 & ~ n4;
    }

    public int a(int n2) {
        if ((n2 & 192) != 0) {
            n2 |= 1;
        }
        int n3 = n2;
        if ((n2 & 48) != 0) {
            n3 = n2 | 2;
        }
        return n3 & 247;
    }

    @Override
    public boolean a(int n2, int n3) {
        if (b.a(b.a(this.a(n2) & 247, n3, 1, 64, 128), n3, 2, 16, 32) == n3) {
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n2) {
        if ((this.a(n2) & 247) == 0) {
            return true;
        }
        return false;
    }
}

