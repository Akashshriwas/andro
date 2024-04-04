package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.c.class_226;
import android.support.v4.c.class_228;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// $FF: renamed from: android.support.v4.app.m
final class class_613 extends class_612 {
   // $FF: renamed from: A android.view.animation.Interpolator
   static final Interpolator field_2039;
   // $FF: renamed from: a boolean
   static boolean field_2040;
   // $FF: renamed from: b boolean
   static final boolean field_2041;
   // $FF: renamed from: x android.view.animation.Interpolator
   static final Interpolator field_2042;
   // $FF: renamed from: y android.view.animation.Interpolator
   static final Interpolator field_2043;
   // $FF: renamed from: z android.view.animation.Interpolator
   static final Interpolator field_2044;
   // $FF: renamed from: c java.util.ArrayList
   ArrayList field_2045;
   // $FF: renamed from: d java.lang.Runnable[]
   Runnable[] field_2046;
   // $FF: renamed from: e boolean
   boolean field_2047;
   // $FF: renamed from: f java.util.ArrayList
   ArrayList field_2048;
   // $FF: renamed from: g java.util.ArrayList
   ArrayList field_2049;
   // $FF: renamed from: h java.util.ArrayList
   ArrayList field_2050;
   // $FF: renamed from: i java.util.ArrayList
   ArrayList field_2051;
   // $FF: renamed from: j java.util.ArrayList
   ArrayList field_2052;
   // $FF: renamed from: k java.util.ArrayList
   ArrayList field_2053;
   // $FF: renamed from: l java.util.ArrayList
   ArrayList field_2054;
   // $FF: renamed from: m java.util.ArrayList
   ArrayList field_2055;
   // $FF: renamed from: n int
   int field_2056 = 0;
   // $FF: renamed from: o android.support.v4.app.g
   class_181 field_2057;
   // $FF: renamed from: p boolean
   boolean field_2058;
   // $FF: renamed from: q boolean
   boolean field_2059;
   // $FF: renamed from: r boolean
   boolean field_2060;
   // $FF: renamed from: s java.lang.String
   String field_2061;
   // $FF: renamed from: t boolean
   boolean field_2062;
   // $FF: renamed from: u android.os.Bundle
   Bundle field_2063 = null;
   // $FF: renamed from: v android.util.SparseArray
   SparseArray field_2064 = null;
   // $FF: renamed from: w java.lang.Runnable
   Runnable field_2065 = new class_614(this);

   static {
      boolean var0 = false;
      field_2040 = false;
      if (VERSION.SDK_INT >= 11) {
         var0 = true;
      }

      field_2041 = var0;
      field_2042 = new DecelerateInterpolator(2.5F);
      field_2043 = new DecelerateInterpolator(1.5F);
      field_2044 = new AccelerateInterpolator(2.5F);
      field_2039 = new AccelerateInterpolator(1.5F);
   }

   // $FF: renamed from: a (android.content.Context, float, float) android.view.animation.Animation
   static Animation method_1950(Context var0, float var1, float var2) {
      AlphaAnimation var3 = new AlphaAnimation(var1, var2);
      var3.setInterpolator(field_2043);
      var3.setDuration(220L);
      return var3;
   }

   // $FF: renamed from: a (android.content.Context, float, float, float, float) android.view.animation.Animation
   static Animation method_1951(Context var0, float var1, float var2, float var3, float var4) {
      AnimationSet var7 = new AnimationSet(false);
      ScaleAnimation var5 = new ScaleAnimation(var1, var2, var1, var2, 1, 0.5F, 1, 0.5F);
      var5.setInterpolator(field_2042);
      var5.setDuration(220L);
      var7.addAnimation(var5);
      AlphaAnimation var6 = new AlphaAnimation(var3, var4);
      var6.setInterpolator(field_2043);
      var6.setDuration(220L);
      var7.addAnimation(var6);
      return var7;
   }

   // $FF: renamed from: b (int, boolean) int
   public static int method_1952(int var0, boolean var1) {
      switch(var0) {
      case 4097:
         if (var1) {
            return 1;
         }

         return 2;
      case 4099:
         if (var1) {
            return 5;
         }

         return 6;
      case 8194:
         if (var1) {
            return 3;
         }

         return 4;
      default:
         return -1;
      }
   }

   // $FF: renamed from: c (int) int
   public static int method_1953(int var0) {
      switch(var0) {
      case 4097:
         return 8194;
      case 4099:
         return 4099;
      case 8194:
         return 4097;
      default:
         return 0;
      }
   }

   // $FF: renamed from: t () void
   private void method_1954() {
      if (this.field_2059) {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      } else if (this.field_2061 != null) {
         throw new IllegalStateException("Can not perform this action inside of " + this.field_2061);
      }
   }

   // $FF: renamed from: a (android.support.v4.app.b) int
   public int method_1955(class_617 var1) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label521: {
         int var2;
         label522: {
            try {
               if (this.field_2054 != null && this.field_2054.size() > 0) {
                  break label522;
               }
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label521;
            }

            try {
               if (this.field_2053 == null) {
                  this.field_2053 = new ArrayList();
               }
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label521;
            }

            try {
               var2 = this.field_2053.size();
               if (field_2040) {
                  Log.v("FragmentManager", "Setting back stack index " + var2 + " to " + var1);
               }
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label521;
            }

            try {
               this.field_2053.add(var1);
               return var2;
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               break label521;
            }
         }

         try {
            var2 = (Integer)this.field_2054.remove(this.field_2054.size() - 1);
            if (field_2040) {
               Log.v("FragmentManager", "Adding back stack index " + var2 + " with " + var1);
            }
         } catch (Throwable var54) {
            var10000 = var54;
            var10001 = false;
            break label521;
         }

         label497:
         try {
            this.field_2053.set(var2, var1);
            return var2;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            break label497;
         }
      }

      while(true) {
         Throwable var59 = var10000;

         try {
            throw var59;
         } catch (Throwable var52) {
            var10000 = var52;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (int) android.support.v4.app.Fragment
   public Fragment method_1946(int var1) {
      int var2;
      Fragment var3;
      if (this.field_2049 != null) {
         for(var2 = this.field_2049.size() - 1; var2 >= 0; --var2) {
            var3 = (Fragment)this.field_2049.get(var2);
            if (var3 != null && var3.field_427 == var1) {
               return var3;
            }
         }
      }

      if (this.field_2048 != null) {
         for(var2 = this.field_2048.size() - 1; var2 >= 0; --var2) {
            Fragment var4 = (Fragment)this.field_2048.get(var2);
            if (var4 != null) {
               var3 = var4;
               if (var4.field_427 == var1) {
                  return var3;
               }
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (android.os.Bundle, java.lang.String) android.support.v4.app.Fragment
   public Fragment method_1956(Bundle var1, String var2) {
      int var3 = var1.getInt(var2, -1);
      Fragment var5;
      if (var3 == -1) {
         var5 = null;
      } else {
         if (var3 >= this.field_2048.size()) {
            throw new IllegalStateException("Fragement no longer exists for key " + var2 + ": index " + var3);
         }

         Fragment var4 = (Fragment)this.field_2048.get(var3);
         var5 = var4;
         if (var4 == null) {
            throw new IllegalStateException("Fragement no longer exists for key " + var2 + ": index " + var3);
         }
      }

      return var5;
   }

   // $FF: renamed from: a (java.lang.String) android.support.v4.app.Fragment
   public Fragment method_1957(String var1) {
      int var2;
      Fragment var3;
      if (this.field_2049 != null && var1 != null) {
         for(var2 = this.field_2049.size() - 1; var2 >= 0; --var2) {
            var3 = (Fragment)this.field_2049.get(var2);
            if (var3 != null && var1.equals(var3.field_429)) {
               return var3;
            }
         }
      }

      if (this.field_2048 == null || var1 == null) {
         return null;
      } else {
         for(var2 = this.field_2048.size() - 1; var2 >= 0; --var2) {
            Fragment var4 = (Fragment)this.field_2048.get(var2);
            if (var4 != null) {
               var3 = var4;
               if (var1.equals(var4.field_429)) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: a () android.support.v4.app.s
   public class_616 method_1947() {
      return new class_617(this);
   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, int, boolean, int) android.view.animation.Animation
   Animation method_1958(Fragment var1, int var2, boolean var3, int var4) {
      Animation var5 = var1.method_596(var2, var3, var1.field_398);
      Animation var6;
      if (var5 != null) {
         var6 = var5;
         return var6;
      } else {
         if (var1.field_398 != 0) {
            var5 = AnimationUtils.loadAnimation(this.field_2057, var1.field_398);
            var6 = var5;
            if (var5 != null) {
               return var6;
            }
         }

         if (var2 == 0) {
            return null;
         } else {
            var2 = method_1952(var2, var3);
            if (var2 < 0) {
               return null;
            } else {
               switch(var2) {
               case 1:
                  return method_1951(this.field_2057, 1.125F, 1.0F, 0.0F, 1.0F);
               case 2:
                  return method_1951(this.field_2057, 1.0F, 0.975F, 1.0F, 0.0F);
               case 3:
                  return method_1951(this.field_2057, 0.975F, 1.0F, 0.0F, 1.0F);
               case 4:
                  return method_1951(this.field_2057, 1.0F, 1.075F, 1.0F, 0.0F);
               case 5:
                  return method_1950(this.field_2057, 0.0F, 1.0F);
               case 6:
                  return method_1950(this.field_2057, 1.0F, 0.0F);
               default:
                  var2 = var4;
                  if (var4 == 0) {
                     var2 = var4;
                     if (this.field_2057.getWindow() != null) {
                        var2 = this.field_2057.getWindow().getAttributes().windowAnimations;
                     }
                  }

                  if (var2 == 0) {
                     return null;
                  } else {
                     return null;
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: a (int, int, int, boolean) void
   void method_1959(int var1, int var2, int var3, boolean var4) {
      if (this.field_2057 == null && var1 != 0) {
         throw new IllegalStateException("No activity");
      } else {
         if (var4 || this.field_2056 != var1) {
            this.field_2056 = var1;
            if (this.field_2048 != null) {
               int var6 = 0;

               boolean var5;
               for(var5 = false; var6 < this.field_2048.size(); ++var6) {
                  Fragment var7 = (Fragment)this.field_2048.get(var6);
                  if (var7 != null) {
                     this.method_1967(var7, var1, var2, var3, false);
                     if (var7.field_404 != null) {
                        var5 |= var7.field_404.method_2024();
                     }
                  }
               }

               if (!var5) {
                  this.method_1987();
               }

               if (this.field_2058 && this.field_2057 != null && this.field_2056 == 5) {
                  this.field_2057.method_700();
                  this.field_2058 = false;
                  return;
               }
            }
         }

      }
   }

   // $FF: renamed from: a (int, android.support.v4.app.b) void
   public void method_1960(int var1, class_617 var2) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label1119: {
         try {
            if (this.field_2053 == null) {
               this.field_2053 = new ArrayList();
            }
         } catch (Throwable var136) {
            var10000 = var136;
            var10001 = false;
            break label1119;
         }

         int var4;
         try {
            var4 = this.field_2053.size();
         } catch (Throwable var135) {
            var10000 = var135;
            var10001 = false;
            break label1119;
         }

         int var3 = var4;
         if (var1 < var4) {
            try {
               if (field_2040) {
                  Log.v("FragmentManager", "Setting back stack index " + var1 + " to " + var2);
               }
            } catch (Throwable var132) {
               var10000 = var132;
               var10001 = false;
               break label1119;
            }

            try {
               this.field_2053.set(var1, var2);
            } catch (Throwable var131) {
               var10000 = var131;
               var10001 = false;
               break label1119;
            }
         } else {
            while(true) {
               if (var3 >= var1) {
                  try {
                     if (field_2040) {
                        Log.v("FragmentManager", "Adding back stack index " + var1 + " with " + var2);
                     }
                  } catch (Throwable var133) {
                     var10000 = var133;
                     var10001 = false;
                     break label1119;
                  }

                  try {
                     this.field_2053.add(var2);
                     break;
                  } catch (Throwable var128) {
                     var10000 = var128;
                     var10001 = false;
                     break label1119;
                  }
               }

               try {
                  this.field_2053.add((Object)null);
                  if (this.field_2054 == null) {
                     this.field_2054 = new ArrayList();
                  }
               } catch (Throwable var130) {
                  var10000 = var130;
                  var10001 = false;
                  break label1119;
               }

               try {
                  if (field_2040) {
                     Log.v("FragmentManager", "Adding available back stack index " + var3);
                  }
               } catch (Throwable var134) {
                  var10000 = var134;
                  var10001 = false;
                  break label1119;
               }

               try {
                  this.field_2054.add(var3);
               } catch (Throwable var129) {
                  var10000 = var129;
                  var10001 = false;
                  break label1119;
               }

               ++var3;
            }
         }

         label1074:
         try {
            return;
         } catch (Throwable var127) {
            var10000 = var127;
            var10001 = false;
            break label1074;
         }
      }

      while(true) {
         Throwable var137 = var10000;

         try {
            throw var137;
         } catch (Throwable var126) {
            var10000 = var126;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (int, boolean) void
   void method_1961(int var1, boolean var2) {
      this.method_1959(var1, 0, 0, var2);
   }

   // $FF: renamed from: a (android.content.res.Configuration) void
   public void method_1962(Configuration var1) {
      if (this.field_2049 != null) {
         for(int var2 = 0; var2 < this.field_2049.size(); ++var2) {
            Fragment var3 = (Fragment)this.field_2049.get(var2);
            if (var3 != null) {
               var3.onConfigurationChanged(var1);
            }
         }
      }

   }

   // $FF: renamed from: a (android.os.Bundle, java.lang.String, android.support.v4.app.Fragment) void
   public void method_1963(Bundle var1, String var2, Fragment var3) {
      if (var3.field_412 < 0) {
         throw new IllegalStateException("Fragment " + var3 + " is not currently in the FragmentManager");
      } else {
         var1.putInt(var2, var3.field_412);
      }
   }

   // $FF: renamed from: a (android.os.Parcelable, java.util.ArrayList) void
   void method_1964(Parcelable var1, ArrayList var2) {
      byte var4 = 0;
      if (var1 != null) {
         FragmentManagerState var7 = (FragmentManagerState)var1;
         if (var7.field_652 != null) {
            int var3;
            Fragment var5;
            if (var2 != null) {
               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var5 = (Fragment)var2.get(var3);
                  if (field_2040) {
                     Log.v("FragmentManager", "restoreAllState: re-attaching retained " + var5);
                  }

                  FragmentState var6 = var7.field_652[var5.field_412];
                  var6.field_1925 = var5;
                  var5.field_411 = null;
                  var5.field_424 = 0;
                  var5.field_422 = false;
                  var5.field_418 = false;
                  var5.field_415 = null;
                  if (var6.field_1924 != null) {
                     var6.field_1924.setClassLoader(this.field_2057.getClassLoader());
                     var5.field_411 = var6.field_1924.getSparseParcelableArray("android:view_state");
                  }
               }
            }

            this.field_2048 = new ArrayList(var7.field_652.length);
            if (this.field_2050 != null) {
               this.field_2050.clear();
            }

            for(var3 = 0; var3 < var7.field_652.length; ++var3) {
               FragmentState var10 = var7.field_652[var3];
               if (var10 != null) {
                  Fragment var11 = var10.method_1858(this.field_2057);
                  if (field_2040) {
                     Log.v("FragmentManager", "restoreAllState: adding #" + var3 + ": " + var11);
                  }

                  this.field_2048.add(var11);
                  var10.field_1925 = null;
               } else {
                  if (field_2040) {
                     Log.v("FragmentManager", "restoreAllState: adding #" + var3 + ": (null)");
                  }

                  this.field_2048.add((Object)null);
                  if (this.field_2050 == null) {
                     this.field_2050 = new ArrayList();
                  }

                  if (field_2040) {
                     Log.v("FragmentManager", "restoreAllState: adding avail #" + var3);
                  }

                  this.field_2050.add(var3);
               }
            }

            if (var2 != null) {
               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var5 = (Fragment)var2.get(var3);
                  if (var5.field_416 >= 0) {
                     if (var5.field_416 < this.field_2048.size()) {
                        var5.field_415 = (Fragment)this.field_2048.get(var5.field_416);
                     } else {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + var5 + " target no longer exists: " + var5.field_416);
                        var5.field_415 = null;
                     }
                  }
               }
            }

            if (var7.field_653 != null) {
               this.field_2049 = new ArrayList(var7.field_653.length);

               for(var3 = 0; var3 < var7.field_653.length; ++var3) {
                  Fragment var8 = (Fragment)this.field_2048.get(var7.field_653[var3]);
                  if (var8 == null) {
                     throw new IllegalStateException("No instantiated fragment for index #" + var7.field_653[var3]);
                  }

                  var8.field_418 = true;
                  if (field_2040) {
                     Log.v("FragmentManager", "restoreAllState: making added #" + var3 + ": " + var8);
                  }

                  this.field_2049.add(var8);
               }
            } else {
               this.field_2049 = null;
            }

            if (var7.field_654 == null) {
               this.field_2051 = null;
               return;
            }

            this.field_2051 = new ArrayList(var7.field_654.length);

            for(var3 = var4; var3 < var7.field_654.length; ++var3) {
               class_617 var9 = var7.field_654[var3].method_867(this);
               if (field_2040) {
                  Log.v("FragmentManager", "restoreAllState: adding bse #" + var3 + " (index " + var9.field_2082 + "): " + var9);
               }

               this.field_2051.add(var9);
               if (var9.field_2082 >= 0) {
                  this.method_1960(var9.field_2082, var9);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.app.Fragment) void
   public void method_1965(Fragment var1) {
      if (var1.field_402) {
         if (!this.field_2047) {
            var1.field_402 = false;
            this.method_1967(var1, this.field_2056, 0, 0, false);
            return;
         }

         this.field_2062 = true;
      }

   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, int, int) void
   public void method_1966(Fragment var1, int var2, int var3) {
      if (field_2040) {
         Log.v("FragmentManager", "remove: " + var1 + " nesting=" + var1.field_424);
      }

      boolean var4;
      if (!var1.method_612()) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (!var1.field_431 || var4) {
         if (this.field_2049 != null) {
            this.field_2049.remove(var1);
         }

         if (var1.field_395 && var1.field_396) {
            this.field_2058 = true;
         }

         var1.field_418 = false;
         var1.field_419 = true;
         byte var5;
         if (var4) {
            var5 = 0;
         } else {
            var5 = 1;
         }

         this.method_1967(var1, var5, var2, var3, false);
      }

   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, int, int, int, boolean) void
   void method_1967(Fragment var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var2;
      if (!var1.field_418) {
         var6 = var2;
         if (var2 > 1) {
            var6 = 1;
         }
      }

      int var7 = var6;
      if (var1.field_419) {
         var7 = var6;
         if (var6 > var1.field_407) {
            var7 = var1.field_407;
         }
      }

      var2 = var7;
      if (var1.field_402) {
         var2 = var7;
         if (var1.field_407 < 4) {
            var2 = var7;
            if (var7 > 3) {
               var2 = 3;
            }
         }
      }

      if (var1.field_407 < var2) {
         if (var1.field_421 && !var1.field_422) {
            return;
         }

         if (var1.field_408 != null) {
            var1.field_408 = null;
            this.method_1967(var1, var1.field_409, 0, 0, true);
         }

         var6 = var2;
         int var8 = var2;
         var7 = var2;
         switch(var1.field_407) {
         case 0:
            if (field_2040) {
               Log.v("FragmentManager", "moveto CREATED: " + var1);
            }

            var7 = var2;
            if (var1.field_410 != null) {
               var1.field_411 = var1.field_410.getSparseParcelableArray("android:view_state");
               var1.field_415 = this.method_1956(var1.field_410, "android:target_state");
               if (var1.field_415 != null) {
                  var1.field_417 = var1.field_410.getInt("android:target_req_state", 0);
               }

               var1.field_403 = var1.field_410.getBoolean("android:user_visible_hint", true);
               var7 = var2;
               if (!var1.field_403) {
                  var1.field_402 = true;
                  var7 = var2;
                  if (var2 > 3) {
                     var7 = 3;
                  }
               }
            }

            var1.field_426 = this.field_2057;
            var1.field_425 = this.field_2057.field_539;
            var1.field_397 = false;
            var1.method_600(this.field_2057);
            if (!var1.field_397) {
               throw new class_291("Fragment " + var1 + " did not call through to super.onAttach()");
            }

            this.field_2057.method_696(var1);
            if (!var1.field_394) {
               var1.field_397 = false;
               var1.method_609(var1.field_410);
               if (!var1.field_397) {
                  throw new class_291("Fragment " + var1 + " did not call through to super.onCreate()");
               }
            }

            var1.field_394 = false;
            var6 = var7;
            if (var1.field_421) {
               var1.field_400 = var1.method_595(var1.method_594(var1.field_410), (ViewGroup)null, var1.field_410);
               if (var1.field_400 != null) {
                  var1.field_401 = var1.field_400;
                  var1.field_400 = class_292.method_1006(var1.field_400);
                  if (var1.field_430) {
                     var1.field_400.setVisibility(8);
                  }

                  var1.method_605(var1.field_400, var1.field_410);
                  var6 = var7;
               } else {
                  var1.field_401 = null;
                  var6 = var7;
               }
            }
         case 1:
            var8 = var6;
            if (var6 > 1) {
               if (field_2040) {
                  Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + var1);
               }

               if (!var1.field_421) {
                  ViewGroup var9;
                  if (var1.field_428 != 0) {
                     ViewGroup var10 = (ViewGroup)this.field_2057.findViewById(var1.field_428);
                     var9 = var10;
                     if (var10 == null) {
                        var9 = var10;
                        if (!var1.field_423) {
                           throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(var1.field_428) + " for fragment " + var1);
                        }
                     }
                  } else {
                     var9 = null;
                  }

                  var1.field_399 = var9;
                  var1.field_400 = var1.method_595(var1.method_594(var1.field_410), var9, var1.field_410);
                  if (var1.field_400 != null) {
                     var1.field_401 = var1.field_400;
                     var1.field_400 = class_292.method_1006(var1.field_400);
                     if (var9 != null) {
                        Animation var12 = this.method_1958(var1, var3, true, var4);
                        if (var12 != null) {
                           var1.field_400.startAnimation(var12);
                        }

                        var9.addView(var1.field_400);
                     }

                     if (var1.field_430) {
                        var1.field_400.setVisibility(8);
                     }

                     var1.method_605(var1.field_400, var1.field_410);
                  } else {
                     var1.field_401 = null;
                  }
               }

               var1.field_397 = false;
               var1.method_615(var1.field_410);
               if (!var1.field_397) {
                  throw new class_291("Fragment " + var1 + " did not call through to super.onActivityCreated()");
               }

               if (var1.field_400 != null) {
                  var1.method_597();
               }

               var1.field_410 = null;
               var8 = var6;
            }
         case 2:
         case 3:
            var7 = var8;
            if (var8 > 3) {
               if (field_2040) {
                  Log.v("FragmentManager", "moveto STARTED: " + var1);
               }

               var1.field_397 = false;
               var1.method_627();
               var7 = var8;
               if (!var1.field_397) {
                  throw new class_291("Fragment " + var1 + " did not call through to super.onStart()");
               }
            }
         case 4:
            var6 = var7;
            if (var7 > 4) {
               if (field_2040) {
                  Log.v("FragmentManager", "moveto RESUMED: " + var1);
               }

               var1.field_397 = false;
               var1.field_420 = true;
               var1.method_619();
               if (!var1.field_397) {
                  throw new class_291("Fragment " + var1 + " did not call through to super.onResume()");
               }

               var1.field_410 = null;
               var1.field_411 = null;
               var6 = var7;
            }
            break;
         default:
            var6 = var2;
         }
      } else {
         var6 = var2;
         if (var1.field_407 > var2) {
            switch(var1.field_407) {
            case 5:
               if (var2 < 5) {
                  if (field_2040) {
                     Log.v("FragmentManager", "movefrom RESUMED: " + var1);
                  }

                  var1.field_397 = false;
                  var1.method_620();
                  if (!var1.field_397) {
                     throw new class_291("Fragment " + var1 + " did not call through to super.onPause()");
                  }

                  var1.field_420 = false;
               }
            case 4:
               if (var2 < 4) {
                  if (field_2040) {
                     Log.v("FragmentManager", "movefrom STARTED: " + var1);
                  }

                  var1.field_397 = false;
                  var1.method_628();
                  if (!var1.field_397) {
                     throw new class_291("Fragment " + var1 + " did not call through to super.onStop()");
                  }
               }
            case 3:
               if (var2 < 3) {
                  if (field_2040) {
                     Log.v("FragmentManager", "movefrom STOPPED: " + var1);
                  }

                  var1.method_629();
               }
            case 2:
               if (var2 < 2) {
                  if (field_2040) {
                     Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + var1);
                  }

                  if (var1.field_400 != null && !this.field_2057.isFinishing() && var1.field_411 == null) {
                     this.method_1988(var1);
                  }

                  var1.field_397 = false;
                  var1.method_630();
                  if (!var1.field_397) {
                     throw new class_291("Fragment " + var1 + " did not call through to super.onDestroyView()");
                  }

                  if (var1.field_400 != null && var1.field_399 != null) {
                     Animation var11;
                     if (this.field_2056 > 0 && !this.field_2060) {
                        var11 = this.method_1958(var1, var3, false, var4);
                     } else {
                        var11 = null;
                     }

                     if (var11 != null) {
                        var1.field_408 = var1.field_400;
                        var1.field_409 = var2;
                        var11.setAnimationListener(new class_627(this, var1));
                        var1.field_400.startAnimation(var11);
                     }

                     var1.field_399.removeView(var1.field_400);
                  }

                  var1.field_399 = null;
                  var1.field_400 = null;
                  var1.field_401 = null;
               }
            case 1:
               var6 = var2;
               if (var2 < 1) {
                  if (this.field_2060 && var1.field_408 != null) {
                     View var13 = var1.field_408;
                     var1.field_408 = null;
                     var13.clearAnimation();
                  }

                  if (var1.field_408 != null) {
                     var1.field_409 = var2;
                     var6 = 1;
                  } else {
                     if (field_2040) {
                        Log.v("FragmentManager", "movefrom CREATED: " + var1);
                     }

                     if (!var1.field_394) {
                        var1.field_397 = false;
                        var1.method_623();
                        if (!var1.field_397) {
                           throw new class_291("Fragment " + var1 + " did not call through to super.onDestroy()");
                        }
                     }

                     var1.field_397 = false;
                     var1.method_625();
                     if (!var1.field_397) {
                        throw new class_291("Fragment " + var1 + " did not call through to super.onDetach()");
                     }

                     var6 = var2;
                     if (!var5) {
                        if (!var1.field_394) {
                           this.method_1984(var1);
                           var6 = var2;
                        } else {
                           var1.field_426 = null;
                           var1.field_425 = null;
                           var6 = var2;
                        }
                     }
                  }
               }
               break;
            default:
               var6 = var2;
            }
         }
      }

      var1.field_407 = var6;
   }

   // $FF: renamed from: a (android.support.v4.app.Fragment, boolean) void
   public void method_1968(Fragment var1, boolean var2) {
      if (this.field_2049 == null) {
         this.field_2049 = new ArrayList();
      }

      if (field_2040) {
         Log.v("FragmentManager", "add: " + var1);
      }

      this.method_1982(var1);
      if (!var1.field_431) {
         this.field_2049.add(var1);
         var1.field_418 = true;
         var1.field_419 = false;
         if (var1.field_395 && var1.field_396) {
            this.field_2058 = true;
         }

         if (var2) {
            this.method_1977(var1);
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.app.g) void
   public void method_1969(class_181 var1) {
      if (this.field_2057 != null) {
         throw new IllegalStateException();
      } else {
         this.field_2057 = var1;
      }
   }

   // $FF: renamed from: a (java.lang.Runnable, boolean) void
   public void method_1970(Runnable var1, boolean var2) {
      if (!var2) {
         this.method_1954();
      }

      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label313: {
         try {
            if (this.field_2057 == null) {
               throw new IllegalStateException("Activity has been destroyed");
            }
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label313;
         }

         try {
            if (this.field_2045 == null) {
               this.field_2045 = new ArrayList();
            }
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label313;
         }

         try {
            this.field_2045.add(var1);
            if (this.field_2045.size() == 1) {
               this.field_2057.field_538.removeCallbacks(this.field_2065);
               this.field_2057.field_538.post(this.field_2065);
            }
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            break label313;
         }

         label295:
         try {
            return;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            break label295;
         }
      }

      while(true) {
         Throwable var33 = var10000;

         try {
            throw var33;
         } catch (Throwable var28) {
            var10000 = var28;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_1971(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      byte var6 = 0;
      String var8 = var1 + "    ";
      int var5;
      int var7;
      Fragment var9;
      if (this.field_2048 != null) {
         var7 = this.field_2048.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.print("Active Fragments in ");
            var3.print(Integer.toHexString(System.identityHashCode(this)));
            var3.println(":");

            for(var5 = 0; var5 < var7; ++var5) {
               var9 = (Fragment)this.field_2048.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var9);
               if (var9 != null) {
                  var9.method_606(var8, var2, var3, var4);
               }
            }
         }
      }

      if (this.field_2049 != null) {
         var7 = this.field_2049.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Added Fragments:");

            for(var5 = 0; var5 < var7; ++var5) {
               var9 = (Fragment)this.field_2049.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var9.toString());
            }
         }
      }

      if (this.field_2052 != null) {
         var7 = this.field_2052.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Fragments Created Menus:");

            for(var5 = 0; var5 < var7; ++var5) {
               var9 = (Fragment)this.field_2052.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var9.toString());
            }
         }
      }

      if (this.field_2051 != null) {
         var7 = this.field_2051.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Back Stack:");

            for(var5 = 0; var5 < var7; ++var5) {
               class_617 var55 = (class_617)this.field_2051.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var55.toString());
               var55.method_2017(var8, var2, var3, var4);
            }
         }
      }

      synchronized(this){}

      label1054: {
         Throwable var10000;
         boolean var10001;
         label1055: {
            label1056: {
               try {
                  if (this.field_2053 == null) {
                     break label1056;
                  }

                  var7 = this.field_2053.size();
               } catch (Throwable var51) {
                  var10000 = var51;
                  var10001 = false;
                  break label1055;
               }

               if (var7 > 0) {
                  try {
                     var3.print(var1);
                     var3.println("Back Stack Indices:");
                  } catch (Throwable var50) {
                     var10000 = var50;
                     var10001 = false;
                     break label1055;
                  }

                  for(var5 = 0; var5 < var7; ++var5) {
                     try {
                        class_617 var53 = (class_617)this.field_2053.get(var5);
                        var3.print(var1);
                        var3.print("  #");
                        var3.print(var5);
                        var3.print(": ");
                        var3.println(var53);
                     } catch (Throwable var49) {
                        var10000 = var49;
                        var10001 = false;
                        break label1055;
                     }
                  }
               }
            }

            try {
               if (this.field_2054 != null && this.field_2054.size() > 0) {
                  var3.print(var1);
                  var3.print("mAvailBackStackIndices: ");
                  var3.println(Arrays.toString(this.field_2054.toArray()));
               }
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label1055;
            }

            label996:
            try {
               break label1054;
            } catch (Throwable var47) {
               var10000 = var47;
               var10001 = false;
               break label996;
            }
         }

         while(true) {
            Throwable var52 = var10000;

            try {
               throw var52;
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               continue;
            }
         }
      }

      if (this.field_2045 != null) {
         var7 = this.field_2045.size();
         if (var7 > 0) {
            var3.print(var1);
            var3.println("Pending Actions:");

            for(var5 = var6; var5 < var7; ++var5) {
               Runnable var54 = (Runnable)this.field_2045.get(var5);
               var3.print(var1);
               var3.print("  #");
               var3.print(var5);
               var3.print(": ");
               var3.println(var54);
            }
         }
      }

      var3.print(var1);
      var3.println("FragmentManager misc state:");
      var3.print(var1);
      var3.print("  mCurState=");
      var3.print(this.field_2056);
      var3.print(" mStateSaved=");
      var3.print(this.field_2059);
      var3.print(" mDestroyed=");
      var3.println(this.field_2060);
      if (this.field_2058) {
         var3.print(var1);
         var3.print("  mNeedMenuInvalidate=");
         var3.println(this.field_2058);
      }

      if (this.field_2061 != null) {
         var3.print(var1);
         var3.print("  mNoTransactionsBecause=");
         var3.println(this.field_2061);
      }

      if (this.field_2050 != null && this.field_2050.size() > 0) {
         var3.print(var1);
         var3.print("  mAvailIndices: ");
         var3.println(Arrays.toString(this.field_2050.toArray()));
      }

   }

   // $FF: renamed from: a (android.os.Handler, java.lang.String, int, int) boolean
   boolean method_1972(Handler var1, String var2, int var3, int var4) {
      if (this.field_2051 != null) {
         if (var2 == null && var3 < 0 && (var4 & 1) == 0) {
            var3 = this.field_2051.size() - 1;
            if (var3 < 0) {
               return false;
            }

            ((class_617)this.field_2051.remove(var3)).method_2019(true);
            this.method_1992();
         } else {
            int var5 = -1;
            if (var2 != null || var3 >= 0) {
               int var6;
               class_617 var8;
               for(var6 = this.field_2051.size() - 1; var6 >= 0; --var6) {
                  var8 = (class_617)this.field_2051.get(var6);
                  if (var2 != null && var2.equals(var8.method_2018()) || var3 >= 0 && var3 == var8.field_2082) {
                     break;
                  }
               }

               if (var6 < 0) {
                  return false;
               }

               var5 = var6;
               if ((var4 & 1) != 0) {
                  var4 = var6 - 1;

                  while(true) {
                     var5 = var4;
                     if (var4 < 0) {
                        break;
                     }

                     var8 = (class_617)this.field_2051.get(var4);
                     if (var2 == null || !var2.equals(var8.method_2018())) {
                        var5 = var4;
                        if (var3 < 0) {
                           break;
                        }

                        var5 = var4;
                        if (var3 != var8.field_2082) {
                           break;
                        }
                     }

                     --var4;
                  }
               }
            }

            if (var5 == this.field_2051.size() - 1) {
               return false;
            }

            ArrayList var9 = new ArrayList();

            for(var3 = this.field_2051.size() - 1; var3 > var5; --var3) {
               var9.add(this.field_2051.remove(var3));
            }

            var4 = var9.size() - 1;

            for(var3 = 0; var3 <= var4; ++var3) {
               if (field_2040) {
                  Log.v("FragmentManager", "Popping back stack state: " + var9.get(var3));
               }

               class_617 var10 = (class_617)var9.get(var3);
               boolean var7;
               if (var3 == var4) {
                  var7 = true;
               } else {
                  var7 = false;
               }

               var10.method_2019(var7);
            }

            this.method_1992();
         }

         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (android.view.Menu) boolean
   public boolean method_1973(Menu var1) {
      boolean var4;
      if (this.field_2049 != null) {
         int var2 = 0;
         boolean var3 = false;

         while(true) {
            var4 = var3;
            if (var2 >= this.field_2049.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.field_2049.get(var2);
            var4 = var3;
            if (var5 != null) {
               var4 = var3;
               if (!var5.field_430) {
                  var4 = var3;
                  if (var5.field_395) {
                     var4 = var3;
                     if (var5.field_396) {
                        var4 = true;
                        var5.method_603(var1);
                     }
                  }
               }
            }

            ++var2;
            var3 = var4;
         }
      } else {
         var4 = false;
      }

      return var4;
   }

   // $FF: renamed from: a (android.view.Menu, android.view.MenuInflater) boolean
   public boolean method_1974(Menu var1, MenuInflater var2) {
      byte var4 = 0;
      ArrayList var8 = null;
      ArrayList var7 = null;
      int var3;
      boolean var6;
      if (this.field_2049 != null) {
         var3 = 0;
         boolean var5 = false;

         while(true) {
            var8 = var7;
            var6 = var5;
            if (var3 >= this.field_2049.size()) {
               break;
            }

            Fragment var9 = (Fragment)this.field_2049.get(var3);
            var8 = var7;
            var6 = var5;
            if (var9 != null) {
               var8 = var7;
               var6 = var5;
               if (!var9.field_430) {
                  var8 = var7;
                  var6 = var5;
                  if (var9.field_395) {
                     var8 = var7;
                     var6 = var5;
                     if (var9.field_396) {
                        var6 = true;
                        var9.method_604(var1, var2);
                        var8 = var7;
                        if (var7 == null) {
                           var8 = new ArrayList();
                        }

                        var8.add(var9);
                     }
                  }
               }
            }

            ++var3;
            var5 = var6;
            var7 = var8;
         }
      } else {
         var6 = false;
      }

      if (this.field_2052 != null) {
         for(var3 = var4; var3 < this.field_2052.size(); ++var3) {
            Fragment var10 = (Fragment)this.field_2052.get(var3);
            if (var8 == null || !var8.contains(var10)) {
               var10.method_626();
            }
         }
      }

      this.field_2052 = var8;
      return var6;
   }

   // $FF: renamed from: a (android.view.MenuItem) boolean
   public boolean method_1975(MenuItem var1) {
      boolean var4 = false;
      boolean var3 = var4;
      if (this.field_2049 != null) {
         int var2 = 0;

         while(true) {
            var3 = var4;
            if (var2 >= this.field_2049.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.field_2049.get(var2);
            if (var5 != null && !var5.field_430 && var5.field_395 && var5.field_396 && var5.method_608(var1)) {
               var3 = true;
               break;
            }

            ++var2;
         }
      }

      return var3;
   }

   // $FF: renamed from: b () void
   public void method_1948() {
      this.method_1970(new class_625(this), false);
   }

   // $FF: renamed from: b (int) void
   public void method_1976(int var1) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label196: {
         try {
            this.field_2053.set(var1, (Object)null);
            if (this.field_2054 == null) {
               this.field_2054 = new ArrayList();
            }
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label196;
         }

         try {
            if (field_2040) {
               Log.v("FragmentManager", "Freeing back stack index " + var1);
            }
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label196;
         }

         label186:
         try {
            this.field_2054.add(var1);
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label186;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: b (android.support.v4.app.Fragment) void
   void method_1977(Fragment var1) {
      this.method_1967(var1, this.field_2056, 0, 0, false);
   }

   // $FF: renamed from: b (android.support.v4.app.Fragment, int, int) void
   public void method_1978(Fragment var1, int var2, int var3) {
      if (field_2040) {
         Log.v("FragmentManager", "hide: " + var1);
      }

      if (!var1.field_430) {
         var1.field_430 = true;
         if (var1.field_400 != null) {
            Animation var4 = this.method_1958(var1, var2, true, var3);
            if (var4 != null) {
               var1.field_400.startAnimation(var4);
            }

            var1.field_400.setVisibility(8);
         }

         if (var1.field_418 && var1.field_395 && var1.field_396) {
            this.field_2058 = true;
         }

         var1.method_607(true);
      }

   }

   // $FF: renamed from: b (android.support.v4.app.b) void
   void method_1979(class_617 var1) {
      if (this.field_2051 == null) {
         this.field_2051 = new ArrayList();
      }

      this.field_2051.add(var1);
      this.method_1992();
   }

   // $FF: renamed from: b (android.view.Menu) void
   public void method_1980(Menu var1) {
      if (this.field_2049 != null) {
         for(int var2 = 0; var2 < this.field_2049.size(); ++var2) {
            Fragment var3 = (Fragment)this.field_2049.get(var2);
            if (var3 != null && !var3.field_430 && var3.field_395 && var3.field_396) {
               var3.method_610(var1);
            }
         }
      }

   }

   // $FF: renamed from: b (android.view.MenuItem) boolean
   public boolean method_1981(MenuItem var1) {
      boolean var4 = false;
      boolean var3 = var4;
      if (this.field_2049 != null) {
         int var2 = 0;

         while(true) {
            var3 = var4;
            if (var2 >= this.field_2049.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.field_2049.get(var2);
            if (var5 != null && !var5.field_430 && var5.field_403 && var5.method_613(var1)) {
               var3 = true;
               break;
            }

            ++var2;
         }
      }

      return var3;
   }

   // $FF: renamed from: c (android.support.v4.app.Fragment) void
   void method_1982(Fragment var1) {
      if (var1.field_412 < 0) {
         if (this.field_2050 != null && this.field_2050.size() > 0) {
            var1.method_598((Integer)this.field_2050.remove(this.field_2050.size() - 1));
            this.field_2048.set(var1.field_412, var1);
         } else {
            if (this.field_2048 == null) {
               this.field_2048 = new ArrayList();
            }

            var1.method_598(this.field_2048.size());
            this.field_2048.add(var1);
         }

         if (field_2040) {
            Log.v("FragmentManager", "Allocated fragment index " + var1);
            return;
         }
      }

   }

   // $FF: renamed from: c (android.support.v4.app.Fragment, int, int) void
   public void method_1983(Fragment var1, int var2, int var3) {
      if (field_2040) {
         Log.v("FragmentManager", "show: " + var1);
      }

      if (var1.field_430) {
         var1.field_430 = false;
         if (var1.field_400 != null) {
            Animation var4 = this.method_1958(var1, var2, true, var3);
            if (var4 != null) {
               var1.field_400.startAnimation(var4);
            }

            var1.field_400.setVisibility(0);
         }

         if (var1.field_418 && var1.field_395 && var1.field_396) {
            this.field_2058 = true;
         }

         var1.method_607(false);
      }

   }

   // $FF: renamed from: c () boolean
   public boolean method_1949() {
      this.method_1954();
      this.method_1986();
      return this.method_1972(this.field_2057.field_538, (String)null, -1, 0);
   }

   // $FF: renamed from: d (android.support.v4.app.Fragment) void
   void method_1984(Fragment var1) {
      if (var1.field_412 >= 0) {
         if (field_2040) {
            Log.v("FragmentManager", "Freeing fragment index " + var1);
         }

         this.field_2048.set(var1.field_412, (Object)null);
         if (this.field_2050 == null) {
            this.field_2050 = new ArrayList();
         }

         this.field_2050.add(var1.field_412);
         this.field_2057.method_695(var1.field_412);
         var1.method_624();
      }
   }

   // $FF: renamed from: d (android.support.v4.app.Fragment, int, int) void
   public void method_1985(Fragment var1, int var2, int var3) {
      if (field_2040) {
         Log.v("FragmentManager", "detach: " + var1);
      }

      if (!var1.field_431) {
         var1.field_431 = true;
         if (var1.field_418) {
            if (this.field_2049 != null) {
               this.field_2049.remove(var1);
            }

            if (var1.field_395 && var1.field_396) {
               this.field_2058 = true;
            }

            var1.field_418 = false;
            this.method_1967(var1, 1, var2, var3, false);
         }
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_1986() {
      return this.method_1991();
   }

   // $FF: renamed from: e () void
   void method_1987() {
      if (this.field_2048 != null) {
         for(int var1 = 0; var1 < this.field_2048.size(); ++var1) {
            Fragment var2 = (Fragment)this.field_2048.get(var1);
            if (var2 != null) {
               this.method_1965(var2);
            }
         }
      }

   }

   // $FF: renamed from: e (android.support.v4.app.Fragment) void
   void method_1988(Fragment var1) {
      if (var1.field_401 != null) {
         if (this.field_2064 == null) {
            this.field_2064 = new SparseArray();
         } else {
            this.field_2064.clear();
         }

         var1.field_401.saveHierarchyState(this.field_2064);
         if (this.field_2064.size() > 0) {
            var1.field_411 = this.field_2064;
            this.field_2064 = null;
            return;
         }
      }

   }

   // $FF: renamed from: e (android.support.v4.app.Fragment, int, int) void
   public void method_1989(Fragment var1, int var2, int var3) {
      if (field_2040) {
         Log.v("FragmentManager", "attach: " + var1);
      }

      if (var1.field_431) {
         var1.field_431 = false;
         if (!var1.field_418) {
            if (this.field_2049 == null) {
               this.field_2049 = new ArrayList();
            }

            this.field_2049.add(var1);
            var1.field_418 = true;
            if (var1.field_395 && var1.field_396) {
               this.field_2058 = true;
            }

            this.method_1967(var1, this.field_2056, var2, var3, false);
         }
      }

   }

   // $FF: renamed from: f (android.support.v4.app.Fragment) android.os.Bundle
   Bundle method_1990(Fragment var1) {
      if (this.field_2063 == null) {
         this.field_2063 = new Bundle();
      }

      var1.method_617(this.field_2063);
      Bundle var3;
      if (!this.field_2063.isEmpty()) {
         var3 = this.field_2063;
         this.field_2063 = null;
      } else {
         var3 = null;
      }

      if (var1.field_400 != null) {
         this.method_1988(var1);
      }

      Bundle var2 = var3;
      if (var1.field_411 != null) {
         var2 = var3;
         if (var3 == null) {
            var2 = new Bundle();
         }

         var2.putSparseParcelableArray("android:view_state", var1.field_411);
      }

      var3 = var2;
      if (!var1.field_403) {
         var3 = var2;
         if (var2 == null) {
            var3 = new Bundle();
         }

         var3.putBoolean("android:user_visible_hint", var1.field_403);
      }

      return var3;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1991() {
      if (this.field_2047) {
         throw new IllegalStateException("Recursive entry to executePendingTransactions");
      } else if (Looper.myLooper() != this.field_2057.field_538.getLooper()) {
         throw new IllegalStateException("Must be called from main thread of process");
      } else {
         boolean var4 = false;

         int var1;
         while(true) {
            synchronized(this){}

            Throwable var10000;
            boolean var10001;
            label717: {
               label708: {
                  try {
                     if (this.field_2045 != null && this.field_2045.size() != 0) {
                        break label708;
                     }
                  } catch (Throwable var47) {
                     var10000 = var47;
                     var10001 = false;
                     break label717;
                  }

                  try {
                     break;
                  } catch (Throwable var46) {
                     var10000 = var46;
                     var10001 = false;
                     break label717;
                  }
               }

               int var48;
               label697: {
                  try {
                     var48 = this.field_2045.size();
                     if (this.field_2046 != null && this.field_2046.length >= var48) {
                        break label697;
                     }
                  } catch (Throwable var45) {
                     var10000 = var45;
                     var10001 = false;
                     break label717;
                  }

                  try {
                     this.field_2046 = new Runnable[var48];
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label717;
                  }
               }

               try {
                  this.field_2045.toArray(this.field_2046);
                  this.field_2045.clear();
                  this.field_2057.field_538.removeCallbacks(this.field_2065);
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label717;
               }

               this.field_2047 = true;

               for(var1 = 0; var1 < var48; ++var1) {
                  this.field_2046[var1].run();
                  this.field_2046[var1] = null;
               }

               this.field_2047 = false;
               var4 = true;
               continue;
            }

            while(true) {
               Throwable var49 = var10000;

               try {
                  throw var49;
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (this.field_2062) {
            var1 = 0;

            boolean var2;
            boolean var3;
            for(var2 = false; var1 < this.field_2048.size(); var2 = var3) {
               Fragment var5 = (Fragment)this.field_2048.get(var1);
               var3 = var2;
               if (var5 != null) {
                  var3 = var2;
                  if (var5.field_404 != null) {
                     var3 = var2 | var5.field_404.method_2024();
                  }
               }

               ++var1;
            }

            if (!var2) {
               this.field_2062 = false;
               this.method_1987();
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: g () void
   void method_1992() {
      if (this.field_2055 != null) {
         for(int var1 = 0; var1 < this.field_2055.size(); ++var1) {
            ((class_72)this.field_2055.get(var1)).method_190();
         }
      }

   }

   // $FF: renamed from: h () java.util.ArrayList
   ArrayList method_1993() {
      ArrayList var4 = null;
      ArrayList var3 = null;
      if (this.field_2048 != null) {
         int var1 = 0;

         while(true) {
            var4 = var3;
            if (var1 >= this.field_2048.size()) {
               break;
            }

            Fragment var6 = (Fragment)this.field_2048.get(var1);
            ArrayList var5 = var3;
            if (var6 != null) {
               var5 = var3;
               if (var6.field_432) {
                  var4 = var3;
                  if (var3 == null) {
                     var4 = new ArrayList();
                  }

                  var4.add(var6);
                  var6.field_394 = true;
                  int var2;
                  if (var6.field_415 != null) {
                     var2 = var6.field_415.field_412;
                  } else {
                     var2 = -1;
                  }

                  var6.field_416 = var2;
                  var5 = var4;
                  if (field_2040) {
                     Log.v("FragmentManager", "retainNonConfig: keeping retained " + var6);
                     var5 = var4;
                  }
               }
            }

            ++var1;
            var3 = var5;
         }
      }

      return var4;
   }

   // $FF: renamed from: i () android.os.Parcelable
   Parcelable method_1994() {
      BackStackState[] var6 = null;
      this.method_1991();
      if (field_2041) {
         this.field_2059 = true;
      }

      if (this.field_2048 != null && this.field_2048.size() > 0) {
         int var3 = this.field_2048.size();
         FragmentState[] var7 = new FragmentState[var3];
         int var2 = 0;

         boolean var1;
         String var9;
         for(var1 = false; var2 < var3; ++var2) {
            Fragment var4 = (Fragment)this.field_2048.get(var2);
            if (var4 != null) {
               if (var4.field_412 < 0) {
                  var9 = "Failure saving state: active " + var4 + " has cleared index: " + var4.field_412;
                  Log.e("FragmentManager", var9);
                  this.method_1971("  ", (FileDescriptor)null, new PrintWriter(new class_226("FragmentManager")), new String[0]);
                  throw new IllegalStateException(var9);
               }

               FragmentState var5 = new FragmentState(var4);
               var7[var2] = var5;
               if (var4.field_407 > 0 && var5.field_1924 == null) {
                  var5.field_1924 = this.method_1990(var4);
                  if (var4.field_415 != null) {
                     if (var4.field_415.field_412 < 0) {
                        var9 = "Failure saving state: " + var4 + " has target not in fragment manager: " + var4.field_415;
                        Log.e("FragmentManager", var9);
                        this.method_1971("  ", (FileDescriptor)null, new PrintWriter(new class_226("FragmentManager")), new String[0]);
                        throw new IllegalStateException(var9);
                     }

                     if (var5.field_1924 == null) {
                        var5.field_1924 = new Bundle();
                     }

                     this.method_1963(var5.field_1924, "android:target_state", var4.field_415);
                     if (var4.field_417 != 0) {
                        var5.field_1924.putInt("android:target_req_state", var4.field_417);
                     }
                  }
               } else {
                  var5.field_1924 = var4.field_410;
               }

               if (field_2040) {
                  Log.v("FragmentManager", "Saved state of " + var4 + ": " + var5.field_1924);
               }

               var1 = true;
            }
         }

         if (var1) {
            int var8;
            int[] var10;
            label82: {
               if (this.field_2049 != null) {
                  var2 = this.field_2049.size();
                  if (var2 > 0) {
                     int[] var11 = new int[var2];
                     var8 = 0;

                     while(true) {
                        var10 = var11;
                        if (var8 >= var2) {
                           break label82;
                        }

                        var11[var8] = ((Fragment)this.field_2049.get(var8)).field_412;
                        if (var11[var8] < 0) {
                           var9 = "Failure saving state: active " + this.field_2049.get(var8) + " has cleared index: " + var11[var8];
                           Log.e("FragmentManager", var9);
                           this.method_1971("  ", (FileDescriptor)null, new PrintWriter(new class_226("FragmentManager")), new String[0]);
                           throw new IllegalStateException(var9);
                        }

                        if (field_2040) {
                           Log.v("FragmentManager", "saveAllState: adding fragment #" + var8 + ": " + this.field_2049.get(var8));
                        }

                        ++var8;
                     }
                  }
               }

               var10 = null;
            }

            BackStackState[] var12 = var6;
            if (this.field_2051 != null) {
               var2 = this.field_2051.size();
               var12 = var6;
               if (var2 > 0) {
                  var6 = new BackStackState[var2];
                  var8 = 0;

                  while(true) {
                     var12 = var6;
                     if (var8 >= var2) {
                        break;
                     }

                     var6[var8] = new BackStackState(this, (class_617)this.field_2051.get(var8));
                     if (field_2040) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + var8 + ": " + this.field_2051.get(var8));
                     }

                     ++var8;
                  }
               }
            }

            FragmentManagerState var13 = new FragmentManagerState();
            var13.field_652 = var7;
            var13.field_653 = var10;
            var13.field_654 = var12;
            return var13;
         }

         if (field_2040) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
         }
      }

      return null;
   }

   // $FF: renamed from: j () void
   public void method_1995() {
      this.field_2059 = false;
   }

   // $FF: renamed from: k () void
   public void method_1996() {
      this.field_2059 = false;
      this.method_1961(1, false);
   }

   // $FF: renamed from: l () void
   public void method_1997() {
      this.field_2059 = false;
      this.method_1961(2, false);
   }

   // $FF: renamed from: m () void
   public void method_1998() {
      this.field_2059 = false;
      this.method_1961(4, false);
   }

   // $FF: renamed from: n () void
   public void method_1999() {
      this.field_2059 = false;
      this.method_1961(5, false);
   }

   // $FF: renamed from: o () void
   public void method_2000() {
      this.method_1961(4, false);
   }

   // $FF: renamed from: p () void
   public void method_2001() {
      this.field_2059 = true;
      this.method_1961(3, false);
   }

   // $FF: renamed from: q () void
   public void method_2002() {
      this.method_1961(2, false);
   }

   // $FF: renamed from: r () void
   public void method_2003() {
      this.field_2060 = true;
      this.method_1991();
      this.method_1961(0, false);
      this.field_2057 = null;
   }

   // $FF: renamed from: s () void
   public void method_2004() {
      if (this.field_2049 != null) {
         for(int var1 = 0; var1 < this.field_2049.size(); ++var1) {
            Fragment var2 = (Fragment)this.field_2049.get(var1);
            if (var2 != null) {
               var2.onLowMemory();
            }
         }
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("FragmentManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      class_228.method_848(this.field_2057, var1);
      var1.append("}}");
      return var1.toString();
   }
}
