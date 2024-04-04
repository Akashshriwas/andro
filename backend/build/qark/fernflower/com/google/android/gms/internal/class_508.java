package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

// $FF: renamed from: com.google.android.gms.internal.fh
final class class_508 implements OnClickListener {
   // $FF: renamed from: a android.webkit.JsPromptResult
   // $FF: synthetic field
   final JsPromptResult field_1543;
   // $FF: renamed from: b android.widget.EditText
   // $FF: synthetic field
   final EditText field_1544;

   class_508(JsPromptResult var1, EditText var2) {
      this.field_1543 = var1;
      this.field_1544 = var2;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.field_1543.confirm(this.field_1544.getText().toString());
   }
}
