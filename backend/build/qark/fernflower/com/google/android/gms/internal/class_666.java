package com.google.android.gms.internal;

import android.util.Base64;

// $FF: renamed from: com.google.android.gms.internal.a
class class_666 implements class_46 {
   // $FF: renamed from: a (byte[], boolean) java.lang.String
   public String method_134(byte[] var1, boolean var2) {
      byte var3;
      if (var2) {
         var3 = 11;
      } else {
         var3 = 2;
      }

      return Base64.encodeToString(var1, var3);
   }

   // $FF: renamed from: a (java.lang.String, boolean) byte[]
   public byte[] method_135(String var1, boolean var2) {
      byte var3;
      if (var2) {
         var3 = 11;
      } else {
         var3 = 2;
      }

      return Base64.decode(var1, var3);
   }
}
