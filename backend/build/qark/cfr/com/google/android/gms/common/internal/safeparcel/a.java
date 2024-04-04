/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Boolean
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class a {
    /*
     * Enabled aggressive block sorting
     */
    public static Parcel[] A(Parcel parcel, int n2) {
        int n3 = a.a(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n5 = parcel.readInt();
        Parcel[] arrparcel = new Parcel[n5];
        n2 = 0;
        do {
            if (n2 >= n5) {
                parcel.setDataPosition(n4 + n3);
                return arrparcel;
            }
            int n6 = parcel.readInt();
            if (n6 != 0) {
                int n7 = parcel.dataPosition();
                Parcel parcel2 = Parcel.obtain();
                parcel2.appendFrom(parcel, n7, n6);
                arrparcel[n2] = parcel2;
                parcel.setDataPosition(n6 + n7);
            } else {
                arrparcel[n2] = null;
            }
            ++n2;
        } while (true);
    }

    public static int a(int n2) {
        return 65535 & n2;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int a(Parcel parcel, int n2) {
        if ((n2 & -65536) != -65536) {
            return n2 >> 16 & 65535;
        }
        return parcel.readInt();
    }

    public static Parcelable a(Parcel parcel, int n2, Parcelable.Creator creator) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        creator = (Parcelable)creator.createFromParcel(parcel);
        parcel.setDataPosition(n2 + n3);
        return creator;
    }

    private static void a(Parcel parcel, int n2, int n3) {
        if ((n2 = a.a(parcel, n2)) != n3) {
            throw new b("Expected size " + n3 + " got " + n2 + " (0x" + Integer.toHexString((int)n2) + ")", parcel);
        }
    }

    private static void a(Parcel parcel, int n2, int n3, int n4) {
        if (n3 != n4) {
            throw new b("Expected size " + n4 + " got " + n3 + " (0x" + Integer.toHexString((int)n3) + ")", parcel);
        }
    }

    public static void a(Parcel parcel, int n2, List list, ClassLoader classLoader) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(n2 + n3);
    }

    public static int b(Parcel parcel) {
        int n2 = a.a(parcel);
        int n3 = a.a(parcel, n2);
        int n4 = parcel.dataPosition();
        if (a.a(n2) != 20293) {
            throw new b("Expected object header. Got 0x" + Integer.toHexString((int)n2), parcel);
        }
        n2 = n4 + n3;
        if (n2 < n4 || n2 > parcel.dataSize()) {
            throw new b("Size read is invalid start=" + n4 + " end=" + n2, parcel);
        }
        return n2;
    }

    public static void b(Parcel parcel, int n2) {
        parcel.setDataPosition(a.a(parcel, n2) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int n2, Parcelable.Creator arrobject) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        arrobject = parcel.createTypedArray((Parcelable.Creator)arrobject);
        parcel.setDataPosition(n2 + n3);
        return arrobject;
    }

    public static ArrayList c(Parcel parcel, int n2, Parcelable.Creator creator) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        creator = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(n2 + n3);
        return creator;
    }

    public static boolean c(Parcel parcel, int n2) {
        a.a(parcel, n2, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean d(Parcel parcel, int n2) {
        boolean bl2;
        int n3 = a.a(parcel, n2);
        if (n3 == 0) {
            return null;
        }
        a.a(parcel, n2, n3, 4);
        if (parcel.readInt() != 0) {
            bl2 = true;
            do {
                return bl2;
                break;
            } while (true);
        }
        bl2 = false;
        return bl2;
    }

    public static byte e(Parcel parcel, int n2) {
        a.a(parcel, n2, 4);
        return (byte)parcel.readInt();
    }

    public static short f(Parcel parcel, int n2) {
        a.a(parcel, n2, 4);
        return (short)parcel.readInt();
    }

    public static int g(Parcel parcel, int n2) {
        a.a(parcel, n2, 4);
        return parcel.readInt();
    }

    public static long h(Parcel parcel, int n2) {
        a.a(parcel, n2, 8);
        return parcel.readLong();
    }

    public static BigInteger i(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        byte[] arrby = parcel.createByteArray();
        parcel.setDataPosition(n2 + n3);
        return new BigInteger(arrby);
    }

    public static float j(Parcel parcel, int n2) {
        a.a(parcel, n2, 4);
        return parcel.readFloat();
    }

    public static double k(Parcel parcel, int n2) {
        a.a(parcel, n2, 8);
        return parcel.readDouble();
    }

    public static BigDecimal l(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        byte[] arrby = parcel.createByteArray();
        int n4 = parcel.readInt();
        parcel.setDataPosition(n2 + n3);
        return new BigDecimal(new BigInteger(arrby), n4);
    }

    public static String m(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(n2 + n3);
        return string;
    }

    public static IBinder n(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n2 + n3);
        return iBinder;
    }

    public static Bundle o(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n2 + n3);
        return bundle;
    }

    public static byte[] p(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        byte[] arrby = parcel.createByteArray();
        parcel.setDataPosition(n2 + n3);
        return arrby;
    }

    public static boolean[] q(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        boolean[] arrbl = parcel.createBooleanArray();
        parcel.setDataPosition(n2 + n3);
        return arrbl;
    }

    public static int[] r(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        int[] arrn = parcel.createIntArray();
        parcel.setDataPosition(n2 + n3);
        return arrn;
    }

    public static long[] s(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        long[] arrl = parcel.createLongArray();
        parcel.setDataPosition(n2 + n3);
        return arrl;
    }

    public static BigInteger[] t(Parcel parcel, int n2) {
        int n3 = a.a(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n5 = parcel.readInt();
        BigInteger[] arrbigInteger = new BigInteger[n5];
        for (n2 = 0; n2 < n5; ++n2) {
            arrbigInteger[n2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(n4 + n3);
        return arrbigInteger;
    }

    public static float[] u(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        float[] arrf = parcel.createFloatArray();
        parcel.setDataPosition(n2 + n3);
        return arrf;
    }

    public static double[] v(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        double[] arrd = parcel.createDoubleArray();
        parcel.setDataPosition(n2 + n3);
        return arrd;
    }

    public static BigDecimal[] w(Parcel parcel, int n2) {
        int n3 = a.a(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n5 = parcel.readInt();
        BigDecimal[] arrbigDecimal = new BigDecimal[n5];
        for (n2 = 0; n2 < n5; ++n2) {
            byte[] arrby = parcel.createByteArray();
            int n6 = parcel.readInt();
            arrbigDecimal[n2] = new BigDecimal(new BigInteger(arrby), n6);
        }
        parcel.setDataPosition(n4 + n3);
        return arrbigDecimal;
    }

    public static String[] x(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        String[] arrstring = parcel.createStringArray();
        parcel.setDataPosition(n2 + n3);
        return arrstring;
    }

    public static ArrayList y(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n2 + n3);
        return arrayList;
    }

    public static Parcel z(Parcel parcel, int n2) {
        n2 = a.a(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        Parcel parcel2 = Parcel.obtain();
        parcel2.appendFrom(parcel, n3, n2);
        parcel.setDataPosition(n2 + n3);
        return parcel2;
    }
}

