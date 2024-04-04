package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_12;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$g extends class_136 implements class_12, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.jb
   public static final class_405 field_314 = new class_405();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_315 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_316;
   // $FF: renamed from: d int
   private final int field_317;
   // $FF: renamed from: e boolean
   private boolean field_318;
   // $FF: renamed from: f java.lang.String
   private String field_319;

   static {
      field_315.put("primary", ee$a.method_2089("primary", 2));
      field_315.put("value", ee$a.method_2090("value", 3));
   }

   public ha$g() {
      this.field_317 = 1;
      this.field_316 = new HashSet();
   }

   ha$g(Set var1, int var2, boolean var3, String var4) {
      this.field_316 = var1;
      this.field_317 = var2;
      this.field_318 = var3;
      this.field_319 = var4;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_539();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_316.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_318;
      case 3:
         return this.field_319;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_315;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_405 var1 = field_314;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_535() {
      return this.field_316;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$g)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$g var4 = (ha$g)var1;
         Iterator var2 = field_315.values().iterator();

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
   int method_536() {
      return this.field_317;
   }

   // $FF: renamed from: g () boolean
   public boolean method_537() {
      return this.field_318;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_538() {
      return this.field_319;
   }

   public int hashCode() {
      Iterator var3 = field_315.values().iterator();
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

   // $FF: renamed from: i () com.google.android.gms.internal.ha$g
   public ha$g method_539() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_405 var3 = field_314;
      class_405.method_1396(this, var1, var2);
   }
}
