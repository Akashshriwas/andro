package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_343;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
   public static final Creator CREATOR = new class_224();
   // $FF: renamed from: a int
   final int field_354;
   // $FF: renamed from: b android.os.Bundle
   final Bundle field_355;

   MetadataBundle(int var1, Bundle var2) {
      this.field_354 = var1;
      this.field_355 = (Bundle)class_343.method_1189(var2);
      this.field_355.setClassLoader(this.getClass().getClassLoader());
      Iterator var4 = this.field_355.keySet().iterator();

      while(var4.hasNext()) {
         String var3 = (String)var4.next();
         if (class_223.method_825(var3) == null) {
            this.field_355.remove(var3);
            Log.w("MetadataBundle", "Ignored unknown metadata field in bundle: " + var3);
         }
      }

   }

   // $FF: renamed from: a () java.util.Set
   public Set method_569() {
      HashSet var1 = new HashSet();
      Iterator var2 = this.field_355.keySet().iterator();

      while(var2.hasNext()) {
         var1.add(class_223.method_825((String)var2.next()));
      }

      return var1;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof MetadataBundle)) {
         return false;
      } else {
         MetadataBundle var4 = (MetadataBundle)var1;
         Set var2 = this.field_355.keySet();
         if (!var2.equals(var4.field_355.keySet())) {
            return false;
         } else {
            Iterator var5 = var2.iterator();

            String var3;
            do {
               if (!var5.hasNext()) {
                  return true;
               }

               var3 = (String)var5.next();
            } while(class_310.method_1035(this.field_355.get(var3), var4.field_355.get(var3)));

            return false;
         }
      }
   }

   public int hashCode() {
      Iterator var2 = this.field_355.keySet().iterator();

      int var1;
      String var3;
      for(var1 = 1; var2.hasNext(); var1 = this.field_355.get(var3).hashCode() + var1 * 31) {
         var3 = (String)var2.next();
      }

      return var1;
   }

   public String toString() {
      return "MetadataBundle [values=" + this.field_355 + "]";
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_224.method_827(this, var1, var2);
   }
}
