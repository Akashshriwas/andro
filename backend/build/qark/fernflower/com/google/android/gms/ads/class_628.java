package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.class_604;

// $FF: renamed from: com.google.android.gms.ads.f
public final class class_628 extends ViewGroup {
   // $FF: renamed from: a com.google.android.gms.internal.p
   private final class_604 field_2129 = new class_604(this);

   public class_628(Context var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.google.android.gms.ads.b) void
   public void method_2046(class_632 var1) {
      this.field_2129.method_1931(var1.method_2052());
   }

   public class_150 getAdListener() {
      return this.field_2129.method_1929();
   }

   public class_626 getAdSize() {
      return this.field_2129.method_1934();
   }

   public String getAdUnitId() {
      return this.field_2129.method_1936();
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      View var8 = this.getChildAt(0);
      if (var8 != null && var8.getVisibility() != 8) {
         int var6 = var8.getMeasuredWidth();
         int var7 = var8.getMeasuredHeight();
         var2 = (var4 - var2 - var6) / 2;
         var3 = (var5 - var3 - var7) / 2;
         var8.layout(var2, var3, var6 + var2, var7 + var3);
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = 0;
      View var6 = this.getChildAt(0);
      class_626 var5 = this.getAdSize();
      int var4;
      if (var6 != null && var6.getVisibility() != 8) {
         this.measureChild(var6, var1, var2);
         var4 = var6.getMeasuredWidth();
         var3 = var6.getMeasuredHeight();
      } else if (var5 != null) {
         Context var7 = this.getContext();
         var4 = var5.method_2045(var7);
         var3 = var5.method_2043(var7);
      } else {
         var4 = 0;
      }

      var4 = Math.max(var4, this.getSuggestedMinimumWidth());
      var3 = Math.max(var3, this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(View.resolveSize(var4, var1), View.resolveSize(var3, var2));
   }

   public void setAdListener(class_150 var1) {
      this.field_2129.method_1930(var1);
   }

   public void setAdSize(class_626 var1) {
      this.field_2129.method_1933(var1);
   }

   public void setAdUnitId(String var1) {
      this.field_2129.method_1932(var1);
   }
}
