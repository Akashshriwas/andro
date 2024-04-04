package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_343;

public final class DataHolder implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.common.data.c
   public static final class_276 field_1033 = new class_276();
   // $FF: renamed from: m com.google.android.gms.common.data.b
   private static final class_268 field_1034 = new class_269(new String[0], (String)null);
   // $FF: renamed from: b android.os.Bundle
   Bundle field_1035;
   // $FF: renamed from: c int[]
   int[] field_1036;
   // $FF: renamed from: d int
   int field_1037;
   // $FF: renamed from: e boolean
   boolean field_1038 = false;
   // $FF: renamed from: f int
   private final int field_1039;
   // $FF: renamed from: g java.lang.String[]
   private final String[] field_1040;
   // $FF: renamed from: h android.database.CursorWindow[]
   private final CursorWindow[] field_1041;
   // $FF: renamed from: i int
   private final int field_1042;
   // $FF: renamed from: j android.os.Bundle
   private final Bundle field_1043;
   // $FF: renamed from: k java.lang.Object
   private Object field_1044;
   // $FF: renamed from: l boolean
   private boolean field_1045 = true;

   DataHolder(int var1, String[] var2, CursorWindow[] var3, int var4, Bundle var5) {
      this.field_1039 = var1;
      this.field_1040 = var2;
      this.field_1041 = var3;
      this.field_1042 = var4;
      this.field_1043 = var5;
   }

   // $FF: renamed from: a (java.lang.String, int) void
   private void method_1332(String var1, int var2) {
      if (this.field_1035 != null && this.field_1035.containsKey(var1)) {
         if (this.method_1348()) {
            throw new IllegalArgumentException("Buffer is closed.");
         } else if (var2 < 0 || var2 >= this.field_1037) {
            throw new CursorIndexOutOfBoundsException(var2, this.field_1037);
         }
      } else {
         throw new IllegalArgumentException("No such column: " + var1);
      }
   }

   // $FF: renamed from: a (int) int
   public int method_1333(int var1) {
      int var3 = 0;
      boolean var4;
      if (var1 >= 0 && var1 < this.field_1037) {
         var4 = true;
      } else {
         var4 = false;
      }

      class_343.method_1192(var4);

      int var2;
      while(true) {
         var2 = var3;
         if (var3 >= this.field_1036.length) {
            break;
         }

         if (var1 < this.field_1036[var3]) {
            var2 = var3 - 1;
            break;
         }

         ++var3;
      }

      var1 = var2;
      if (var2 == this.field_1036.length) {
         var1 = var2 - 1;
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String, int, int) long
   public long method_1334(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return this.field_1041[var3].getLong(var2 - this.field_1036[var3], this.field_1035.getInt(var1));
   }

   // $FF: renamed from: a () void
   public void method_1335() {
      byte var2 = 0;
      this.field_1035 = new Bundle();

      int var1;
      for(var1 = 0; var1 < this.field_1040.length; ++var1) {
         this.field_1035.putInt(this.field_1040[var1], var1);
      }

      this.field_1036 = new int[this.field_1041.length];
      byte var3 = 0;
      var1 = var2;

      int var4;
      for(var4 = var3; var1 < this.field_1041.length; ++var1) {
         this.field_1036[var1] = var4;
         var4 += this.field_1041[var1].getNumRows();
      }

      this.field_1037 = var4;
   }

   // $FF: renamed from: b () int
   int method_1336() {
      return this.field_1039;
   }

   // $FF: renamed from: b (java.lang.String, int, int) int
   public int method_1337(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return this.field_1041[var3].getInt(var2 - this.field_1036[var3], this.field_1035.getInt(var1));
   }

   // $FF: renamed from: c (java.lang.String, int, int) java.lang.String
   public String method_1338(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return this.field_1041[var3].getString(var2 - this.field_1036[var3], this.field_1035.getInt(var1));
   }

   // $FF: renamed from: c () java.lang.String[]
   String[] method_1339() {
      return this.field_1040;
   }

   // $FF: renamed from: d (java.lang.String, int, int) boolean
   public boolean method_1340(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return Long.valueOf(this.field_1041[var3].getLong(var2 - this.field_1036[var3], this.field_1035.getInt(var1))) == 1L;
   }

   // $FF: renamed from: d () android.database.CursorWindow[]
   CursorWindow[] method_1341() {
      return this.field_1041;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_1342() {
      return this.field_1042;
   }

   // $FF: renamed from: e (java.lang.String, int, int) byte[]
   public byte[] method_1343(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return this.field_1041[var3].getBlob(var2 - this.field_1036[var3], this.field_1035.getInt(var1));
   }

   // $FF: renamed from: f (java.lang.String, int, int) android.net.Uri
   public Uri method_1344(String var1, int var2, int var3) {
      var1 = this.method_1338(var1, var2, var3);
      return var1 == null ? null : Uri.parse(var1);
   }

   // $FF: renamed from: f () android.os.Bundle
   public Bundle method_1345() {
      return this.field_1043;
   }

   protected void finalize() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () int
   public int method_1346() {
      return this.field_1037;
   }

   // $FF: renamed from: g (java.lang.String, int, int) boolean
   public boolean method_1347(String var1, int var2, int var3) {
      this.method_1332(var1, var2);
      return this.field_1041[var3].isNull(var2 - this.field_1036[var3], this.field_1035.getInt(var1));
   }

   // $FF: renamed from: h () boolean
   public boolean method_1348() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   public void method_1349() {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label217: {
         label221: {
            try {
               if (this.field_1038) {
                  break label221;
               }

               this.field_1038 = true;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label217;
            }

            int var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.field_1041.length) {
                     break;
                  }

                  this.field_1041[var1].close();
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label217;
               }

               ++var1;
            }
         }

         label204:
         try {
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label204;
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

   public void writeToParcel(Parcel var1, int var2) {
      class_276.method_960(this, var1, var2);
   }
}
