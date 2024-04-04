package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import com.a.d.class_111;
import com.a.f.class_128;
import com.a.f.class_185;
import com.a.h.class_517;
import com.google.android.gms.ads.class_626;
import com.google.android.gms.ads.class_628;
import dn.class_100;
import dn.class_91;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: mm.pr
public class class_187 extends class_185 {
   // $FF: renamed from: A android.media.MediaPlayer.OnPreparedListener
   private OnPreparedListener field_616 = new class_164(this);
   // $FF: renamed from: B android.media.MediaPlayer.OnCompletionListener
   private OnCompletionListener field_617 = new class_167(this);
   // $FF: renamed from: C android.view.View.OnClickListener
   private OnClickListener field_618 = new class_166(this);
   // $FF: renamed from: p int
   int field_619;
   // $FF: renamed from: q java.lang.String
   String field_620;
   // $FF: renamed from: r android.widget.LinearLayout
   LinearLayout field_621;
   // $FF: renamed from: s android.widget.TextView
   TextView field_622;
   // $FF: renamed from: t android.media.MediaPlayer
   MediaPlayer field_623;
   // $FF: renamed from: u boolean
   boolean field_624;
   // $FF: renamed from: v android.content.BroadcastReceiver
   BroadcastReceiver field_625 = new class_168(this);
   // $FF: renamed from: w android.content.BroadcastReceiver
   BroadcastReceiver field_626 = new class_165(this);
   // $FF: renamed from: x int
   int field_627 = 0;
   // $FF: renamed from: y com.google.android.gms.ads.f
   private class_628 field_628;
   // $FF: renamed from: z android.media.MediaPlayer.OnErrorListener
   private OnErrorListener field_629 = new class_163(this);

   // $FF: renamed from: a (mm.pr) com.a.f.e
   // $FF: synthetic method
   static class_128 method_783(class_187 var0) {
      return var0.m;
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   private String method_784(byte[] var1) {
      try {
         this.method_789(this);
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

   // $FF: renamed from: a (java.lang.String) void
   private void method_785(String var1) {
      this.field_623.reset();
      this.field_623.setAudioStreamType(3);

      try {
         this.field_623.setDataSource(var1);
         this.field_623.setLooping(false);
         this.field_623.prepareAsync();
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

   // $FF: renamed from: b (mm.pr) void
   // $FF: synthetic method
   static void method_786(class_187 var0) {
      var0.method_788();
   }

   // $FF: renamed from: c (mm.pr) com.google.android.gms.ads.f
   // $FF: synthetic method
   static class_628 method_787(class_187 var0) {
      return var0.field_628;
   }

   // $FF: renamed from: m () void
   private void method_788() {
      if (this.field_623 != null && !this.field_623.isPlaying()) {
         this.field_624 = true;
         this.field_623.start();
      }

   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_789(Context param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.widget.AdapterView, android.view.View, int) void
   protected void method_756(AdapterView var1, View var2, int var3) {
      try {
         if (this.m != null) {
            ((class_133)this.m).method_390(var3);
            ((class_133)this.m).notifyDataSetChanged();
         }

         this.method_790((class_517)this.m.getItem(var3));
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   // $FF: renamed from: a (com.a.h.g) void
   public void method_790(class_517 var1) {
      if (this.field_623 != null) {
         this.field_623.reset();
         byte[] var3 = (new class_111()).method_352(var1.method_1754());
         Object var2 = null;
         String var4;
         if (var3 != null) {
            var4 = this.method_784(var3);
         } else if (class_100.method_314(var1.method_1759())) {
            var4 = class_100.method_309(var1.method_1759());
         } else if (class_100.method_312()) {
            var4 = class_100.method_318(var1.method_1759());
         } else {
            class_100.method_311(this, this.getString(2131230751));
            var4 = (String)var2;
         }

         if (var4 != null) {
            this.method_785(var4);
         }
      }

   }

   // $FF: renamed from: a (java.io.File) boolean
   public boolean method_791(File var1) {
      boolean var4 = false;
      boolean var3;
      if (var1 != null && var1.isDirectory()) {
         String[] var5 = var1.list();

         for(int var2 = 0; var2 < var5.length; ++var2) {
            var3 = var4;
            if (!this.method_791(new File(var1, var5[var2]))) {
               return var3;
            }
         }
      }

      var3 = var1.delete();
      return var3;
   }

   // $FF: renamed from: f () void
   public void method_758() {
      this.field_619 = this.getIntent().getExtras().getInt(class_91.field_84);
      this.field_620 = this.getIntent().getExtras().getString(class_91.field_83);
      this.field_622 = (TextView)this.findViewById(2131165211);
      this.field_622.setText(this.field_619 + ". " + this.field_620);
      this.field_621 = (LinearLayout)this.findViewById(2131165208);
      this.field_621.setOnClickListener(this.field_618);
      this.field_623 = new MediaPlayer();
      this.field_623.setOnCompletionListener(this.field_617);
      this.field_623.setOnPreparedListener(this.field_616);
      this.field_623.setOnErrorListener(this.field_629);
      this.method_792();
   }

   // $FF: renamed from: g () int
   public int method_759() {
      return 2130903047;
   }

   // $FF: renamed from: h () com.a.f.e
   public class_128 method_760() {
      return new class_133(this, this);
   }

   // $FF: renamed from: i () java.util.ArrayList
   public ArrayList method_761() {
      return (new class_111()).method_353(this.getIntent().getExtras().getInt(class_91.field_84));
   }

   // $FF: renamed from: j () java.lang.Class
   public Class method_762() {
      return null;
   }

   // $FF: renamed from: l () void
   void method_792() {
      try {
         this.field_628 = new class_628(this);
         this.field_628.setAdUnitId(class_91.field_91);
         this.field_628.setAdSize(class_626.field_2123);
         RelativeLayout var1 = (RelativeLayout)this.findViewById(2131165212);
         LayoutParams var2 = new LayoutParams(-1, -2);
         var1.addView(this.field_628, var2);
         this.field_628.setAdListener(new class_152(this, var1));
         this.registerReceiver(this.field_626, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
         this.registerReceiver(this.field_625, new IntentFilter("android.intent.action.HEADSET_PLUG"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void onBackPressed() {
      super.onBackPressed();
      this.overridePendingTransition(2130968579, 2130968580);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
   }

   protected void onDestroy() {
      if (this.field_623 != null) {
         this.field_623.release();
         this.field_623 = null;
      }

      if (this.field_626 != null && this.field_628 != null) {
         this.unregisterReceiver(this.field_626);
      }

      if (this.field_625 != null && this.field_628 != null) {
         this.unregisterReceiver(this.field_625);
      }

      super.onDestroy();
   }
}
