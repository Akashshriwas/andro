package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.class_20;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.ha
public final class class_138 extends class_136 implements class_20, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.it
   public static final class_354 field_191 = new class_354();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_192 = new HashMap();
   // $FF: renamed from: A java.util.List
   private List field_193;
   // $FF: renamed from: B boolean
   private boolean field_194;
   // $FF: renamed from: c java.util.Set
   private final Set field_195;
   // $FF: renamed from: d int
   private final int field_196;
   // $FF: renamed from: e java.lang.String
   private String field_197;
   // $FF: renamed from: f com.google.android.gms.internal.ha$a
   private ha$a field_198;
   // $FF: renamed from: g java.lang.String
   private String field_199;
   // $FF: renamed from: h java.lang.String
   private String field_200;
   // $FF: renamed from: i int
   private int field_201;
   // $FF: renamed from: j com.google.android.gms.internal.ha$b
   private ha$b field_202;
   // $FF: renamed from: k java.lang.String
   private String field_203;
   // $FF: renamed from: l java.lang.String
   private String field_204;
   // $FF: renamed from: m int
   private int field_205;
   // $FF: renamed from: n java.lang.String
   private String field_206;
   // $FF: renamed from: o com.google.android.gms.internal.ha$c
   private ha$c field_207;
   // $FF: renamed from: p boolean
   private boolean field_208;
   // $FF: renamed from: q java.lang.String
   private String field_209;
   // $FF: renamed from: r com.google.android.gms.internal.ha$d
   private ha$d field_210;
   // $FF: renamed from: s java.lang.String
   private String field_211;
   // $FF: renamed from: t int
   private int field_212;
   // $FF: renamed from: u java.util.List
   private List field_213;
   // $FF: renamed from: v java.util.List
   private List field_214;
   // $FF: renamed from: w int
   private int field_215;
   // $FF: renamed from: x int
   private int field_216;
   // $FF: renamed from: y java.lang.String
   private String field_217;
   // $FF: renamed from: z java.lang.String
   private String field_218;

   static {
      field_192.put("aboutMe", ee$a.method_2090("aboutMe", 2));
      field_192.put("ageRange", ee$a.method_2085("ageRange", 3, ha$a.class));
      field_192.put("birthday", ee$a.method_2090("birthday", 4));
      field_192.put("braggingRights", ee$a.method_2090("braggingRights", 5));
      field_192.put("circledByCount", ee$a.method_2083("circledByCount", 6));
      field_192.put("cover", ee$a.method_2085("cover", 7, ha$b.class));
      field_192.put("currentLocation", ee$a.method_2090("currentLocation", 8));
      field_192.put("displayName", ee$a.method_2090("displayName", 9));
      field_192.put("gender", ee$a.method_2084("gender", 12, (new class_478()).method_1665("male", 0).method_1665("female", 1).method_1665("other", 2), false));
      field_192.put("id", ee$a.method_2090("id", 14));
      field_192.put("image", ee$a.method_2085("image", 15, ha$c.class));
      field_192.put("isPlusUser", ee$a.method_2089("isPlusUser", 16));
      field_192.put("language", ee$a.method_2090("language", 18));
      field_192.put("name", ee$a.method_2085("name", 19, ha$d.class));
      field_192.put("nickname", ee$a.method_2090("nickname", 20));
      field_192.put("objectType", ee$a.method_2084("objectType", 21, (new class_478()).method_1665("person", 0).method_1665("page", 1), false));
      field_192.put("organizations", ee$a.method_2088("organizations", 22, ha$f.class));
      field_192.put("placesLived", ee$a.method_2088("placesLived", 23, ha$g.class));
      field_192.put("plusOneCount", ee$a.method_2083("plusOneCount", 24));
      field_192.put("relationshipStatus", ee$a.method_2084("relationshipStatus", 25, (new class_478()).method_1665("single", 0).method_1665("in_a_relationship", 1).method_1665("engaged", 2).method_1665("married", 3).method_1665("its_complicated", 4).method_1665("open_relationship", 5).method_1665("widowed", 6).method_1665("in_domestic_partnership", 7).method_1665("in_civil_union", 8), false));
      field_192.put("tagline", ee$a.method_2090("tagline", 26));
      field_192.put("url", ee$a.method_2090("url", 27));
      field_192.put("urls", ee$a.method_2088("urls", 28, ha$h.class));
      field_192.put("verified", ee$a.method_2089("verified", 29));
   }

   public class_138() {
      this.field_196 = 2;
      this.field_195 = new HashSet();
   }

   class_138(Set var1, int var2, String var3, ha$a var4, String var5, String var6, int var7, ha$b var8, String var9, String var10, int var11, String var12, ha$c var13, boolean var14, String var15, ha$d var16, String var17, int var18, List var19, List var20, int var21, int var22, String var23, String var24, List var25, boolean var26) {
      this.field_195 = var1;
      this.field_196 = var2;
      this.field_197 = var3;
      this.field_198 = var4;
      this.field_199 = var5;
      this.field_200 = var6;
      this.field_201 = var7;
      this.field_202 = var8;
      this.field_203 = var9;
      this.field_204 = var10;
      this.field_205 = var11;
      this.field_206 = var12;
      this.field_207 = var13;
      this.field_208 = var14;
      this.field_209 = var15;
      this.field_210 = var16;
      this.field_211 = var17;
      this.field_212 = var18;
      this.field_213 = var19;
      this.field_214 = var20;
      this.field_215 = var21;
      this.field_216 = var22;
      this.field_217 = var23;
      this.field_218 = var24;
      this.field_193 = var25;
      this.field_194 = var26;
   }

   // $FF: renamed from: A () java.lang.String
   public String method_418() {
      return this.field_217;
   }

   // $FF: renamed from: B () java.lang.String
   public String method_419() {
      return this.field_218;
   }

   // $FF: renamed from: C () java.util.List
   List method_420() {
      return this.field_193;
   }

   // $FF: renamed from: D () boolean
   public boolean method_421() {
      return this.field_194;
   }

   // $FF: renamed from: E () com.google.android.gms.internal.ha
   public class_138 method_422() {
      return this;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_422();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_195.contains(var1.method_2100());
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_197;
      case 3:
         return this.field_198;
      case 4:
         return this.field_199;
      case 5:
         return this.field_200;
      case 6:
         return this.field_201;
      case 7:
         return this.field_202;
      case 8:
         return this.field_203;
      case 9:
         return this.field_204;
      case 10:
      case 11:
      case 13:
      case 17:
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      case 12:
         return this.field_205;
      case 14:
         return this.field_206;
      case 15:
         return this.field_207;
      case 16:
         return this.field_208;
      case 18:
         return this.field_209;
      case 19:
         return this.field_210;
      case 20:
         return this.field_211;
      case 21:
         return this.field_212;
      case 22:
         return this.field_213;
      case 23:
         return this.field_214;
      case 24:
         return this.field_215;
      case 25:
         return this.field_216;
      case 26:
         return this.field_217;
      case 27:
         return this.field_218;
      case 28:
         return this.field_193;
      case 29:
         return this.field_194;
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_192;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_354 var1 = field_191;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_423() {
      return this.field_195;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class_138)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         class_138 var4 = (class_138)var1;
         Iterator var2 = field_192.values().iterator();

         while(var2.hasNext()) {
            ee$a var3 = (ee$a)var2.next();
            if (this.method_398(var3)) {
               if (!var4.method_398(var3)) {
                  return false;
               }

               if (!this.method_399(var3).equals(var4.method_399(var3))) {
                  return false;
               }
            } else if (var4.method_398(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: f () int
   int method_424() {
      return this.field_196;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_425() {
      return this.field_197;
   }

   // $FF: renamed from: h () com.google.android.gms.internal.ha$a
   ha$a method_426() {
      return this.field_198;
   }

   public int hashCode() {
      Iterator var3 = field_192.values().iterator();
      int var1 = 0;

      while(var3.hasNext()) {
         ee$a var4 = (ee$a)var3.next();
         if (this.method_398(var4)) {
            int var2 = var4.method_2100();
            var1 = this.method_399(var4).hashCode() + var1 + var2;
         }
      }

      return var1;
   }

   // $FF: renamed from: i () java.lang.String
   public String method_427() {
      return this.field_199;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_428() {
      return this.field_200;
   }

   // $FF: renamed from: k () int
   public int method_429() {
      return this.field_201;
   }

   // $FF: renamed from: l () com.google.android.gms.internal.ha$b
   ha$b method_430() {
      return this.field_202;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_431() {
      return this.field_203;
   }

   // $FF: renamed from: n () java.lang.String
   public String method_432() {
      return this.field_204;
   }

   // $FF: renamed from: o () int
   public int method_433() {
      return this.field_205;
   }

   // $FF: renamed from: p () java.lang.String
   public String method_434() {
      return this.field_206;
   }

   // $FF: renamed from: q () com.google.android.gms.internal.ha$c
   ha$c method_435() {
      return this.field_207;
   }

   // $FF: renamed from: r () boolean
   public boolean method_436() {
      return this.field_208;
   }

   // $FF: renamed from: s () java.lang.String
   public String method_437() {
      return this.field_209;
   }

   // $FF: renamed from: t () com.google.android.gms.internal.ha$d
   ha$d method_438() {
      return this.field_210;
   }

   // $FF: renamed from: u () java.lang.String
   public String method_439() {
      return this.field_211;
   }

   // $FF: renamed from: v () int
   public int method_440() {
      return this.field_212;
   }

   // $FF: renamed from: w () java.util.List
   List method_441() {
      return this.field_213;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_354 var3 = field_191;
      class_354.method_1234(this, var1, var2);
   }

   // $FF: renamed from: x () java.util.List
   List method_442() {
      return this.field_214;
   }

   // $FF: renamed from: y () int
   public int method_443() {
      return this.field_215;
   }

   // $FF: renamed from: z () int
   public int method_444() {
      return this.field_216;
   }
}
