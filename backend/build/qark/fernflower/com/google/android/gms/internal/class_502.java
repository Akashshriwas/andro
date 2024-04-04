package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

// $FF: renamed from: com.google.android.gms.internal.fd
final class class_502 implements OnClickListener {
   // $FF: renamed from: a android.webkit.JsResult
   // $FF: synthetic field
   final JsResult field_1539;

   class_502(JsResult var1) {
      this.field_1539 = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.field_1539.cancel();
   }
}
