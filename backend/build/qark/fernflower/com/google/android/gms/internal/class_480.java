package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.eh
public class class_480 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hl
   public static final class_353 field_1365 = new class_353();
   // $FF: renamed from: b int
   private final int field_1366;
   // $FF: renamed from: c java.util.HashMap
   private final HashMap field_1367;
   // $FF: renamed from: d java.util.ArrayList
   private final ArrayList field_1368;
   // $FF: renamed from: e java.lang.String
   private final String field_1369;

   class_480(int var1, ArrayList var2, String var3) {
      this.field_1366 = var1;
      this.field_1368 = null;
      this.field_1367 = method_1671(var2);
      this.field_1369 = (String)class_343.method_1189(var3);
      this.method_1673();
   }

   // $FF: renamed from: a (java.util.ArrayList) java.util.HashMap
   private static HashMap method_1671(ArrayList var0) {
      HashMap var3 = new HashMap();
      int var2 = var0.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         eh$a var4 = (eh$a)var0.get(var1);
         var3.put(var4.field_177, var4.method_393());
      }

      return var3;
   }

   // $FF: renamed from: a (java.lang.String) java.util.HashMap
   public HashMap method_1672(String var1) {
      return (HashMap)this.field_1367.get(var1);
   }

   // $FF: renamed from: a () void
   public void method_1673() {
      Iterator var1 = this.field_1367.keySet().iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         HashMap var4 = (HashMap)this.field_1367.get(var2);
         Iterator var3 = var4.keySet().iterator();

         while(var3.hasNext()) {
            ((ee$a)var4.get((String)var3.next())).method_2094(this);
         }
      }

   }

   // $FF: renamed from: b () int
   int method_1674() {
      return this.field_1366;
   }

   // $FF: renamed from: c () java.util.ArrayList
   ArrayList method_1675() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.field_1367.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.add(new eh$a(var3, (HashMap)this.field_1367.get(var3)));
      }

      return var1;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_1676() {
      return this.field_1369;
   }

   public int describeContents() {
      class_353 var1 = field_1365;
      return 0;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field_1367.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.append(var3).append(":\n");
         HashMap var6 = (HashMap)this.field_1367.get(var3);
         Iterator var4 = var6.keySet().iterator();

         while(var4.hasNext()) {
            String var5 = (String)var4.next();
            var1.append("  ").append(var5).append(": ");
            var1.append(var6.get(var5));
         }
      }

      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_353 var3 = field_1365;
      class_353.method_1231(this, var1, var2);
   }
}
