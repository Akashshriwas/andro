package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// $FF: renamed from: com.google.android.gms.internal.fj
public final class class_471 extends class_470 {
   public class_471(class_473 var1, boolean var2) {
      super(var1, var2);
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, java.lang.String) android.webkit.WebResourceResponse
   private static WebResourceResponse method_1635(Context var0, String var1, String var2) {
      HttpURLConnection var6 = (HttpURLConnection)(new URL(var2)).openConnection();

      WebResourceResponse var5;
      try {
         class_466.method_1587(var0, var1, true, var6);
         var6.connect();
         var5 = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(class_466.method_1579(new InputStreamReader(var6.getInputStream())).getBytes("UTF-8")));
      } finally {
         var6.disconnect();
      }

      return var5;
   }

   public WebResourceResponse shouldInterceptRequest(WebView var1, String var2) {
      try {
         if (!"mraid.js".equalsIgnoreCase((new File(var2)).getName())) {
            return super.shouldInterceptRequest(var1, var2);
         } else if (!(var1 instanceof class_473)) {
            class_467.method_1610("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(var1, var2);
         } else {
            class_473 var3 = (class_473)var1;
            var3.method_1649().method_1634();
            if (var3.method_1648().field_2024) {
               class_467.method_1609("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
               return method_1635(var3.getContext(), this.a.method_1651().field_1127, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            } else if (var3.method_1652()) {
               class_467.method_1609("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
               return method_1635(var3.getContext(), this.a.method_1651().field_1127, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            } else {
               class_467.method_1609("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
               WebResourceResponse var5 = method_1635(var3.getContext(), this.a.method_1651().field_1127, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
               return var5;
            }
         }
      } catch (IOException var4) {
         class_467.method_1610("Could not fetching MRAID JS. " + var4.getMessage());
         return super.shouldInterceptRequest(var1, var2);
      }
   }
}
