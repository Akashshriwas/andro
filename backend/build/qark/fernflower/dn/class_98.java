package dn;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// $FF: renamed from: dn.b
public class class_98 {
   // $FF: renamed from: a android.app.AlertDialog
   static AlertDialog field_109;
   // $FF: renamed from: b android.content.Context
   static Context field_110;

   // $FF: renamed from: a (android.content.Context, android.content.SharedPreferences.Editor) void
   public static void method_301(Context var0, Editor var1) {
      field_110 = var0;
      Builder var2 = new Builder(var0);
      LinearLayout var3 = (LinearLayout)LayoutInflater.from(var0).inflate(2130903072, (ViewGroup)null);
      ((LinearLayout)var3.findViewById(2131165251)).setOnClickListener(new class_96(var0, var1));
      ((LinearLayout)var3.findViewById(2131165253)).setOnClickListener(new class_94(var1));
      ((LinearLayout)var3.findViewById(2131165252)).setOnClickListener(new class_92());
      var2.setView(var3);
      field_109 = var2.create();
      field_109.show();
   }

   // $FF: renamed from: b (android.content.Context, android.content.SharedPreferences.Editor) void
   // $FF: synthetic method
   static void method_302(Context var0, Editor var1) {
      method_303(var0, var1);
   }

   // $FF: renamed from: c (android.content.Context, android.content.SharedPreferences.Editor) void
   private static void method_303(Context var0, Editor var1) {
      var0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(var0.getString(2131230794), var0.getPackageName()))));
      field_110 = var0;
      if (var1 != null) {
         var1.putBoolean("rateclicked", true);
         var1.commit();
      }

   }
}
