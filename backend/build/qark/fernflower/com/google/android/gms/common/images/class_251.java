package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.class_338;
import com.google.android.gms.internal.class_490;
import com.google.android.gms.internal.class_495;
import com.google.android.gms.internal.class_511;
import java.lang.ref.WeakReference;

// $FF: renamed from: com.google.android.gms.common.images.e
public final class class_251 {
   // $FF: renamed from: a com.google.android.gms.common.images.f
   final class_249 field_733;
   // $FF: renamed from: b int
   int field_734;
   // $FF: renamed from: c int
   private int field_735;
   // $FF: renamed from: d int
   private int field_736;
   // $FF: renamed from: e java.lang.ref.WeakReference
   private WeakReference field_737;
   // $FF: renamed from: f java.lang.ref.WeakReference
   private WeakReference field_738;
   // $FF: renamed from: g java.lang.ref.WeakReference
   private WeakReference field_739;
   // $FF: renamed from: h int
   private int field_740;
   // $FF: renamed from: i boolean
   private boolean field_741;
   // $FF: renamed from: j boolean
   private boolean field_742;

   // $FF: renamed from: a (android.graphics.drawable.Drawable, android.graphics.drawable.Drawable) com.google.android.gms.internal.fm
   private class_511 method_907(Drawable var1, Drawable var2) {
      Drawable var3;
      if (var1 != null) {
         var3 = var1;
         if (var1 instanceof class_511) {
            var3 = ((class_511)var1).method_1727();
         }
      } else {
         var3 = null;
      }

      return new class_511(var3, var2);
   }

   // $FF: renamed from: a (android.graphics.drawable.Drawable, boolean, boolean, boolean) void
   private void method_908(Drawable var1, boolean var2, boolean var3, boolean var4) {
      switch(this.field_734) {
      case 1:
         if (!var3) {
            class_35 var7 = (class_35)this.field_737.get();
            if (var7 != null) {
               var7.method_93(this.field_733.field_732, var1, var4);
               return;
            }
         }
         break;
      case 2:
         ImageView var6 = (ImageView)this.field_738.get();
         if (var6 != null) {
            this.method_909(var6, var1, var2, var3, var4);
            return;
         }
         break;
      case 3:
         TextView var5 = (TextView)this.field_739.get();
         if (var5 != null) {
            this.method_910(var5, this.field_740, var1, var2, var3);
            return;
         }
      }

   }

   // $FF: renamed from: a (android.widget.ImageView, android.graphics.drawable.Drawable, boolean, boolean, boolean) void
   private void method_909(ImageView var1, Drawable var2, boolean var3, boolean var4, boolean var5) {
      boolean var6;
      if (!var4 && !var5) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (var6 && var1 instanceof class_490) {
         int var7 = ((class_490)var1).method_1696();
         if (this.field_735 != 0 && var7 == this.field_735) {
            return;
         }
      }

      var3 = this.method_911(var3, var4);
      if (var3) {
         var2 = this.method_907(var1.getDrawable(), (Drawable)var2);
      }

      var1.setImageDrawable((Drawable)var2);
      if (var1 instanceof class_490) {
         class_490 var8 = (class_490)var1;
         Uri var9;
         if (var5) {
            var9 = this.field_733.field_732;
         } else {
            var9 = null;
         }

         var8.method_1698(var9);
         int var10;
         if (var6) {
            var10 = this.field_735;
         } else {
            var10 = 0;
         }

         var8.method_1697(var10);
      }

      if (var3) {
         ((class_511)var2).method_1725(250);
      }
   }

   // $FF: renamed from: a (android.widget.TextView, int, android.graphics.drawable.Drawable, boolean, boolean) void
   private void method_910(TextView var1, int var2, Drawable var3, boolean var4, boolean var5) {
      var4 = this.method_911(var4, var5);
      Drawable[] var6;
      if (class_338.method_1166()) {
         var6 = var1.getCompoundDrawablesRelative();
      } else {
         var6 = var1.getCompoundDrawables();
      }

      Drawable var7 = var6[var2];
      if (var4) {
         var3 = this.method_907(var7, (Drawable)var3);
      }

      Object var11;
      if (var2 == 0) {
         var11 = var3;
      } else {
         var11 = var6[0];
      }

      Object var8;
      if (var2 == 1) {
         var8 = var3;
      } else {
         var8 = var6[1];
      }

      Object var9;
      if (var2 == 2) {
         var9 = var3;
      } else {
         var9 = var6[2];
      }

      Object var10;
      if (var2 == 3) {
         var10 = var3;
      } else {
         var10 = var6[3];
      }

      if (class_338.method_1166()) {
         var1.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)var11, (Drawable)var8, (Drawable)var9, (Drawable)var10);
      } else {
         var1.setCompoundDrawablesWithIntrinsicBounds((Drawable)var11, (Drawable)var8, (Drawable)var9, (Drawable)var10);
      }

      if (var4) {
         ((class_511)var3).method_1725(250);
      }

   }

   // $FF: renamed from: a (boolean, boolean) boolean
   private boolean method_911(boolean var1, boolean var2) {
      return this.field_741 && !var2 && (!var1 || this.field_742);
   }

   // $FF: renamed from: a (android.content.Context, android.graphics.Bitmap, boolean) void
   void method_912(Context var1, Bitmap var2, boolean var3) {
      class_495.method_1705(var2);
      this.method_908(new BitmapDrawable(var1.getResources(), var2), var3, false, true);
   }

   // $FF: renamed from: a (android.content.Context, boolean) void
   void method_913(Context var1, boolean var2) {
      Drawable var3 = null;
      if (this.field_735 != 0) {
         var3 = var1.getResources().getDrawable(this.field_735);
      }

      this.method_908(var3, var2, false, false);
   }

   public boolean equals(Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof class_251)) {
         var2 = false;
      } else {
         var2 = var3;
         if (this != var1) {
            var2 = var3;
            if (((class_251)var1).hashCode() != this.hashCode()) {
               return false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      return this.field_736;
   }
}
