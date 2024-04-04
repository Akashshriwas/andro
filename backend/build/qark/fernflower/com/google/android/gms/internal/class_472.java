package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

// $FF: renamed from: com.google.android.gms.internal.ew
class class_472 extends MutableContextWrapper {
   // $FF: renamed from: a android.app.Activity
   private Activity field_1294;
   // $FF: renamed from: b android.content.Context
   private Context field_1295;

   public class_472(Context var1) {
      super(var1);
      this.setBaseContext(var1);
   }

   public void setBaseContext(Context var1) {
      this.field_1295 = var1.getApplicationContext();
      Activity var2;
      if (var1 instanceof Activity) {
         var2 = (Activity)var1;
      } else {
         var2 = null;
      }

      this.field_1294 = var2;
      super.setBaseContext(this.field_1295);
   }

   public void startActivity(Intent var1) {
      if (this.field_1294 != null) {
         this.field_1294.startActivity(var1);
      } else {
         var1.setFlags(268435456);
         this.field_1295.startActivity(var1);
      }
   }
}
