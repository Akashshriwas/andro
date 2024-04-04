package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.a.class_9;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.gx
public final class class_139 extends class_136 implements class_9, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ir
   public static final class_356 field_219 = new class_356();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_220 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_221;
   // $FF: renamed from: d int
   private final int field_222;
   // $FF: renamed from: e java.lang.String
   private String field_223;
   // $FF: renamed from: f com.google.android.gms.internal.gv
   private class_140 field_224;
   // $FF: renamed from: g java.lang.String
   private String field_225;
   // $FF: renamed from: h com.google.android.gms.internal.gv
   private class_140 field_226;
   // $FF: renamed from: i java.lang.String
   private String field_227;

   static {
      field_220.put("id", ee$a.method_2090("id", 2));
      field_220.put("result", ee$a.method_2085("result", 4, gv.class));
      field_220.put("startDate", ee$a.method_2090("startDate", 5));
      field_220.put("target", ee$a.method_2085("target", 6, gv.class));
      field_220.put("type", ee$a.method_2090("type", 7));
   }

   public class_139() {
      this.field_222 = 1;
      this.field_221 = new HashSet();
   }

   class_139(Set var1, int var2, String var3, class_140 var4, String var5, class_140 var6, String var7) {
      this.field_221 = var1;
      this.field_222 = var2;
      this.field_223 = var3;
      this.field_224 = var4;
      this.field_225 = var5;
      this.field_226 = var6;
      this.field_227 = var7;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_452();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_221.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_223;
      case 3:
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      case 4:
         return this.field_224;
      case 5:
         return this.field_225;
      case 6:
         return this.field_226;
      case 7:
         return this.field_227;
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_220;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_356 var1 = field_219;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_445() {
      return this.field_221;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class_139)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         class_139 var4 = (class_139)var1;
         Iterator var2 = field_220.values().iterator();

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
   int method_446() {
      return this.field_222;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_447() {
      return this.field_223;
   }

   // $FF: renamed from: h () com.google.android.gms.internal.gv
   class_140 method_448() {
      return this.field_224;
   }

   public int hashCode() {
      Iterator var3 = field_220.values().iterator();
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
   public String method_449() {
      return this.field_225;
   }

   // $FF: renamed from: j () com.google.android.gms.internal.gv
   class_140 method_450() {
      return this.field_226;
   }

   // $FF: renamed from: k () java.lang.String
   public String method_451() {
      return this.field_227;
   }

   // $FF: renamed from: l () com.google.android.gms.internal.gx
   public class_139 method_452() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_356 var3 = field_219;
      class_356.method_1243(this, var1, var2);
   }
}
