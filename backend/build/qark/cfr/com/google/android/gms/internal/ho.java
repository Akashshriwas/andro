/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal;

public final class ho {
    public static void a(StringBuilder stringBuilder, double[] arrd) {
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Double.toString((double)arrd[i2]));
        }
    }

    public static void a(StringBuilder stringBuilder, float[] arrf) {
        int n2 = arrf.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Float.toString((float)arrf[i2]));
        }
    }

    public static void a(StringBuilder stringBuilder, int[] arrn) {
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Integer.toString((int)arrn[i2]));
        }
    }

    public static void a(StringBuilder stringBuilder, long[] arrl) {
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString((long)arrl[i2]));
        }
    }

    public static void a(StringBuilder stringBuilder, Object[] arrobject) {
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(arrobject[i2].toString());
        }
    }

    public static void a(StringBuilder stringBuilder, String[] arrstring) {
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("\"").append(arrstring[i2]).append("\"");
        }
    }

    public static void a(StringBuilder stringBuilder, boolean[] arrbl) {
        int n2 = arrbl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Boolean.toString((boolean)arrbl[i2]));
        }
    }
}

