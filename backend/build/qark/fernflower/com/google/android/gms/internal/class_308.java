package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: com.google.android.gms.internal.gz
public final class class_308 {
   // $FF: renamed from: a java.util.List
   private final List field_860;
   // $FF: renamed from: b java.lang.Object
   private final Object field_861;

   private class_308(Object var1) {
      this.field_861 = class_343.method_1189(var1);
      this.field_860 = new ArrayList();
   }

   // $FF: synthetic method
   class_308(Object var1, class_309 var2) {
      this(var1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object) com.google.android.gms.internal.gz
   public class_308 method_1032(String var1, Object var2) {
      this.field_860.add((String)class_343.method_1189(var1) + "=" + var2);
      return this;
   }

   public String toString() {
      StringBuilder var3 = (new StringBuilder(100)).append(this.field_861.getClass().getSimpleName()).append('{');
      int var2 = this.field_860.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         var3.append((String)this.field_860.get(var1));
         if (var1 < var2 - 1) {
            var3.append(", ");
         }
      }

      return var3.append('}').toString();
   }
}
