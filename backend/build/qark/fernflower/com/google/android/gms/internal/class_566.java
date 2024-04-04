package com.google.android.gms.internal;

import com.google.a.class_311;
import com.google.a.class_312;
import com.google.a.a.class_127;
import com.google.android.gms.ads.class_630;
import java.util.Date;
import java.util.HashSet;

// $FF: renamed from: com.google.android.gms.internal.bx
public final class class_566 {
   // $FF: renamed from: a (com.google.android.gms.internal.v) com.google.a.a.a
   public static class_127 method_1855(class_597 var0) {
      HashSet var1;
      if (var0.field_1984 != null) {
         var1 = new HashSet(var0.field_1984);
      } else {
         var1 = null;
      }

      return new class_127(new Date(var0.field_1981), method_1856(var0.field_1983), var1, var0.field_1985);
   }

   // $FF: renamed from: a (int) com.google.a.b
   public static class_312 method_1856(int var0) {
      switch(var0) {
      case 1:
         return class_312.field_870;
      case 2:
         return class_312.field_871;
      default:
         return class_312.field_869;
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.x) com.google.a.c
   public static class_311 method_1857(class_607 var0) {
      return new class_311(class_630.method_2049(var0.field_2025, var0.field_2022, var0.field_2021));
   }
}
