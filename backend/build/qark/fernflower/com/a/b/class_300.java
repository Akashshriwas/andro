package com.a.b;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

// $FF: renamed from: com.a.b.f
class class_300 implements OnSeekBarChangeListener {
   // $FF: renamed from: a com.a.b.d
   // $FF: synthetic field
   final class_295 field_845;

   class_300(class_295 var1) {
      this.field_845 = var1;
   }

   public void onProgressChanged(SeekBar var1, int var2, boolean var3) {
      class_295.method_1008(this.field_845).setStreamVolume(3, var2, 0);
   }

   public void onStartTrackingTouch(SeekBar var1) {
   }

   public void onStopTrackingTouch(SeekBar var1) {
   }
}
