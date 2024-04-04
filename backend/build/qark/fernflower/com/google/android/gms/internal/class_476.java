package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

// $FF: renamed from: com.google.android.gms.internal.ed
public final class class_476 {
   // $FF: renamed from: a java.lang.String
   public static final String field_1320;
   // $FF: renamed from: b java.lang.Object
   private static final Object field_1321;
   // $FF: renamed from: c java.math.BigInteger
   private static BigInteger field_1322;

   static {
      UUID var1 = UUID.randomUUID();
      byte[] var3 = BigInteger.valueOf(var1.getLeastSignificantBits()).toByteArray();
      byte[] var4 = BigInteger.valueOf(var1.getMostSignificantBits()).toByteArray();
      String var7 = (new BigInteger(1, var3)).toString();

      for(int var0 = 0; var0 < 2; ++var0) {
         String var8;
         try {
            MessageDigest var2 = MessageDigest.getInstance("MD5");
            var2.update(var3);
            var2.update(var4);
            byte[] var5 = new byte[8];
            System.arraycopy(var2.digest(), 0, var5, 0, 8);
            var8 = (new BigInteger(1, var5)).toString();
         } catch (NoSuchAlgorithmException var6) {
            continue;
         }

         var7 = var8;
      }

      field_1320 = var7;
      field_1321 = new Object();
      field_1322 = BigInteger.ONE;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_1662() {
      // $FF: Couldn't be decompiled
   }
}
