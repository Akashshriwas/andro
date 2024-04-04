package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: com.google.android.gms.internal.ek
public class class_137 extends class_136 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hn
   public static final class_351 field_183 = new class_351();
   // $FF: renamed from: b int
   private final int field_184;
   // $FF: renamed from: c android.os.Parcel
   private final Parcel field_185;
   // $FF: renamed from: d int
   private final int field_186;
   // $FF: renamed from: e com.google.android.gms.internal.eh
   private final class_480 field_187;
   // $FF: renamed from: f java.lang.String
   private final String field_188;
   // $FF: renamed from: g int
   private int field_189;
   // $FF: renamed from: h int
   private int field_190;

   class_137(int var1, Parcel var2, class_480 var3) {
      this.field_184 = var1;
      this.field_185 = (Parcel)class_343.method_1189(var2);
      this.field_186 = 2;
      this.field_187 = var3;
      if (this.field_187 == null) {
         this.field_188 = null;
      } else {
         this.field_188 = this.field_187.method_1676();
      }

      this.field_189 = 2;
   }

   // $FF: renamed from: a (android.os.Bundle) java.util.HashMap
   public static HashMap method_406(Bundle var0) {
      HashMap var1 = new HashMap();
      Iterator var2 = var0.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.put(var3, var0.getString(var3));
      }

      return var1;
   }

   // $FF: renamed from: a (java.util.HashMap) java.util.HashMap
   private static HashMap method_407(HashMap var0) {
      HashMap var1 = new HashMap();
      Iterator var3 = var0.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var2 = (Entry)var3.next();
         var1.put(((ee$a)var2.getValue()).method_2100(), var2);
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.StringBuilder, int, java.lang.Object) void
   private void method_408(StringBuilder var1, int var2, Object var3) {
      switch(var2) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
         var1.append(var3);
         return;
      case 7:
         var1.append("\"").append(class_332.method_1134(var3.toString())).append("\"");
         return;
      case 8:
         var1.append("\"").append(class_335.method_1162((byte[])((byte[])var3))).append("\"");
         return;
      case 9:
         var1.append("\"").append(class_335.method_1163((byte[])((byte[])var3)));
         var1.append("\"");
         return;
      case 10:
         class_329.method_1130(var1, (HashMap)var3);
         return;
      case 11:
         throw new IllegalArgumentException("Method does not accept concrete type.");
      default:
         throw new IllegalArgumentException("Unknown type = " + var2);
      }
   }

   // $FF: renamed from: a (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, android.os.Parcel, int) void
   private void method_409(StringBuilder var1, ee$a var2, Parcel var3, int var4) {
      switch(var2.method_2097()) {
      case 0:
         this.method_410(var1, var2, this.a(var2, class_327.method_1107(var3, var4)));
         return;
      case 1:
         this.method_410(var1, var2, this.a(var2, class_327.method_1109(var3, var4)));
         return;
      case 2:
         this.method_410(var1, var2, this.a(var2, class_327.method_1108(var3, var4)));
         return;
      case 3:
         this.method_410(var1, var2, this.a(var2, class_327.method_1110(var3, var4)));
         return;
      case 4:
         this.method_410(var1, var2, this.a(var2, class_327.method_1111(var3, var4)));
         return;
      case 5:
         this.method_410(var1, var2, this.a(var2, class_327.method_1112(var3, var4)));
         return;
      case 6:
         this.method_410(var1, var2, this.a(var2, class_327.method_1103(var3, var4)));
         return;
      case 7:
         this.method_410(var1, var2, this.a(var2, class_327.method_1113(var3, var4)));
         return;
      case 8:
      case 9:
         this.method_410(var1, var2, this.a(var2, class_327.method_1116(var3, var4)));
         return;
      case 10:
         this.method_410(var1, var2, this.a(var2, method_406(class_327.method_1115(var3, var4))));
         return;
      case 11:
         throw new IllegalArgumentException("Method does not accept concrete type.");
      default:
         throw new IllegalArgumentException("Unknown field out type = " + var2.method_2097());
      }
   }

   // $FF: renamed from: a (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, java.lang.Object) void
   private void method_410(StringBuilder var1, ee$a var2, Object var3) {
      if (var2.method_2096()) {
         this.method_411(var1, var2, (ArrayList)var3);
      } else {
         this.method_408(var1, var2.method_2095(), var3);
      }
   }

   // $FF: renamed from: a (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, java.util.ArrayList) void
   private void method_411(StringBuilder var1, ee$a var2, ArrayList var3) {
      var1.append("[");
      int var5 = var3.size();

      for(int var4 = 0; var4 < var5; ++var4) {
         if (var4 != 0) {
            var1.append(",");
         }

         this.method_408(var1, var2.method_2095(), var3.get(var4));
      }

      var1.append("]");
   }

   // $FF: renamed from: a (java.lang.StringBuilder, java.lang.String, com.google.android.gms.internal.ee$a, android.os.Parcel, int) void
   private void method_412(StringBuilder var1, String var2, ee$a var3, Parcel var4, int var5) {
      var1.append("\"").append(var2).append("\":");
      if (var3.method_2103()) {
         this.method_409(var1, var3, var4, var5);
      } else {
         this.method_414(var1, var3, var4, var5);
      }
   }

   // $FF: renamed from: a (java.lang.StringBuilder, java.util.HashMap, android.os.Parcel) void
   private void method_413(StringBuilder var1, HashMap var2, Parcel var3) {
      var2 = method_407(var2);
      var1.append('{');
      int var5 = class_327.method_1099(var3);
      boolean var4 = false;

      while(var3.dataPosition() < var5) {
         int var6 = class_327.method_1093(var3);
         Entry var7 = (Entry)var2.get(class_327.method_1092(var6));
         if (var7 != null) {
            if (var4) {
               var1.append(",");
            }

            this.method_412(var1, (String)var7.getKey(), (ee$a)var7.getValue(), var3, var6);
            var4 = true;
         }
      }

      if (var3.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var3);
      } else {
         var1.append('}');
      }
   }

   // $FF: renamed from: b (java.lang.StringBuilder, com.google.android.gms.internal.ee$a, android.os.Parcel, int) void
   private void method_414(StringBuilder var1, ee$a var2, Parcel var3, int var4) {
      if (!var2.method_2098()) {
         byte[] var8;
         switch(var2.method_2097()) {
         case 0:
            var1.append(class_327.method_1107(var3, var4));
            return;
         case 1:
            var1.append(class_327.method_1109(var3, var4));
            return;
         case 2:
            var1.append(class_327.method_1108(var3, var4));
            return;
         case 3:
            var1.append(class_327.method_1110(var3, var4));
            return;
         case 4:
            var1.append(class_327.method_1111(var3, var4));
            return;
         case 5:
            var1.append(class_327.method_1112(var3, var4));
            return;
         case 6:
            var1.append(class_327.method_1103(var3, var4));
            return;
         case 7:
            String var9 = class_327.method_1113(var3, var4);
            var1.append("\"").append(class_332.method_1134(var9)).append("\"");
            return;
         case 8:
            var8 = class_327.method_1116(var3, var4);
            var1.append("\"").append(class_335.method_1162(var8)).append("\"");
            return;
         case 9:
            var8 = class_327.method_1116(var3, var4);
            var1.append("\"").append(class_335.method_1163(var8));
            var1.append("\"");
            return;
         case 10:
            Bundle var7 = class_327.method_1115(var3, var4);
            Set var11 = var7.keySet();
            var11.size();
            var1.append("{");
            Iterator var12 = var11.iterator();

            for(boolean var13 = true; var12.hasNext(); var13 = false) {
               String var6 = (String)var12.next();
               if (!var13) {
                  var1.append(",");
               }

               var1.append("\"").append(var6).append("\"");
               var1.append(":");
               var1.append("\"").append(class_332.method_1134(var7.getString(var6))).append("\"");
            }

            var1.append("}");
            return;
         case 11:
            var3 = class_327.method_1126(var3, var4);
            var3.setDataPosition(0);
            this.method_413(var1, var2.method_2105(), var3);
            return;
         default:
            throw new IllegalStateException("Unknown field type out");
         }
      } else {
         var1.append("[");
         label56:
         switch(var2.method_2097()) {
         case 0:
            class_350.method_1220(var1, class_327.method_1118(var3, var4));
            break;
         case 1:
            class_350.method_1222(var1, class_327.method_1120(var3, var4));
            break;
         case 2:
            class_350.method_1221(var1, class_327.method_1119(var3, var4));
            break;
         case 3:
            class_350.method_1219(var1, class_327.method_1121(var3, var4));
            break;
         case 4:
            class_350.method_1218(var1, class_327.method_1122(var3, var4));
            break;
         case 5:
            class_350.method_1222(var1, class_327.method_1123(var3, var4));
            break;
         case 6:
            class_350.method_1224(var1, class_327.method_1117(var3, var4));
            break;
         case 7:
            class_350.method_1223(var1, class_327.method_1124(var3, var4));
            break;
         case 8:
         case 9:
         case 10:
            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
         case 11:
            Parcel[] var10 = class_327.method_1091(var3, var4);
            int var5 = var10.length;
            var4 = 0;

            while(true) {
               if (var4 >= var5) {
                  break label56;
               }

               if (var4 > 0) {
                  var1.append(",");
               }

               var10[var4].setDataPosition(0);
               this.method_413(var1, var2.method_2105(), var10[var4]);
               ++var4;
            }
         default:
            throw new IllegalStateException("Unknown field type out.");
         }

         var1.append("]");
      }
   }

   // $FF: renamed from: a () int
   public int method_415() {
      return this.field_184;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      throw new UnsupportedOperationException("Converting to JSON does not require this method.");
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return this.field_187 == null ? null : this.field_187.method_1672(this.field_188);
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      throw new UnsupportedOperationException("Converting to JSON does not require this method.");
   }

   public int describeContents() {
      class_351 var1 = field_183;
      return 0;
   }

   // $FF: renamed from: e () android.os.Parcel
   public Parcel method_416() {
      switch(this.field_189) {
      case 0:
         this.field_190 = class_333.method_1135(this.field_185);
         class_333.method_1136(this.field_185, this.field_190);
         this.field_189 = 2;
         break;
      case 1:
         class_333.method_1136(this.field_185, this.field_190);
         this.field_189 = 2;
      }

      return this.field_185;
   }

   // $FF: renamed from: f () com.google.android.gms.internal.eh
   class_480 method_417() {
      switch(this.field_186) {
      case 0:
         return null;
      case 1:
         return this.field_187;
      case 2:
         return this.field_187;
      default:
         throw new IllegalStateException("Invalid creation type: " + this.field_186);
      }
   }

   public String toString() {
      class_343.method_1190(this.field_187, "Cannot convert to JSON on client side.");
      Parcel var1 = this.method_416();
      var1.setDataPosition(0);
      StringBuilder var2 = new StringBuilder(100);
      this.method_413(var2, this.field_187.method_1672(this.field_188), var1);
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_351 var3 = field_183;
      class_351.method_1225(this, var1, var2);
   }
}
