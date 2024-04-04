package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

// $FF: renamed from: com.google.android.gms.internal.eq
public final class class_469 {
   // $FF: renamed from: a (android.content.Context) java.lang.String
   public static String method_1619(Context var0) {
      return WebSettings.getDefaultUserAgent(var0);
   }

   // $FF: renamed from: a (android.content.Context, android.webkit.WebSettings) void
   public static void method_1620(Context var0, WebSettings var1) {
      class_463.method_1571(var0, var1);
      var1.setMediaPlaybackRequiresUserGesture(false);
   }
}
