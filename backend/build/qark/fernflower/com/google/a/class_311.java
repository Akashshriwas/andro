package com.google.a;

import com.google.android.gms.ads.class_626;

// $FF: renamed from: com.google.a.c
@Deprecated
public final class class_311 {
   // $FF: renamed from: a com.google.a.c
   public static final class_311 field_862 = new class_311(-1, -2, "mb");
   // $FF: renamed from: b com.google.a.c
   public static final class_311 field_863 = new class_311(320, 50, "mb");
   // $FF: renamed from: c com.google.a.c
   public static final class_311 field_864 = new class_311(300, 250, "as");
   // $FF: renamed from: d com.google.a.c
   public static final class_311 field_865 = new class_311(468, 60, "as");
   // $FF: renamed from: e com.google.a.c
   public static final class_311 field_866 = new class_311(728, 90, "as");
   // $FF: renamed from: f com.google.a.c
   public static final class_311 field_867 = new class_311(160, 600, "as");
   // $FF: renamed from: g com.google.android.gms.ads.e
   private final class_626 field_868;

   private class_311(int var1, int var2, String var3) {
      this(new class_626(var1, var2));
   }

   public class_311(class_626 var1) {
      this.field_868 = var1;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class_311)) {
         return false;
      } else {
         class_311 var2 = (class_311)var1;
         return this.field_868.equals(var2.field_868);
      }
   }

   public int hashCode() {
      return this.field_868.hashCode();
   }

   public String toString() {
      return this.field_868.toString();
   }
}
