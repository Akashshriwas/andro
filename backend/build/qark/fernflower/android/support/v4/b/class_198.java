package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

// $FF: renamed from: android.support.v4.b.d
class class_198 implements ClassLoaderCreator {
   // $FF: renamed from: a android.support.v4.b.c
   private final class_30 field_645;

   public class_198(class_30 var1) {
      this.field_645 = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.field_645.method_83(var1, (ClassLoader)null);
   }

   public Object createFromParcel(Parcel var1, ClassLoader var2) {
      return this.field_645.method_83(var1, var2);
   }

   public Object[] newArray(int var1) {
      return this.field_645.method_84(var1);
   }
}
