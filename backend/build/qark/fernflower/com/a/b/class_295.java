package com.a.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;

// $FF: renamed from: com.a.b.d
public class class_295 {
   // $FF: renamed from: a android.content.Context
   Context field_811;
   // $FF: renamed from: b android.app.AlertDialog.Builder
   Builder field_812;
   // $FF: renamed from: c android.widget.Button
   public Button field_813;
   // $FF: renamed from: d android.view.View
   View field_814;
   // $FF: renamed from: e android.app.AlertDialog
   AlertDialog field_815;
   // $FF: renamed from: f android.widget.SeekBar
   private SeekBar field_816;
   // $FF: renamed from: g android.media.AudioManager
   private AudioManager field_817;
   // $FF: renamed from: h android.view.View.OnClickListener
   private OnClickListener field_818 = new class_299(this);

   public class_295(Context var1) {
      this.field_811 = var1;
      this.field_812 = new Builder(var1);
      this.field_814 = View.inflate(var1, 2130903068, (ViewGroup)null);
      this.field_813 = (Button)this.field_814.findViewById(2131165231);
      this.field_813.setOnClickListener(this.field_818);
      this.field_812.setView(this.field_814);
      this.field_815 = this.field_812.create();
      this.field_815.setCanceledOnTouchOutside(false);
      this.field_812.setInverseBackgroundForced(true);
      this.field_816 = (SeekBar)this.field_814.findViewById(2131165248);
      this.field_817 = (AudioManager)var1.getSystemService("audio");
      ((Activity)var1).setVolumeControlStream(3);
      this.method_1009();
   }

   // $FF: renamed from: a (com.a.b.d) android.media.AudioManager
   // $FF: synthetic method
   static AudioManager method_1008(class_295 var0) {
      return var0.field_817;
   }

   // $FF: renamed from: b () void
   private void method_1009() {
      try {
         this.field_816.setMax(this.field_817.getStreamMaxVolume(3));
         this.field_816.setProgress(this.field_817.getStreamVolume(3));
         this.field_816.setOnSeekBarChangeListener(new class_300(this));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: a () void
   public void method_1010() {
      this.field_815.show();
      ViewGroup var1 = (ViewGroup)this.field_814.getParent();
      var1.setPadding(0, 0, 0, 0);
      var1.setBackgroundDrawable(new ColorDrawable(0));
   }
}
