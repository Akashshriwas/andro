package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_343;

// $FF: renamed from: com.google.android.gms.common.data.e
public abstract class class_118 {
   // $FF: renamed from: a com.google.android.gms.common.data.DataHolder
   protected final DataHolder field_119;
   // $FF: renamed from: b int
   protected final int field_120;
   // $FF: renamed from: c int
   private final int field_121;

   public class_118(DataHolder var1, int var2) {
      this.field_119 = (DataHolder)class_343.method_1189(var1);
      boolean var3;
      if (var2 >= 0 && var2 < var1.method_1346()) {
         var3 = true;
      } else {
         var3 = false;
      }

      class_343.method_1192(var3);
      this.field_120 = var2;
      this.field_121 = var1.method_1333(this.field_120);
   }

   // $FF: renamed from: a (java.lang.String) long
   protected long method_364(String var1) {
      return this.field_119.method_1334(var1, this.field_120, this.field_121);
   }

   // $FF: renamed from: b (java.lang.String) int
   protected int method_365(String var1) {
      return this.field_119.method_1337(var1, this.field_120, this.field_121);
   }

   // $FF: renamed from: c (java.lang.String) boolean
   protected boolean method_366(String var1) {
      return this.field_119.method_1340(var1, this.field_120, this.field_121);
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   protected String method_367(String var1) {
      return this.field_119.method_1338(var1, this.field_120, this.field_121);
   }

   // $FF: renamed from: e (java.lang.String) byte[]
   protected byte[] method_368(String var1) {
      return this.field_119.method_1343(var1, this.field_120, this.field_121);
   }

   public boolean equals(Object var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 instanceof class_118) {
         class_118 var4 = (class_118)var1;
         var2 = var3;
         if (class_310.method_1035(var4.field_120, this.field_120)) {
            var2 = var3;
            if (class_310.method_1035(var4.field_121, this.field_121)) {
               var2 = var3;
               if (var4.field_119 == this.field_119) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: f (java.lang.String) android.net.Uri
   protected Uri method_369(String var1) {
      return this.field_119.method_1344(var1, this.field_120, this.field_121);
   }

   // $FF: renamed from: g (java.lang.String) boolean
   protected boolean method_370(String var1) {
      return this.field_119.method_1347(var1, this.field_120, this.field_121);
   }

   public int hashCode() {
      return class_310.method_1033(this.field_120, this.field_121, this.field_119);
   }
}
