package com.a.h;

import android.content.Context;
import android.support.v4.app.class_181;

// $FF: renamed from: com.a.h.c
class class_515 implements Runnable {
   // $FF: renamed from: a android.content.Context
   // $FF: synthetic field
   private final Context field_1574;

   class_515(Context var1) {
      this.field_1574 = var1;
   }

   public void run() {
      if (class_577.method_1881()) {
         ((class_181)this.field_1574).runOnUiThread(new class_516(this, this.field_1574));
      }

   }
}
