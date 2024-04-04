package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.google.android.gms.internal.hr
public final class class_332 {
   // $FF: renamed from: a java.util.regex.Pattern
   private static final Pattern field_935 = Pattern.compile("\\\\.");
   // $FF: renamed from: b java.util.regex.Pattern
   private static final Pattern field_936 = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1134(String var0) {
      if (!TextUtils.isEmpty(var0)) {
         Matcher var3 = field_936.matcher(var0);
         StringBuffer var1 = null;

         while(var3.find()) {
            StringBuffer var2 = var1;
            if (var1 == null) {
               var2 = new StringBuffer();
            }

            switch(var3.group().charAt(0)) {
            case '\b':
               var3.appendReplacement(var2, "\\\\b");
               var1 = var2;
               break;
            case '\t':
               var3.appendReplacement(var2, "\\\\t");
               var1 = var2;
               break;
            case '\n':
               var3.appendReplacement(var2, "\\\\n");
               var1 = var2;
               break;
            case '\f':
               var3.appendReplacement(var2, "\\\\f");
               var1 = var2;
               break;
            case '\r':
               var3.appendReplacement(var2, "\\\\r");
               var1 = var2;
               break;
            case '"':
               var3.appendReplacement(var2, "\\\\\\\"");
               var1 = var2;
               break;
            case '/':
               var3.appendReplacement(var2, "\\\\/");
               var1 = var2;
               break;
            case '\\':
               var3.appendReplacement(var2, "\\\\\\\\");
               var1 = var2;
               break;
            default:
               var1 = var2;
            }
         }

         if (var1 != null) {
            var3.appendTail(var1);
            return var1.toString();
         }
      }

      return var0;
   }
}
