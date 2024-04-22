package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import java.util.HashMap;

// $FF: renamed from: com.google.android.gms.internal.gk
public final class class_326 implements Callback {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_930 = new Object();
   // $FF: renamed from: b com.google.android.gms.internal.gk
   private static class_326 field_931;
   // $FF: renamed from: c android.content.Context
   private final Context field_932;
   // $FF: renamed from: d java.util.HashMap
   private final HashMap field_933;
   // $FF: renamed from: e android.os.Handler
   private final Handler field_934;

   private class_326(Context var1) {
      this.field_934 = new Handler(var1.getMainLooper(), this);
      this.field_933 = new HashMap();
      this.field_932 = var1.getApplicationContext();
   }

   // $FF: renamed from: a (android.content.Context) com.google.android.gms.internal.gk
   public static class_326 method_1087(Context var0) {
      Object var1 = field_930;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label131: {
         try {
            if (field_931 == null) {
               field_931 = new class_326(var0.getApplicationContext());
            }
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label131;
         }

         label128:
         try {
            return field_931;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label128;
         }
      }

      while(true) {
         Throwable var14 = var10000;

         try {
            throw var14;
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gk) java.util.HashMap
   // $FF: synthetic method
   static HashMap method_1088(class_326 var0) {
      return var0.field_933;
   }

   // $FF: renamed from: a (java.lang.String, com.google.android.gms.internal.ge) boolean
   public boolean method_1089(String var1, class_318 var2) {
      HashMap var5 = this.field_933;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label661: {
         class_325 var4;
         try {
            var4 = (class_325)this.field_933.get(var1);
         } catch (Throwable var77) {
            var10000 = var77;
            var10001 = false;
            break label661;
         }

         class_325 var78;
         if (var4 == null) {
            try {
               var4 = new class_325(this, var1);
               var4.method_1077(var2);
               Intent var80 = (new Intent(var1)).setPackage("com.google.android.gms");
               var4.method_1078(this.field_932.bindService(var80, var4.method_1076(), 129));
               this.field_933.put(var1, var4);
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label661;
            }

            var78 = var4;
         } else {
            label662: {
               try {
                  this.field_934.removeMessages(0, var4);
                  if (var4.method_1082(var2)) {
                     throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + var1);
                  }
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label661;
               }

               label663: {
                  label664: {
                     try {
                        var4.method_1077(var2);
                        switch(var4.method_1083()) {
                        case 1:
                           break;
                        case 2:
                           break label664;
                        default:
                           break label663;
                        }
                     } catch (Throwable var76) {
                        var10000 = var76;
                        var10001 = false;
                        break label661;
                     }

                     try {
                        var2.onServiceConnected(var4.method_1086(), var4.method_1085());
                     } catch (Throwable var73) {
                        var10000 = var73;
                        var10001 = false;
                        break label661;
                     }

                     var78 = var4;
                     break label662;
                  }

                  try {
                     Intent var79 = (new Intent(var1)).setPackage("com.google.android.gms");
                     var4.method_1078(this.field_932.bindService(var79, var4.method_1076(), 129));
                  } catch (Throwable var72) {
                     var10000 = var72;
                     var10001 = false;
                     break label661;
                  }

                  var78 = var4;
                  break label662;
               }

               var78 = var4;
            }
         }

         label628:
         try {
            boolean var3 = var78.method_1081();
            return var3;
         } catch (Throwable var71) {
            var10000 = var71;
            var10001 = false;
            break label628;
         }
      }

      while(true) {
         Throwable var81 = var10000;

         try {
            throw var81;
         } catch (Throwable var70) {
            var10000 = var70;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: b (java.lang.String, com.google.android.gms.internal.ge) void
   public void method_1090(String var1, class_318 var2) {
      HashMap var3 = this.field_933;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label347: {
         class_325 var4;
         try {
            var4 = (class_325)this.field_933.get(var1);
         } catch (Throwable var46) {
            var10000 = var46;
            var10001 = false;
            break label347;
         }

         if (var4 == null) {
            label335:
            try {
               throw new IllegalStateException("Nonexistent connection status for service action: " + var1);
            } catch (Throwable var42) {
               var10000 = var42;
               var10001 = false;
               break label335;
            }
         } else {
            label351: {
               try {
                  if (!var4.method_1082(var2)) {
                     throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + var1);
                  }
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label351;
               }

               try {
                  var4.method_1080(var2);
                  if (var4.method_1084()) {
                     Message var47 = this.field_934.obtainMessage(0, var4);
                     this.field_934.sendMessageDelayed(var47, 5000L);
                  }
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label351;
               }

               label337:
               try {
                  return;
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label337;
               }
            }
         }
      }

      while(true) {
         Throwable var48 = var10000;

         try {
            throw var48;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean handleMessage(Message var1) {
      switch(var1.what) {
      case 0:
         class_325 var2 = (class_325)var1.obj;
         HashMap var15 = this.field_933;
         synchronized(var15){}

         Throwable var10000;
         boolean var10001;
         label133: {
            try {
               if (var2.method_1084()) {
                  this.field_932.unbindService(var2.method_1076());
                  this.field_933.remove(var2.method_1079());
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label133;
            }

            label130:
            try {
               return true;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label130;
            }
         }

         while(true) {
            Throwable var16 = var10000;

            try {
               throw var16;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               continue;
            }
         }
      default:
         return false;
      }
   }
}
