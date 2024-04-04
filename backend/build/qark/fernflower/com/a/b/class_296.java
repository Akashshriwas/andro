package com.a.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// $FF: renamed from: com.a.b.a
public class class_296 extends ProgressDialog {
   // $FF: renamed from: a android.content.Context
   Context field_819;

   public class_296(Context var1) {
      super(var1);
      this.field_819 = var1;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);

      try {
         TextView var3 = (TextView)this.findViewById(16908299);
         var3.setTextColor(2131099659);
         ViewGroup var4 = (ViewGroup)((View)var3.getParent()).getParent().getParent().getParent();
         var4.setPadding(((Activity)this.field_819).getWindowManager().getDefaultDisplay().getWidth() / 3, 0, 0, 0);
         var4.setBackgroundDrawable(new ColorDrawable(0));
      } catch (Exception var2) {
         Log.w("HKLoadDialog", var2.toString());
      }
   }
}
