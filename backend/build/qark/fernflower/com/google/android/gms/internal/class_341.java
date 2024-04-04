package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.hy
public abstract class class_341 extends class_340 {
   // $FF: renamed from: d boolean
   static boolean field_953 = false;
   // $FF: renamed from: e java.lang.reflect.Method
   private static Method field_954;
   // $FF: renamed from: f java.lang.reflect.Method
   private static Method field_955;
   // $FF: renamed from: g java.lang.reflect.Method
   private static Method field_956;
   // $FF: renamed from: h java.lang.reflect.Method
   private static Method field_957;
   // $FF: renamed from: i java.lang.reflect.Method
   private static Method field_958;
   // $FF: renamed from: j java.lang.reflect.Method
   private static Method field_959;
   // $FF: renamed from: k java.lang.String
   private static String field_960;
   // $FF: renamed from: l long
   private static long field_961 = 0L;
   // $FF: renamed from: m com.google.android.gms.internal.jm
   private static class_411 field_962;

   protected class_341(Context var1, class_46 var2, class_45 var3) {
      super(var1, var2, var3);
   }

   // $FF: renamed from: a () java.lang.String
   static String method_1176() {
      if (field_960 == null) {
         throw new class_339();
      } else {
         return field_960;
      }
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.jk) java.lang.String
   static String method_1177(Context var0, class_46 var1) {
      if (field_956 == null) {
         throw new class_339();
      } else {
         InvocationTargetException var10000;
         label36: {
            IllegalAccessException var12;
            label35: {
               ByteBuffer var8;
               boolean var10001;
               try {
                  var8 = (ByteBuffer)field_956.invoke((Object)null, var0);
               } catch (IllegalAccessException var6) {
                  var12 = var6;
                  var10001 = false;
                  break label35;
               } catch (InvocationTargetException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label36;
               }

               if (var8 == null) {
                  try {
                     throw new class_339();
                  } catch (IllegalAccessException var2) {
                     var12 = var2;
                     var10001 = false;
                  } catch (InvocationTargetException var3) {
                     var10000 = var3;
                     var10001 = false;
                     break label36;
                  }
               } else {
                  try {
                     String var11 = var1.method_134(var8.array(), true);
                     return var11;
                  } catch (IllegalAccessException var4) {
                     var12 = var4;
                     var10001 = false;
                  } catch (InvocationTargetException var5) {
                     var10000 = var5;
                     var10001 = false;
                     break label36;
                  }
               }
            }

            IllegalAccessException var10 = var12;
            throw new class_339(var10);
         }

         InvocationTargetException var9 = var10000;
         throw new class_339(var9);
      }
   }

   // $FF: renamed from: a (android.view.MotionEvent, android.util.DisplayMetrics) java.util.ArrayList
   static ArrayList method_1178(MotionEvent var0, DisplayMetrics var1) {
      if (field_957 != null && var0 != null) {
         try {
            ArrayList var4 = (ArrayList)field_957.invoke((Object)null, var0, var1);
            return var4;
         } catch (IllegalAccessException var2) {
            throw new class_339(var2);
         } catch (InvocationTargetException var3) {
            throw new class_339(var3);
         }
      } else {
         throw new class_339();
      }
   }

   // $FF: renamed from: a (java.lang.String, android.content.Context, com.google.android.gms.internal.jk) void
   protected static void method_1179(String param0, Context param1, class_46 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () java.lang.Long
   static Long method_1180() {
      if (field_954 == null) {
         throw new class_339();
      } else {
         try {
            Long var0 = (Long)field_954.invoke((Object)null);
            return var0;
         } catch (IllegalAccessException var1) {
            throw new class_339(var1);
         } catch (InvocationTargetException var2) {
            throw new class_339(var2);
         }
      }
   }

   // $FF: renamed from: b (android.content.Context, com.google.android.gms.internal.jk) java.lang.String
   static String method_1181(Context var0, class_46 var1) {
      if (field_959 == null) {
         throw new class_339();
      } else {
         InvocationTargetException var10000;
         label36: {
            IllegalAccessException var12;
            label35: {
               ByteBuffer var8;
               boolean var10001;
               try {
                  var8 = (ByteBuffer)field_959.invoke((Object)null, var0);
               } catch (IllegalAccessException var6) {
                  var12 = var6;
                  var10001 = false;
                  break label35;
               } catch (InvocationTargetException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label36;
               }

               if (var8 == null) {
                  try {
                     throw new class_339();
                  } catch (IllegalAccessException var2) {
                     var12 = var2;
                     var10001 = false;
                  } catch (InvocationTargetException var3) {
                     var10000 = var3;
                     var10001 = false;
                     break label36;
                  }
               } else {
                  try {
                     String var11 = var1.method_134(var8.array(), true);
                     return var11;
                  } catch (IllegalAccessException var4) {
                     var12 = var4;
                     var10001 = false;
                  } catch (InvocationTargetException var5) {
                     var10000 = var5;
                     var10001 = false;
                     break label36;
                  }
               }
            }

            IllegalAccessException var10 = var12;
            throw new class_339(var10);
         }

         InvocationTargetException var9 = var10000;
         throw new class_339(var9);
      }
   }

   // $FF: renamed from: b (byte[], java.lang.String) java.lang.String
   private static String method_1182(byte[] var0, String var1) {
      try {
         String var4 = new String(field_962.method_1420(var0, var1), "UTF-8");
         return var4;
      } catch (class_415 var2) {
         throw new class_339(var2);
      } catch (UnsupportedEncodingException var3) {
         throw new class_339(var3);
      }
   }

   // $FF: renamed from: c () java.lang.String
   static String method_1183() {
      if (field_955 == null) {
         throw new class_339();
      } else {
         try {
            String var0 = (String)field_955.invoke((Object)null);
            return var0;
         } catch (IllegalAccessException var1) {
            throw new class_339(var1);
         } catch (InvocationTargetException var2) {
            throw new class_339(var2);
         }
      }
   }

   // $FF: renamed from: d (android.content.Context) java.lang.String
   static String method_1184(Context var0) {
      if (field_958 == null) {
         throw new class_339();
      } else {
         IllegalAccessException var8;
         label32: {
            InvocationTargetException var10000;
            label39: {
               boolean var10001;
               String var5;
               try {
                  var5 = (String)field_958.invoke((Object)null, var0);
               } catch (IllegalAccessException var3) {
                  var8 = var3;
                  var10001 = false;
                  break label32;
               } catch (InvocationTargetException var4) {
                  var10000 = var4;
                  var10001 = false;
                  break label39;
               }

               if (var5 != null) {
                  return var5;
               }

               try {
                  throw new class_339();
               } catch (IllegalAccessException var1) {
                  var8 = var1;
                  var10001 = false;
                  break label32;
               } catch (InvocationTargetException var2) {
                  var10000 = var2;
                  var10001 = false;
               }
            }

            InvocationTargetException var6 = var10000;
            throw new class_339(var6);
         }

         IllegalAccessException var7 = var8;
         throw new class_339(var7);
      }
   }

   // $FF: renamed from: e (android.content.Context) void
   private static void method_1185(Context var0) {
      FileNotFoundException var48;
      label88: {
         IOException var47;
         label87: {
            ClassNotFoundException var46;
            label86: {
               class_415 var45;
               label85: {
                  NoSuchMethodException var44;
                  label84: {
                     NullPointerException var10000;
                     label90: {
                        File var2;
                        byte[] var3;
                        byte[] var4;
                        boolean var10001;
                        try {
                           var3 = field_962.method_1419(class_413.method_1421());
                           var4 = field_962.method_1420(var3, class_413.method_1422());
                           var2 = var0.getCacheDir();
                        } catch (FileNotFoundException var27) {
                           var48 = var27;
                           var10001 = false;
                           break label88;
                        } catch (IOException var28) {
                           var47 = var28;
                           var10001 = false;
                           break label87;
                        } catch (ClassNotFoundException var29) {
                           var46 = var29;
                           var10001 = false;
                           break label86;
                        } catch (class_415 var30) {
                           var45 = var30;
                           var10001 = false;
                           break label85;
                        } catch (NoSuchMethodException var31) {
                           var44 = var31;
                           var10001 = false;
                           break label84;
                        } catch (NullPointerException var32) {
                           var10000 = var32;
                           var10001 = false;
                           break label90;
                        }

                        File var1 = var2;
                        if (var2 == null) {
                           try {
                              var2 = var0.getDir("dex", 0);
                           } catch (FileNotFoundException var21) {
                              var48 = var21;
                              var10001 = false;
                              break label88;
                           } catch (IOException var22) {
                              var47 = var22;
                              var10001 = false;
                              break label87;
                           } catch (ClassNotFoundException var23) {
                              var46 = var23;
                              var10001 = false;
                              break label86;
                           } catch (class_415 var24) {
                              var45 = var24;
                              var10001 = false;
                              break label85;
                           } catch (NoSuchMethodException var25) {
                              var44 = var25;
                              var10001 = false;
                              break label84;
                           } catch (NullPointerException var26) {
                              var10000 = var26;
                              var10001 = false;
                              break label90;
                           }

                           var1 = var2;
                           if (var2 == null) {
                              try {
                                 throw new class_339();
                              } catch (FileNotFoundException var9) {
                                 var48 = var9;
                                 var10001 = false;
                                 break label88;
                              } catch (IOException var10) {
                                 var47 = var10;
                                 var10001 = false;
                                 break label87;
                              } catch (ClassNotFoundException var11) {
                                 var46 = var11;
                                 var10001 = false;
                                 break label86;
                              } catch (class_415 var12) {
                                 var45 = var12;
                                 var10001 = false;
                                 break label85;
                              } catch (NoSuchMethodException var13) {
                                 var44 = var13;
                                 var10001 = false;
                                 break label84;
                              } catch (NullPointerException var14) {
                                 var10000 = var14;
                                 var10001 = false;
                                 break label90;
                              }
                           }
                        }

                        try {
                           var2 = File.createTempFile("ads", ".jar", var1);
                           FileOutputStream var5 = new FileOutputStream(var2);
                           var5.write(var4, 0, var4.length);
                           var5.close();
                           DexClassLoader var8 = new DexClassLoader(var2.getAbsolutePath(), var1.getAbsolutePath(), (String)null, var0.getClassLoader());
                           Class var33 = var8.loadClass(method_1182(var3, class_413.method_1423()));
                           Class var41 = var8.loadClass(method_1182(var3, class_413.method_1429()));
                           Class var42 = var8.loadClass(method_1182(var3, class_413.method_1427()));
                           Class var6 = var8.loadClass(method_1182(var3, class_413.method_1433()));
                           Class var7 = var8.loadClass(method_1182(var3, class_413.method_1425()));
                           Class var43 = var8.loadClass(method_1182(var3, class_413.method_1431()));
                           field_954 = var33.getMethod(method_1182(var3, class_413.method_1424()));
                           field_955 = var41.getMethod(method_1182(var3, class_413.method_1430()));
                           field_956 = var42.getMethod(method_1182(var3, class_413.method_1428()), Context.class);
                           field_957 = var6.getMethod(method_1182(var3, class_413.method_1434()), MotionEvent.class, DisplayMetrics.class);
                           field_958 = var7.getMethod(method_1182(var3, class_413.method_1426()), Context.class);
                           field_959 = var43.getMethod(method_1182(var3, class_413.method_1432()), Context.class);
                           String var34 = var2.getName();
                           var2.delete();
                           (new File(var1, var34.replace(".jar", ".dex"))).delete();
                           return;
                        } catch (FileNotFoundException var15) {
                           var48 = var15;
                           var10001 = false;
                           break label88;
                        } catch (IOException var16) {
                           var47 = var16;
                           var10001 = false;
                           break label87;
                        } catch (ClassNotFoundException var17) {
                           var46 = var17;
                           var10001 = false;
                           break label86;
                        } catch (class_415 var18) {
                           var45 = var18;
                           var10001 = false;
                           break label85;
                        } catch (NoSuchMethodException var19) {
                           var44 = var19;
                           var10001 = false;
                           break label84;
                        } catch (NullPointerException var20) {
                           var10000 = var20;
                           var10001 = false;
                        }
                     }

                     NullPointerException var35 = var10000;
                     throw new class_339(var35);
                  }

                  NoSuchMethodException var36 = var44;
                  throw new class_339(var36);
               }

               class_415 var37 = var45;
               throw new class_339(var37);
            }

            ClassNotFoundException var38 = var46;
            throw new class_339(var38);
         }

         IOException var39 = var47;
         throw new class_339(var39);
      }

      FileNotFoundException var40 = var48;
      throw new class_339(var40);
   }

   // $FF: renamed from: b (android.content.Context) void
   protected void method_1174(Context var1) {
      try {
         try {
            this.a(1, method_1183());
         } catch (class_339 var6) {
         }

         try {
            this.a(2, method_1176());
         } catch (class_339 var5) {
         }

         try {
            this.a(25, method_1180());
         } catch (class_339 var4) {
         }

         try {
            this.a(24, method_1184(var1));
         } catch (class_339 var3) {
         }
      } catch (IOException var7) {
      }
   }

   // $FF: renamed from: c (android.content.Context) void
   protected void method_1175(Context var1) {
      try {
         try {
            this.a(2, method_1176());
         } catch (class_339 var10) {
         }

         try {
            this.a(1, method_1183());
         } catch (class_339 var9) {
         }

         try {
            long var2 = method_1180();
            this.a(25, var2);
            if (field_961 != 0L) {
               this.a(17, var2 - field_961);
               this.a(23, field_961);
            }
         } catch (class_339 var8) {
         }

         try {
            ArrayList var4 = method_1178(this.a, this.b);
            this.a(14, (Long)var4.get(0));
            this.a(15, (Long)var4.get(1));
            if (var4.size() >= 3) {
               this.a(16, (Long)var4.get(2));
            }
         } catch (class_339 var7) {
         }

         try {
            this.a(27, method_1177(var1, this.c));
         } catch (class_339 var6) {
         }

         try {
            this.a(29, method_1181(var1, this.c));
         } catch (class_339 var5) {
         }
      } catch (IOException var11) {
      }
   }
}
