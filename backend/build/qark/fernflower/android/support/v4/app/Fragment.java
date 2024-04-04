package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.c.class_228;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
   // $FF: renamed from: N java.util.HashMap
   private static final HashMap field_393 = new HashMap();
   // $FF: renamed from: A boolean
   boolean field_394;
   // $FF: renamed from: B boolean
   boolean field_395;
   // $FF: renamed from: C boolean
   boolean field_396 = true;
   // $FF: renamed from: D boolean
   boolean field_397;
   // $FF: renamed from: E int
   int field_398;
   // $FF: renamed from: F android.view.ViewGroup
   ViewGroup field_399;
   // $FF: renamed from: G android.view.View
   View field_400;
   // $FF: renamed from: H android.view.View
   View field_401;
   // $FF: renamed from: I boolean
   boolean field_402;
   // $FF: renamed from: J boolean
   boolean field_403 = true;
   // $FF: renamed from: K android.support.v4.app.y
   class_623 field_404;
   // $FF: renamed from: L boolean
   boolean field_405;
   // $FF: renamed from: M boolean
   boolean field_406;
   // $FF: renamed from: a int
   int field_407 = 0;
   // $FF: renamed from: b android.view.View
   View field_408;
   // $FF: renamed from: c int
   int field_409;
   // $FF: renamed from: d android.os.Bundle
   Bundle field_410;
   // $FF: renamed from: e android.util.SparseArray
   SparseArray field_411;
   // $FF: renamed from: f int
   int field_412 = -1;
   // $FF: renamed from: g java.lang.String
   String field_413;
   // $FF: renamed from: h android.os.Bundle
   Bundle field_414;
   // $FF: renamed from: i android.support.v4.app.Fragment
   Fragment field_415;
   // $FF: renamed from: j int
   int field_416 = -1;
   // $FF: renamed from: k int
   int field_417;
   // $FF: renamed from: l boolean
   boolean field_418;
   // $FF: renamed from: m boolean
   boolean field_419;
   // $FF: renamed from: n boolean
   boolean field_420;
   // $FF: renamed from: o boolean
   boolean field_421;
   // $FF: renamed from: p boolean
   boolean field_422;
   // $FF: renamed from: q boolean
   boolean field_423;
   // $FF: renamed from: r int
   int field_424;
   // $FF: renamed from: s android.support.v4.app.m
   class_613 field_425;
   // $FF: renamed from: t android.support.v4.app.g
   class_181 field_426;
   // $FF: renamed from: u int
   int field_427;
   // $FF: renamed from: v int
   int field_428;
   // $FF: renamed from: w java.lang.String
   String field_429;
   // $FF: renamed from: x boolean
   boolean field_430;
   // $FF: renamed from: y boolean
   boolean field_431;
   // $FF: renamed from: z boolean
   boolean field_432;

   // $FF: renamed from: a (android.content.Context, java.lang.String) android.support.v4.app.Fragment
   public static Fragment method_592(Context var0, String var1) {
      return method_593(var0, var1, (Bundle)null);
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, android.os.Bundle) android.support.v4.app.Fragment
   public static Fragment method_593(Context var0, String var1, Bundle var2) {
      ClassNotFoundException var22;
      label57: {
         InstantiationException var21;
         label56: {
            IllegalAccessException var10000;
            label60: {
               Class var4;
               boolean var10001;
               try {
                  var4 = (Class)field_393.get(var1);
               } catch (ClassNotFoundException var14) {
                  var22 = var14;
                  var10001 = false;
                  break label57;
               } catch (InstantiationException var15) {
                  var21 = var15;
                  var10001 = false;
                  break label56;
               } catch (IllegalAccessException var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label60;
               }

               Class var3 = var4;
               if (var4 == null) {
                  try {
                     var3 = var0.getClassLoader().loadClass(var1);
                     field_393.put(var1, var3);
                  } catch (ClassNotFoundException var11) {
                     var22 = var11;
                     var10001 = false;
                     break label57;
                  } catch (InstantiationException var12) {
                     var21 = var12;
                     var10001 = false;
                     break label56;
                  } catch (IllegalAccessException var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label60;
                  }
               }

               Fragment var17;
               try {
                  var17 = (Fragment)var3.newInstance();
               } catch (ClassNotFoundException var8) {
                  var22 = var8;
                  var10001 = false;
                  break label57;
               } catch (InstantiationException var9) {
                  var21 = var9;
                  var10001 = false;
                  break label56;
               } catch (IllegalAccessException var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label60;
               }

               if (var2 == null) {
                  return var17;
               }

               try {
                  var2.setClassLoader(var17.getClass().getClassLoader());
                  var17.field_414 = var2;
                  return var17;
               } catch (ClassNotFoundException var5) {
                  var22 = var5;
                  var10001 = false;
                  break label57;
               } catch (InstantiationException var6) {
                  var21 = var6;
                  var10001 = false;
                  break label56;
               } catch (IllegalAccessException var7) {
                  var10000 = var7;
                  var10001 = false;
               }
            }

            IllegalAccessException var18 = var10000;
            throw new class_620("Unable to instantiate fragment " + var1 + ": make sure class name exists, is public, and has an" + " empty constructor that is public", var18);
         }

         InstantiationException var19 = var21;
         throw new class_620("Unable to instantiate fragment " + var1 + ": make sure class name exists, is public, and has an" + " empty constructor that is public", var19);
      }

      ClassNotFoundException var20 = var22;
      throw new class_620("Unable to instantiate fragment " + var1 + ": make sure class name exists, is public, and has an" + " empty constructor that is public", var20);
   }

   // $FF: renamed from: a (android.os.Bundle) android.view.LayoutInflater
   public LayoutInflater method_594(Bundle var1) {
      return this.field_426.getLayoutInflater();
   }

   // $FF: renamed from: a (android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle) android.view.View
   public View method_595(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return null;
   }

   // $FF: renamed from: a (int, boolean, int) android.view.animation.Animation
   public Animation method_596(int var1, boolean var2, int var3) {
      return null;
   }

   // $FF: renamed from: a () void
   final void method_597() {
      if (this.field_411 != null) {
         this.field_401.restoreHierarchyState(this.field_411);
         this.field_411 = null;
      }

   }

   // $FF: renamed from: a (int) void
   final void method_598(int var1) {
      this.field_412 = var1;
      this.field_413 = "android:fragment:" + this.field_412;
   }

   // $FF: renamed from: a (int, int, android.content.Intent) void
   public void method_599(int var1, int var2, Intent var3) {
   }

   // $FF: renamed from: a (android.app.Activity) void
   public void method_600(Activity var1) {
      this.field_397 = true;
   }

   // $FF: renamed from: a (android.app.Activity, android.util.AttributeSet, android.os.Bundle) void
   public void method_601(Activity var1, AttributeSet var2, Bundle var3) {
      this.field_397 = true;
   }

   // $FF: renamed from: a (android.content.Intent) void
   public void method_602(Intent var1) {
      if (this.field_426 == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.field_426.method_697(this, var1, -1);
      }
   }

   // $FF: renamed from: a (android.view.Menu) void
   public void method_603(Menu var1) {
   }

   // $FF: renamed from: a (android.view.Menu, android.view.MenuInflater) void
   public void method_604(Menu var1, MenuInflater var2) {
   }

   // $FF: renamed from: a (android.view.View, android.os.Bundle) void
   public void method_605(View var1, Bundle var2) {
   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_606(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mFragmentId=#");
      var3.print(Integer.toHexString(this.field_427));
      var3.print(" mContainerId=#");
      var3.print(Integer.toHexString(this.field_428));
      var3.print(" mTag=");
      var3.println(this.field_429);
      var3.print(var1);
      var3.print("mState=");
      var3.print(this.field_407);
      var3.print(" mIndex=");
      var3.print(this.field_412);
      var3.print(" mWho=");
      var3.print(this.field_413);
      var3.print(" mBackStackNesting=");
      var3.println(this.field_424);
      var3.print(var1);
      var3.print("mAdded=");
      var3.print(this.field_418);
      var3.print(" mRemoving=");
      var3.print(this.field_419);
      var3.print(" mResumed=");
      var3.print(this.field_420);
      var3.print(" mFromLayout=");
      var3.print(this.field_421);
      var3.print(" mInLayout=");
      var3.println(this.field_422);
      var3.print(var1);
      var3.print("mHidden=");
      var3.print(this.field_430);
      var3.print(" mDetached=");
      var3.print(this.field_431);
      var3.print(" mMenuVisible=");
      var3.print(this.field_396);
      var3.print(" mHasMenu=");
      var3.println(this.field_395);
      var3.print(var1);
      var3.print("mRetainInstance=");
      var3.print(this.field_432);
      var3.print(" mRetaining=");
      var3.print(this.field_394);
      var3.print(" mUserVisibleHint=");
      var3.println(this.field_403);
      if (this.field_425 != null) {
         var3.print(var1);
         var3.print("mFragmentManager=");
         var3.println(this.field_425);
      }

      if (this.field_426 != null) {
         var3.print(var1);
         var3.print("mActivity=");
         var3.println(this.field_426);
      }

      if (this.field_414 != null) {
         var3.print(var1);
         var3.print("mArguments=");
         var3.println(this.field_414);
      }

      if (this.field_410 != null) {
         var3.print(var1);
         var3.print("mSavedFragmentState=");
         var3.println(this.field_410);
      }

      if (this.field_411 != null) {
         var3.print(var1);
         var3.print("mSavedViewState=");
         var3.println(this.field_411);
      }

      if (this.field_415 != null) {
         var3.print(var1);
         var3.print("mTarget=");
         var3.print(this.field_415);
         var3.print(" mTargetRequestCode=");
         var3.println(this.field_417);
      }

      if (this.field_398 != 0) {
         var3.print(var1);
         var3.print("mNextAnim=");
         var3.println(this.field_398);
      }

      if (this.field_399 != null) {
         var3.print(var1);
         var3.print("mContainer=");
         var3.println(this.field_399);
      }

      if (this.field_400 != null) {
         var3.print(var1);
         var3.print("mView=");
         var3.println(this.field_400);
      }

      if (this.field_401 != null) {
         var3.print(var1);
         var3.print("mInnerView=");
         var3.println(this.field_400);
      }

      if (this.field_408 != null) {
         var3.print(var1);
         var3.print("mAnimatingAway=");
         var3.println(this.field_408);
         var3.print(var1);
         var3.print("mStateAfterAnimating=");
         var3.println(this.field_409);
      }

      if (this.field_404 != null) {
         var3.print(var1);
         var3.println("Loader Manager:");
         this.field_404.method_2026(var1 + "  ", var2, var3, var4);
      }

   }

   // $FF: renamed from: a (boolean) void
   public void method_607(boolean var1) {
   }

   // $FF: renamed from: a (android.view.MenuItem) boolean
   public boolean method_608(MenuItem var1) {
      return false;
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_609(Bundle var1) {
      this.field_397 = true;
   }

   // $FF: renamed from: b (android.view.Menu) void
   public void method_610(Menu var1) {
   }

   // $FF: renamed from: b (boolean) void
   public void method_611(boolean var1) {
      this.field_432 = var1;
   }

   // $FF: renamed from: b () boolean
   final boolean method_612() {
      return this.field_424 > 0;
   }

   // $FF: renamed from: b (android.view.MenuItem) boolean
   public boolean method_613(MenuItem var1) {
      return false;
   }

   // $FF: renamed from: c () android.support.v4.app.g
   public final class_181 method_614() {
      return this.field_426;
   }

   // $FF: renamed from: c (android.os.Bundle) void
   public void method_615(Bundle var1) {
      this.field_397 = true;
   }

   // $FF: renamed from: d () android.view.View
   public View method_616() {
      return this.field_400;
   }

   // $FF: renamed from: d (android.os.Bundle) void
   public void method_617(Bundle var1) {
   }

   // $FF: renamed from: e () void
   public void method_618() {
      this.field_397 = true;
      if (!this.field_405) {
         this.field_405 = true;
         if (!this.field_406) {
            this.field_406 = true;
            this.field_404 = this.field_426.method_694(this.field_412, this.field_405, false);
         }

         if (this.field_404 != null) {
            this.field_404.method_2027();
         }
      }

   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: f () void
   public void method_619() {
      this.field_397 = true;
   }

   // $FF: renamed from: g () void
   public void method_620() {
      this.field_397 = true;
   }

   // $FF: renamed from: h () void
   public void method_621() {
      this.field_397 = true;
   }

   public final int hashCode() {
      return super.hashCode();
   }

   // $FF: renamed from: i () void
   public void method_622() {
      this.field_397 = true;
   }

   // $FF: renamed from: j () void
   public void method_623() {
      this.field_397 = true;
      if (!this.field_406) {
         this.field_406 = true;
         this.field_404 = this.field_426.method_694(this.field_412, this.field_405, false);
      }

      if (this.field_404 != null) {
         this.field_404.method_2033();
      }

   }

   // $FF: renamed from: k () void
   void method_624() {
      this.field_412 = -1;
      this.field_413 = null;
      this.field_418 = false;
      this.field_419 = false;
      this.field_420 = false;
      this.field_421 = false;
      this.field_422 = false;
      this.field_423 = false;
      this.field_424 = 0;
      this.field_425 = null;
      this.field_426 = null;
      this.field_427 = 0;
      this.field_428 = 0;
      this.field_429 = null;
      this.field_430 = false;
      this.field_431 = false;
      this.field_394 = false;
      this.field_404 = null;
      this.field_405 = false;
      this.field_406 = false;
   }

   // $FF: renamed from: l () void
   public void method_625() {
      this.field_397 = true;
   }

   // $FF: renamed from: m () void
   public void method_626() {
   }

   // $FF: renamed from: n () void
   void method_627() {
      this.method_618();
      if (this.field_404 != null) {
         this.field_404.method_2032();
      }

   }

   // $FF: renamed from: o () void
   void method_628() {
      this.method_621();
   }

   public void onConfigurationChanged(Configuration var1) {
      this.field_397 = true;
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      this.method_614().onCreateContextMenu(var1, var2, var3);
   }

   public void onLowMemory() {
      this.field_397 = true;
   }

   // $FF: renamed from: p () void
   void method_629() {
      if (this.field_405) {
         this.field_405 = false;
         if (!this.field_406) {
            this.field_406 = true;
            this.field_404 = this.field_426.method_694(this.field_412, this.field_405, false);
         }

         if (this.field_404 != null) {
            if (this.field_426.field_544) {
               this.field_404.method_2029();
               return;
            }

            this.field_404.method_2028();
         }
      }

   }

   // $FF: renamed from: q () void
   void method_630() {
      this.method_622();
      if (this.field_404 != null) {
         this.field_404.method_2031();
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      class_228.method_848(this, var1);
      if (this.field_412 >= 0) {
         var1.append(" #");
         var1.append(this.field_412);
      }

      if (this.field_427 != 0) {
         var1.append(" id=0x");
         var1.append(Integer.toHexString(this.field_427));
      }

      if (this.field_429 != null) {
         var1.append(" ");
         var1.append(this.field_429);
      }

      var1.append('}');
      return var1.toString();
   }
}
