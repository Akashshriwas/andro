/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.UUID
 */
package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class ed {
    public static final String a;
    private static final Object b;
    private static BigInteger c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = UUID.randomUUID();
        byte[] arrby = BigInteger.valueOf((long)object.getLeastSignificantBits()).toByteArray();
        byte[] arrby2 = BigInteger.valueOf((long)object.getMostSignificantBits()).toByteArray();
        object = new BigInteger(1, arrby).toString();
        int n2 = 0;
        do {
            if (n2 >= 2) {
                a = object;
                b = new Object();
                c = BigInteger.ONE;
                return;
            }
            try {
                Object object2 = MessageDigest.getInstance((String)"MD5");
                object2.update(arrby);
                object2.update(arrby2);
                byte[] arrby3 = new byte[8];
                System.arraycopy((Object)object2.digest(), (int)0, (Object)arrby3, (int)0, (int)8);
                object = object2 = new BigInteger(1, arrby3).toString();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n2;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a() {
        Object object = b;
        synchronized (object) {
            String string = c.toString();
            c.add(BigInteger.ONE);
            return string;
        }
    }
}

