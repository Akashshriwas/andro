package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.class_310;

// $FF: renamed from: com.google.android.gms.common.images.f
public final class class_249 {
   // $FF: renamed from: a android.net.Uri
   public final Uri field_732;

   public class_249(Uri var1) {
      this.field_732 = var1;
   }

   public boolean equals(Object var1) {
      boolean var3 = true;
      boolean var2;
      if (!(var1 instanceof class_249)) {
         var2 = false;
      } else {
         var2 = var3;
         if (this != var1) {
            var2 = var3;
            if (((class_249)var1).hashCode() != this.hashCode()) {
               return false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_732);
   }
}
