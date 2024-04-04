package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

// $FF: renamed from: android.support.v4.view.ak
public class class_87 extends LayoutParams {
   // $FF: renamed from: a boolean
   public boolean field_60;
   // $FF: renamed from: b int
   public int field_61;
   // $FF: renamed from: c float
   public float field_62 = 0.0F;
   // $FF: renamed from: d boolean
   public boolean field_63;

   public class_87() {
      super(-1, -1);
   }

   public class_87(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, ViewPager.method_2179());
      this.field_61 = var3.getInteger(0, 48);
      var3.recycle();
   }
}
