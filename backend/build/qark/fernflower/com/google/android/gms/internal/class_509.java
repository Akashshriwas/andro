package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

// $FF: renamed from: com.google.android.gms.internal.fg
final class class_509 implements OnClickListener {
   // $FF: renamed from: a android.webkit.JsPromptResult
   // $FF: synthetic field
   final JsPromptResult field_1545;

   class_509(JsPromptResult var1) {
      this.field_1545 = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.field_1545.cancel();
   }
}
