package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

// $FF: renamed from: com.google.android.gms.internal.fc
final class class_503 implements OnCancelListener {
   // $FF: renamed from: a android.webkit.JsResult
   // $FF: synthetic field
   final JsResult field_1540;

   class_503(JsResult var1) {
      this.field_1540 = var1;
   }

   public void onCancel(DialogInterface var1) {
      this.field_1540.cancel();
   }
}
