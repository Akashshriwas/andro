/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    public static int a(Parcel parcel) {
        return c.b(parcel, 20293);
    }

    public static void a(Parcel parcel, int n2) {
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, byte by2) {
        c.b(parcel, n2, 4);
        parcel.writeInt((int)by2);
    }

    public static void a(Parcel parcel, int n2, double d2) {
        c.b(parcel, n2, 8);
        parcel.writeDouble(d2);
    }

    public static void a(Parcel parcel, int n2, float f2) {
        c.b(parcel, n2, 4);
        parcel.writeFloat(f2);
    }

    public static void a(Parcel parcel, int n2, int n3) {
        c.b(parcel, n2, 4);
        parcel.writeInt(n3);
    }

    public static void a(Parcel parcel, int n2, long l2) {
        c.b(parcel, n2, 8);
        parcel.writeLong(l2);
    }

    public static void a(Parcel parcel, int n2, Bundle bundle, boolean bl2) {
        if (bundle == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeBundle(bundle);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, IBinder iBinder, boolean bl2) {
        if (iBinder == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeStrongBinder(iBinder);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, Parcel parcel2, boolean bl2) {
        if (parcel2 == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, Parcelable parcelable, int n3, boolean bl2) {
        if (parcelable == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcelable.writeToParcel(parcel, n3);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, Boolean bl2, boolean bl3) {
        int n3 = 0;
        if (bl2 == null) {
            if (bl3) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        c.b(parcel, n2, 4);
        n2 = n3;
        if (bl2.booleanValue()) {
            n2 = 1;
        }
        parcel.writeInt(n2);
    }

    public static void a(Parcel parcel, int n2, String string, boolean bl2) {
        if (string == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeString(string);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeStringList(list);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, short s2) {
        c.b(parcel, n2, 4);
        parcel.writeInt((int)s2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Parcel parcel, int n2, boolean bl2) {
        c.b(parcel, n2, 4);
        n2 = bl2 ? 1 : 0;
        parcel.writeInt(n2);
    }

    public static void a(Parcel parcel, int n2, byte[] arrby, boolean bl2) {
        if (arrby == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeByteArray(arrby);
        c.c(parcel, n2);
    }

    public static void a(Parcel parcel, int n2, float[] arrf, boolean bl2) {
        if (arrf == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeFloatArray(arrf);
        c.c(parcel, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Parcel parcel, int n2, Parcelable[] arrparcelable, int n3, boolean bl2) {
        if (arrparcelable == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        int n4 = c.b(parcel, n2);
        int n5 = arrparcelable.length;
        parcel.writeInt(n5);
        n2 = 0;
        do {
            if (n2 >= n5) {
                c.c(parcel, n4);
                return;
            }
            Parcelable parcelable = arrparcelable[n2];
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                c.a(parcel, parcelable, n3);
            }
            ++n2;
        } while (true);
    }

    public static void a(Parcel parcel, int n2, String[] arrstring, boolean bl2) {
        if (arrstring == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeStringArray(arrstring);
        c.c(parcel, n2);
    }

    private static void a(Parcel parcel, Parcelable parcelable, int n2) {
        int n3 = parcel.dataPosition();
        parcel.writeInt(1);
        int n4 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n2);
        n2 = parcel.dataPosition();
        parcel.setDataPosition(n3);
        parcel.writeInt(n2 - n4);
        parcel.setDataPosition(n2);
    }

    private static int b(Parcel parcel, int n2) {
        parcel.writeInt(-65536 | n2);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void b(Parcel parcel, int n2, int n3) {
        if (n3 >= 65535) {
            parcel.writeInt(-65536 | n2);
            parcel.writeInt(n3);
            return;
        }
        parcel.writeInt(n3 << 16 | n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(Parcel parcel, int n2, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        int n3 = c.b(parcel, n2);
        int n4 = list.size();
        parcel.writeInt(n4);
        n2 = 0;
        do {
            if (n2 >= n4) {
                c.c(parcel, n3);
                return;
            }
            Parcelable parcelable = (Parcelable)list.get(n2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                c.a(parcel, parcelable, 0);
            }
            ++n2;
        } while (true);
    }

    private static void c(Parcel parcel, int n2) {
        int n3 = parcel.dataPosition();
        parcel.setDataPosition(n2 - 4);
        parcel.writeInt(n3 - n2);
        parcel.setDataPosition(n3);
    }

    public static void c(Parcel parcel, int n2, List list, boolean bl2) {
        if (list == null) {
            if (bl2) {
                c.b(parcel, n2, 0);
            }
            return;
        }
        n2 = c.b(parcel, n2);
        parcel.writeList(list);
        c.c(parcel, n2);
    }
}

