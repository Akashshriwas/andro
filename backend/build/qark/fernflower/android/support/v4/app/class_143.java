package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;

// $FF: renamed from: android.support.v4.app.t
public class class_143 extends Fragment {
   // $FF: renamed from: N android.widget.ListAdapter
   ListAdapter field_433;
   // $FF: renamed from: O android.widget.ListView
   ListView field_434;
   // $FF: renamed from: P android.view.View
   View field_435;
   // $FF: renamed from: Q android.widget.TextView
   TextView field_436;
   // $FF: renamed from: R android.view.View
   View field_437;
   // $FF: renamed from: S android.view.View
   View field_438;
   // $FF: renamed from: T java.lang.CharSequence
   CharSequence field_439;
   // $FF: renamed from: U boolean
   boolean field_440;
   // $FF: renamed from: V android.os.Handler
   private final Handler field_441 = new Handler();
   // $FF: renamed from: W java.lang.Runnable
   private final Runnable field_442 = new class_633(this);
   // $FF: renamed from: X android.widget.AdapterView.OnItemClickListener
   private final OnItemClickListener field_443 = new class_635(this);

   // $FF: renamed from: a (boolean, boolean) void
   private void method_631(boolean var1, boolean var2) {
      this.method_632();
      if (this.field_437 == null) {
         throw new IllegalStateException("Can't be used with a custom content view");
      } else if (this.field_440 != var1) {
         this.field_440 = var1;
         if (var1) {
            if (var2) {
               this.field_437.startAnimation(AnimationUtils.loadAnimation(this.c(), 17432577));
               this.field_438.startAnimation(AnimationUtils.loadAnimation(this.c(), 17432576));
            } else {
               this.field_437.clearAnimation();
               this.field_438.clearAnimation();
            }

            this.field_437.setVisibility(8);
            this.field_438.setVisibility(0);
         } else {
            if (var2) {
               this.field_437.startAnimation(AnimationUtils.loadAnimation(this.c(), 17432576));
               this.field_438.startAnimation(AnimationUtils.loadAnimation(this.c(), 17432577));
            } else {
               this.field_437.clearAnimation();
               this.field_438.clearAnimation();
            }

            this.field_437.setVisibility(0);
            this.field_438.setVisibility(8);
         }
      }
   }

   // $FF: renamed from: s () void
   private void method_632() {
      if (this.field_434 == null) {
         View var1 = this.d();
         if (var1 == null) {
            throw new IllegalStateException("Content view not yet created");
         } else {
            if (var1 instanceof ListView) {
               this.field_434 = (ListView)var1;
            } else {
               this.field_436 = (TextView)var1.findViewById(16711681);
               if (this.field_436 == null) {
                  this.field_435 = var1.findViewById(16908292);
               } else {
                  this.field_436.setVisibility(8);
               }

               this.field_437 = var1.findViewById(16711682);
               this.field_438 = var1.findViewById(16711683);
               var1 = var1.findViewById(16908298);
               if (!(var1 instanceof ListView)) {
                  if (var1 == null) {
                     throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                  }

                  throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
               }

               this.field_434 = (ListView)var1;
               if (this.field_435 != null) {
                  this.field_434.setEmptyView(this.field_435);
               } else if (this.field_439 != null) {
                  this.field_436.setText(this.field_439);
                  this.field_434.setEmptyView(this.field_436);
               }
            }

            this.field_440 = true;
            this.field_434.setOnItemClickListener(this.field_443);
            if (this.field_433 != null) {
               ListAdapter var2 = this.field_433;
               this.field_433 = null;
               this.method_633(var2);
            } else if (this.field_437 != null) {
               this.method_631(false, false);
            }

            this.field_441.post(this.field_442);
         }
      }
   }

   // $FF: renamed from: a (android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle) android.view.View
   public View method_595(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      class_181 var5 = this.c();
      FrameLayout var4 = new FrameLayout(var5);
      LinearLayout var7 = new LinearLayout(var5);
      var7.setId(16711682);
      var7.setOrientation(1);
      var7.setVisibility(8);
      var7.setGravity(17);
      var7.addView(new ProgressBar(var5, (AttributeSet)null, 16842874), new LayoutParams(-2, -2));
      var4.addView(var7, new LayoutParams(-1, -1));
      FrameLayout var6 = new FrameLayout(var5);
      var6.setId(16711683);
      TextView var8 = new TextView(this.c());
      var8.setId(16711681);
      var8.setGravity(17);
      var6.addView(var8, new LayoutParams(-1, -1));
      ListView var9 = new ListView(this.c());
      var9.setId(16908298);
      var9.setDrawSelectorOnTop(false);
      var6.addView(var9, new LayoutParams(-1, -1));
      var4.addView(var6, new LayoutParams(-1, -1));
      var4.setLayoutParams(new LayoutParams(-1, -1));
      return var4;
   }

   // $FF: renamed from: a (android.view.View, android.os.Bundle) void
   public void method_605(View var1, Bundle var2) {
      super.method_605(var1, var2);
      this.method_632();
   }

   // $FF: renamed from: a (android.widget.ListAdapter) void
   public void method_633(ListAdapter var1) {
      boolean var3 = false;
      boolean var2;
      if (this.field_433 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.field_433 = var1;
      if (this.field_434 != null) {
         this.field_434.setAdapter(var1);
         if (!this.field_440 && !var2) {
            if (this.d().getWindowToken() != null) {
               var3 = true;
            }

            this.method_631(true, var3);
         }
      }

   }

   // $FF: renamed from: a (android.widget.ListView, android.view.View, int, long) void
   public void method_634(ListView var1, View var2, int var3, long var4) {
   }

   // $FF: renamed from: i () void
   public void method_622() {
      this.field_441.removeCallbacks(this.field_442);
      this.field_434 = null;
      this.field_440 = false;
      this.field_438 = null;
      this.field_437 = null;
      this.field_435 = null;
      this.field_436 = null;
      super.method_622();
   }

   // $FF: renamed from: r () android.widget.ListView
   public ListView method_635() {
      this.method_632();
      return this.field_434;
   }
}
