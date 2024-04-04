package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.y
public class class_192 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.VisibleRegion, android.os.Parcel, int) void
   static void method_807(VisibleRegion var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1577());
      class_333.method_1145(var1, 2, var0.field_1272, var2, false);
      class_333.method_1145(var1, 3, var0.field_1273, var2, false);
      class_333.method_1145(var1, 4, var0.field_1274, var2, false);
      class_333.method_1145(var1, 5, var0.field_1275, var2, false);
      class_333.method_1145(var1, 6, var0.field_1276, var2, false);
      class_333.method_1136(var1, var3);
   }
}
