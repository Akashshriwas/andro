package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.ct
public final class class_424 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.eu
   public static final class_474 field_1125 = new class_474();
   // $FF: renamed from: b int
   public final int field_1126;
   // $FF: renamed from: c java.lang.String
   public String field_1127;
   // $FF: renamed from: d int
   public int field_1128;
   // $FF: renamed from: e int
   public int field_1129;
   // $FF: renamed from: f boolean
   public boolean field_1130;

   public class_424(int var1, int var2, boolean var3) {
      StringBuilder var5 = (new StringBuilder()).append("afma-sdk-a-v").append(var1).append(".").append(var2).append(".");
      String var4;
      if (var3) {
         var4 = "0";
      } else {
         var4 = "1";
      }

      this(1, var5.append(var4).toString(), var1, var2, var3);
   }

   class_424(int var1, String var2, int var3, int var4, boolean var5) {
      this.field_1126 = var1;
      this.field_1127 = var2;
      this.field_1128 = var3;
      this.field_1129 = var4;
      this.field_1130 = var5;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_474.method_1653(this, var1, var2);
   }
}
