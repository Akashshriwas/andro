package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_16;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$b$b extends class_136 implements class_16, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ix
   public static final class_358 field_341 = new class_358();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_342 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_343;
   // $FF: renamed from: d int
   private final int field_344;
   // $FF: renamed from: e int
   private int field_345;
   // $FF: renamed from: f java.lang.String
   private String field_346;
   // $FF: renamed from: g int
   private int field_347;

   static {
      field_342.put("height", ee$a.method_2083("height", 2));
      field_342.put("url", ee$a.method_2090("url", 3));
      field_342.put("width", ee$a.method_2083("width", 4));
   }

   public ha$b$b() {
      this.field_344 = 1;
      this.field_343 = new HashSet();
   }

   ha$b$b(Set var1, int var2, int var3, String var4, int var5) {
      this.field_343 = var1;
      this.field_344 = var2;
      this.field_345 = var3;
      this.field_346 = var4;
      this.field_347 = var5;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_563();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_343.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_345;
      case 3:
         return this.field_346;
      case 4:
         return this.field_347;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_342;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_358 var1 = field_341;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_558() {
      return this.field_343;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$b$b)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$b$b var4 = (ha$b$b)var1;
         Iterator var2 = field_342.values().iterator();

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
   int method_559() {
      return this.field_344;
   }

   // $FF: renamed from: g () int
   public int method_560() {
      return this.field_345;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_561() {
      return this.field_346;
   }

   public int hashCode() {
      Iterator var3 = field_342.values().iterator();
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

   // $FF: renamed from: i () int
   public int method_562() {
      return this.field_347;
   }

   // $FF: renamed from: j () com.google.android.gms.internal.ha$b$b
   public ha$b$b method_563() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_358 var3 = field_341;
      class_358.method_1249(this, var1, var2);
   }
}
