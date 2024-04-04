package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.eb
public final class class_478 implements SafeParcelable, class_42 {
   // $FF: renamed from: a com.google.android.gms.internal.hg
   public static final class_345 field_1341 = new class_345();
   // $FF: renamed from: b int
   private final int field_1342;
   // $FF: renamed from: c java.util.HashMap
   private final HashMap field_1343;
   // $FF: renamed from: d java.util.HashMap
   private final HashMap field_1344;
   // $FF: renamed from: e java.util.ArrayList
   private final ArrayList field_1345;

   public class_478() {
      this.field_1342 = 1;
      this.field_1343 = new HashMap();
      this.field_1344 = new HashMap();
      this.field_1345 = null;
   }

   class_478(int var1, ArrayList var2) {
      this.field_1342 = var1;
      this.field_1343 = new HashMap();
      this.field_1344 = new HashMap();
      this.field_1345 = null;
      this.method_1663(var2);
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   private void method_1663(ArrayList var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         eb$a var2 = (eb$a)var3.next();
         this.method_1665(var2.field_1604, var2.field_1605);
      }

   }

   // $FF: renamed from: a () int
   int method_1664() {
      return this.field_1342;
   }

   // $FF: renamed from: a (java.lang.String, int) com.google.android.gms.internal.eb
   public class_478 method_1665(String var1, int var2) {
      this.field_1343.put(var1, var2);
      this.field_1344.put(var2, var1);
      return this;
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   // $FF: synthetic method
   public Object method_126(Object var1) {
      return this.method_1666((Integer)var1);
   }

   // $FF: renamed from: a (java.lang.Integer) java.lang.String
   public String method_1666(Integer var1) {
      String var2 = (String)this.field_1344.get(var1);
      String var3 = var2;
      if (var2 == null) {
         var3 = var2;
         if (this.field_1343.containsKey("gms_unknown")) {
            var3 = "gms_unknown";
         }
      }

      return var3;
   }

   // $FF: renamed from: b () java.util.ArrayList
   ArrayList method_1667() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.field_1343.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.add(new eb$a(var3, (Integer)this.field_1343.get(var3)));
      }

      return var1;
   }

   // $FF: renamed from: c () int
   public int method_127() {
      return 7;
   }

   // $FF: renamed from: d () int
   public int method_128() {
      return 0;
   }

   public int describeContents() {
      class_345 var1 = field_1341;
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_345 var3 = field_1341;
      class_345.method_1202(this, var1, var2);
   }
}
