package mm;

import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import com.a.d.class_111;
import com.a.f.class_128;
import com.a.f.class_185;
import com.google.android.gms.ads.class_626;
import com.google.android.gms.ads.class_628;
import dn.class_100;
import dn.class_91;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: mm.rc
public class class_186 extends class_185 {
   // $FF: renamed from: z java.lang.String
   static String field_590 = null;
   // $FF: renamed from: A android.media.MediaRecorder
   MediaRecorder field_591 = null;
   // $FF: renamed from: B boolean
   boolean field_592;
   // $FF: renamed from: C android.os.Handler
   Handler field_593;
   // $FF: renamed from: D android.content.BroadcastReceiver
   BroadcastReceiver field_594 = new class_170(this);
   // $FF: renamed from: E android.content.BroadcastReceiver
   BroadcastReceiver field_595 = new class_206(this);
   // $FF: renamed from: F java.lang.Thread
   Thread field_596;
   // $FF: renamed from: G int
   int field_597 = 0;
   // $FF: renamed from: H com.google.android.gms.ads.f
   private class_628 field_598;
   // $FF: renamed from: I android.view.View.OnClickListener
   private OnClickListener field_599 = new class_203(this);
   // $FF: renamed from: J android.view.View.OnClickListener
   private OnClickListener field_600 = new class_204(this);
   // $FF: renamed from: K android.media.MediaPlayer.OnErrorListener
   private OnErrorListener field_601 = new class_209(this);
   // $FF: renamed from: L android.media.MediaPlayer.OnPreparedListener
   private OnPreparedListener field_602 = new class_210(this);
   // $FF: renamed from: M android.media.MediaPlayer.OnCompletionListener
   private OnCompletionListener field_603 = new class_208(this);
   // $FF: renamed from: N android.telephony.TelephonyManager
   private TelephonyManager field_604;
   // $FF: renamed from: O mm.bb
   private class_212 field_605;
   // $FF: renamed from: p int
   int field_606;
   // $FF: renamed from: q java.lang.String
   String field_607;
   // $FF: renamed from: r android.widget.LinearLayout
   LinearLayout field_608;
   // $FF: renamed from: s android.widget.TextView
   TextView field_609;
   // $FF: renamed from: t android.widget.Button
   Button field_610;
   // $FF: renamed from: u android.widget.Button
   Button field_611;
   // $FF: renamed from: v android.widget.Button
   Button field_612;
   // $FF: renamed from: w android.widget.Button
   Button field_613;
   // $FF: renamed from: x android.widget.TextView
   TextView field_614;
   // $FF: renamed from: y android.media.MediaPlayer
   MediaPlayer field_615;

   // $FF: renamed from: a (mm.rc) com.google.android.gms.ads.f
   // $FF: synthetic method
   static class_628 method_764(class_186 var0) {
      return var0.field_598;
   }

   // $FF: renamed from: a (long) java.lang.String
   private String method_765(long var1) {
      StringBuffer var5 = new StringBuffer();
      int var3 = (int)(var1 % 3600000L / 60000L);
      int var4 = (int)(var1 % 3600000L % 60000L / 1000L);
      var5.append(String.format("%02d", var3)).append(":").append(String.format("%02d", var4));
      return var5.toString();
   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_766(String var1) {
      this.field_615.reset();
      this.field_615.setAudioStreamType(3);

      try {
         this.field_615.setDataSource(var1);
         this.field_615.prepareAsync();
      } catch (IllegalArgumentException var2) {
         var2.printStackTrace();
      } catch (SecurityException var3) {
         var3.printStackTrace();
      } catch (IllegalStateException var4) {
         var4.printStackTrace();
      } catch (IOException var5) {
         var5.printStackTrace();
         Log.w("loadDataStream", var5.toString());
      }
   }

   // $FF: renamed from: a (mm.rc, long) void
   // $FF: synthetic method
   static void method_767(class_186 var0, long var1) {
      var0.method_769(var1);
   }

   // $FF: renamed from: b (mm.rc) com.a.f.e
   // $FF: synthetic method
   static class_128 method_768(class_186 var0) {
      return var0.m;
   }

   // $FF: renamed from: b (long) void
   private void method_769(long var1) {
      if (this.field_591 != null) {
         this.field_614.setText(this.method_765(var1));
         class_205 var3 = new class_205(this, var1);
         this.field_593.postDelayed(var3, 1000L);
      }

   }

   // $FF: renamed from: c (mm.rc) void
   // $FF: synthetic method
   static void method_770(class_186 var0) {
      var0.method_774();
   }

   // $FF: renamed from: t () boolean
   private boolean method_771() {
      return this.getPackageManager().hasSystemFeature("android.hardware.microphone");
   }

   // $FF: renamed from: u () void
   private void method_772() {
      class_100.method_315();
      field_590 = class_100.method_321(this.field_606);
      this.field_591 = new MediaRecorder();
      this.field_591.setAudioSource(1);
      this.field_591.setOutputFormat(1);
      this.field_591.setOutputFile(field_590);
      this.field_591.setAudioEncoder(1);

      try {
         this.field_591.prepare();
         this.field_591.start();
         this.field_611.setVisibility(0);
         this.field_610.setVisibility(8);
         this.field_612.setVisibility(8);
         this.field_613.setVisibility(8);
         this.method_769(1000L);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: v () void
   private void method_773() {
      this.field_591.stop();
      this.field_591.release();
      this.field_591 = null;
      this.field_611.setVisibility(8);
      this.field_610.setVisibility(0);
      this.field_612.setVisibility(0);
      this.field_613.setVisibility(0);
      this.field_614.setText("");
      if (this.field_593 != null) {
         this.field_593.removeCallbacksAndMessages((Object)null);
      }

   }

   // $FF: renamed from: w () void
   private void method_774() {
      if (this.field_615 != null && !this.field_615.isPlaying()) {
         this.field_615.start();
      }

   }

   // $FF: renamed from: f () void
   public void method_758() {
      this.field_593 = new Handler();
      this.field_606 = this.getIntent().getExtras().getInt(class_91.field_84);
      this.field_607 = this.getIntent().getExtras().getString(class_91.field_83);
      this.field_609 = (TextView)this.findViewById(2131165211);
      this.field_609.setText(this.field_606 + ". " + this.field_607);
      this.field_608 = (LinearLayout)this.findViewById(2131165208);
      this.field_608.setOnClickListener(this.field_600);
      this.field_614 = (TextView)this.findViewById(2131165241);
      this.field_612 = (Button)this.findViewById(2131165223);
      this.field_611 = (Button)this.findViewById(2131165244);
      this.field_610 = (Button)this.findViewById(2131165243);
      this.field_613 = (Button)this.findViewById(2131165242);
      this.field_612.setOnClickListener(this.field_599);
      this.field_611.setOnClickListener(this.field_599);
      this.field_610.setOnClickListener(this.field_599);
      this.field_613.setOnClickListener(this.field_599);
      this.field_615 = new MediaPlayer();
      this.field_615.setOnCompletionListener(this.field_603);
      this.field_615.setOnPreparedListener(this.field_602);
      this.field_615.setOnErrorListener(this.field_601);
      this.method_776();
      this.method_781();
      this.method_775();
   }

   // $FF: renamed from: g () int
   public int method_759() {
      return 2130903063;
   }

   // $FF: renamed from: h () com.a.f.e
   public class_128 method_760() {
      return new class_129(this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_761() {
      return (new class_111()).method_355(this.getIntent().getExtras().getInt(class_91.field_84));
   }

   // $FF: renamed from: j () java.lang.Class
   public Class method_762() {
      return null;
   }

   // $FF: renamed from: l () void
   void method_775() {
      try {
         this.field_598 = new class_628(this);
         this.field_598.setAdUnitId(class_91.field_91);
         this.field_598.setAdSize(class_626.field_2123);
         RelativeLayout var1 = (RelativeLayout)this.findViewById(2131165212);
         LayoutParams var2 = new LayoutParams(-1, -2);
         var1.addView(this.field_598, var2);
         this.field_598.setAdListener(new class_151(this, var1));
         this.registerReceiver(this.field_595, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
         this.registerReceiver(this.field_594, new IntentFilter("android.intent.action.HEADSET_PLUG"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   // $FF: renamed from: m () void
   void method_776() {
      if (class_100.method_317(this.field_606)) {
         this.field_611.setVisibility(8);
         this.field_610.setVisibility(0);
         this.field_612.setVisibility(0);
         this.field_613.setVisibility(0);
      }

   }

   // $FF: renamed from: n () void
   void method_777() {
      Builder var1 = new Builder(this);
      var1.setMessage(this.getString(2131230806));
      var1.setTitle(this.getString(2131230774));
      var1.setPositiveButton(this.getString(2131230763), new class_211(this));
      var1.setNegativeButton(this.getString(2131230764), new class_171(this));
      var1.create().show();
   }

   // $FF: renamed from: o () void
   void method_778() {
      this.method_773();
   }

   public void onBackPressed() {
      super.onBackPressed();
      this.overridePendingTransition(2130968579, 2130968580);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
   }

   protected void onDestroy() {
      if (this.field_591 != null) {
         this.field_591.release();
         this.field_591 = null;
      }

      if (this.field_615 != null) {
         this.field_615.release();
         this.field_615 = null;
      }

      if (this.field_595 != null && this.field_598 != null) {
         this.unregisterReceiver(this.field_595);
      }

      if (this.field_594 != null && this.field_598 != null) {
         this.unregisterReceiver(this.field_594);
      }

      this.method_782();
      super.onDestroy();
   }

   // $FF: renamed from: p () void
   void method_779() {
      if (this.field_615.isPlaying()) {
         this.field_612.setBackgroundResource(2130837595);
         this.field_615.pause();
      } else {
         this.field_612.setBackgroundResource(2130837594);
         if (this.field_592) {
            this.field_615.start();
         } else {
            this.method_766(class_100.method_321(this.field_606));
         }
      }
   }

   // $FF: renamed from: q () void
   void method_780() {
      if (this.method_771()) {
         this.method_772();
      }

   }

   // $FF: renamed from: r () void
   public void method_781() {
      this.field_605 = new class_212(this, (class_212)null);
      this.field_604 = (TelephonyManager)this.getSystemService("phone");
      this.field_604.listen(this.field_605, 32);
   }

   // $FF: renamed from: s () void
   public void method_782() {
      if (this.field_604 != null) {
         this.field_604.listen(this.field_605, 0);
      }

   }
}
