/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 */
package android.support.v4.util;

public class SparseArrayCompat<E> {
    private static final Object DELETED = new Object();
    private boolean mGarbage = false;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int n) {
        n = SparseArrayCompat.idealIntArraySize(n);
        this.mKeys = new int[n];
        this.mValues = new Object[n];
        this.mSize = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int binarySearch(int[] arrn, int n, int n2, int n3) {
        int n4 = n + n2;
        int n5 = n - 1;
        while (n4 - n5 > 1) {
            int n6 = (n4 + n5) / 2;
            if (arrn[n6] < n3) {
                n5 = n6;
                continue;
            }
            n4 = n6;
        }
        if (n4 == n + n2) {
            return ~ (n + n2);
        }
        n = n4;
        if (arrn[n4] == n3) return n;
        return ~ n4;
    }

    private void gc() {
        int n = this.mSize;
        int n2 = 0;
        int[] arrn = this.mKeys;
        Object[] arrobject = this.mValues;
        for (int i = 0; i < n; ++i) {
            Object object = arrobject[i];
            int n3 = n2;
            if (object != DELETED) {
                if (i != n2) {
                    arrn[n2] = arrn[i];
                    arrobject[n2] = object;
                }
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        this.mGarbage = false;
        this.mSize = n2;
    }

    static int idealByteArraySize(int n) {
        int n2 = 4;
        do {
            block4 : {
                int n3;
                block3 : {
                    n3 = n;
                    if (n2 >= 32) break block3;
                    if (n > (1 << n2) - 12) break block4;
                    n3 = (1 << n2) - 12;
                }
                return n3;
            }
            ++n2;
        } while (true);
    }

    static int idealIntArraySize(int n) {
        return SparseArrayCompat.idealByteArraySize(n * 4) / 4;
    }

    public void append(int n, E e) {
        int n2;
        if (this.mSize != 0 && n <= this.mKeys[this.mSize - 1]) {
            this.put(n, e);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.gc();
        }
        if ((n2 = this.mSize) >= this.mKeys.length) {
            int n3 = SparseArrayCompat.idealIntArraySize(n2 + 1);
            int[] arrn = new int[n3];
            Object[] arrobject = new Object[n3];
            System.arraycopy((Object)this.mKeys, (int)0, (Object)arrn, (int)0, (int)this.mKeys.length);
            System.arraycopy((Object)this.mValues, (int)0, (Object)arrobject, (int)0, (int)this.mValues.length);
            this.mKeys = arrn;
            this.mValues = arrobject;
        }
        this.mKeys[n2] = n;
        this.mValues[n2] = e;
        this.mSize = n2 + 1;
    }

    public void clear() {
        int n = this.mSize;
        Object[] arrobject = this.mValues;
        for (int i = 0; i < n; ++i) {
            arrobject[i] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void delete(int n) {
        if ((n = SparseArrayCompat.binarySearch(this.mKeys, 0, this.mSize, n)) >= 0 && this.mValues[n] != DELETED) {
            this.mValues[n] = DELETED;
            this.mGarbage = true;
        }
    }

    public E get(int n) {
        return this.get(n, null);
    }

    public E get(int n, E e) {
        if ((n = SparseArrayCompat.binarySearch(this.mKeys, 0, this.mSize, n)) < 0 || this.mValues[n] == DELETED) {
            return e;
        }
        return (E)this.mValues[n];
    }

    public int indexOfKey(int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return SparseArrayCompat.binarySearch(this.mKeys, 0, this.mSize, n);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            this.gc();
        }
        for (int i = 0; i < this.mSize; ++i) {
            if (this.mValues[i] != e) continue;
            return i;
        }
        return -1;
    }

    public int keyAt(int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mKeys[n];
    }

    public void put(int n, E e) {
        int n2 = SparseArrayCompat.binarySearch(this.mKeys, 0, this.mSize, n);
        if (n2 >= 0) {
            this.mValues[n2] = e;
            return;
        }
        int n3 = ~ n2;
        if (n3 < this.mSize && this.mValues[n3] == DELETED) {
            this.mKeys[n3] = n;
            this.mValues[n3] = e;
            return;
        }
        n2 = n3;
        if (this.mGarbage) {
            n2 = n3;
            if (this.mSize >= this.mKeys.length) {
                this.gc();
                n2 = ~ SparseArrayCompat.binarySearch(this.mKeys, 0, this.mSize, n);
            }
        }
        if (this.mSize >= this.mKeys.length) {
            n3 = SparseArrayCompat.idealIntArraySize(this.mSize + 1);
            int[] arrn = new int[n3];
            Object[] arrobject = new Object[n3];
            System.arraycopy((Object)this.mKeys, (int)0, (Object)arrn, (int)0, (int)this.mKeys.length);
            System.arraycopy((Object)this.mValues, (int)0, (Object)arrobject, (int)0, (int)this.mValues.length);
            this.mKeys = arrn;
            this.mValues = arrobject;
        }
        if (this.mSize - n2 != 0) {
            System.arraycopy((Object)this.mKeys, (int)n2, (Object)this.mKeys, (int)(n2 + 1), (int)(this.mSize - n2));
            System.arraycopy((Object)this.mValues, (int)n2, (Object)this.mValues, (int)(n2 + 1), (int)(this.mSize - n2));
        }
        this.mKeys[n2] = n;
        this.mValues[n2] = e;
        ++this.mSize;
    }

    public void remove(int n) {
        this.delete(n);
    }

    public void removeAt(int n) {
        if (this.mValues[n] != DELETED) {
            this.mValues[n] = DELETED;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int n, int n2) {
        n2 = Math.min((int)this.mSize, (int)(n + n2));
        while (n < n2) {
            this.removeAt(n);
            ++n;
        }
    }

    public void setValueAt(int n, E e) {
        if (this.mGarbage) {
            this.gc();
        }
        this.mValues[n] = e;
    }

    public int size() {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mSize;
    }

    public E valueAt(int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return (E)this.mValues[n];
    }
}

