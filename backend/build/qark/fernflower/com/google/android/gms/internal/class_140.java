package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.a.class_10;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.gv
public final class class_140 extends class_136 implements class_10, SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.iq
   public static final class_357 field_228 = new class_357();
   // $FF: renamed from: b java.util.HashMap
   private static final HashMap field_229 = new HashMap();
   // $FF: renamed from: A java.lang.String
   private String field_230;
   // $FF: renamed from: B java.lang.String
   private String field_231;
   // $FF: renamed from: C java.lang.String
   private String field_232;
   // $FF: renamed from: D java.lang.String
   private String field_233;
   // $FF: renamed from: E java.lang.String
   private String field_234;
   // $FF: renamed from: F com.google.android.gms.internal.gv
   private class_140 field_235;
   // $FF: renamed from: G java.lang.String
   private String field_236;
   // $FF: renamed from: H java.lang.String
   private String field_237;
   // $FF: renamed from: I java.lang.String
   private String field_238;
   // $FF: renamed from: J java.lang.String
   private String field_239;
   // $FF: renamed from: K com.google.android.gms.internal.gv
   private class_140 field_240;
   // $FF: renamed from: L double
   private double field_241;
   // $FF: renamed from: M com.google.android.gms.internal.gv
   private class_140 field_242;
   // $FF: renamed from: N double
   private double field_243;
   // $FF: renamed from: O java.lang.String
   private String field_244;
   // $FF: renamed from: P com.google.android.gms.internal.gv
   private class_140 field_245;
   // $FF: renamed from: Q java.util.List
   private List field_246;
   // $FF: renamed from: R java.lang.String
   private String field_247;
   // $FF: renamed from: S java.lang.String
   private String field_248;
   // $FF: renamed from: T java.lang.String
   private String field_249;
   // $FF: renamed from: U java.lang.String
   private String field_250;
   // $FF: renamed from: V com.google.android.gms.internal.gv
   private class_140 field_251;
   // $FF: renamed from: W java.lang.String
   private String field_252;
   // $FF: renamed from: X java.lang.String
   private String field_253;
   // $FF: renamed from: Y java.lang.String
   private String field_254;
   // $FF: renamed from: Z com.google.android.gms.internal.gv
   private class_140 field_255;
   // $FF: renamed from: aa java.lang.String
   private String field_256;
   // $FF: renamed from: ab java.lang.String
   private String field_257;
   // $FF: renamed from: ac java.lang.String
   private String field_258;
   // $FF: renamed from: ad java.lang.String
   private String field_259;
   // $FF: renamed from: ae java.lang.String
   private String field_260;
   // $FF: renamed from: af java.lang.String
   private String field_261;
   // $FF: renamed from: c java.util.Set
   private final Set field_262;
   // $FF: renamed from: d int
   private final int field_263;
   // $FF: renamed from: e com.google.android.gms.internal.gv
   private class_140 field_264;
   // $FF: renamed from: f java.util.List
   private List field_265;
   // $FF: renamed from: g com.google.android.gms.internal.gv
   private class_140 field_266;
   // $FF: renamed from: h java.lang.String
   private String field_267;
   // $FF: renamed from: i java.lang.String
   private String field_268;
   // $FF: renamed from: j java.lang.String
   private String field_269;
   // $FF: renamed from: k java.util.List
   private List field_270;
   // $FF: renamed from: l int
   private int field_271;
   // $FF: renamed from: m java.util.List
   private List field_272;
   // $FF: renamed from: n com.google.android.gms.internal.gv
   private class_140 field_273;
   // $FF: renamed from: o java.util.List
   private List field_274;
   // $FF: renamed from: p java.lang.String
   private String field_275;
   // $FF: renamed from: q java.lang.String
   private String field_276;
   // $FF: renamed from: r com.google.android.gms.internal.gv
   private class_140 field_277;
   // $FF: renamed from: s java.lang.String
   private String field_278;
   // $FF: renamed from: t java.lang.String
   private String field_279;
   // $FF: renamed from: u java.lang.String
   private String field_280;
   // $FF: renamed from: v java.util.List
   private List field_281;
   // $FF: renamed from: w java.lang.String
   private String field_282;
   // $FF: renamed from: x java.lang.String
   private String field_283;
   // $FF: renamed from: y java.lang.String
   private String field_284;
   // $FF: renamed from: z java.lang.String
   private String field_285;

   static {
      field_229.put("about", ee$a.method_2085("about", 2, gv.class));
      field_229.put("additionalName", ee$a.method_2091("additionalName", 3));
      field_229.put("address", ee$a.method_2085("address", 4, gv.class));
      field_229.put("addressCountry", ee$a.method_2090("addressCountry", 5));
      field_229.put("addressLocality", ee$a.method_2090("addressLocality", 6));
      field_229.put("addressRegion", ee$a.method_2090("addressRegion", 7));
      field_229.put("associated_media", ee$a.method_2088("associated_media", 8, gv.class));
      field_229.put("attendeeCount", ee$a.method_2083("attendeeCount", 9));
      field_229.put("attendees", ee$a.method_2088("attendees", 10, gv.class));
      field_229.put("audio", ee$a.method_2085("audio", 11, gv.class));
      field_229.put("author", ee$a.method_2088("author", 12, gv.class));
      field_229.put("bestRating", ee$a.method_2090("bestRating", 13));
      field_229.put("birthDate", ee$a.method_2090("birthDate", 14));
      field_229.put("byArtist", ee$a.method_2085("byArtist", 15, gv.class));
      field_229.put("caption", ee$a.method_2090("caption", 16));
      field_229.put("contentSize", ee$a.method_2090("contentSize", 17));
      field_229.put("contentUrl", ee$a.method_2090("contentUrl", 18));
      field_229.put("contributor", ee$a.method_2088("contributor", 19, gv.class));
      field_229.put("dateCreated", ee$a.method_2090("dateCreated", 20));
      field_229.put("dateModified", ee$a.method_2090("dateModified", 21));
      field_229.put("datePublished", ee$a.method_2090("datePublished", 22));
      field_229.put("description", ee$a.method_2090("description", 23));
      field_229.put("duration", ee$a.method_2090("duration", 24));
      field_229.put("embedUrl", ee$a.method_2090("embedUrl", 25));
      field_229.put("endDate", ee$a.method_2090("endDate", 26));
      field_229.put("familyName", ee$a.method_2090("familyName", 27));
      field_229.put("gender", ee$a.method_2090("gender", 28));
      field_229.put("geo", ee$a.method_2085("geo", 29, gv.class));
      field_229.put("givenName", ee$a.method_2090("givenName", 30));
      field_229.put("height", ee$a.method_2090("height", 31));
      field_229.put("id", ee$a.method_2090("id", 32));
      field_229.put("image", ee$a.method_2090("image", 33));
      field_229.put("inAlbum", ee$a.method_2085("inAlbum", 34, gv.class));
      field_229.put("latitude", ee$a.method_2087("latitude", 36));
      field_229.put("location", ee$a.method_2085("location", 37, gv.class));
      field_229.put("longitude", ee$a.method_2087("longitude", 38));
      field_229.put("name", ee$a.method_2090("name", 39));
      field_229.put("partOfTVSeries", ee$a.method_2085("partOfTVSeries", 40, gv.class));
      field_229.put("performers", ee$a.method_2088("performers", 41, gv.class));
      field_229.put("playerType", ee$a.method_2090("playerType", 42));
      field_229.put("postOfficeBoxNumber", ee$a.method_2090("postOfficeBoxNumber", 43));
      field_229.put("postalCode", ee$a.method_2090("postalCode", 44));
      field_229.put("ratingValue", ee$a.method_2090("ratingValue", 45));
      field_229.put("reviewRating", ee$a.method_2085("reviewRating", 46, gv.class));
      field_229.put("startDate", ee$a.method_2090("startDate", 47));
      field_229.put("streetAddress", ee$a.method_2090("streetAddress", 48));
      field_229.put("text", ee$a.method_2090("text", 49));
      field_229.put("thumbnail", ee$a.method_2085("thumbnail", 50, gv.class));
      field_229.put("thumbnailUrl", ee$a.method_2090("thumbnailUrl", 51));
      field_229.put("tickerSymbol", ee$a.method_2090("tickerSymbol", 52));
      field_229.put("type", ee$a.method_2090("type", 53));
      field_229.put("url", ee$a.method_2090("url", 54));
      field_229.put("width", ee$a.method_2090("width", 55));
      field_229.put("worstRating", ee$a.method_2090("worstRating", 56));
   }

   public class_140() {
      this.field_263 = 1;
      this.field_262 = new HashSet();
   }

   class_140(Set var1, int var2, class_140 var3, List var4, class_140 var5, String var6, String var7, String var8, List var9, int var10, List var11, class_140 var12, List var13, String var14, String var15, class_140 var16, String var17, String var18, String var19, List var20, String var21, String var22, String var23, String var24, String var25, String var26, String var27, String var28, String var29, class_140 var30, String var31, String var32, String var33, String var34, class_140 var35, double var36, class_140 var38, double var39, String var41, class_140 var42, List var43, String var44, String var45, String var46, String var47, class_140 var48, String var49, String var50, String var51, class_140 var52, String var53, String var54, String var55, String var56, String var57, String var58) {
      this.field_262 = var1;
      this.field_263 = var2;
      this.field_264 = var3;
      this.field_265 = var4;
      this.field_266 = var5;
      this.field_267 = var6;
      this.field_268 = var7;
      this.field_269 = var8;
      this.field_270 = var9;
      this.field_271 = var10;
      this.field_272 = var11;
      this.field_273 = var12;
      this.field_274 = var13;
      this.field_275 = var14;
      this.field_276 = var15;
      this.field_277 = var16;
      this.field_278 = var17;
      this.field_279 = var18;
      this.field_280 = var19;
      this.field_281 = var20;
      this.field_282 = var21;
      this.field_283 = var22;
      this.field_284 = var23;
      this.field_285 = var24;
      this.field_230 = var25;
      this.field_231 = var26;
      this.field_232 = var27;
      this.field_233 = var28;
      this.field_234 = var29;
      this.field_235 = var30;
      this.field_236 = var31;
      this.field_237 = var32;
      this.field_238 = var33;
      this.field_239 = var34;
      this.field_240 = var35;
      this.field_241 = var36;
      this.field_242 = var38;
      this.field_243 = var39;
      this.field_244 = var41;
      this.field_245 = var42;
      this.field_246 = var43;
      this.field_247 = var44;
      this.field_248 = var45;
      this.field_249 = var46;
      this.field_250 = var47;
      this.field_251 = var48;
      this.field_252 = var49;
      this.field_253 = var50;
      this.field_254 = var51;
      this.field_255 = var52;
      this.field_256 = var53;
      this.field_257 = var54;
      this.field_258 = var55;
      this.field_259 = var56;
      this.field_260 = var57;
      this.field_261 = var58;
   }

   // $FF: renamed from: A () java.lang.String
   public String method_453() {
      return this.field_284;
   }

   // $FF: renamed from: B () java.lang.String
   public String method_454() {
      return this.field_285;
   }

   // $FF: renamed from: C () java.lang.String
   public String method_455() {
      return this.field_230;
   }

   // $FF: renamed from: D () java.lang.String
   public String method_456() {
      return this.field_231;
   }

   // $FF: renamed from: E () java.lang.String
   public String method_457() {
      return this.field_232;
   }

   // $FF: renamed from: F () java.lang.String
   public String method_458() {
      return this.field_233;
   }

   // $FF: renamed from: G () java.lang.String
   public String method_459() {
      return this.field_234;
   }

   // $FF: renamed from: H () com.google.android.gms.internal.gv
   class_140 method_460() {
      return this.field_235;
   }

   // $FF: renamed from: I () java.lang.String
   public String method_461() {
      return this.field_236;
   }

   // $FF: renamed from: J () java.lang.String
   public String method_462() {
      return this.field_237;
   }

   // $FF: renamed from: K () java.lang.String
   public String method_463() {
      return this.field_238;
   }

   // $FF: renamed from: L () java.lang.String
   public String method_464() {
      return this.field_239;
   }

   // $FF: renamed from: M () com.google.android.gms.internal.gv
   class_140 method_465() {
      return this.field_240;
   }

   // $FF: renamed from: N () double
   public double method_466() {
      return this.field_241;
   }

   // $FF: renamed from: O () com.google.android.gms.internal.gv
   class_140 method_467() {
      return this.field_242;
   }

   // $FF: renamed from: P () double
   public double method_468() {
      return this.field_243;
   }

   // $FF: renamed from: Q () java.lang.String
   public String method_469() {
      return this.field_244;
   }

   // $FF: renamed from: R () com.google.android.gms.internal.gv
   class_140 method_470() {
      return this.field_245;
   }

   // $FF: renamed from: S () java.util.List
   List method_471() {
      return this.field_246;
   }

   // $FF: renamed from: T () java.lang.String
   public String method_472() {
      return this.field_247;
   }

   // $FF: renamed from: U () java.lang.String
   public String method_473() {
      return this.field_248;
   }

   // $FF: renamed from: V () java.lang.String
   public String method_474() {
      return this.field_249;
   }

   // $FF: renamed from: W () java.lang.String
   public String method_475() {
      return this.field_250;
   }

   // $FF: renamed from: X () com.google.android.gms.internal.gv
   class_140 method_476() {
      return this.field_251;
   }

   // $FF: renamed from: Y () java.lang.String
   public String method_477() {
      return this.field_252;
   }

   // $FF: renamed from: Z () java.lang.String
   public String method_478() {
      return this.field_253;
   }

   // $FF: renamed from: a () java.lang.Object
   // $FF: synthetic method
   public Object method_13() {
      return this.method_487();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   protected Object method_397(String var1) {
      return null;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) boolean
   protected boolean method_398(ee$a var1) {
      return this.field_262.contains(var1.method_2100());
   }

   // $FF: renamed from: aa () java.lang.String
   public String method_479() {
      return this.field_254;
   }

   // $FF: renamed from: ab () com.google.android.gms.internal.gv
   class_140 method_480() {
      return this.field_255;
   }

   // $FF: renamed from: ac () java.lang.String
   public String method_481() {
      return this.field_256;
   }

   // $FF: renamed from: ad () java.lang.String
   public String method_482() {
      return this.field_257;
   }

   // $FF: renamed from: ae () java.lang.String
   public String method_483() {
      return this.field_258;
   }

   // $FF: renamed from: af () java.lang.String
   public String method_484() {
      return this.field_259;
   }

   // $FF: renamed from: ag () java.lang.String
   public String method_485() {
      return this.field_260;
   }

   // $FF: renamed from: ah () java.lang.String
   public String method_486() {
      return this.field_261;
   }

   // $FF: renamed from: ai () com.google.android.gms.internal.gv
   public class_140 method_487() {
      return this;
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ee$a) java.lang.Object
   protected Object method_399(ee$a var1) {
      switch(var1.method_2100()) {
      case 2:
         return this.field_264;
      case 3:
         return this.field_265;
      case 4:
         return this.field_266;
      case 5:
         return this.field_267;
      case 6:
         return this.field_268;
      case 7:
         return this.field_269;
      case 8:
         return this.field_270;
      case 9:
         return this.field_271;
      case 10:
         return this.field_272;
      case 11:
         return this.field_273;
      case 12:
         return this.field_274;
      case 13:
         return this.field_275;
      case 14:
         return this.field_276;
      case 15:
         return this.field_277;
      case 16:
         return this.field_278;
      case 17:
         return this.field_279;
      case 18:
         return this.field_280;
      case 19:
         return this.field_281;
      case 20:
         return this.field_282;
      case 21:
         return this.field_283;
      case 22:
         return this.field_284;
      case 23:
         return this.field_285;
      case 24:
         return this.field_230;
      case 25:
         return this.field_231;
      case 26:
         return this.field_232;
      case 27:
         return this.field_233;
      case 28:
         return this.field_234;
      case 29:
         return this.field_235;
      case 30:
         return this.field_236;
      case 31:
         return this.field_237;
      case 32:
         return this.field_238;
      case 33:
         return this.field_239;
      case 34:
         return this.field_240;
      case 35:
      default:
         throw new IllegalStateException("Unknown safe parcelable id=" + var1.method_2100());
      case 36:
         return this.field_241;
      case 37:
         return this.field_242;
      case 38:
         return this.field_243;
      case 39:
         return this.field_244;
      case 40:
         return this.field_245;
      case 41:
         return this.field_246;
      case 42:
         return this.field_247;
      case 43:
         return this.field_248;
      case 44:
         return this.field_249;
      case 45:
         return this.field_250;
      case 46:
         return this.field_251;
      case 47:
         return this.field_252;
      case 48:
         return this.field_253;
      case 49:
         return this.field_254;
      case 50:
         return this.field_255;
      case 51:
         return this.field_256;
      case 52:
         return this.field_257;
      case 53:
         return this.field_258;
      case 54:
         return this.field_259;
      case 55:
         return this.field_260;
      case 56:
         return this.field_261;
      }
   }

   // $FF: renamed from: b () java.util.HashMap
   public HashMap method_400() {
      return field_229;
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected boolean method_401(String var1) {
      return false;
   }

   public int describeContents() {
      class_357 var1 = field_228;
      return 0;
   }

   // $FF: renamed from: e () java.util.Set
   Set method_488() {
      return this.field_262;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class_140)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         class_140 var4 = (class_140)var1;
         Iterator var2 = field_229.values().iterator();

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
   int method_489() {
      return this.field_263;
   }

   // $FF: renamed from: g () com.google.android.gms.internal.gv
   class_140 method_490() {
      return this.field_264;
   }

   // $FF: renamed from: h () java.util.List
   public List method_491() {
      return this.field_265;
   }

   public int hashCode() {
      Iterator var3 = field_229.values().iterator();
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

   // $FF: renamed from: i () com.google.android.gms.internal.gv
   class_140 method_492() {
      return this.field_266;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_493() {
      return this.field_267;
   }

   // $FF: renamed from: k () java.lang.String
   public String method_494() {
      return this.field_268;
   }

   // $FF: renamed from: l () java.lang.String
   public String method_495() {
      return this.field_269;
   }

   // $FF: renamed from: m () java.util.List
   List method_496() {
      return this.field_270;
   }

   // $FF: renamed from: n () int
   public int method_497() {
      return this.field_271;
   }

   // $FF: renamed from: o () java.util.List
   List method_498() {
      return this.field_272;
   }

   // $FF: renamed from: p () com.google.android.gms.internal.gv
   class_140 method_499() {
      return this.field_273;
   }

   // $FF: renamed from: q () java.util.List
   List method_500() {
      return this.field_274;
   }

   // $FF: renamed from: r () java.lang.String
   public String method_501() {
      return this.field_275;
   }

   // $FF: renamed from: s () java.lang.String
   public String method_502() {
      return this.field_276;
   }

   // $FF: renamed from: t () com.google.android.gms.internal.gv
   class_140 method_503() {
      return this.field_277;
   }

   // $FF: renamed from: u () java.lang.String
   public String method_504() {
      return this.field_278;
   }

   // $FF: renamed from: v () java.lang.String
   public String method_505() {
      return this.field_279;
   }

   // $FF: renamed from: w () java.lang.String
   public String method_506() {
      return this.field_280;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_357 var3 = field_228;
      class_357.method_1246(this, var1, var2);
   }

   // $FF: renamed from: x () java.util.List
   List method_507() {
      return this.field_281;
   }

   // $FF: renamed from: y () java.lang.String
   public String method_508() {
      return this.field_282;
   }

   // $FF: renamed from: z () java.lang.String
   public String method_509() {
      return this.field_283;
   }
}
