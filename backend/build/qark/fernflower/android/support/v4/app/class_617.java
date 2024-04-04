package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// $FF: renamed from: android.support.v4.app.b
final class class_617 extends class_616 implements Runnable {
   // $FF: renamed from: a android.support.v4.app.m
   final class_613 field_2068;
   // $FF: renamed from: b android.support.v4.app.c
   class_618 field_2069;
   // $FF: renamed from: c android.support.v4.app.c
   class_618 field_2070;
   // $FF: renamed from: d int
   int field_2071;
   // $FF: renamed from: e int
   int field_2072;
   // $FF: renamed from: f int
   int field_2073;
   // $FF: renamed from: g int
   int field_2074;
   // $FF: renamed from: h int
   int field_2075;
   // $FF: renamed from: i int
   int field_2076;
   // $FF: renamed from: j int
   int field_2077;
   // $FF: renamed from: k boolean
   boolean field_2078;
   // $FF: renamed from: l boolean
   boolean field_2079 = true;
   // $FF: renamed from: m java.lang.String
   String field_2080;
   // $FF: renamed from: n boolean
   boolean field_2081;
   // $FF: renamed from: o int
   int field_2082;
   // $FF: renamed from: p int
   int field_2083;
   // $FF: renamed from: q java.lang.CharSequence
   CharSequence field_2084;
   // $FF: renamed from: r int
   int field_2085;
   // $FF: renamed from: s java.lang.CharSequence
   CharSequence field_2086;

   public class_617(class_613 var1) {
      this.field_2068 = var1;
   }

   // $FF: renamed from: a (int, android.support.v4.app.Fragment, java.lang.String, int) void
   private void method_2012(int var1, Fragment var2, String var3, int var4) {
      var2.field_425 = this.field_2068;
      if (var3 != null) {
         if (var2.field_429 != null && !var3.equals(var2.field_429)) {
            throw new IllegalStateException("Can't change tag of fragment " + var2 + ": was " + var2.field_429 + " now " + var3);
         }

         var2.field_429 = var3;
      }

      if (var1 != 0) {
         if (var2.field_427 != 0 && var2.field_427 != var1) {
            throw new IllegalStateException("Can't change container ID of fragment " + var2 + ": was " + var2.field_427 + " now " + var1);
         }

         var2.field_427 = var1;
         var2.field_428 = var1;
      }

      class_618 var5 = new class_618();
      var5.field_2089 = var4;
      var5.field_2090 = var2;
      this.method_2016(var5);
   }

   // $FF: renamed from: a () int
   public int method_2006() {
      return this.method_2013(false);
   }

   // $FF: renamed from: a (boolean) int
   int method_2013(boolean var1) {
      if (this.field_2081) {
         throw new IllegalStateException("commit already called");
      } else {
         if (class_613.field_2040) {
            Log.v("BackStackEntry", "Commit: " + this);
         }

         this.field_2081 = true;
         if (this.field_2078) {
            this.field_2082 = this.field_2068.method_1955(this);
         } else {
            this.field_2082 = -1;
         }

         this.field_2068.method_1970(this, var1);
         return this.field_2082;
      }
   }

   // $FF: renamed from: a (int, int, int, int) android.support.v4.app.s
   public class_616 method_2007(int var1, int var2, int var3, int var4) {
      this.field_2072 = var1;
      this.field_2073 = var2;
      this.field_2074 = var3;
      this.field_2075 = var4;
      return this;
   }

   // $FF: renamed from: a (int, android.support.v4.app.Fragment) android.support.v4.app.s
   public class_616 method_2008(int var1, Fragment var2) {
      this.method_2012(var1, var2, (String)null, 1);
      return this;
   }

   // $FF: renamed from: a (int, android.support.v4.app.Fragment, java.lang.String) android.support.v4.app.s
   public class_616 method_2014(int var1, Fragment var2, String var3) {
      if (var1 == 0) {
         throw new IllegalArgumentException("Must use non-zero containerViewId");
      } else {
         this.method_2012(var1, var2, var3, 2);
         return this;
      }
   }

   // $FF: renamed from: a (android.support.v4.app.Fragment) android.support.v4.app.s
   public class_616 method_2009(Fragment var1) {
      class_618 var2 = new class_618();
      var2.field_2089 = 4;
      var2.field_2090 = var1;
      this.method_2016(var2);
      return this;
   }

   // $FF: renamed from: a (java.lang.String) android.support.v4.app.s
   public class_616 method_2010(String var1) {
      if (!this.field_2079) {
         throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
      } else {
         this.field_2078 = true;
         this.field_2080 = var1;
         return this;
      }
   }

   // $FF: renamed from: a (int) void
   void method_2015(int var1) {
      if (this.field_2078) {
         if (class_613.field_2040) {
            Log.v("BackStackEntry", "Bump nesting in " + this + " by " + var1);
         }

         for(class_618 var3 = this.field_2069; var3 != null; var3 = var3.field_2087) {
            Fragment var4;
            if (var3.field_2090 != null) {
               var4 = var3.field_2090;
               var4.field_424 += var1;
               if (class_613.field_2040) {
                  Log.v("BackStackEntry", "Bump nesting of " + var3.field_2090 + " to " + var3.field_2090.field_424);
               }
            }

            if (var3.field_2095 != null) {
               for(int var2 = var3.field_2095.size() - 1; var2 >= 0; --var2) {
                  var4 = (Fragment)var3.field_2095.get(var2);
                  var4.field_424 += var1;
                  if (class_613.field_2040) {
                     Log.v("BackStackEntry", "Bump nesting of " + var4 + " to " + var4.field_424);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.app.c) void
   void method_2016(class_618 var1) {
      if (this.field_2069 == null) {
         this.field_2070 = var1;
         this.field_2069 = var1;
      } else {
         var1.field_2088 = this.field_2070;
         this.field_2070.field_2087 = var1;
         this.field_2070 = var1;
      }

      var1.field_2091 = this.field_2072;
      var1.field_2092 = this.field_2073;
      var1.field_2093 = this.field_2074;
      var1.field_2094 = this.field_2075;
      ++this.field_2071;
   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_2017(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mName=");
      var3.print(this.field_2080);
      var3.print(" mIndex=");
      var3.print(this.field_2082);
      var3.print(" mCommitted=");
      var3.println(this.field_2081);
      if (this.field_2076 != 0) {
         var3.print(var1);
         var3.print("mTransition=#");
         var3.print(Integer.toHexString(this.field_2076));
         var3.print(" mTransitionStyle=#");
         var3.println(Integer.toHexString(this.field_2077));
      }

      if (this.field_2072 != 0 || this.field_2073 != 0) {
         var3.print(var1);
         var3.print("mEnterAnim=#");
         var3.print(Integer.toHexString(this.field_2072));
         var3.print(" mExitAnim=#");
         var3.println(Integer.toHexString(this.field_2073));
      }

      if (this.field_2074 != 0 || this.field_2075 != 0) {
         var3.print(var1);
         var3.print("mPopEnterAnim=#");
         var3.print(Integer.toHexString(this.field_2074));
         var3.print(" mPopExitAnim=#");
         var3.println(Integer.toHexString(this.field_2075));
      }

      if (this.field_2083 != 0 || this.field_2084 != null) {
         var3.print(var1);
         var3.print("mBreadCrumbTitleRes=#");
         var3.print(Integer.toHexString(this.field_2083));
         var3.print(" mBreadCrumbTitleText=");
         var3.println(this.field_2084);
      }

      if (this.field_2085 != 0 || this.field_2086 != null) {
         var3.print(var1);
         var3.print("mBreadCrumbShortTitleRes=#");
         var3.print(Integer.toHexString(this.field_2085));
         var3.print(" mBreadCrumbShortTitleText=");
         var3.println(this.field_2086);
      }

      if (this.field_2069 != null) {
         var3.print(var1);
         var3.println("Operations:");
         String var7 = var1 + "    ";

         for(class_618 var6 = this.field_2069; var6 != null; var6 = var6.field_2087) {
            var3.print(var1);
            var3.print("  Op #");
            var3.print(0);
            var3.println(":");
            var3.print(var7);
            var3.print("cmd=");
            var3.print(var6.field_2089);
            var3.print(" fragment=");
            var3.println(var6.field_2090);
            if (var6.field_2091 != 0 || var6.field_2092 != 0) {
               var3.print(var1);
               var3.print("enterAnim=#");
               var3.print(Integer.toHexString(var6.field_2091));
               var3.print(" exitAnim=#");
               var3.println(Integer.toHexString(var6.field_2092));
            }

            if (var6.field_2093 != 0 || var6.field_2094 != 0) {
               var3.print(var1);
               var3.print("popEnterAnim=#");
               var3.print(Integer.toHexString(var6.field_2093));
               var3.print(" popExitAnim=#");
               var3.println(Integer.toHexString(var6.field_2094));
            }

            if (var6.field_2095 != null && var6.field_2095.size() > 0) {
               for(int var5 = 0; var5 < var6.field_2095.size(); ++var5) {
                  var3.print(var7);
                  if (var6.field_2095.size() == 1) {
                     var3.print("Removed: ");
                  } else {
                     var3.println("Removed:");
                     var3.print(var7);
                     var3.print("  #");
                     var3.print(0);
                     var3.print(": ");
                  }

                  var3.println(var6.field_2095.get(var5));
               }
            }
         }
      }

   }

   // $FF: renamed from: b (int, android.support.v4.app.Fragment) android.support.v4.app.s
   public class_616 method_2011(int var1, Fragment var2) {
      return this.method_2014(var1, var2, (String)null);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_2018() {
      return this.field_2080;
   }

   // $FF: renamed from: b (boolean) void
   public void method_2019(boolean var1) {
      if (class_613.field_2040) {
         Log.v("BackStackEntry", "popFromBackStack: " + this);
      }

      this.method_2015(-1);

      for(class_618 var3 = this.field_2070; var3 != null; var3 = var3.field_2088) {
         Fragment var4;
         switch(var3.field_2089) {
         case 1:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2094;
            this.field_2068.method_1966(var4, class_613.method_1953(this.field_2076), this.field_2077);
            break;
         case 2:
            var4 = var3.field_2090;
            if (var4 != null) {
               var4.field_398 = var3.field_2094;
               this.field_2068.method_1966(var4, class_613.method_1953(this.field_2076), this.field_2077);
            }

            if (var3.field_2095 != null) {
               for(int var2 = 0; var2 < var3.field_2095.size(); ++var2) {
                  var4 = (Fragment)var3.field_2095.get(var2);
                  var4.field_398 = var3.field_2093;
                  this.field_2068.method_1968(var4, false);
               }
            }
            break;
         case 3:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2093;
            this.field_2068.method_1968(var4, false);
            break;
         case 4:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2093;
            this.field_2068.method_1983(var4, class_613.method_1953(this.field_2076), this.field_2077);
            break;
         case 5:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2094;
            this.field_2068.method_1978(var4, class_613.method_1953(this.field_2076), this.field_2077);
            break;
         case 6:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2093;
            this.field_2068.method_1989(var4, class_613.method_1953(this.field_2076), this.field_2077);
            break;
         case 7:
            var4 = var3.field_2090;
            var4.field_398 = var3.field_2093;
            this.field_2068.method_1985(var4, class_613.method_1953(this.field_2076), this.field_2077);
            break;
         default:
            throw new IllegalArgumentException("Unknown cmd: " + var3.field_2089);
         }
      }

      if (var1) {
         this.field_2068.method_1959(this.field_2068.field_2056, class_613.method_1953(this.field_2076), this.field_2077, true);
      }

      if (this.field_2082 >= 0) {
         this.field_2068.method_1976(this.field_2082);
         this.field_2082 = -1;
      }

   }

   public void run() {
      if (class_613.field_2040) {
         Log.v("BackStackEntry", "Run: " + this);
      }

      if (this.field_2078 && this.field_2082 < 0) {
         throw new IllegalStateException("addToBackStack() called after commit()");
      } else {
         this.method_2015(1);

         for(class_618 var3 = this.field_2069; var3 != null; var3 = var3.field_2087) {
            Fragment var2;
            switch(var3.field_2089) {
            case 1:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2091;
               this.field_2068.method_1968(var2, false);
               break;
            case 2:
               var2 = var3.field_2090;
               Fragment var4;
               if (this.field_2068.field_2049 == null) {
                  var4 = var2;
               } else {
                  int var1 = 0;

                  while(true) {
                     var4 = var2;
                     if (var1 >= this.field_2068.field_2049.size()) {
                        break;
                     }

                     Fragment var5 = (Fragment)this.field_2068.field_2049.get(var1);
                     if (class_613.field_2040) {
                        Log.v("BackStackEntry", "OP_REPLACE: adding=" + var2 + " old=" + var5);
                     }

                     label67: {
                        if (var2 != null) {
                           var4 = var2;
                           if (var5.field_428 != var2.field_428) {
                              break label67;
                           }
                        }

                        if (var5 == var2) {
                           var4 = null;
                           var3.field_2090 = null;
                        } else {
                           if (var3.field_2095 == null) {
                              var3.field_2095 = new ArrayList();
                           }

                           var3.field_2095.add(var5);
                           var5.field_398 = var3.field_2092;
                           if (this.field_2078) {
                              ++var5.field_424;
                              if (class_613.field_2040) {
                                 Log.v("BackStackEntry", "Bump nesting of " + var5 + " to " + var5.field_424);
                              }
                           }

                           this.field_2068.method_1966(var5, this.field_2076, this.field_2077);
                           var4 = var2;
                        }
                     }

                     ++var1;
                     var2 = var4;
                  }
               }

               if (var4 != null) {
                  var4.field_398 = var3.field_2091;
                  this.field_2068.method_1968(var4, false);
               }
               break;
            case 3:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2092;
               this.field_2068.method_1966(var2, this.field_2076, this.field_2077);
               break;
            case 4:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2092;
               this.field_2068.method_1978(var2, this.field_2076, this.field_2077);
               break;
            case 5:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2091;
               this.field_2068.method_1983(var2, this.field_2076, this.field_2077);
               break;
            case 6:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2092;
               this.field_2068.method_1985(var2, this.field_2076, this.field_2077);
               break;
            case 7:
               var2 = var3.field_2090;
               var2.field_398 = var3.field_2091;
               this.field_2068.method_1989(var2, this.field_2076, this.field_2077);
               break;
            default:
               throw new IllegalArgumentException("Unknown cmd: " + var3.field_2089);
            }
         }

         this.field_2068.method_1959(this.field_2068.field_2056, this.field_2076, this.field_2077, true);
         if (this.field_2078) {
            this.field_2068.method_1979(this);
         }

      }
   }
}
