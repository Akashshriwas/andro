package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_17;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$b$a extends class_136 implements class_17, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iw
   public static final class_359 field_348 = new class_359();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_349 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_350;
   // $FF: renamed from: d int
   private final int field_351;
   // $FF: renamed from: e int
   private int field_352;
   // $FF: renamed from: f int
   private int field_353;

   static {
      field_349.put("leftImageOffset", ee$a.method_2083("leftImageOffset", 2));
      field_349.put("topImageOffset", ee$a.method_2083("topImageOffset", 3));
   }

   public ha$b$a() {
      this.field_351 = 1;
      this.field_350 = new HashSet();
   }

   ha$b$a(Set var1, int var2, int var3, int var4) {
      this.field_350 = var1;
      this.field_351 = var2;
      this.field_352 = var3;
      this.field_353 = var4;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_568();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_350.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_352;
      case 3:
         return this.field_353;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_349;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_359 var1 = field_348;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_564() {
      return this.field_350;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$b$a)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$b$a var4 = (ha$b$a)var1;
         Iterator var2 = field_349.values().iterator();

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
   int method_565() {
      return this.field_351;
   }

   // $FF: renamed from: g () int
   public int method_566() {
      return this.field_352;
   }

   // $FF: renamed from: h () int
   public int method_567() {
      return this.field_353;
   }

   public int hashCode() {
      Iterator var3 = field_349.values().iterator();
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

   // $FF: renamed from: i () com.google.android.gms.internal.ha$b$a
   public ha$b$a method_568() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_359 var3 = field_348;
      class_359.method_1252(this, var1, var2);
   }
}
