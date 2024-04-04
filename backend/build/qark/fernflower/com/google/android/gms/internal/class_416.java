package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.FrameLayout.LayoutParams;

// $FF: renamed from: com.google.android.gms.internal.cl
public final class class_416 extends FrameLayout implements OnClickListener {
   // $FF: renamed from: a android.app.Activity
   private final Activity field_1107;
   // $FF: renamed from: b android.widget.ImageButton
   private final ImageButton field_1108;

   public class_416(Activity var1, int var2) {
      super(var1);
      this.field_1107 = var1;
      this.setOnClickListener(this);
      this.field_1108 = new ImageButton(var1);
      this.field_1108.setImageResource(17301527);
      this.field_1108.setBackgroundColor(0);
      this.field_1108.setOnClickListener(this);
      this.field_1108.setPadding(0, 0, 0, 0);
      var2 = class_468.method_1611(var1, var2);
      this.addView(this.field_1108, new LayoutParams(var2, var2, 17));
   }

   // $FF: renamed from: a (boolean) void
   public void method_1435(boolean var1) {
      ImageButton var3 = this.field_1108;
      byte var2;
      if (var1) {
         var2 = 4;
      } else {
         var2 = 0;
      }

      var3.setVisibility(var2);
   }

   public void onClick(View var1) {
      this.field_1107.finish();
   }
}
