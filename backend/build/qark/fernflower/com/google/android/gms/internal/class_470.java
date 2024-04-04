package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.ex
public class class_470 extends WebViewClient {
   // $FF: renamed from: a com.google.android.gms.internal.ev
   protected final class_473 field_1284;
   // $FF: renamed from: b java.util.HashMap
   private final HashMap field_1285 = new HashMap();
   // $FF: renamed from: c java.lang.Object
   private final Object field_1286 = new Object();
   // $FF: renamed from: d com.google.android.gms.internal.jt
   private class_44 field_1287;
   // $FF: renamed from: e com.google.android.gms.internal.ch
   private class_52 field_1288;
   // $FF: renamed from: f com.google.android.gms.internal.fa
   private class_55 field_1289;
   // $FF: renamed from: g com.google.android.gms.internal.s
   private class_71 field_1290;
   // $FF: renamed from: h boolean
   private boolean field_1291 = false;
   // $FF: renamed from: i boolean
   private boolean field_1292;
   // $FF: renamed from: j com.google.android.gms.internal.cm
   private class_48 field_1293;

   public class_470(class_473 var1, boolean var2) {
      this.field_1284 = var1;
      this.field_1292 = var2;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bm) void
   private void method_1621(class_556 var1) {
      class_420.method_1437(this.field_1284.getContext(), var1);
   }

   // $FF: renamed from: a (android.net.Uri) boolean
   private static boolean method_1622(Uri var0) {
      String var1 = var0.getScheme();
      return "http".equalsIgnoreCase(var1) || "https".equalsIgnoreCase(var1);
   }

   // $FF: renamed from: b (android.net.Uri) void
   private void method_1623(Uri var1) {
      String var4 = var1.getPath();
      class_60 var2 = (class_60)this.field_1285.get(var4);
      if (var2 == null) {
         class_467.method_1610("No GMSG handler found for GMSG: " + var1);
      } else {
         HashMap var3 = new HashMap();
         UrlQuerySanitizer var5 = new UrlQuerySanitizer();
         var5.setAllowUnregisteredParamaters(true);
         var5.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
         var5.parseUrl(var1.toString());
         Iterator var6 = var5.getParameterList().iterator();

         while(var6.hasNext()) {
            ParameterValuePair var7 = (ParameterValuePair)var6.next();
            var3.put(var7.mParameter, var7.mValue);
         }

         if (class_467.method_1605(2)) {
            class_467.method_1609("Received GMSG: " + var4);
            var6 = var3.keySet().iterator();

            while(var6.hasNext()) {
               var4 = (String)var6.next();
               class_467.method_1609("  " + var4 + ": " + (String)var3.get(var4));
            }
         }

         var2.method_167(this.field_1284, var3);
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bj) void
   public final void method_1624(class_559 var1) {
      class_52 var4 = null;
      boolean var2 = this.field_1284.method_1652();
      class_44 var3;
      if (var2 && !this.field_1284.method_1648().field_2024) {
         var3 = null;
      } else {
         var3 = this.field_1287;
      }

      if (!var2) {
         var4 = this.field_1288;
      }

      this.method_1621(new class_556(var1, var3, var4, this.field_1293, this.field_1284.method_1651()));
   }

   // $FF: renamed from: a (com.google.android.gms.internal.fa) void
   public final void method_1625(class_55 var1) {
      this.field_1289 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.jt, com.google.android.gms.internal.ch, com.google.android.gms.internal.s, com.google.android.gms.internal.cm, boolean) void
   public void method_1626(class_44 var1, class_52 var2, class_71 var3, class_48 var4, boolean var5) {
      this.method_1627("/appEvent", new class_602(var3));
      this.method_1627("/canOpenURLs", class_599.field_1995);
      this.method_1627("/click", class_599.field_1996);
      this.method_1627("/close", class_599.field_1997);
      this.method_1627("/customClose", class_599.field_1998);
      this.method_1627("/httpTrack", class_599.field_1999);
      this.method_1627("/log", class_599.field_2000);
      this.method_1627("/open", class_599.field_2001);
      this.method_1627("/touch", class_599.field_2002);
      this.method_1627("/video", class_599.field_2003);
      this.field_1287 = var1;
      this.field_1288 = var2;
      this.field_1290 = var3;
      this.field_1293 = var4;
      this.method_1628(var5);
   }

   // $FF: renamed from: a (java.lang.String, com.google.android.gms.internal.ad) void
   public final void method_1627(String var1, class_60 var2) {
      this.field_1285.put(var1, var2);
   }

   // $FF: renamed from: a (boolean) void
   public final void method_1628(boolean var1) {
      this.field_1291 = var1;
   }

   // $FF: renamed from: a (boolean, int) void
   public final void method_1629(boolean var1, int var2) {
      class_44 var3;
      if (this.field_1284.method_1652() && !this.field_1284.method_1648().field_2024) {
         var3 = null;
      } else {
         var3 = this.field_1287;
      }

      this.method_1621(new class_556(var3, this.field_1288, this.field_1293, this.field_1284, var1, var2, this.field_1284.method_1651()));
   }

   // $FF: renamed from: a (boolean, int, java.lang.String) void
   public final void method_1630(boolean var1, int var2, String var3) {
      class_52 var6 = null;
      boolean var4 = this.field_1284.method_1652();
      class_44 var5;
      if (var4 && !this.field_1284.method_1648().field_2024) {
         var5 = null;
      } else {
         var5 = this.field_1287;
      }

      if (!var4) {
         var6 = this.field_1288;
      }

      this.method_1621(new class_556(var5, var6, this.field_1290, this.field_1293, this.field_1284, var1, var2, var3, this.field_1284.method_1651()));
   }

   // $FF: renamed from: a (boolean, int, java.lang.String, java.lang.String) void
   public final void method_1631(boolean var1, int var2, String var3, String var4) {
      class_52 var7 = null;
      boolean var5 = this.field_1284.method_1652();
      class_44 var6;
      if (var5 && !this.field_1284.method_1648().field_2024) {
         var6 = null;
      } else {
         var6 = this.field_1287;
      }

      if (!var5) {
         var7 = this.field_1288;
      }

      this.method_1621(new class_556(var6, var7, this.field_1290, this.field_1293, this.field_1284, var1, var2, var3, var4, this.field_1284.method_1651()));
   }

   // $FF: renamed from: a () boolean
   public boolean method_1632() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public final void method_1633() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public final void method_1634() {
      Object var1 = this.field_1286;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label282: {
         class_420 var2;
         try {
            this.field_1291 = false;
            this.field_1292 = true;
            var2 = this.field_1284.method_1647();
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label282;
         }

         if (var2 != null) {
            label283: {
               try {
                  if (!class_468.method_1618()) {
                     class_468.field_1283.post(new class_475(this, var2));
                     break label283;
                  }
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label282;
               }

               try {
                  var2.method_1450();
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label282;
               }
            }
         }

         label264:
         try {
            return;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            break label264;
         }
      }

      while(true) {
         Throwable var33 = var10000;

         try {
            throw var33;
         } catch (Throwable var28) {
            var10000 = var28;
            var10001 = false;
            continue;
         }
      }
   }

   public final void onPageFinished(WebView var1, String var2) {
      if (this.field_1289 != null) {
         this.field_1289.method_155(this.field_1284);
         this.field_1289 = null;
      }

   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      class_467.method_1609("AdWebView shouldOverrideUrlLoading: " + var2);
      Uri var3 = Uri.parse(var2);
      if ("gmsg".equalsIgnoreCase(var3.getScheme()) && "mobileads.google.com".equalsIgnoreCase(var3.getHost())) {
         this.method_1623(var3);
      } else {
         if (this.field_1291 && var1 == this.field_1284 && method_1622(var3)) {
            return super.shouldOverrideUrlLoading(var1, var2);
         }

         if (!this.field_1284.willNotDraw()) {
            Uri var7;
            label39: {
               label49: {
                  boolean var10001;
                  class_355 var4;
                  try {
                     var4 = this.field_1284.method_1650();
                  } catch (class_412 var6) {
                     var10001 = false;
                     break label49;
                  }

                  var7 = var3;
                  if (var4 == null) {
                     break label39;
                  }

                  var7 = var3;

                  try {
                     if (var4.method_1242(var3)) {
                        var7 = var4.method_1239(var3, this.field_1284.getContext());
                     }
                     break label39;
                  } catch (class_412 var5) {
                     var10001 = false;
                  }
               }

               class_467.method_1610("Unable to append parameter to URL: " + var2);
               var7 = var3;
            }

            this.method_1624(new class_559("android.intent.action.VIEW", var7.toString(), (String)null, (String)null, (String)null, (String)null, (String)null));
         } else {
            class_467.method_1610("AdWebView unable to handle URL: " + var2);
         }
      }

      return true;
   }
}
