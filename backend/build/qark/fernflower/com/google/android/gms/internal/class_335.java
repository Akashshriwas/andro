package com.google.android.gms.internal;

import android.util.Base64;

// $FF: renamed from: com.google.android.gms.internal.hp
public final class class_335 {
   // $FF: renamed from: a (byte[]) java.lang.String
   public static String method_1162(byte[] var0) {
      return var0 == null ? null : Base64.encodeToString(var0, 0);
   }

   // $FF: renamed from: b (byte[]) java.lang.String
   public static String method_1163(byte[] var0) {
      return var0 == null ? null : Base64.encodeToString(var0, 10);
   }
}
