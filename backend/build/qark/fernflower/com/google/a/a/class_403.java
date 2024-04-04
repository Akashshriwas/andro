package com.google.a.a;

import com.google.android.gms.internal.class_467;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: com.google.a.a.g
@Deprecated
public abstract class class_403 {
   // $FF: renamed from: a () void
   protected void method_1394() {
   }

   // $FF: renamed from: a (java.util.Map) void
   public void method_1395(Map var1) {
      HashMap var4 = new HashMap();
      Field[] var5 = this.getClass().getFields();
      int var3 = var5.length;

      Field var6;
      for(int var2 = 0; var2 < var3; ++var2) {
         var6 = var5[var2];
         class_69 var7 = (class_69)var6.getAnnotation(i.class);
         if (var7 != null) {
            var4.put(var7.method_186(), var6);
         }
      }

      if (var4.isEmpty()) {
         class_467.method_1610("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
      }

      Iterator var10 = var1.entrySet().iterator();

      while(var10.hasNext()) {
         Entry var13 = (Entry)var10.next();
         var6 = (Field)var4.remove(var13.getKey());
         if (var6 != null) {
            try {
               var6.set(this, var13.getValue());
            } catch (IllegalAccessException var8) {
               class_467.method_1610("Server option \"" + (String)var13.getKey() + "\" could not be set: Illegal Access");
            } catch (IllegalArgumentException var9) {
               class_467.method_1610("Server option \"" + (String)var13.getKey() + "\" could not be set: Bad Type");
            }
         } else {
            class_467.method_1603("Unexpected server option: " + (String)var13.getKey() + " = \"" + (String)var13.getValue() + "\"");
         }
      }

      StringBuilder var11 = new StringBuilder();
      Iterator var12 = var4.values().iterator();

      while(var12.hasNext()) {
         Field var14 = (Field)var12.next();
         if (((class_69)var14.getAnnotation(i.class)).method_187()) {
            class_467.method_1610("Required server option missing: " + ((class_69)var14.getAnnotation(i.class)).method_186());
            if (var11.length() > 0) {
               var11.append(", ");
            }

            var11.append(((class_69)var14.getAnnotation(i.class)).method_186());
         }
      }

      if (var11.length() > 0) {
         throw new class_594("Required server option(s) missing: " + var11.toString());
      } else {
         this.method_1394();
      }
   }
}
