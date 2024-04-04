package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.ee
public abstract class class_136 {
   // $FF: renamed from: a (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, java.lang.Object) void
   private void method_394(StringBuilder var1, ee$a var2, Object var3) {
      if (var2.method_2095() == 11) {
         var1.append(((class_136)var2.method_2101().cast(var3)).toString());
      } else if (var2.method_2095() == 7) {
         var1.append("\"");
         var1.append(class_332.method_1134((String)var3));
         var1.append("\"");
      } else {
         var1.append(var3);
      }
   }

   // $FF: renamed from: a (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, java.util.ArrayList) void
   private void method_395(StringBuilder var1, ee$a var2, ArrayList var3) {
      var1.append("[");
      int var4 = 0;

      for(int var5 = var3.size(); var4 < var5; ++var4) {
         if (var4 > 0) {
            var1.append(",");
         }

         Object var6 = var3.get(var4);
         if (var6 != null) {
            this.method_394(var1, var2, var6);
         }
      }

      var1.append("]");
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a, java.lang.Object) java.lang.Object
   protected Object method_396(ee$a var1, Object var2) {
      Object var3 = var2;
      if (ee$a.method_2086(var1) != null) {
         var3 = var1.method_2093(var2);
      }

      return var3;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected abstract Object method_397(String var1);

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      if (var1.method_2097() == 11) {
         return var1.method_2098() ? this.method_405(var1.method_2099()) : this.method_403(var1.method_2099());
      } else {
         return this.method_401(var1.method_2099());
      }
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      boolean var2 = true;
      String var3 = var1.method_2099();
      if (var1.method_2101() != null) {
         if (this.method_397(var1.method_2099()) != null) {
            var2 = false;
         }

         class_343.method_1193(var2, "Concrete field shouldn't be value object: " + var1.method_2099());
         HashMap var5;
         if (var1.method_2098()) {
            var5 = this.method_404();
         } else {
            var5 = this.method_402();
         }

         if (var5 != null) {
            return var5.get(var3);
         } else {
            try {
               String var6 = "get" + Character.toUpperCase(var3.charAt(0)) + var3.substring(1);
               Object var7 = this.getClass().getMethod(var6).invoke(this);
               return var7;
            } catch (Exception var4) {
               throw new RuntimeException(var4);
            }
         }
      } else {
         return this.method_397(var1.method_2099());
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public abstract HashMap method_400();

   // $FF: renamed from: b (java.lang.String) boolean
   protected abstract boolean method_401(String var1);

   // $FF: renamed from: c () java.util.HashMap
   public HashMap method_402() {
      return null;
   }

   // $FF: renamed from: c (java.lang.String) boolean
   protected boolean method_403(String var1) {
      throw new UnsupportedOperationException("Concrete types not supported");
   }

   // $FF: renamed from: d () java.util.HashMap
   public HashMap method_404() {
      return null;
   }

   // $FF: renamed from: d (java.lang.String) boolean
   protected boolean method_405(String var1) {
      throw new UnsupportedOperationException("Concrete type arrays not supported");
   }

   public String toString() {
      HashMap var1 = this.method_400();
      StringBuilder var2 = new StringBuilder(100);
      Iterator var3 = var1.keySet().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         ee$a var5 = (ee$a)var1.get(var4);
         if (this.method_398(var5)) {
            Object var6 = this.method_396(var5, this.method_399(var5));
            if (var2.length() == 0) {
               var2.append("{");
            } else {
               var2.append(",");
            }

            var2.append("\"").append(var4).append("\":");
            if (var6 == null) {
               var2.append("null");
            } else {
               switch(var5.method_2097()) {
               case 8:
                  var2.append("\"").append(class_335.method_1162((byte[])((byte[])var6))).append("\"");
                  break;
               case 9:
                  var2.append("\"").append(class_335.method_1163((byte[])((byte[])var6))).append("\"");
                  break;
               case 10:
                  class_329.method_1130(var2, (HashMap)var6);
                  break;
               default:
                  if (var5.method_2096()) {
                     this.method_395(var2, var5, (ArrayList)var6);
                  } else {
                     this.method_394(var2, var5, var6);
                  }
               }
            }
         }
      }

      if (var2.length() > 0) {
         var2.append("}");
      } else {
         var2.append("{}");
      }

      return var2.toString();
   }
}
