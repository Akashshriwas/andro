package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

// $FF: renamed from: com.google.android.gms.internal.fe
final class class_501 implements OnClickListener {
   // $FF: renamed from: a android.webkit.JsResult
   // $FF: synthetic field
   final JsResult field_1538;

   class_501(JsResult var1) {
      this.field_1538 = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.field_1538.confirm();
   }
}
