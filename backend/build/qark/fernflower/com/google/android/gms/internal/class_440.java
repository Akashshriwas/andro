package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.FrameLayout.LayoutParams;
import java.util.HashMap;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.ci
public final class class_440 extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {
   // $FF: renamed from: a com.google.android.gms.internal.ev
   private final class_473 field_1188;
   // $FF: renamed from: b android.widget.MediaController
   private final MediaController field_1189;
   // $FF: renamed from: c com.google.android.gms.internal.cj
   private final class_439 field_1190;
   // $FF: renamed from: d android.widget.VideoView
   private final VideoView field_1191;
   // $FF: renamed from: e long
   private long field_1192;
   // $FF: renamed from: f java.lang.String
   private String field_1193;

   public class_440(Context var1, class_473 var2) {
      super(var1);
      this.field_1188 = var2;
      this.field_1191 = new VideoView(var1);
      LayoutParams var3 = new LayoutParams(-1, -1, 17);
      this.addView(this.field_1191, var3);
      this.field_1189 = new MediaController(var1);
      this.field_1190 = new class_439(this);
      this.field_1190.method_1477();
      this.field_1191.setOnCompletionListener(this);
      this.field_1191.setOnPreparedListener(this);
      this.field_1191.setOnErrorListener(this);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.lang.String) void
   private static void method_1478(class_473 var0, String var1) {
      method_1481(var0, var1, new HashMap(1));
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.lang.String, java.lang.String) void
   public static void method_1479(class_473 var0, String var1, String var2) {
      boolean var3;
      if (var2 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      byte var4;
      if (var3) {
         var4 = 2;
      } else {
         var4 = 3;
      }

      HashMap var5 = new HashMap(var4);
      var5.put("what", var1);
      if (!var3) {
         var5.put("extra", var2);
      }

      method_1481(var0, "error", var5);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.lang.String, java.lang.String, java.lang.String) void
   private static void method_1480(class_473 var0, String var1, String var2, String var3) {
      HashMap var4 = new HashMap(2);
      var4.put(var2, var3);
      method_1481(var0, var1, var4);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.lang.String, java.util.Map) void
   private static void method_1481(class_473 var0, String var1, Map var2) {
      var2.put("event", var1);
      var0.method_1644("onVideoEvent", var2);
   }

   // $FF: renamed from: a () void
   public void method_1482() {
      this.field_1190.method_1476();
      this.field_1191.stopPlayback();
   }

   // $FF: renamed from: a (int) void
   public void method_1483(int var1) {
      this.field_1191.seekTo(var1);
   }

   // $FF: renamed from: a (android.view.MotionEvent) void
   public void method_1484(MotionEvent var1) {
      this.field_1191.dispatchTouchEvent(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1485(String var1) {
      this.field_1193 = var1;
   }

   // $FF: renamed from: a (boolean) void
   public void method_1486(boolean var1) {
      if (var1) {
         this.field_1191.setMediaController(this.field_1189);
      } else {
         this.field_1189.hide();
         this.field_1191.setMediaController((MediaController)null);
      }
   }

   // $FF: renamed from: b () void
   public void method_1487() {
      if (!TextUtils.isEmpty(this.field_1193)) {
         this.field_1191.setVideoPath(this.field_1193);
      } else {
         method_1479(this.field_1188, "no_src", (String)null);
      }
   }

   // $FF: renamed from: c () void
   public void method_1488() {
      this.field_1191.pause();
   }

   // $FF: renamed from: d () void
   public void method_1489() {
      this.field_1191.start();
   }

   // $FF: renamed from: e () void
   public void method_1490() {
      long var2 = (long)this.field_1191.getCurrentPosition();
      if (this.field_1192 != var2) {
         float var1 = (float)var2 / 1000.0F;
         method_1480(this.field_1188, "timeupdate", "time", String.valueOf(var1));
         this.field_1192 = var2;
      }

   }

   public void onCompletion(MediaPlayer var1) {
      method_1478(this.field_1188, "ended");
   }

   public boolean onError(MediaPlayer var1, int var2, int var3) {
      method_1479(this.field_1188, String.valueOf(var2), String.valueOf(var3));
      return true;
   }

   public void onPrepared(MediaPlayer var1) {
      float var2 = (float)this.field_1191.getDuration() / 1000.0F;
      method_1480(this.field_1188, "canplaythrough", "duration", String.valueOf(var2));
   }
}
