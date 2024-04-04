package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.class_213;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.drive.query.internal.d
class class_643 {
   // $FF: renamed from: a (com.google.android.gms.drive.metadata.internal.MetadataBundle) com.google.android.gms.drive.metadata.b
   static class_213 method_2073(MetadataBundle var0) {
      Set var1 = var0.method_569();
      if (var1.size() != 1) {
         throw new IllegalArgumentException("bundle should have exactly 1 populated field");
      } else {
         return (class_213)var1.iterator().next();
      }
   }
}
