package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
   public static final Creator CREATOR = new class_631();
   // $FF: renamed from: a java.lang.String
   final String field_1915;
   // $FF: renamed from: b int
   final int field_1916;
   // $FF: renamed from: c boolean
   final boolean field_1917;
   // $FF: renamed from: d int
   final int field_1918;
   // $FF: renamed from: e int
   final int field_1919;
   // $FF: renamed from: f java.lang.String
   final String field_1920;
   // $FF: renamed from: g boolean
   final boolean field_1921;
   // $FF: renamed from: h boolean
   final boolean field_1922;
   // $FF: renamed from: i android.os.Bundle
   final Bundle field_1923;
   // $FF: renamed from: j android.os.Bundle
   Bundle field_1924;
   // $FF: renamed from: k android.support.v4.app.Fragment
   Fragment field_1925;

   public FragmentState(Parcel var1) {
      boolean var3 = true;
      super();
      this.field_1915 = var1.readString();
      this.field_1916 = var1.readInt();
      boolean var2;
      if (var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.field_1917 = var2;
      this.field_1918 = var1.readInt();
      this.field_1919 = var1.readInt();
      this.field_1920 = var1.readString();
      if (var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.field_1921 = var2;
      if (var1.readInt() != 0) {
         var2 = var3;
      } else {
         var2 = false;
      }

      this.field_1922 = var2;
      this.field_1923 = var1.readBundle();
      this.field_1924 = var1.readBundle();
   }

   public FragmentState(Fragment var1) {
      this.field_1915 = var1.getClass().getName();
      this.field_1916 = var1.field_412;
      this.field_1917 = var1.field_421;
      this.field_1918 = var1.field_427;
      this.field_1919 = var1.field_428;
      this.field_1920 = var1.field_429;
      this.field_1921 = var1.field_432;
      this.field_1922 = var1.field_431;
      this.field_1923 = var1.field_414;
   }

   // $FF: renamed from: a (android.support.v4.app.g) android.support.v4.app.Fragment
   public Fragment method_1858(class_181 var1) {
      if (this.field_1925 != null) {
         return this.field_1925;
      } else {
         if (this.field_1923 != null) {
            this.field_1923.setClassLoader(var1.getClassLoader());
         }

         this.field_1925 = Fragment.method_593(var1, this.field_1915, this.field_1923);
         if (this.field_1924 != null) {
            this.field_1924.setClassLoader(var1.getClassLoader());
            this.field_1925.field_410 = this.field_1924;
         }

         this.field_1925.method_598(this.field_1916);
         this.field_1925.field_421 = this.field_1917;
         this.field_1925.field_423 = true;
         this.field_1925.field_427 = this.field_1918;
         this.field_1925.field_428 = this.field_1919;
         this.field_1925.field_429 = this.field_1920;
         this.field_1925.field_432 = this.field_1921;
         this.field_1925.field_431 = this.field_1922;
         this.field_1925.field_425 = var1.field_539;
         if (class_613.field_2040) {
            Log.v("FragmentManager", "Instantiated fragment " + this.field_1925);
         }

         return this.field_1925;
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 1;
      var1.writeString(this.field_1915);
      var1.writeInt(this.field_1916);
      byte var4;
      if (this.field_1917) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeInt(this.field_1918);
      var1.writeInt(this.field_1919);
      var1.writeString(this.field_1920);
      if (this.field_1921) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      if (this.field_1922) {
         var4 = var3;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeBundle(this.field_1923);
      var1.writeBundle(this.field_1924);
   }
}
