package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
   public static final Creator CREATOR = new class_619();
   // $FF: renamed from: a int[]
   final int[] field_710;
   // $FF: renamed from: b int
   final int field_711;
   // $FF: renamed from: c int
   final int field_712;
   // $FF: renamed from: d java.lang.String
   final String field_713;
   // $FF: renamed from: e int
   final int field_714;
   // $FF: renamed from: f int
   final int field_715;
   // $FF: renamed from: g java.lang.CharSequence
   final CharSequence field_716;
   // $FF: renamed from: h int
   final int field_717;
   // $FF: renamed from: i java.lang.CharSequence
   final CharSequence field_718;

   public BackStackState(Parcel var1) {
      this.field_710 = var1.createIntArray();
      this.field_711 = var1.readInt();
      this.field_712 = var1.readInt();
      this.field_713 = var1.readString();
      this.field_714 = var1.readInt();
      this.field_715 = var1.readInt();
      this.field_716 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.field_717 = var1.readInt();
      this.field_718 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
   }

   public BackStackState(class_613 var1, class_617 var2) {
      class_618 var7 = var2.field_2069;

      int var3;
      int var4;
      for(var3 = 0; var7 != null; var3 = var4) {
         var4 = var3;
         if (var7.field_2095 != null) {
            var4 = var3 + var7.field_2095.size();
         }

         var7 = var7.field_2087;
      }

      this.field_710 = new int[var3 + var2.field_2071 * 7];
      if (!var2.field_2078) {
         throw new IllegalStateException("Not on back stack");
      } else {
         var7 = var2.field_2069;

         for(var3 = 0; var7 != null; var7 = var7.field_2087) {
            int[] var6 = this.field_710;
            var4 = var3 + 1;
            var6[var3] = var7.field_2089;
            var6 = this.field_710;
            int var5 = var4 + 1;
            if (var7.field_2090 != null) {
               var3 = var7.field_2090.field_412;
            } else {
               var3 = -1;
            }

            var6[var4] = var3;
            var6 = this.field_710;
            var3 = var5 + 1;
            var6[var5] = var7.field_2091;
            var6 = this.field_710;
            var4 = var3 + 1;
            var6[var3] = var7.field_2092;
            var6 = this.field_710;
            var3 = var4 + 1;
            var6[var4] = var7.field_2093;
            var6 = this.field_710;
            var4 = var3 + 1;
            var6[var3] = var7.field_2094;
            if (var7.field_2095 != null) {
               var5 = var7.field_2095.size();
               var6 = this.field_710;
               var3 = var4 + 1;
               var6[var4] = var5;

               for(var4 = 0; var4 < var5; ++var3) {
                  this.field_710[var3] = ((Fragment)var7.field_2095.get(var4)).field_412;
                  ++var4;
               }
            } else {
               var6 = this.field_710;
               var3 = var4 + 1;
               var6[var4] = 0;
            }
         }

         this.field_711 = var2.field_2076;
         this.field_712 = var2.field_2077;
         this.field_713 = var2.field_2080;
         this.field_714 = var2.field_2082;
         this.field_715 = var2.field_2083;
         this.field_716 = var2.field_2084;
         this.field_717 = var2.field_2085;
         this.field_718 = var2.field_2086;
      }
   }

   // $FF: renamed from: a (android.support.v4.app.m) android.support.v4.app.b
   public class_617 method_867(class_613 var1) {
      class_617 var6 = new class_617(var1);

      class_618 var7;
      for(int var3 = 0; var3 < this.field_710.length; var6.method_2016(var7)) {
         var7 = new class_618();
         int[] var8 = this.field_710;
         int var4 = var3 + 1;
         var7.field_2089 = var8[var3];
         if (class_613.field_2040) {
            Log.v("FragmentManager", "BSE " + var6 + " set base fragment #" + this.field_710[var4]);
         }

         var8 = this.field_710;
         int var2 = var4 + 1;
         var3 = var8[var4];
         if (var3 >= 0) {
            var7.field_2090 = (Fragment)var1.field_2048.get(var3);
         } else {
            var7.field_2090 = null;
         }

         var8 = this.field_710;
         var3 = var2 + 1;
         var7.field_2091 = var8[var2];
         var8 = this.field_710;
         var2 = var3 + 1;
         var7.field_2092 = var8[var3];
         var8 = this.field_710;
         var3 = var2 + 1;
         var7.field_2093 = var8[var2];
         var8 = this.field_710;
         var4 = var3 + 1;
         var7.field_2094 = var8[var3];
         var8 = this.field_710;
         var2 = var4 + 1;
         int var5 = var8[var4];
         var3 = var2;
         if (var5 > 0) {
            var7.field_2095 = new ArrayList(var5);
            var4 = 0;

            while(true) {
               var3 = var2;
               if (var4 >= var5) {
                  break;
               }

               if (class_613.field_2040) {
                  Log.v("FragmentManager", "BSE " + var6 + " set remove fragment #" + this.field_710[var2]);
               }

               Fragment var9 = (Fragment)var1.field_2048.get(this.field_710[var2]);
               var7.field_2095.add(var9);
               ++var4;
               ++var2;
            }
         }
      }

      var6.field_2076 = this.field_711;
      var6.field_2077 = this.field_712;
      var6.field_2080 = this.field_713;
      var6.field_2082 = this.field_714;
      var6.field_2078 = true;
      var6.field_2083 = this.field_715;
      var6.field_2084 = this.field_716;
      var6.field_2085 = this.field_717;
      var6.field_2086 = this.field_718;
      var6.method_2015(1);
      return var6;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.field_710);
      var1.writeInt(this.field_711);
      var1.writeInt(this.field_712);
      var1.writeString(this.field_713);
      var1.writeInt(this.field_714);
      var1.writeInt(this.field_715);
      TextUtils.writeToParcel(this.field_716, var1, 0);
      var1.writeInt(this.field_717);
      TextUtils.writeToParcel(this.field_718, var1, 0);
   }
}
