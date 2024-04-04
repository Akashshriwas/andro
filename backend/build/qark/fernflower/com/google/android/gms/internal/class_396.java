package com.google.android.gms.internal;

import android.content.Context;
import android.widget.ViewSwitcher;

// $FF: renamed from: com.google.android.gms.internal.jv
final class class_396 {
   // $FF: renamed from: a android.widget.ViewSwitcher
   public final ViewSwitcher field_1052;
   // $FF: renamed from: b java.lang.String
   public final String field_1053;
   // $FF: renamed from: c android.content.Context
   public final Context field_1054;
   // $FF: renamed from: d com.google.android.gms.internal.is
   public final class_355 field_1055;
   // $FF: renamed from: e com.google.android.gms.internal.ct
   public final class_424 field_1056;
   // $FF: renamed from: f com.google.android.gms.internal.b
   public class_82 field_1057;
   // $FF: renamed from: g com.google.android.gms.internal.ef
   public class_426 field_1058;
   // $FF: renamed from: h com.google.android.gms.internal.x
   public class_607 field_1059;
   // $FF: renamed from: i com.google.android.gms.internal.ec
   public class_477 field_1060;
   // $FF: renamed from: j com.google.android.gms.internal.k
   public class_67 field_1061;

   public class_396(Context var1, class_607 var2, String var3, class_424 var4) {
      if (var2.field_2024) {
         this.field_1052 = null;
      } else {
         this.field_1052 = new ViewSwitcher(var1);
         this.field_1052.setMinimumWidth(var2.field_2026);
         this.field_1052.setMinimumHeight(var2.field_2023);
         this.field_1052.setVisibility(4);
      }

      this.field_1059 = var2;
      this.field_1053 = var3;
      this.field_1054 = var1;
      this.field_1055 = new class_355(class_342.method_1186(var4.field_1127, var1));
      this.field_1056 = var4;
   }
}
