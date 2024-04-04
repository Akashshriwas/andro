package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.c.class_230;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// $FF: renamed from: android.support.v4.app.g
public class class_181 extends Activity {
   // $FF: renamed from: a android.os.Handler
   final Handler field_538 = new class_609(this);
   // $FF: renamed from: b android.support.v4.app.m
   final class_613 field_539 = new class_613();
   // $FF: renamed from: c boolean
   boolean field_540;
   // $FF: renamed from: d boolean
   boolean field_541;
   // $FF: renamed from: e boolean
   boolean field_542;
   // $FF: renamed from: f boolean
   boolean field_543;
   // $FF: renamed from: g boolean
   boolean field_544;
   // $FF: renamed from: h boolean
   boolean field_545;
   // $FF: renamed from: i boolean
   boolean field_546;
   // $FF: renamed from: j boolean
   boolean field_547;
   // $FF: renamed from: k android.support.v4.c.c
   class_230 field_548;
   // $FF: renamed from: l android.support.v4.app.y
   class_623 field_549;

   // $FF: renamed from: a (int, boolean, boolean) android.support.v4.app.y
   class_623 method_694(int var1, boolean var2, boolean var3) {
      if (this.field_548 == null) {
         this.field_548 = new class_230();
      }

      class_623 var4 = (class_623)this.field_548.method_857(var1);
      if (var4 == null) {
         if (var3) {
            var4 = new class_623(this, var2);
            this.field_548.method_861(var1, var4);
         }

         return var4;
      } else {
         var4.method_2025(this);
         return var4;
      }
   }

   // $FF: renamed from: a (int) void
   void method_695(int var1) {
      if (this.field_548 != null) {
         class_623 var2 = (class_623)this.field_548.method_857(var1);
         if (var2 != null && !var2.field_2101) {
            var2.method_2033();
            this.field_548.method_862(var1);
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.app.Fragment) void
   public void method_696(Fragment var1) {
   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, android.content.Intent, int) void
   public void method_697(Fragment var1, Intent var2, int var3) {
      if (var3 == -1) {
         super.startActivityForResult(var2, -1);
      } else if ((-65536 & var3) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      } else {
         super.startActivityForResult(var2, (var1.field_412 + 1 << 16) + ('\uffff' & var3));
      }
   }

   // $FF: renamed from: a (boolean) void
   void method_698(boolean var1) {
      if (!this.field_543) {
         this.field_543 = true;
         this.field_544 = var1;
         this.field_538.removeMessages(1);
         this.method_702();
      }

   }

   // $FF: renamed from: b_ () void
   protected void method_699() {
      this.field_539.method_1999();
   }

   // $FF: renamed from: c () void
   public void method_700() {
      if (VERSION.SDK_INT >= 11) {
         class_615.method_2005(this);
      } else {
         this.field_545 = true;
      }
   }

   // $FF: renamed from: c_ () java.lang.Object
   public Object method_701() {
      return null;
   }

   // $FF: renamed from: d () void
   void method_702() {
      if (this.field_547) {
         this.field_547 = false;
         if (this.field_549 != null) {
            if (!this.field_544) {
               this.field_549.method_2028();
            } else {
               this.field_549.method_2029();
            }
         }
      }

      this.field_539.method_2002();
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      if (VERSION.SDK_INT >= 11) {
      }

      var3.print(var1);
      var3.print("Local FragmentActivity ");
      var3.print(Integer.toHexString(System.identityHashCode(this)));
      var3.println(" State:");
      String var5 = var1 + "  ";
      var3.print(var5);
      var3.print("mCreated=");
      var3.print(this.field_540);
      var3.print("mResumed=");
      var3.print(this.field_541);
      var3.print(" mStopped=");
      var3.print(this.field_542);
      var3.print(" mReallyStopped=");
      var3.println(this.field_543);
      var3.print(var5);
      var3.print("mLoadersStarted=");
      var3.println(this.field_547);
      if (this.field_549 != null) {
         var3.print(var1);
         var3.print("Loader Manager ");
         var3.print(Integer.toHexString(System.identityHashCode(this.field_549)));
         var3.println(":");
         this.field_549.method_2026(var1 + "  ", var2, var3, var4);
      }

      this.field_539.method_1971(var1, var2, var3, var4);
   }

   // $FF: renamed from: e () android.support.v4.app.k
   public class_612 method_703() {
      return this.field_539;
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      int var4 = var1 >> 16;
      if (var4 != 0) {
         --var4;
         if (this.field_539.field_2048 != null && var4 >= 0 && var4 < this.field_539.field_2048.size()) {
            Fragment var5 = (Fragment)this.field_539.field_2048.get(var4);
            if (var5 == null) {
               Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(var1));
            } else {
               var5.method_599('\uffff' & var1, var2, var3);
            }
         } else {
            Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(var1));
         }
      } else {
         super.onActivityResult(var1, var2, var3);
      }
   }

   public void onBackPressed() {
      if (!this.field_539.method_1949()) {
         this.finish();
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.field_539.method_1962(var1);
   }

   protected void onCreate(Bundle var1) {
      this.field_539.method_1969(this);
      if (this.getLayoutInflater().getFactory() == null) {
         this.getLayoutInflater().setFactory(this);
      }

      super.onCreate(var1);
      class_611 var4 = (class_611)this.getLastNonConfigurationInstance();
      if (var4 != null) {
         this.field_548 = var4.field_2036;
      }

      if (var1 != null) {
         Parcelable var2 = var1.getParcelable("android:support:fragments");
         class_613 var3 = this.field_539;
         ArrayList var5;
         if (var4 != null) {
            var5 = var4.field_2035;
         } else {
            var5 = null;
         }

         var3.method_1964(var2, var5);
      }

      this.field_539.method_1996();
   }

   public boolean onCreatePanelMenu(int var1, Menu var2) {
      if (var1 == 0) {
         boolean var3 = super.onCreatePanelMenu(var1, var2);
         boolean var4 = this.field_539.method_1974(var2, this.getMenuInflater());
         return VERSION.SDK_INT >= 11 ? var3 | var4 : true;
      } else {
         return super.onCreatePanelMenu(var1, var2);
      }
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      Object var7 = null;
      if (!"fragment".equals(var1)) {
         return super.onCreateView(var1, var2, var3);
      } else {
         var1 = var3.getAttributeValue((String)null, "class");
         TypedArray var10 = var2.obtainStyledAttributes(var3, class_610.field_2031);
         String var6 = var1;
         if (var1 == null) {
            var6 = var10.getString(0);
         }

         int var5 = var10.getResourceId(1, -1);
         String var8 = var10.getString(2);
         var10.recycle();
         if (false) {
            throw new NullPointerException();
         } else if (-1 == 0 && var5 == -1 && var8 == null) {
            throw new IllegalArgumentException(var3.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + var6);
         } else {
            Fragment var11 = (Fragment)var7;
            if (var5 != -1) {
               var11 = this.field_539.method_1946(var5);
            }

            Fragment var9 = var11;
            if (var11 == null) {
               var9 = var11;
               if (var8 != null) {
                  var9 = this.field_539.method_1957(var8);
               }
            }

            var11 = var9;
            if (var9 == null) {
               var11 = var9;
               if (-1 != 0) {
                  var11 = this.field_539.method_1946(0);
               }
            }

            if (class_613.field_2040) {
               Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(var5) + " fname=" + var6 + " existing=" + var11);
            }

            if (var11 == null) {
               var9 = Fragment.method_592(this, var6);
               var9.field_421 = true;
               int var4;
               if (var5 != 0) {
                  var4 = var5;
               } else {
                  var4 = 0;
               }

               var9.field_427 = var4;
               var9.field_428 = 0;
               var9.field_429 = var8;
               var9.field_422 = true;
               var9.field_425 = this.field_539;
               var9.method_601(this, var3, var9.field_410);
               this.field_539.method_1968(var9, true);
            } else {
               if (var11.field_422) {
                  throw new IllegalArgumentException(var3.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(var5) + ", tag " + var8 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + var6);
               }

               var11.field_422 = true;
               if (!var11.field_394) {
                  var11.method_601(this, var3, var11.field_410);
               }

               this.field_539.method_1977(var11);
               var9 = var11;
            }

            if (var9.field_400 == null) {
               throw new IllegalStateException("Fragment " + var6 + " did not create a view.");
            } else {
               if (var5 != 0) {
                  var9.field_400.setId(var5);
               }

               if (var9.field_400.getTag() == null) {
                  var9.field_400.setTag(var8);
               }

               return var9.field_400;
            }
         }
      }
   }

   protected void onDestroy() {
      super.onDestroy();
      this.method_698(false);
      this.field_539.method_2003();
      if (this.field_549 != null) {
         this.field_549.method_2033();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      if (VERSION.SDK_INT < 5 && var1 == 4 && var2.getRepeatCount() == 0) {
         this.onBackPressed();
         return true;
      } else {
         return super.onKeyDown(var1, var2);
      }
   }

   public void onLowMemory() {
      super.onLowMemory();
      this.field_539.method_2004();
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         switch(var1) {
         case 0:
            return this.field_539.method_1975(var2);
         case 6:
            return this.field_539.method_1981(var2);
         default:
            return false;
         }
      }
   }

   public void onPanelClosed(int var1, Menu var2) {
      switch(var1) {
      case 0:
         this.field_539.method_1980(var2);
      default:
         super.onPanelClosed(var1, var2);
      }
   }

   protected void onPause() {
      super.onPause();
      this.field_541 = false;
      if (this.field_538.hasMessages(2)) {
         this.field_538.removeMessages(2);
         this.method_699();
      }

      this.field_539.method_2000();
   }

   protected void onPostResume() {
      super.onPostResume();
      this.field_538.removeMessages(2);
      this.method_699();
      this.field_539.method_1991();
   }

   public boolean onPreparePanel(int var1, View var2, Menu var3) {
      boolean var5 = false;
      if (var1 == 0 && var3 != null) {
         if (this.field_545) {
            this.field_545 = false;
            var3.clear();
            this.onCreatePanelMenu(var1, var3);
         }

         boolean var4 = var5;
         if (super.onPreparePanel(var1, var2, var3) | this.field_539.method_1973(var3)) {
            var4 = var5;
            if (var3.hasVisibleItems()) {
               var4 = true;
            }
         }

         return var4;
      } else {
         return super.onPreparePanel(var1, var2, var3);
      }
   }

   protected void onResume() {
      super.onResume();
      this.field_538.sendEmptyMessage(2);
      this.field_541 = true;
      this.field_539.method_1991();
   }

   public final Object onRetainNonConfigurationInstance() {
      if (this.field_542) {
         this.method_698(true);
      }

      Object var4 = this.method_701();
      ArrayList var5 = this.field_539.method_1993();
      boolean var3 = false;
      boolean var1 = false;
      if (this.field_548 != null) {
         int var2 = this.field_548.method_856() - 1;

         while(true) {
            var3 = var1;
            if (var2 < 0) {
               break;
            }

            class_623 var6 = (class_623)this.field_548.method_865(var2);
            if (var6.field_2101) {
               var1 = true;
            } else {
               var6.method_2033();
               this.field_548.method_863(var2);
            }

            --var2;
         }
      }

      if (var5 == null && !var3 && var4 == null) {
         return null;
      } else {
         class_611 var7 = new class_611();
         var7.field_2032 = null;
         var7.field_2033 = var4;
         var7.field_2034 = null;
         var7.field_2035 = var5;
         var7.field_2036 = this.field_548;
         return var7;
      }
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      Parcelable var2 = this.field_539.method_1994();
      if (var2 != null) {
         var1.putParcelable("android:support:fragments", var2);
      }

   }

   protected void onStart() {
      super.onStart();
      this.field_542 = false;
      this.field_543 = false;
      this.field_538.removeMessages(1);
      if (!this.field_540) {
         this.field_540 = true;
         this.field_539.method_1997();
      }

      this.field_539.method_1995();
      this.field_539.method_1991();
      if (!this.field_547) {
         this.field_547 = true;
         if (this.field_549 != null) {
            this.field_549.method_2027();
         } else if (!this.field_546) {
            this.field_549 = this.method_694(-1, this.field_547, false);
         }

         this.field_546 = true;
      }

      this.field_539.method_1998();
      if (this.field_548 != null) {
         for(int var1 = this.field_548.method_856() - 1; var1 >= 0; --var1) {
            class_623 var2 = (class_623)this.field_548.method_865(var1);
            var2.method_2030();
            var2.method_2032();
         }
      }

   }

   protected void onStop() {
      super.onStop();
      this.field_542 = true;
      this.field_538.sendEmptyMessage(1);
      this.field_539.method_2001();
   }

   public void startActivityForResult(Intent var1, int var2) {
      if (var2 != -1 && (-65536 & var2) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      } else {
         super.startActivityForResult(var1, var2);
      }
   }
}
