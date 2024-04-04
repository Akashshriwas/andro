package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

// $FF: renamed from: com.google.android.gms.internal.jh
public final class class_407 {
   // $FF: renamed from: a (com.google.android.gms.internal.jg) java.lang.String
   public static String method_1400(class_408 var0) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var1 = new StringBuffer();

         try {
            method_1402((String)null, var0.getClass(), var0, new StringBuffer(), var1);
         } catch (IllegalAccessException var2) {
            return "Error printing proto: " + var2.getMessage();
         }

         return var1.toString();
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private static String method_1401(String var0) {
      StringBuffer var3 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var1 = var0.charAt(var2);
         if (var2 == 0) {
            var3.append(Character.toLowerCase(var1));
         } else if (Character.isUpperCase(var1)) {
            var3.append('_').append(Character.toLowerCase(var1));
         } else {
            var3.append(var1);
         }
      }

      return var3.toString();
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Class, java.lang.Object, java.lang.StringBuffer, java.lang.StringBuffer) void
   private static void method_1402(String var0, Class var1, Object var2, StringBuffer var3, StringBuffer var4) {
      if (var2 != null) {
         if (!jg.class.isAssignableFrom(var1)) {
            var0 = method_1401(var0);
            var4.append(var3).append(var0).append(": ");
            if (var2 instanceof String) {
               var0 = method_1404((String)var2);
               var4.append("\"").append(var0).append("\"");
            } else if (var2 instanceof byte[]) {
               method_1403((byte[])((byte[])var2), var4);
            } else {
               var4.append(var2);
            }

            var4.append("\n");
            return;
         }

         int var8 = var3.length();
         if (var0 != null) {
            var4.append(var3).append(method_1401(var0)).append(" <\n");
            var3.append("  ");
         }

         Field[] var14 = var1.getFields();
         int var9 = var14.length;

         for(int var5 = 0; var5 < var9; ++var5) {
            Field var12 = var14[var5];
            int var6 = var12.getModifiers();
            String var10 = var12.getName();
            if ((var6 & 1) == 1 && (var6 & 8) != 8 && !var10.startsWith("_") && !var10.endsWith("_")) {
               Class var11 = var12.getType();
               Object var15 = var12.get(var2);
               if (var11.isArray()) {
                  Class var13 = var11.getComponentType();
                  if (var13 == Byte.TYPE) {
                     method_1402(var10, var11, var15, var3, var4);
                  } else {
                     if (var15 == null) {
                        var6 = 0;
                     } else {
                        var6 = Array.getLength(var15);
                     }

                     for(int var7 = 0; var7 < var6; ++var7) {
                        method_1402(var10, var13, Array.get(var15, var7), var3, var4);
                     }
                  }
               } else {
                  method_1402(var10, var11, var15, var3, var4);
               }
            }
         }

         if (var0 != null) {
            var3.setLength(var8);
            var4.append(var3).append(">\n");
            return;
         }
      }

   }

   // $FF: renamed from: a (byte[], java.lang.StringBuffer) void
   private static void method_1403(byte[] var0, StringBuffer var1) {
      if (var0 == null) {
         var1.append("\"\"");
      } else {
         var1.append('"');

         for(int var2 = 0; var2 < var0.length; ++var2) {
            byte var3 = var0[var2];
            if (var3 != 92 && var3 != 34) {
               if (var3 >= 32 && var3 < 127) {
                  var1.append((char)var3);
               } else {
                  var1.append(String.format("\\%03o", Integer.valueOf(var3)));
               }
            } else {
               var1.append('\\').append((char)var3);
            }
         }

         var1.append('"');
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   private static String method_1404(String var0) {
      String var1 = var0;
      if (!var0.startsWith("http")) {
         var1 = var0;
         if (var0.length() > 200) {
            var1 = var0.substring(0, 200) + "[...]";
         }
      }

      return method_1405(var1);
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   private static String method_1405(String var0) {
      int var3 = var0.length();
      StringBuilder var4 = new StringBuilder(var3);

      for(int var2 = 0; var2 < var3; ++var2) {
         char var1 = var0.charAt(var2);
         if (var1 >= ' ' && var1 <= '~' && var1 != '"' && var1 != '\'') {
            var4.append(var1);
         } else {
            var4.append(String.format("\\u%04x", Integer.valueOf(var1)));
         }
      }

      return var4.toString();
   }
}
