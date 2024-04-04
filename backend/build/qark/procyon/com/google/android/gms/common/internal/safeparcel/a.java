// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public class a
{
    public static Parcel[] A(final Parcel parcel, int i) {
        final int a = a(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final Parcel[] array = new Parcel[int1];
        int int2;
        int dataPosition2;
        Parcel obtain;
        for (i = 0; i < int1; ++i) {
            int2 = parcel.readInt();
            if (int2 != 0) {
                dataPosition2 = parcel.dataPosition();
                obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, int2);
                array[i] = obtain;
                parcel.setDataPosition(int2 + dataPosition2);
            }
            else {
                array[i] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return array;
    }
    
    public static int a(final int n) {
        return 0xFFFF & n;
    }
    
    public static int a(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static int a(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return n >> 16 & 0xFFFF;
        }
        return parcel.readInt();
    }
    
    public static Parcelable a(final Parcel parcel, int a, final Parcelable$Creator parcelable$Creator) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }
    
    private static void a(final Parcel parcel, int a, final int i) {
        a = a(parcel, a);
        if (a != i) {
            throw new b("Expected size " + i + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }
    
    private static void a(final Parcel parcel, final int n, final int n2, final int i) {
        if (n2 != i) {
            throw new b("Expected size " + i + " got " + n2 + " (0x" + Integer.toHexString(n2) + ")", parcel);
        }
    }
    
    public static void a(final Parcel parcel, int a, final List list, final ClassLoader classLoader) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(a + dataPosition);
    }
    
    public static int b(final Parcel parcel) {
        final int a = a(parcel);
        final int a2 = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a(a) != 20293) {
            throw new b("Expected object header. Got 0x" + Integer.toHexString(a), parcel);
        }
        final int i = dataPosition + a2;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new b("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        return i;
    }
    
    public static void b(final Parcel parcel, final int n) {
        parcel.setDataPosition(a(parcel, n) + parcel.dataPosition());
    }
    
    public static Object[] b(final Parcel parcel, int a, final Parcelable$Creator parcelable$Creator) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(a + dataPosition);
        return typedArray;
    }
    
    public static ArrayList c(final Parcel parcel, int a, final Parcelable$Creator parcelable$Creator) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(a + dataPosition);
        return typedArrayList;
    }
    
    public static boolean c(final Parcel parcel, final int n) {
        a(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static Boolean d(final Parcel parcel, final int n) {
        final int a = a(parcel, n);
        if (a == 0) {
            return null;
        }
        a(parcel, n, a, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte e(final Parcel parcel, final int n) {
        a(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    public static short f(final Parcel parcel, final int n) {
        a(parcel, n, 4);
        return (short)parcel.readInt();
    }
    
    public static int g(final Parcel parcel, final int n) {
        a(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static long h(final Parcel parcel, final int n) {
        a(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static BigInteger i(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(byteArray);
    }
    
    public static float j(final Parcel parcel, final int n) {
        a(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static double k(final Parcel parcel, final int n) {
        a(parcel, n, 8);
        return parcel.readDouble();
    }
    
    public static BigDecimal l(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        final int int1 = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(byteArray), int1);
    }
    
    public static String m(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return string;
    }
    
    public static IBinder n(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return strongBinder;
    }
    
    public static Bundle o(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return bundle;
    }
    
    public static byte[] p(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return byteArray;
    }
    
    public static boolean[] q(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final boolean[] booleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(a + dataPosition);
        return booleanArray;
    }
    
    public static int[] r(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return intArray;
    }
    
    public static long[] s(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final long[] longArray = parcel.createLongArray();
        parcel.setDataPosition(a + dataPosition);
        return longArray;
    }
    
    public static BigInteger[] t(final Parcel parcel, int i) {
        final int a = a(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final BigInteger[] array = new BigInteger[int1];
        for (i = 0; i < int1; ++i) {
            array[i] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return array;
    }
    
    public static float[] u(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final float[] floatArray = parcel.createFloatArray();
        parcel.setDataPosition(a + dataPosition);
        return floatArray;
    }
    
    public static double[] v(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final double[] doubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(a + dataPosition);
        return doubleArray;
    }
    
    public static BigDecimal[] w(final Parcel parcel, int i) {
        final int a = a(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final BigDecimal[] array = new BigDecimal[int1];
        for (i = 0; i < int1; ++i) {
            array[i] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return array;
    }
    
    public static String[] x(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return stringArray;
    }
    
    public static ArrayList y(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return stringArrayList;
    }
    
    public static Parcel z(final Parcel parcel, int a) {
        a = a(parcel, a);
        final int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }
}
