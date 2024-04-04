// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

class b implements d
{
    private static int a(final int n, int n2, final int n3, int n4, final int n5) {
        final int n6 = 1;
        int n7;
        if ((n2 & n3) != 0x0) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        n4 |= n5;
        if ((n2 & n4) != 0x0) {
            n2 = n6;
        }
        else {
            n2 = 0;
        }
        if (n7 != 0) {
            if (n2 != 0) {
                throw new IllegalArgumentException("bad arguments");
            }
            n4 = (n & ~n4);
        }
        else {
            n4 = n;
            if (n2 != 0) {
                return n & ~n3;
            }
        }
        return n4;
    }
    
    public int a(int n) {
        if ((n & 0xC0) != 0x0) {
            n |= 0x1;
        }
        int n2 = n;
        if ((n & 0x30) != 0x0) {
            n2 = (n | 0x2);
        }
        return n2 & 0xF7;
    }
    
    @Override
    public boolean a(final int n, final int n2) {
        return a(a(this.a(n) & 0xF7, n2, 1, 64, 128), n2, 2, 16, 32) == n2;
    }
    
    @Override
    public boolean b(final int n) {
        return (this.a(n) & 0xF7) == 0x0;
    }
}
