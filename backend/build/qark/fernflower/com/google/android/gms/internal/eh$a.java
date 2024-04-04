package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class eh$a implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hm
   public static final class_352 field_175 = new class_352();
   // $FF: renamed from: b int
   final int field_176;
   // $FF: renamed from: c java.lang.String
   final String field_177;
   // $FF: renamed from: d java.util.ArrayList
   final ArrayList field_178;

   eh$a(int var1, String var2, ArrayList var3) {
      this.field_176 = var1;
      this.field_177 = var2;
      this.field_178 = var3;
   }

   eh$a(String var1, HashMap var2) {
      this.field_176 = 1;
      this.field_177 = var1;
      this.field_178 = method_392(var2);
   }

   // $FF: renamed from: a (java.util.HashMap) java.util.ArrayList
   private static ArrayList method_392(HashMap var0) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         Iterator var2 = var0.keySet().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.add(new eh$b(var3, (ee$a)var0.get(var3)));
         }

         return var1;
      }
   }

   // $FF: renamed from: a () java.util.HashMap
   HashMap method_393() {
      HashMap var3 = new HashMap();
      int var2 = this.field_178.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         eh$b var4 = (eh$b)this.field_178.get(var1);
         var3.put(var4.field_181, var4.field_182);
      }

      return var3;
   }

   public int describeContents() {
      class_352 var1 = field_175;
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_352 var3 = field_175;
      class_352.method_1228(this, var1, var2);
   }
}
