package com.a.b;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

// $FF: renamed from: com.a.b.b
public class class_297 {
   // $FF: renamed from: a android.content.Context
   Context field_820;
   // $FF: renamed from: b java.lang.String
   String field_821;
   // $FF: renamed from: c java.lang.String
   String field_822;
   // $FF: renamed from: d android.app.AlertDialog.Builder
   Builder field_823;
   // $FF: renamed from: e android.widget.Button
   public Button field_824;
   // $FF: renamed from: f android.view.View
   View field_825;
   // $FF: renamed from: g android.app.AlertDialog
   AlertDialog field_826;
   // $FF: renamed from: h android.view.View.OnClickListener
   private OnClickListener field_827 = new class_293(this);

   public class_297(Context var1, String var2, String var3) {
      this.field_820 = var1;
      this.field_821 = var2;
      this.field_822 = var3;
      this.field_823 = new Builder(var1);
      this.field_825 = View.inflate(var1, 2130903058, (ViewGroup)null);
      ((TextView)this.field_825.findViewById(2131165230)).setText(var2);
      this.field_824 = (Button)this.field_825.findViewById(2131165233);
      this.field_824.setOnClickListener(this.field_827);
      this.field_823.setView(this.field_825);
      this.field_826 = this.field_823.create();
      this.field_823.setInverseBackgroundForced(true);
   }

   // $FF: renamed from: a (com.a.b.b, java.lang.String) void
   // $FF: synthetic method
   static void method_1011(class_297 var0, String var1) {
      var0.method_1012(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_1012(String var1) {
      if (this.method_1014() != null) {
         var1 = "market://details?id=".concat(var1);
         this.method_1014().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(var1)));
      }

   }

   // $FF: renamed from: a () void
   public void method_1013() {
      this.field_826.show();
      ViewGroup var1 = (ViewGroup)this.field_825.getParent();
      var1.setPadding(0, 0, 0, 0);
      var1.setBackgroundDrawable(new ColorDrawable(0));
   }

   // $FF: renamed from: b () android.content.Context
   public Context method_1014() {
      return this.field_820;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1015() {
      return this.field_822;
   }
}
