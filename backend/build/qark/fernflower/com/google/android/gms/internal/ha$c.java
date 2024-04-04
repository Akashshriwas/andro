package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_15;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$c extends class_136 implements class_15, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iy
   public static final class_363 field_286 = new class_363();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_287 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_288;
   // $FF: renamed from: d int
   private final int field_289;
   // $FF: renamed from: e java.lang.String
   private String field_290;

   static {
      field_287.put("url", ee$a.method_2090("url", 2));
   }

   public ha$c() {
      this.field_289 = 1;
      this.field_288 = new HashSet();
   }

   ha$c(Set var1, int var2, String var3) {
      this.field_288 = var1;
      this.field_289 = var2;
      this.field_290 = var3;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_513();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_288.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_290;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_287;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_363 var1 = field_286;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_510() {
      return this.field_288;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$c)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$c var4 = (ha$c)var1;
         Iterator var2 = field_287.values().iterator();

         while(var2.hasNext()) {
            ee$a var3 = (ee$a)var2.next();
            if (this.method_398(var3)) {
               if (!var4.method_398(var3)) {
                  return false;
               }

               if (!this.method_399(var3).equals(var4.method_399(var3))) {
                  return false;
               }
            } else if (var4.method_398(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: f () int
   int method_511() {
      return this.field_289;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_512() {
      return this.field_290;
   }

   // $FF: renamed from: h () com.google.android.gms.internal.ha$c
   public ha$c method_513() {
      return this;
   }

   public int hashCode() {
      Iterator var3 = field_287.values().iterator();
      int var1 = 0;

      while(var3.hasNext()) {
         ee$a var4 = (ee$a)var3.next();
         if (this.method_398(var4)) {
            int var2 = var4.method_2100();
            var1 = this.method_399(var4).hashCode() + var1 + var2;
         }
      }

      return var1;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_363 var3 = field_286;
      class_363.method_1264(this, var1, var2);
   }
}
