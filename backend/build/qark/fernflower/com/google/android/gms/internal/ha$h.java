package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_11;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$h extends class_136 implements class_11, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.jc
   public static final class_402 field_320 = new class_402();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_321 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_322;
   // $FF: renamed from: d int
   private final int field_323;
   // $FF: renamed from: e java.lang.String
   private String field_324;
   // $FF: renamed from: f int
   private final int field_325 = 4;
   // $FF: renamed from: g int
   private int field_326;
   // $FF: renamed from: h java.lang.String
   private String field_327;

   static {
      field_321.put("label", ee$a.method_2090("label", 5));
      field_321.put("type", ee$a.method_2084("type", 6, (new class_478()).method_1665("home", 0).method_1665("work", 1).method_1665("blog", 2).method_1665("profile", 3).method_1665("other", 4).method_1665("otherProfile", 5).method_1665("contributor", 6).method_1665("website", 7), false));
      field_321.put("value", ee$a.method_2090("value", 4));
   }

   public ha$h() {
      this.field_323 = 2;
      this.field_322 = new HashSet();
   }

   ha$h(Set var1, int var2, String var3, int var4, String var5, int var6) {
      this.field_322 = var1;
      this.field_323 = var2;
      this.field_324 = var3;
      this.field_326 = var4;
      this.field_327 = var5;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_546();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_322.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 4:
         return this.field_327;
      case 5:
         return this.field_324;
      case 6:
         return this.field_326;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_321;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_402 var1 = field_320;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_540() {
      return this.field_322;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$h)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$h var4 = (ha$h)var1;
         Iterator var2 = field_321.values().iterator();

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
   int method_541() {
      return this.field_323;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_542() {
      return this.field_324;
   }

   // $FF: renamed from: h () int
   @Deprecated
   public int method_543() {
      return 4;
   }

   public int hashCode() {
      Iterator var3 = field_321.values().iterator();
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
   public int method_544() {
      return this.field_326;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_545() {
      return this.field_327;
   }

   // $FF: renamed from: k () com.google.android.gms.internal.ha$h
   public ha$h method_546() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_402 var3 = field_320;
      class_402.method_1391(this, var1, var2);
   }
}
