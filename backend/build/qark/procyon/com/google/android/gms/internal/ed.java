// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.UUID;
import java.math.BigInteger;

public final class ed
{
    public static final String a;
    private static final Object b;
    private static BigInteger c;
    
    static {
        final UUID randomUUID = UUID.randomUUID();
        final byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        final byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String a2 = new BigInteger(1, byteArray).toString();
        int n = 0;
    Label_0099_Outer:
        while (true) {
            Label_0106: {
                if (n >= 2) {
                    break Label_0106;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        instance.update(byteArray);
                        instance.update(byteArray2);
                        final byte[] magnitude = new byte[8];
                        System.arraycopy(instance.digest(), 0, magnitude, 0, 8);
                        a2 = new BigInteger(1, magnitude).toString();
                        ++n;
                        continue Label_0099_Outer;
                        a = a2;
                        b = new Object();
                        ed.c = BigInteger.ONE;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static String a() {
        synchronized (ed.b) {
            final String string = ed.c.toString();
            ed.c.add(BigInteger.ONE);
            return string;
        }
    }
}
