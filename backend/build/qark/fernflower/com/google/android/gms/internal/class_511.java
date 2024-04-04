package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

// $FF: renamed from: com.google.android.gms.internal.fm
public final class class_511 extends Drawable implements Callback {
   // $FF: renamed from: a int
   private int field_1547;
   // $FF: renamed from: b long
   private long field_1548;
   // $FF: renamed from: c int
   private int field_1549;
   // $FF: renamed from: d int
   private int field_1550;
   // $FF: renamed from: e int
   private int field_1551;
   // $FF: renamed from: f int
   private int field_1552;
   // $FF: renamed from: g int
   private int field_1553;
   // $FF: renamed from: h boolean
   private boolean field_1554;
   // $FF: renamed from: i boolean
   private boolean field_1555;
   // $FF: renamed from: j com.google.android.gms.internal.fr
   private class_492 field_1556;
   // $FF: renamed from: k android.graphics.drawable.Drawable
   private Drawable field_1557;
   // $FF: renamed from: l android.graphics.drawable.Drawable
   private Drawable field_1558;
   // $FF: renamed from: m boolean
   private boolean field_1559;
   // $FF: renamed from: n boolean
   private boolean field_1560;
   // $FF: renamed from: o boolean
   private boolean field_1561;
   // $FF: renamed from: p int
   private int field_1562;

   public class_511(Drawable var1, Drawable var2) {
      this((class_492)null);
      Object var3 = var1;
      if (var1 == null) {
         var3 = class_486.method_1678();
      }

      this.field_1557 = (Drawable)var3;
      ((Drawable)var3).setCallback(this);
      class_492 var4 = this.field_1556;
      var4.field_1404 |= ((Drawable)var3).getChangingConfigurations();
      Object var5 = var2;
      if (var2 == null) {
         var5 = class_486.method_1678();
      }

      this.field_1558 = (Drawable)var5;
      ((Drawable)var5).setCallback(this);
      class_492 var6 = this.field_1556;
      var6.field_1404 |= ((Drawable)var5).getChangingConfigurations();
   }

   class_511(class_492 var1) {
      this.field_1547 = 0;
      this.field_1551 = 255;
      this.field_1553 = 0;
      this.field_1554 = true;
      this.field_1556 = new class_492(var1);
   }

   // $FF: renamed from: a (int) void
   public void method_1725(int var1) {
      this.field_1549 = 0;
      this.field_1550 = this.field_1551;
      this.field_1553 = 0;
      this.field_1552 = var1;
      this.field_1547 = 1;
      this.invalidateSelf();
   }

   // $FF: renamed from: a () boolean
   public boolean method_1726() {
      if (!this.field_1559) {
         boolean var1;
         if (this.field_1557.getConstantState() != null && this.field_1558.getConstantState() != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         this.field_1560 = var1;
         this.field_1559 = true;
      }

      return this.field_1560;
   }

   // $FF: renamed from: b () android.graphics.drawable.Drawable
   public Drawable method_1727() {
      return this.field_1558;
   }

   public void draw(Canvas var1) {
      boolean var5 = true;
      boolean var4 = true;
      boolean var6 = false;
      switch(this.field_1547) {
      case 1:
         this.field_1548 = SystemClock.uptimeMillis();
         this.field_1547 = 2;
         var4 = var6;
         break;
      case 2:
         if (this.field_1548 >= 0L) {
            float var2 = (float)(SystemClock.uptimeMillis() - this.field_1548) / (float)this.field_1552;
            if (var2 >= 1.0F) {
               var4 = var5;
            } else {
               var4 = false;
            }

            if (var4) {
               this.field_1547 = 0;
            }

            var2 = Math.min(var2, 1.0F);
            float var3 = (float)this.field_1549;
            this.field_1553 = (int)(var2 * (float)(this.field_1550 - this.field_1549) + var3);
         }
      }

      int var10 = this.field_1553;
      boolean var7 = this.field_1554;
      Drawable var8 = this.field_1557;
      Drawable var9 = this.field_1558;
      if (!var4) {
         if (var7) {
            var8.setAlpha(this.field_1551 - var10);
         }

         var8.draw(var1);
         if (var7) {
            var8.setAlpha(this.field_1551);
         }

         if (var10 > 0) {
            var9.setAlpha(var10);
            var9.draw(var1);
            var9.setAlpha(this.field_1551);
         }

         this.invalidateSelf();
      } else {
         if (!var7 || var10 == 0) {
            var8.draw(var1);
         }

         if (var10 == this.field_1551) {
            var9.setAlpha(this.field_1551);
            var9.draw(var1);
         }

      }
   }

   public int getChangingConfigurations() {
      return super.getChangingConfigurations() | this.field_1556.field_1403 | this.field_1556.field_1404;
   }

   public ConstantState getConstantState() {
      if (this.method_1726()) {
         this.field_1556.field_1403 = this.getChangingConfigurations();
         return this.field_1556;
      } else {
         return null;
      }
   }

   public int getIntrinsicHeight() {
      return Math.max(this.field_1557.getIntrinsicHeight(), this.field_1558.getIntrinsicHeight());
   }

   public int getIntrinsicWidth() {
      return Math.max(this.field_1557.getIntrinsicWidth(), this.field_1558.getIntrinsicWidth());
   }

   public int getOpacity() {
      if (!this.field_1561) {
         this.field_1562 = Drawable.resolveOpacity(this.field_1557.getOpacity(), this.field_1558.getOpacity());
         this.field_1561 = true;
      }

      return this.field_1562;
   }

   public void invalidateDrawable(Drawable var1) {
      if (class_338.method_1164()) {
         Callback var2 = this.getCallback();
         if (var2 != null) {
            var2.invalidateDrawable(this);
         }
      }

   }

   public Drawable mutate() {
      if (!this.field_1555 && super.mutate() == this) {
         if (!this.method_1726()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
         }

         this.field_1557.mutate();
         this.field_1558.mutate();
         this.field_1555 = true;
      }

      return this;
   }

   protected void onBoundsChange(Rect var1) {
      this.field_1557.setBounds(var1);
      this.field_1558.setBounds(var1);
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      if (class_338.method_1164()) {
         Callback var5 = this.getCallback();
         if (var5 != null) {
            var5.scheduleDrawable(this, var2, var3);
         }
      }

   }

   public void setAlpha(int var1) {
      if (this.field_1553 == this.field_1551) {
         this.field_1553 = var1;
      }

      this.field_1551 = var1;
      this.invalidateSelf();
   }

   public void setColorFilter(ColorFilter var1) {
      this.field_1557.setColorFilter(var1);
      this.field_1558.setColorFilter(var1);
   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      if (class_338.method_1164()) {
         Callback var3 = this.getCallback();
         if (var3 != null) {
            var3.unscheduleDrawable(this, var2);
         }
      }

   }
}
