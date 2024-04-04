package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_19;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$a extends class_136 implements class_19, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iu
   public static final class_361 field_328 = new class_361();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_329 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_330;
   // $FF: renamed from: d int
   private final int field_331;
   // $FF: renamed from: e int
   private int field_332;
   // $FF: renamed from: f int
   private int field_333;

   static {
      field_329.put("max", ee$a.method_2083("max", 2));
      field_329.put("min", ee$a.method_2083("min", 3));
   }

   public ha$a() {
      this.field_331 = 1;
      this.field_330 = new HashSet();
   }

   ha$a(Set var1, int var2, int var3, int var4) {
      this.field_330 = var1;
      this.field_331 = var2;
      this.field_332 = var3;
      this.field_333 = var4;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_551();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_330.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_332;
      case 3:
         return this.field_333;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_329;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_361 var1 = field_328;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_547() {
      return this.field_330;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$a)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$a var4 = (ha$a)var1;
         Iterator var2 = field_329.values().iterator();

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
   int method_548() {
      return this.field_331;
   }

   // $FF: renamed from: g () int
   public int method_549() {
      return this.field_332;
   }

   // $FF: renamed from: h () int
   public int method_550() {
      return this.field_333;
   }

   public int hashCode() {
      Iterator var3 = field_329.values().iterator();
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

   // $FF: renamed from: i () com.google.android.gms.internal.ha$a
   public ha$a method_551() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_361 var3 = field_328;
      class_361.method_1258(this, var1, var2);
   }
}
