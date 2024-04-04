package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

// $FF: renamed from: com.google.android.gms.internal.is
public class class_355 {
   // $FF: renamed from: a java.lang.String
   private String field_978 = "googleads.g.doubleclick.net";
   // $FF: renamed from: b java.lang.String
   private String field_979 = "/pagead/ads";
   // $FF: renamed from: c java.lang.String[]
   private String[] field_980 = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
   // $FF: renamed from: d com.google.android.gms.internal.fl
   private class_56 field_981;
   // $FF: renamed from: e com.google.android.gms.internal.dm
   private final class_444 field_982 = new class_444();

   public class_355(class_56 var1) {
      this.field_981 = var1;
   }

   // $FF: renamed from: a (android.net.Uri, android.content.Context, java.lang.String, boolean) android.net.Uri
   private Uri method_1237(Uri var1, Context var2, String var3, boolean var4) {
      boolean var10001;
      try {
         if (var1.getQueryParameter("ms") != null) {
            throw new class_412("Query parameter already exists: ms");
         }
      } catch (UnsupportedOperationException var8) {
         var10001 = false;
         throw new class_412("Provided Uri is not in a valid state");
      }

      String var9;
      if (var4) {
         try {
            var9 = this.field_981.method_157(var2, var3);
         } catch (UnsupportedOperationException var7) {
            var10001 = false;
            throw new class_412("Provided Uri is not in a valid state");
         }
      } else {
         try {
            var9 = this.field_981.method_156(var2);
         } catch (UnsupportedOperationException var6) {
            var10001 = false;
            throw new class_412("Provided Uri is not in a valid state");
         }
      }

      try {
         return this.method_1238(var1, "ms", var9);
      } catch (UnsupportedOperationException var5) {
         var10001 = false;
         throw new class_412("Provided Uri is not in a valid state");
      }
   }

   // $FF: renamed from: a (android.net.Uri, java.lang.String, java.lang.String) android.net.Uri
   private Uri method_1238(Uri var1, String var2, String var3) {
      String var6 = var1.toString();
      int var5 = var6.indexOf("&adurl");
      int var4 = var5;
      if (var5 == -1) {
         var4 = var6.indexOf("?adurl");
      }

      return var4 != -1 ? Uri.parse(var6.substring(0, var4 + 1) + var2 + "=" + var3 + "&" + var6.substring(var4 + 1)) : var1.buildUpon().appendQueryParameter(var2, var3).build();
   }

   // $FF: renamed from: a (android.net.Uri, android.content.Context) android.net.Uri
   public Uri method_1239(Uri var1, Context var2) {
      try {
         var1 = this.method_1237(var1, var2, var1.getQueryParameter("ai"), true);
         return var1;
      } catch (UnsupportedOperationException var3) {
         throw new class_412("Provided Uri is not in a valid state");
      }
   }

   // $FF: renamed from: a () com.google.android.gms.internal.fl
   public class_56 method_1240() {
      return this.field_981;
   }

   // $FF: renamed from: a (android.view.MotionEvent) void
   public void method_1241(MotionEvent var1) {
      this.field_981.method_159(var1);
   }

   // $FF: renamed from: a (android.net.Uri) boolean
   public boolean method_1242(Uri var1) {
      boolean var5 = false;
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         boolean var10001;
         int var3;
         String[] var6;
         String var9;
         try {
            var9 = var1.getHost();
            var6 = this.field_980;
            var3 = var6.length;
         } catch (NullPointerException var8) {
            var10001 = false;
            return false;
         }

         int var2 = 0;

         while(true) {
            boolean var4 = var5;
            if (var2 >= var3) {
               return var4;
            }

            try {
               var4 = var9.endsWith(var6[var2]);
            } catch (NullPointerException var7) {
               var10001 = false;
               return false;
            }

            if (var4) {
               var4 = true;
               return var4;
            }

            ++var2;
         }
      }
   }
}
