package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// $FF: renamed from: com.google.android.gms.internal.fb
public class class_504 extends WebChromeClient {
   // $FF: renamed from: a com.google.android.gms.internal.ev
   private final class_473 field_1541;

   public class_504(class_473 var1) {
      this.field_1541 = var1;
   }

   // $FF: renamed from: a (android.app.AlertDialog.Builder, java.lang.String, android.webkit.JsResult) void
   private static void method_1718(Builder var0, String var1, JsResult var2) {
      var0.setMessage(var1).setPositiveButton(17039370, new class_501(var2)).setNegativeButton(17039360, new class_502(var2)).setOnCancelListener(new class_503(var2)).create().show();
   }

   // $FF: renamed from: a (android.content.Context, android.app.AlertDialog.Builder, java.lang.String, java.lang.String, android.webkit.JsPromptResult) void
   private static void method_1719(Context var0, Builder var1, String var2, String var3, JsPromptResult var4) {
      LinearLayout var5 = new LinearLayout(var0);
      var5.setOrientation(1);
      TextView var6 = new TextView(var0);
      var6.setText(var2);
      EditText var7 = new EditText(var0);
      var7.setText(var3);
      var5.addView(var6);
      var5.addView(var7);
      var1.setView(var5).setPositiveButton(17039370, new class_508(var4, var7)).setNegativeButton(17039360, new class_509(var4)).setOnCancelListener(new class_510(var4)).create().show();
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsResult, android.webkit.JsPromptResult, boolean) boolean
   private static boolean method_1720(Context var0, String var1, String var2, String var3, JsResult var4, JsPromptResult var5, boolean var6) {
      Builder var7 = new Builder(var0);
      var7.setTitle(var1);
      if (var6) {
         method_1719(var0, var7, var2, var3, var5);
      } else {
         method_1718(var7, var2, var4);
      }

      return true;
   }

   // $FF: renamed from: a (android.view.View, int, android.webkit.WebChromeClient.CustomViewCallback) void
   protected final void method_1721(View var1, int var2, CustomViewCallback var3) {
      class_420 var4 = this.field_1541.method_1647();
      if (var4 == null) {
         class_467.method_1610("Could not get ad overlay when showing custom view.");
         var3.onCustomViewHidden();
      } else {
         var4.method_1444(var1, var3);
         var4.method_1442(var2);
      }
   }

   public final void onCloseWindow(WebView var1) {
      if (!(var1 instanceof class_473)) {
         class_467.method_1610("Tried to close a WebView that wasn't an AdWebView.");
      } else {
         class_420 var2 = ((class_473)var1).method_1647();
         if (var2 == null) {
            class_467.method_1610("Tried to close an AdWebView not associated with an overlay.");
         } else {
            var2.method_1441();
         }
      }
   }

   public final boolean onConsoleMessage(ConsoleMessage var1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onCreateWindow(WebView var1, boolean var2, boolean var3, Message var4) {
      WebViewTransport var5 = (WebViewTransport)var4.obj;
      var1 = new WebView(var1.getContext());
      var1.setWebViewClient(this.field_1541.method_1649());
      var5.setWebView(var1);
      var4.sendToTarget();
      return true;
   }

   public final void onExceededDatabaseQuota(String var1, String var2, long var3, long var5, long var7, QuotaUpdater var9) {
      long var10 = 5242880L - var7;
      if (var10 <= 0L) {
         var9.updateQuota(var3);
      } else {
         if (var3 == 0L) {
            if (var5 > var10 || var5 > 1048576L) {
               var5 = 0L;
            }
         } else if (var5 == 0L) {
            var5 = Math.min(Math.min(131072L, var10) + var3, 1048576L);
         } else {
            var7 = var3;
            if (var5 <= Math.min(1048576L - var3, var10)) {
               var7 = var3 + var5;
            }

            var5 = var7;
         }

         var9.updateQuota(var5);
      }
   }

   public final void onHideCustomView() {
      class_420 var1 = this.field_1541.method_1647();
      if (var1 == null) {
         class_467.method_1610("Could not get ad overlay when hiding custom view.");
      } else {
         var1.method_1449();
      }
   }

   public final boolean onJsAlert(WebView var1, String var2, String var3, JsResult var4) {
      return method_1720(var1.getContext(), var2, var3, (String)null, var4, (JsPromptResult)null, false);
   }

   public final boolean onJsBeforeUnload(WebView var1, String var2, String var3, JsResult var4) {
      return method_1720(var1.getContext(), var2, var3, (String)null, var4, (JsPromptResult)null, false);
   }

   public final boolean onJsConfirm(WebView var1, String var2, String var3, JsResult var4) {
      return method_1720(var1.getContext(), var2, var3, (String)null, var4, (JsPromptResult)null, false);
   }

   public final boolean onJsPrompt(WebView var1, String var2, String var3, String var4, JsPromptResult var5) {
      return method_1720(var1.getContext(), var2, var3, var4, (JsResult)null, var5, true);
   }

   public final void onReachedMaxAppCacheSize(long var1, long var3, QuotaUpdater var5) {
      var1 += 131072L;
      if (5242880L - var3 < var1) {
         var5.updateQuota(0L);
      } else {
         var5.updateQuota(var1);
      }
   }

   public final void onShowCustomView(View var1, CustomViewCallback var2) {
      this.method_1721(var1, -1, var2);
   }
}
