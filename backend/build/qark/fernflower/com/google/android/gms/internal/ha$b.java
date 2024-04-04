package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_18;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$b extends class_136 implements class_18, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iv
   public static final class_360 field_334 = new class_360();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_335 = new HashMap();
   // $FF: renamed from: c java.util.Set
   private final Set field_336;
   // $FF: renamed from: d int
   private final int field_337;
   // $FF: renamed from: e com.google.android.gms.internal.ha$b$a
   private ha$b$a field_338;
   // $FF: renamed from: f com.google.android.gms.internal.ha$b$b
   private ha$b$b field_339;
   // $FF: renamed from: g int
   private int field_340;

   static {
      field_335.put("coverInfo", ee$a.method_2085("coverInfo", 2, ha$b$a.class));
      field_335.put("coverPhoto", ee$a.method_2085("coverPhoto", 3, ha$b$b.class));
      field_335.put("layout", ee$a.method_2084("layout", 4, (new class_478()).method_1665("banner", 0), false));
   }

   public ha$b() {
      this.field_337 = 1;
      this.field_336 = new HashSet();
   }

   ha$b(Set var1, int var2, ha$b$a var3, ha$b$b var4, int var5) {
      this.field_336 = var1;
      this.field_337 = var2;
      this.field_338 = var3;
      this.field_339 = var4;
      this.field_340 = var5;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_557();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_336.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_338;
      case 3:
         return this.field_339;
      case 4:
         return this.field_340;
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_335;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_360 var1 = field_334;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_552() {
      return this.field_336;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ha$b)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         ha$b var4 = (ha$b)var1;
         Iterator var2 = field_335.values().iterator();

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
   int method_553() {
      return this.field_337;
   }

   // $FF: renamed from: g () com.google.android.gms.internal.ha$b$a
   ha$b$a method_554() {
      return this.field_338;
   }

   // $FF: renamed from: h () com.google.android.gms.internal.ha$b$b
   ha$b$b method_555() {
      return this.field_339;
   }

   public int hashCode() {
      Iterator var3 = field_335.values().iterator();
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
   public int method_556() {
      return this.field_340;
   }

   // $FF: renamed from: j () com.google.android.gms.internal.ha$b
   public ha$b method_557() {
      return this;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_360 var3 = field_334;
      class_360.method_1255(this, var1, var2);
   }
}
