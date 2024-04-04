package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.class_612;
import android.support.v4.app.class_616;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import com.a.a.class_284;
import com.a.b.class_295;
import com.a.d.class_111;
import com.a.h.class_513;
import com.a.h.class_577;
import com.google.android.gms.ads.class_626;
import com.google.android.gms.ads.class_628;
import dn.class_100;
import dn.class_91;
import dn.class_98;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// $FF: renamed from: mm.m
public class class_184 extends class_183 {
   // $FF: renamed from: A boolean
   boolean field_559;
   // $FF: renamed from: B boolean
   boolean field_560;
   // $FF: renamed from: C android.media.MediaPlayer
   public MediaPlayer field_561;
   // $FF: renamed from: D android.widget.ProgressBar
   ProgressBar field_562;
   // $FF: renamed from: E android.widget.ImageButton
   ImageButton field_563;
   // $FF: renamed from: F java.lang.Thread
   Thread field_564;
   // $FF: renamed from: G android.content.BroadcastReceiver
   BroadcastReceiver field_565 = new class_172(this);
   // $FF: renamed from: H android.content.BroadcastReceiver
   BroadcastReceiver field_566 = new class_157(this);
   // $FF: renamed from: I int
   int field_567 = 0;
   // $FF: renamed from: J com.google.android.gms.ads.f
   private class_628 field_568;
   // $FF: renamed from: K android.view.View.OnClickListener
   private OnClickListener field_569 = new class_657(this);
   // $FF: renamed from: L android.media.MediaPlayer.OnErrorListener
   private OnErrorListener field_570 = new class_656(this);
   // $FF: renamed from: M android.media.MediaPlayer.OnPreparedListener
   private OnPreparedListener field_571 = new class_665(this);
   // $FF: renamed from: N android.media.MediaPlayer.OnCompletionListener
   private OnCompletionListener field_572 = new class_660(this);
   // $FF: renamed from: O android.telephony.TelephonyManager
   private TelephonyManager field_573;
   // $FF: renamed from: P mm.ae
   private class_154 field_574;
   // $FF: renamed from: q android.os.Handler
   Handler field_575;
   // $FF: renamed from: r android.widget.LinearLayout
   LinearLayout field_576;
   // $FF: renamed from: s android.widget.LinearLayout
   LinearLayout field_577;
   // $FF: renamed from: t android.widget.LinearLayout
   LinearLayout field_578;
   // $FF: renamed from: u android.widget.ImageView
   ImageView field_579;
   // $FF: renamed from: v android.widget.TextView
   TextView field_580;
   // $FF: renamed from: w android.widget.Button
   Button field_581;
   // $FF: renamed from: x android.widget.Button
   Button field_582;
   // $FF: renamed from: y android.widget.Button
   Button field_583;
   // $FF: renamed from: z com.a.h.e
   class_513 field_584;

   // $FF: renamed from: A () void
   private void method_719() {
      if (this.field_561 != null) {
         Fragment var1 = this.e().method_1946(2131165217);
         if (var1 instanceof class_147) {
            ((class_147)var1).method_648(this.field_561.getCurrentPosition());
         }

         if (this.field_561.isPlaying()) {
            class_159 var2 = new class_159(this);
            this.field_575.postDelayed(var2, 500L);
         }
      }

   }

   // $FF: renamed from: B () void
   private void method_720() {
      Exception var10000;
      label135: {
         boolean var2;
         boolean var10001;
         Editor var19;
         SharedPreferences var20;
         try {
            var20 = this.getSharedPreferences("apprater", 0);
            var19 = var20.edit();
            var2 = this.getResources().getBoolean(2131492864);
         } catch (Exception var34) {
            var10000 = var34;
            var10001 = false;
            break label135;
         }

         if (!var2) {
            try {
               if (var20.getBoolean("dontshow", false)) {
                  return;
               }

               if (var20.getBoolean("rateclicked", false)) {
                  return;
               }
            } catch (Exception var33) {
               var10000 = var33;
               var10001 = false;
               break label135;
            }
         }

         if (var2) {
            try {
               class_98.method_301(this, var19);
               return;
            } catch (Exception var25) {
               var10000 = var25;
               var10001 = false;
            }
         } else {
            label136: {
               long var11;
               long var13;
               long var15;
               long var17;
               try {
                  var11 = var20.getLong("launch_count", 0L);
                  var13 = var20.getLong("event_count", 0L);
                  var15 = var20.getLong("date_firstlaunch", 0L);
                  var17 = var20.getLong("date_reminder_pressed", 0L);
               } catch (Exception var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label136;
               }

               long var3 = var13;
               long var5 = var11;

               long var7;
               long var9;
               label90: {
                  label89: {
                     label137: {
                        int var1;
                        try {
                           var1 = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionCode;
                        } catch (Exception var24) {
                           var10001 = false;
                           break label137;
                        }

                        var7 = var13;
                        var9 = var11;
                        var3 = var13;
                        var5 = var11;

                        label138: {
                           try {
                              if (var20.getInt("versioncode", 0) == var1) {
                                 break label138;
                              }
                           } catch (Exception var23) {
                              var10001 = false;
                              break label137;
                           }

                           var9 = 0L;
                           var7 = 0L;
                           var3 = var7;
                           var5 = var9;

                           try {
                              var19.putLong("event_count", 0L);
                           } catch (Exception var22) {
                              var10001 = false;
                              break label137;
                           }
                        }

                        var3 = var7;
                        var5 = var9;

                        try {
                           var19.putInt("versioncode", var1);
                           break label89;
                        } catch (Exception var21) {
                           var10001 = false;
                        }
                     }

                     var9 = var5;
                     break label90;
                  }

                  var3 = var7;
               }

               var7 = 1L + var9;

               try {
                  var19.putLong("launch_count", var7);
               } catch (Exception var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label136;
               }

               if (var15 == 0L) {
                  try {
                     var5 = System.currentTimeMillis();
                     var19.putLong("date_firstlaunch", var5);
                  } catch (Exception var30) {
                     var10000 = var30;
                     var10001 = false;
                     break label136;
                  }
               } else {
                  var5 = var15;
               }

               label113: {
                  try {
                     if (var7 < (long)this.getResources().getInteger(2131296259)) {
                        break label113;
                     }

                     var7 = (long)(this.getResources().getInteger(2131296258) * 24 * 60 * 60);
                     if (System.currentTimeMillis() < var5 + var7 * 1000L && var3 < (long)this.getResources().getInteger(2131296260)) {
                        break label113;
                     }
                  } catch (Exception var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label136;
                  }

                  if (var17 == 0L) {
                     try {
                        class_98.method_301(this, var19);
                     } catch (Exception var27) {
                        var10000 = var27;
                        var10001 = false;
                        break label136;
                     }
                  } else {
                     try {
                        var3 = (long)(this.getResources().getInteger(2131296261) * 24 * 60 * 60);
                        if (System.currentTimeMillis() >= var3 * 1000L + var17) {
                           class_98.method_301(this, var19);
                        }
                     } catch (Exception var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label136;
                     }
                  }
               }

               try {
                  var19.commit();
                  return;
               } catch (Exception var26) {
                  var10000 = var26;
                  var10001 = false;
               }
            }
         }
      }

      Exception var35 = var10000;
      var35.printStackTrace();
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   private String method_721(byte[] var1) {
      try {
         this.method_740(this);
         File var2 = File.createTempFile("test", "mp3", this.getCacheDir());
         var2.deleteOnExit();
         FileOutputStream var3 = new FileOutputStream(var2);
         var3.write(var1);
         var3.close();
         String var5 = var2.getPath();
         return var5;
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   // $FF: renamed from: a (mm.m) void
   // $FF: synthetic method
   static void method_722(class_184 var0) {
      var0.method_737();
   }

   // $FF: renamed from: b (android.support.v4.app.Fragment) void
   private void method_723(Fragment var1) {
      class_616 var2 = this.e().method_1947();
      var2.method_2011(2131165217, var1);
      var2.method_2006();
   }

   // $FF: renamed from: b (java.lang.Boolean) void
   private void method_724(Boolean var1) {
      this.field_575.removeCallbacksAndMessages((Object)null);
      Fragment var2 = this.e().method_1946(2131165217);
      class_513 var3 = (new class_111()).method_349(this.method_750(), var1);
      if (var2 != null && var3 != null) {
         this.method_742(var3);
         this.method_748(var3);
         if (!(var2 instanceof class_146) && var2 instanceof class_147) {
            this.a(var3.method_1736() + ". " + var3.method_1732());
            ((class_147)var2).method_647(var3);
            ((class_147)var2).v();
         }

         this.method_745(this.method_750());
      }

   }

   // $FF: renamed from: b (mm.m) void
   // $FF: synthetic method
   static void method_725(class_184 var0) {
      var0.method_738();
   }

   // $FF: renamed from: c (java.lang.String) void
   private void method_726(String var1) {
      this.field_561.reset();
      this.field_561.setAudioStreamType(3);

      try {
         this.field_561.setDataSource(var1);
         this.field_561.setLooping(false);
         this.field_561.prepareAsync();
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

   // $FF: renamed from: c (mm.m) void
   // $FF: synthetic method
   static void method_727(class_184 var0) {
      var0.method_739();
   }

   // $FF: renamed from: d (mm.m) void
   // $FF: synthetic method
   static void method_728(class_184 var0) {
      var0.method_734();
   }

   // $FF: renamed from: e (mm.m) void
   // $FF: synthetic method
   static void method_729(class_184 var0) {
      var0.method_733();
   }

   // $FF: renamed from: f (mm.m) void
   // $FF: synthetic method
   static void method_730(class_184 var0) {
      var0.method_736();
   }

   // $FF: renamed from: g (mm.m) void
   // $FF: synthetic method
   static void method_731(class_184 var0) {
      var0.method_719();
   }

   // $FF: renamed from: h (mm.m) com.google.android.gms.ads.f
   // $FF: synthetic method
   static class_628 method_732(class_184 var0) {
      return var0.field_568;
   }

   // $FF: renamed from: t () void
   private void method_733() {
      Fragment var1 = this.e().method_1946(2131165217);
      if (var1 != null) {
         if (var1 instanceof class_147) {
            if (this.field_561.isPlaying()) {
               this.field_561.pause();
               this.field_581.setBackgroundResource(2130837586);
            }

            Intent var2 = new Intent(this, rc.class);
            var2.putExtra(class_91.field_84, this.method_750().method_1736());
            var2.putExtra(class_91.field_83, this.method_750().method_1732());
            this.startActivity(var2);
            this.overridePendingTransition(2130968576, 2130968577);
         } else if (var1 instanceof class_146) {
            (new class_295(this)).method_1010();
            return;
         }
      }

   }

   // $FF: renamed from: u () void
   private void method_734() {
      boolean var1 = false;
      boolean var2 = class_91.method_281().method_285("RepeatPlayAll", false);
      if (var2) {
         this.field_563.setBackgroundResource(2130837585);
      } else {
         this.field_563.setBackgroundResource(2130837600);
      }

      if (!var2) {
         var1 = true;
      }

      class_91.method_281().method_287("RepeatPlayAll", var1);
   }

   // $FF: renamed from: v () void
   private void method_735() {
      boolean var1 = class_91.method_281().method_285("RepeatPlayAll", false);
      this.field_560 = var1;
      if (var1) {
         this.field_563.setBackgroundResource(2130837600);
      } else {
         this.field_563.setBackgroundResource(2130837585);
      }
   }

   // $FF: renamed from: w () void
   private void method_736() {
      if (this.field_561 != null && !this.field_561.isPlaying()) {
         this.field_559 = true;
         this.field_561.start();
      }

   }

   // $FF: renamed from: x () void
   private void method_737() {
      this.field_560 = true;
      this.method_724(true);
   }

   // $FF: renamed from: y () void
   private void method_738() {
      this.field_560 = true;
      this.method_724(false);
   }

   // $FF: renamed from: z () void
   private void method_739() {
      if (this.method_750() != null) {
         this.method_749(true);
         if (this.e().method_1946(2131165217) instanceof class_146) {
            class_147 var1 = new class_147();
            this.l();
            this.a(this.method_750().method_1736() + ". " + this.method_750().method_1732());
            var1.method_647(this.method_750());
            this.method_741(var1, true);
         }
      }

   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_740(Context param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, java.lang.Boolean) void
   public void method_741(Fragment var1, Boolean var2) {
      class_612 var4 = this.e();
      class_616 var3 = var4.method_1947();
      var3.method_2007(2130968576, 2130968577, 2130968579, 2130968580);
      var3.method_2009(var4.method_1946(2131165217));
      var3.method_2008(2131165217, var1);
      var3.method_2010((String)null);
      var3.method_2006();
   }

   // $FF: renamed from: a (com.a.a.a, android.view.View) void
   public void method_201(class_284 var1, View var2) {
      super.method_201(var1, var2);
      if (var1 != null && var1.method_981() <= 3) {
         this.k();
         this.method_749(false);
         class_612 var3 = this.e();
         Fragment var5 = var3.method_1946(2131165217);
         if (var5 != null && var5 instanceof class_147) {
            var3.method_1949();
         }

         if (this.field_561 != null) {
            this.field_561.reset();
            this.field_581.setBackgroundResource(2130837586);
         }

         this.method_743(false);
         Fragment var4 = var3.method_1946(2131165217);
         if (var4 instanceof class_146) {
            ((class_146)var4).v();
         }
      }

   }

   // $FF: renamed from: a (com.a.h.e) void
   public void method_742(class_513 var1) {
      this.field_584 = var1;
   }

   // $FF: renamed from: a (java.lang.Boolean) void
   public void method_743(Boolean var1) {
      if (!var1) {
         this.field_576.setVisibility(8);
      } else {
         this.field_576.setVisibility(0);
      }
   }

   // $FF: renamed from: a (java.io.File) boolean
   public boolean method_744(File var1) {
      boolean var4 = false;
      boolean var3;
      if (var1 != null && var1.isDirectory()) {
         String[] var5 = var1.list();

         for(int var2 = 0; var2 < var5.length; ++var2) {
            var3 = var4;
            if (!this.method_744(new File(var1, var5[var2]))) {
               return var3;
            }
         }
      }

      var3 = var1.delete();
      return var3;
   }

   // $FF: renamed from: b (com.a.h.e) void
   public void method_745(class_513 var1) {
      if (var1 != null && this.field_561 != null) {
         if (this.field_561.isPlaying()) {
            this.field_561.reset();
            this.field_559 = false;
            this.method_751();
         } else {
            this.field_561.reset();
            this.field_559 = false;
            if (this.field_560) {
               this.method_751();
               return;
            }
         }
      }

   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_746(String var1) {
      if (this.field_561 != null && this.field_561.isPlaying()) {
         String[] var4 = var1.split(":");
         int var2 = Integer.parseInt(var4[1].substring(0, 2));
         int var3 = Integer.parseInt(var4[1].substring(3, 5));
         this.field_561.seekTo(var3 + var2 * 1000);
      }

   }

   // $FF: renamed from: b (boolean) void
   public void method_747(boolean var1) {
      this.field_560 = var1;
   }

   // $FF: renamed from: c (com.a.h.e) void
   public void method_748(class_513 var1) {
      if (var1 != null && this.field_580 != null) {
         this.field_580.setText(var1.method_1736() + ". " + var1.method_1732());
      }

   }

   // $FF: renamed from: c (boolean) void
   public void method_749(boolean var1) {
      if (var1) {
         this.field_579.setImageResource(2130837560);
      } else {
         this.field_579.setImageResource(2130837552);
      }
   }

   // $FF: renamed from: i () void
   public void method_713() {
      this.field_575 = new Handler();
      this.field_576 = (LinearLayout)this.findViewById(2131165218);
      this.field_578 = (LinearLayout)this.findViewById(2131165215);
      this.field_579 = (ImageView)this.findViewById(2131165216);
      this.field_577 = (LinearLayout)this.findViewById(2131165219);
      this.field_580 = (TextView)this.findViewById(2131165220);
      this.field_582 = (Button)this.findViewById(2131165224);
      this.field_581 = (Button)this.findViewById(2131165223);
      this.field_583 = (Button)this.findViewById(2131165222);
      this.field_563 = (ImageButton)this.findViewById(2131165225);
      this.field_582.setOnClickListener(this.field_569);
      this.field_581.setOnClickListener(this.field_569);
      this.field_583.setOnClickListener(this.field_569);
      this.field_563.setOnClickListener(this.field_569);
      this.field_577.setOnClickListener(this.field_569);
      this.field_578.setOnClickListener(this.field_569);
      this.field_562 = (ProgressBar)this.findViewById(2131165221);
      this.method_743(false);
      this.field_559 = false;
      this.field_561 = new MediaPlayer();
      this.field_561.setOnCompletionListener(this.field_572);
      this.field_561.setOnPreparedListener(this.field_571);
      this.field_561.setOnErrorListener(this.field_570);
      this.method_735();
      this.method_749(false);
      this.method_753();
      this.method_752();
   }

   // $FF: renamed from: j () int
   public int method_714() {
      return 2130903049;
   }

   // $FF: renamed from: n () void
   public void method_718() {
      class_612 var1 = this.e();
      Fragment var2 = var1.method_1946(2131165217);
      if (var2 != null && var2 instanceof class_147) {
         var1.method_1948();
         this.k();
         this.method_749(false);
         this.a(this.p.method_284(class_91.field_83));
      } else {
         super.method_718();
      }
   }

   // $FF: renamed from: o () com.a.h.e
   public class_513 method_750() {
      return this.field_584;
   }

   public void onBackPressed() {
      Fragment var1 = this.e().method_1946(2131165217);
      if (var1 != null && var1 instanceof class_147) {
         this.k();
         this.m();
         this.method_749(false);
         super.onBackPressed();
      } else {
         class_100.method_310(this);
      }
   }

   public void onCreate(Bundle var1) {
      super.onCreate((Bundle)null);
      this.method_723(new class_146());
      class_577.method_1880(this);
   }

   protected void onDestroy() {
      if (this.field_561 != null) {
         this.field_561.release();
         this.field_561 = null;
      }

      if (this.field_566 != null && this.field_568 != null) {
         this.unregisterReceiver(this.field_566);
      }

      if (this.field_565 != null && this.field_568 != null) {
         this.unregisterReceiver(this.field_565);
      }

      this.method_754();
      super.onDestroy();
   }

   protected void onRestoreInstanceState(Bundle var1) {
      var1.getInt("maxItem");
      super.onRestoreInstanceState(var1);
   }

   protected void onResume() {
      try {
         super.onResume();
         if (class_100.method_312()) {
            this.method_720();
         }

      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: p () void
   public void method_751() {
      if (this.field_561.isPlaying()) {
         this.field_561.pause();
         this.field_581.setBackgroundResource(2130837586);
      } else {
         this.field_581.setBackgroundResource(2130837581);
         if (this.field_559) {
            this.method_736();
            this.method_719();
            return;
         }

         byte[] var2 = (new class_111()).method_351(this.method_750().method_1729());
         String var1 = null;
         if (var2 != null) {
            var1 = this.method_721(var2);
         } else if (class_100.method_313(this.method_750().method_1729())) {
            var1 = class_100.method_308(this.method_750().method_1729());
         } else if (class_100.method_312()) {
            this.field_562.setVisibility(0);
            var1 = class_100.method_322(this.method_750().method_1729());
         } else {
            this.field_581.setBackgroundResource(2130837586);
            class_100.method_311(this, this.getString(2131230751));
         }

         if (var1 != null) {
            this.method_726(var1);
            return;
         }
      }

   }

   // $FF: renamed from: q () void
   void method_752() {
      try {
         this.field_568 = new class_628(this);
         this.field_568.setAdUnitId(class_91.field_90);
         this.field_568.setAdSize(class_626.field_2123);
         RelativeLayout var1 = (RelativeLayout)this.findViewById(2131165212);
         LayoutParams var2 = new LayoutParams(-1, -2);
         var1.addView(this.field_568, var2);
         this.field_568.setAdListener(new class_153(this, var1));
         this.registerReceiver(this.field_566, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
         this.registerReceiver(this.field_565, new IntentFilter("android.intent.action.HEADSET_PLUG"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   // $FF: renamed from: r () void
   public void method_753() {
      this.field_574 = new class_154(this, (class_154)null);
      this.field_573 = (TelephonyManager)this.getSystemService("phone");
      this.field_573.listen(this.field_574, 32);
   }

   // $FF: renamed from: s () void
   public void method_754() {
      if (this.field_573 != null) {
         this.field_573.listen(this.field_574, 0);
      }

   }
}
