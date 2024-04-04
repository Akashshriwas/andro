package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_14;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$d extends class_136 implements class_14, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iz
   public static final class_362 field_291 = new class_362();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_292 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_293;
   // $FF: renamed from: d int
   private final int field_294;
   // $FF: renamed from: e java.lang.String
   private String field_295;
   // $FF: renamed from: f java.lang.String
   private String field_296;
   // $FF: renamed from: g java.lang.String
   private String field_297;
   // $FF: renamed from: h java.lang.String
   private String field_298;
   // $FF: renamed from: i java.lang.String
   private String field_299;
   // $FF: renamed from: j java.lang.String
   private String field_300;

   static {
      field_292.put("familyName", ee$a.method_2090("familyName", 2));
      field_292.put("formatted", ee$a.method_2090("formatted", 3));
      field_292.put("givenName", ee$a.method_2090("givenName", 4));
      field_292.put("honorificPrefix", ee$a.method_2090("honorificPrefix", 5));
      field_292.put("honorificSuffix", ee$a.method_2090("honorificSuffix", 6));
      field_292.put("middleName", ee$a.method_2090("middleName", 7));
   }

   public ha$d() {
      this.field_294 = 1;
      this.field_293 = new HashSet();
   }

   ha$d(Set var1, int var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      this.field_293 = var1;
      this.field_294 = var2;
      this.field_295 = var3;
      this.field_296 = var4;
      this.field_297 = var5;
      this.field_298 = var6;
      this.field_299 = var7;
      this.field_300 = var8;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_522();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_293.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_295;
      case 3:
         return this.field_296;
      case 4:
         return this.field_297;
      case 5:
         return this.field_298;
      case 6:
         return this.field_299;
      case 7:
         return this.field_300;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_292;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_362 var1 = field_291;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_514() {
      return this.field_293;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$d)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$d var4 = (ha$d)var1;
         Iterator var2 = field_292.values().iterator();

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
   int method_515() {
      return this.field_294;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_516() {
      return this.field_295;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_517() {
      return this.field_296;
   }

   public int hashCode() {
      Iterator var3 = field_292.values().iterator();
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

   // $FF: renamed from: i () java.lang.String
   public String method_518() {
      return this.field_297;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_519() {
      return this.field_298;
   }

   // $FF: renamed from: k () java.lang.String
   public String method_520() {
      return this.field_299;
   }

   // $FF: renamed from: l () java.lang.String
   public String method_521() {
      return this.field_300;
   }

   // $FF: renamed from: m () com.google.android.gms.internal.ha$d
   public ha$d method_522() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_362 var3 = field_291;
      class_362.method_1261(this, var1, var2);
   }
}
