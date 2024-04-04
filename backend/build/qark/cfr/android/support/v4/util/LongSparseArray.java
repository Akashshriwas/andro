/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.System
 */
package android.support.v4.util;

public class LongSparseArray<E>
implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage = false;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int n) {
        n = LongSparseArray.idealLongArraySize(n);
        this.mKeys = new long[n];
        this.mValues = new Object[n];
        this.mSize = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int binarySearch(long[] arrl, int n, int n2, long l) {
        int n3 = n + n2;
        int n4 = n - 1;
        while (n3 - n4 > 1) {
            int n5 = (n3 + n4) / 2;
            if (arrl[n5] < l) {
                n4 = n5;
                continue;
            }
            n3 = n5;
        }
        if (n3 == n + n2) {
            return ~ (n + n2);
        }
        n = n3;
        if (arrl[n3] == l) return n;
        return ~ n3;
    }

    private void gc() {
        int n = this.mSize;
        int n2 = 0;
        long[] arrl = this.mKeys;
        Object[] arrobject = this.mValues;
        for (int i = 0; i < n; ++i) {
            Object object = arrobject[i];
            int n3 = n2;
            if (object != DELETED) {
                if (i != n2) {
                    arrl[n2] = arrl[i];
                    arrobject[n2] = object;
                    arrobject[i] = null;
                }
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        this.mGarbage = false;
        this.mSize = n2;
    }

    public static int idealByteArraySize(int n) {
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

    public static int idealLongArraySize(int n) {
        return LongSparseArray.idealByteArraySize(n * 8) / 8;
    }

    public void append(long l, E e) {
        int n;
        if (this.mSize != 0 && l <= this.mKeys[this.mSize - 1]) {
            this.put(l, e);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.gc();
        }
        if ((n = this.mSize) >= this.mKeys.length) {
            int n2 = LongSparseArray.idealLongArraySize(n + 1);
            long[] arrl = new long[n2];
            Object[] arrobject = new Object[n2];
            System.arraycopy((Object)this.mKeys, (int)0, (Object)arrl, (int)0, (int)this.mKeys.length);
            System.arraycopy((Object)this.mValues, (int)0, (Object)arrobject, (int)0, (int)this.mValues.length);
            this.mKeys = arrl;
            this.mValues = arrobject;
        }
        this.mKeys[n] = l;
        this.mValues[n] = e;
        this.mSize = n + 1;
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

    public LongSparseArray<E> clone() {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = null;
        try {
            longSparseArray2 = longSparseArray = (LongSparseArray)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return longSparseArray2;
        }
        longSparseArray.mKeys = (long[])this.mKeys.clone();
        longSparseArray2 = longSparseArray;
        longSparseArray.mValues = (Object[])this.mValues.clone();
        return longSparseArray;
    }

    public void delete(long l) {
        int n = LongSparseArray.binarySearch(this.mKeys, 0, this.mSize, l);
        if (n >= 0 && this.mValues[n] != DELETED) {
            this.mValues[n] = DELETED;
            this.mGarbage = true;
        }
    }

    public E get(long l) {
        return this.get(l, null);
    }

    public E get(long l, E e) {
        int n = LongSparseArray.binarySearch(this.mKeys, 0, this.mSize, l);
        if (n < 0 || this.mValues[n] == DELETED) {
            return e;
        }
        return (E)this.mValues[n];
    }

    public int indexOfKey(long l) {
        if (this.mGarbage) {
            this.gc();
        }
        return LongSparseArray.binarySearch(this.mKeys, 0, this.mSize, l);
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

    public long keyAt(int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mKeys[n];
    }

    public void put(long l, E e) {
        int n = LongSparseArray.binarySearch(this.mKeys, 0, this.mSize, l);
        if (n >= 0) {
            this.mValues[n] = e;
            return;
        }
        int n2 = ~ n;
        if (n2 < this.mSize && this.mValues[n2] == DELETED) {
            this.mKeys[n2] = l;
            this.mValues[n2] = e;
            return;
        }
        n = n2;
        if (this.mGarbage) {
            n = n2;
            if (this.mSize >= this.mKeys.length) {
                this.gc();
                n = ~ LongSparseArray.binarySearch(this.mKeys, 0, this.mSize, l);
            }
        }
        if (this.mSize >= this.mKeys.length) {
            n2 = LongSparseArray.idealLongArraySize(this.mSize + 1);
            long[] arrl = new long[n2];
            Object[] arrobject = new Object[n2];
            System.arraycopy((Object)this.mKeys, (int)0, (Object)arrl, (int)0, (int)this.mKeys.length);
            System.arraycopy((Object)this.mValues, (int)0, (Object)arrobject, (int)0, (int)this.mValues.length);
            this.mKeys = arrl;
            this.mValues = arrobject;
        }
        if (this.mSize - n != 0) {
            System.arraycopy((Object)this.mKeys, (int)n, (Object)this.mKeys, (int)(n + 1), (int)(this.mSize - n));
            System.arraycopy((Object)this.mValues, (int)n, (Object)this.mValues, (int)(n + 1), (int)(this.mSize - n));
        }
        this.mKeys[n] = l;
        this.mValues[n] = e;
        ++this.mSize;
    }

    public void remove(long l) {
        this.delete(l);
    }

    public void removeAt(int n) {
        if (this.mValues[n] != DELETED) {
            this.mValues[n] = DELETED;
            this.mGarbage = true;
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

