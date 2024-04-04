package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_13;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$f extends class_136 implements class_13, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ja
   public static final class_364 field_301 = new class_364();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_302 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_303;
   // $FF: renamed from: d int
   private final int field_304;
   // $FF: renamed from: e java.lang.String
   private String field_305;
   // $FF: renamed from: f java.lang.String
   private String field_306;
   // $FF: renamed from: g java.lang.String
   private String field_307;
   // $FF: renamed from: h java.lang.String
   private String field_308;
   // $FF: renamed from: i java.lang.String
   private String field_309;
   // $FF: renamed from: j boolean
   private boolean field_310;
   // $FF: renamed from: k java.lang.String
   private String field_311;
   // $FF: renamed from: l java.lang.String
   private String field_312;
   // $FF: renamed from: m int
   private int field_313;

   static {
      field_302.put("department", ee$a.method_2090("department", 2));
      field_302.put("description", ee$a.method_2090("description", 3));
      field_302.put("endDate", ee$a.method_2090("endDate", 4));
      field_302.put("location", ee$a.method_2090("location", 5));
      field_302.put("name", ee$a.method_2090("name", 6));
      field_302.put("primary", ee$a.method_2089("primary", 7));
      field_302.put("startDate", ee$a.method_2090("startDate", 8));
      field_302.put("title", ee$a.method_2090("title", 9));
      field_302.put("type", ee$a.method_2084("type", 10, (new class_478()).method_1665("work", 0).method_1665("school", 1), false));
   }

   public ha$f() {
      this.field_304 = 1;
      this.field_303 = new HashSet();
   }

   ha$f(Set var1, int var2, String var3, String var4, String var5, String var6, String var7, boolean var8, String var9, String var10, int var11) {
      this.field_303 = var1;
      this.field_304 = var2;
      this.field_305 = var3;
      this.field_306 = var4;
      this.field_307 = var5;
      this.field_308 = var6;
      this.field_309 = var7;
      this.field_310 = var8;
      this.field_311 = var9;
      this.field_312 = var10;
      this.field_313 = var11;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_534();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_303.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_305;
      case 3:
         return this.field_306;
      case 4:
         return this.field_307;
      case 5:
         return this.field_308;
      case 6:
         return this.field_309;
      case 7:
         return this.field_310;
      case 8:
         return this.field_311;
      case 9:
         return this.field_312;
      case 10:
         return this.field_313;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_302;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_364 var1 = field_301;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_523() {
      return this.field_303;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$f)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$f var4 = (ha$f)var1;
         Iterator var2 = field_302.values().iterator();

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
   int method_524() {
      return this.field_304;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_525() {
      return this.field_305;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_526() {
      return this.field_306;
   }

   public int hashCode() {
      Iterator var3 = field_302.values().iterator();
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
   public String method_527() {
      return this.field_307;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_528() {
      return this.field_308;
   }

   // $FF: renamed from: k () java.lang.String
   public String method_529() {
      return this.field_309;
   }

   // $FF: renamed from: l () boolean
   public boolean method_530() {
      return this.field_310;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_531() {
      return this.field_311;
   }

   // $FF: renamed from: n () java.lang.String
   public String method_532() {
      return this.field_312;
   }

   // $FF: renamed from: o () int
   public int method_533() {
      return this.field_313;
   }

   // $FF: renamed from: p () com.google.android.gms.internal.ha$f
   public ha$f method_534() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_364 var3 = field_301;
      class_364.method_1267(this, var1, var2);
   }
}
