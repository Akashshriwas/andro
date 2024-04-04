package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.o
public class class_237 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.CameraPosition, android.os.Parcel, int) void
   static void method_881(CameraPosition var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1542());
      class_333.method_1145(var1, 2, var0.field_1249, var2, false);
      class_333.method_1139(var1, 3, var0.field_1250);
      class_333.method_1139(var1, 4, var0.field_1251);
      class_333.method_1139(var1, 5, var0.field_1252);
      class_333.method_1136(var1, var3);
   }
}
