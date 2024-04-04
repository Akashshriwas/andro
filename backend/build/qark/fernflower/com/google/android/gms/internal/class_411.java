package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $FF: renamed from: com.google.android.gms.internal.jm
public class class_411 {
   // $FF: renamed from: a com.google.android.gms.internal.jk
   private final class_46 field_1098;
   // $FF: renamed from: b java.security.SecureRandom
   private final SecureRandom field_1099;

   public class_411(class_46 var1, SecureRandom var2) {
      this.field_1098 = var1;
      this.field_1099 = var2;
   }

   // $FF: renamed from: a (byte[]) void
   static void method_1418(byte[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = (byte)(var0[var1] ^ 68);
      }

   }

   // $FF: renamed from: a (java.lang.String) byte[]
   public byte[] method_1419(String var1) {
      try {
         byte[] var4 = this.field_1098.method_135(var1, false);
         if (var4.length != 32) {
            throw new class_415(this);
         } else {
            ByteBuffer var5 = ByteBuffer.wrap(var4, 4, 16);
            byte[] var2 = new byte[16];
            var5.get(var2);
            method_1418(var2);
            return var2;
         }
      } catch (IllegalArgumentException var3) {
         throw new class_415(this, var3);
      }
   }

   // $FF: renamed from: a (byte[], java.lang.String) byte[]
   public byte[] method_1420(byte[] var1, String var2) {
      if (var1.length != 16) {
         throw new class_415(this);
      } else {
         try {
            byte[] var3 = this.field_1098.method_135(var2, false);
            if (var3.length <= 16) {
               throw new class_415(this);
            } else {
               ByteBuffer var4 = ByteBuffer.allocate(var3.length);
               var4.put(var3);
               var4.flip();
               byte[] var13 = new byte[16];
               var3 = new byte[var3.length - 16];
               var4.get(var13);
               var4.get(var3);
               SecretKeySpec var12 = new SecretKeySpec(var1, "AES");
               Cipher var14 = Cipher.getInstance("AES/CBC/PKCS5Padding");
               var14.init(2, var12, new IvParameterSpec(var13));
               var1 = var14.doFinal(var3);
               return var1;
            }
         } catch (NoSuchAlgorithmException var5) {
            throw new class_415(this, var5);
         } catch (InvalidKeyException var6) {
            throw new class_415(this, var6);
         } catch (IllegalBlockSizeException var7) {
            throw new class_415(this, var7);
         } catch (NoSuchPaddingException var8) {
            throw new class_415(this, var8);
         } catch (BadPaddingException var9) {
            throw new class_415(this, var9);
         } catch (InvalidAlgorithmParameterException var10) {
            throw new class_415(this, var10);
         } catch (IllegalArgumentException var11) {
            throw new class_415(this, var11);
         }
      }
   }
}
