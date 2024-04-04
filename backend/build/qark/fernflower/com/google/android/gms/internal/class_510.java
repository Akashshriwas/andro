package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

// $FF: renamed from: com.google.android.gms.internal.ff
final class class_510 implements OnCancelListener {
   // $FF: renamed from: a android.webkit.JsPromptResult
   // $FF: synthetic field
   final JsPromptResult field_1546;

   class_510(JsPromptResult var1) {
      this.field_1546 = var1;
   }

   public void onCancel(DialogInterface var1) {
      this.field_1546.cancel();
   }
}
