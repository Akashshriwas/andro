package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.bz
public final class class_433 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.dn
   public static final class_443 field_1156 = new class_443();
   // $FF: renamed from: b int
   public final int field_1157;
   // $FF: renamed from: c android.os.Bundle
   public final Bundle field_1158;
   // $FF: renamed from: d com.google.android.gms.internal.v
   public final class_597 field_1159;
   // $FF: renamed from: e com.google.android.gms.internal.x
   public final class_607 field_1160;
   // $FF: renamed from: f java.lang.String
   public final String field_1161;
   // $FF: renamed from: g android.content.pm.ApplicationInfo
   public final ApplicationInfo field_1162;
   // $FF: renamed from: h android.content.pm.PackageInfo
   public final PackageInfo field_1163;
   // $FF: renamed from: i java.lang.String
   public final String field_1164;
   // $FF: renamed from: j java.lang.String
   public final String field_1165;
   // $FF: renamed from: k java.lang.String
   public final String field_1166;
   // $FF: renamed from: l com.google.android.gms.internal.ct
   public final class_424 field_1167;

   class_433(int var1, Bundle var2, class_597 var3, class_607 var4, String var5, ApplicationInfo var6, PackageInfo var7, String var8, String var9, String var10, class_424 var11) {
      this.field_1157 = var1;
      this.field_1158 = var2;
      this.field_1159 = var3;
      this.field_1160 = var4;
      this.field_1161 = var5;
      this.field_1162 = var6;
      this.field_1163 = var7;
      this.field_1164 = var8;
      this.field_1165 = var9;
      this.field_1166 = var10;
      this.field_1167 = var11;
   }

   public class_433(Bundle var1, class_597 var2, class_607 var3, String var4, ApplicationInfo var5, PackageInfo var6, String var7, String var8, String var9, class_424 var10) {
      this(1, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public class_433(class_445 var1, String var2) {
      this(var1.field_1194, var1.field_1195, var1.field_1196, var1.field_1197, var1.field_1198, var1.field_1199, var2, var1.field_1200, var1.field_1201, var1.field_1202);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_443.method_1497(this, var1, var2);
   }
}
