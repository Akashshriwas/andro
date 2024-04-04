package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.class_174;
import com.google.android.gms.common.class_25;
import com.google.android.gms.common.class_26;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.gh
public final class class_321 {
   // $FF: renamed from: a java.util.ArrayList
   final ArrayList field_908 = new ArrayList();
   // $FF: renamed from: b com.google.android.gms.internal.gj
   private final class_41 field_909;
   // $FF: renamed from: c java.util.ArrayList
   private ArrayList field_910;
   // $FF: renamed from: d boolean
   private boolean field_911 = false;
   // $FF: renamed from: e java.util.ArrayList
   private ArrayList field_912;
   // $FF: renamed from: f android.os.Handler
   private final Handler field_913;
   // $FF: renamed from: g boolean
   private boolean field_914 = false;

   class_321(Context var1, class_41 var2, Handler var3) {
      Object var4 = var3;
      if (var3 == null) {
         var4 = new class_320(this, Looper.getMainLooper());
      }

      this.field_910 = new ArrayList();
      this.field_912 = new ArrayList();
      this.field_909 = var2;
      this.field_913 = (Handler)var4;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gh) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_1059(class_321 var0) {
      return var0.field_910;
   }

   // $FF: renamed from: b (com.google.android.gms.internal.gh) com.google.android.gms.internal.gj
   // $FF: synthetic method
   static class_41 method_1060(class_321 var0) {
      return var0.field_909;
   }

   // $FF: renamed from: a () void
   protected void method_1061() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.os.Bundle) void
   public void method_1062(Bundle var1) {
      boolean var5 = true;
      ArrayList var6 = this.field_910;
      synchronized(var6){}

      Throwable var10000;
      boolean var10001;
      label633: {
         boolean var4;
         label628: {
            label627: {
               try {
                  if (this.field_911) {
                     break label627;
                  }
               } catch (Throwable var63) {
                  var10000 = var63;
                  var10001 = false;
                  break label633;
               }

               var4 = true;
               break label628;
            }

            var4 = false;
         }

         label620: {
            label619: {
               try {
                  class_343.method_1192(var4);
                  this.field_913.removeMessages(1);
                  this.field_911 = true;
                  if (this.field_908.size() != 0) {
                     break label619;
                  }
               } catch (Throwable var62) {
                  var10000 = var62;
                  var10001 = false;
                  break label633;
               }

               var4 = var5;
               break label620;
            }

            var4 = false;
         }

         int var3;
         ArrayList var7;
         try {
            class_343.method_1192(var4);
            var7 = this.field_910;
            var3 = var7.size();
         } catch (Throwable var61) {
            var10000 = var61;
            var10001 = false;
            break label633;
         }

         for(int var2 = 0; var2 < var3; ++var2) {
            try {
               if (!this.field_909.method_125() || !this.field_909.method_123()) {
                  break;
               }
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label633;
            }

            try {
               this.field_908.size();
               if (!this.field_908.contains(var7.get(var2))) {
                  ((class_26)var7.get(var2)).method_81(var1);
               }
            } catch (Throwable var60) {
               var10000 = var60;
               var10001 = false;
               break label633;
            }
         }

         label593:
         try {
            this.field_908.clear();
            this.field_911 = false;
            return;
         } catch (Throwable var58) {
            var10000 = var58;
            var10001 = false;
            break label593;
         }
      }

      while(true) {
         Throwable var64 = var10000;

         try {
            throw var64;
         } catch (Throwable var57) {
            var10000 = var57;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.common.a) void
   public void method_1063(class_174 var1) {
      this.field_913.removeMessages(1);
      ArrayList var4 = this.field_912;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label320: {
         int var3;
         ArrayList var5;
         try {
            this.field_914 = true;
            var5 = this.field_912;
            var3 = var5.size();
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label320;
         }

         for(int var2 = 0; var2 < var3; ++var2) {
            try {
               if (!this.field_909.method_125()) {
                  return;
               }
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label320;
            }

            try {
               if (this.field_912.contains(var5.get(var2))) {
                  ((class_25)var5.get(var2)).method_80(var1);
               }
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label320;
            }
         }

         label299:
         try {
            this.field_914 = false;
            return;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label299;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.common.c) void
   public void method_1064(class_26 var1) {
      class_343.method_1189(var1);
      ArrayList var2 = this.field_910;
      synchronized(var2){}

      label317: {
         Throwable var10000;
         boolean var10001;
         label312: {
            label318: {
               try {
                  if (this.field_910.contains(var1)) {
                     Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + var1 + " is already registered");
                     break label318;
                  }
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label312;
               }

               try {
                  if (this.field_911) {
                     this.field_910 = new ArrayList(this.field_910);
                  }
               } catch (Throwable var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label312;
               }

               try {
                  this.field_910.add(var1);
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label312;
               }
            }

            label298:
            try {
               break label317;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break label298;
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

      if (this.field_909.method_123()) {
         this.field_913.sendMessage(this.field_913.obtainMessage(1, var1));
      }

   }

   // $FF: renamed from: a (com.google.android.gms.common.d) void
   public void method_1065(class_25 var1) {
      class_343.method_1189(var1);
      ArrayList var2 = this.field_912;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label273: {
         label277: {
            try {
               if (this.field_912.contains(var1)) {
                  Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + var1 + " is already registered");
                  break label277;
               }
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label273;
            }

            try {
               if (this.field_914) {
                  this.field_912 = new ArrayList(this.field_912);
               }
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label273;
            }

            try {
               this.field_912.add(var1);
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label273;
            }
         }

         label259:
         try {
            return;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            break label259;
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

   // $FF: renamed from: b () void
   public void method_1066() {
      this.field_913.removeMessages(1);
      ArrayList var3 = this.field_910;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label313: {
         int var2;
         ArrayList var4;
         try {
            this.field_911 = true;
            var4 = this.field_910;
            var2 = var4.size();
         } catch (Throwable var34) {
            var10000 = var34;
            var10001 = false;
            break label313;
         }

         for(int var1 = 0; var1 < var2; ++var1) {
            try {
               if (!this.field_909.method_125()) {
                  break;
               }
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label313;
            }

            try {
               if (this.field_910.contains(var4.get(var1))) {
                  ((class_26)var4.get(var1)).method_82();
               }
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label313;
            }
         }

         label291:
         try {
            this.field_911 = false;
            return;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label291;
         }
      }

      while(true) {
         Throwable var35 = var10000;

         try {
            throw var35;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }
}
