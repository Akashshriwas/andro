package dn;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

// $FF: renamed from: dn.f
public class class_91 {
   // $FF: renamed from: a java.lang.String
   public static String field_82 = "PopupSelectedIndex";
   // $FF: renamed from: b java.lang.String
   public static String field_83 = "HeaderName";
   // $FF: renamed from: c java.lang.String
   public static String field_84 = "SELECTEDID";
   // $FF: renamed from: d java.lang.String
   public static String field_85 = "KeywordSearch";
   // $FF: renamed from: e java.lang.String
   public static String field_86 = "URLAudio";
   // $FF: renamed from: f java.lang.String
   public static String field_87 = "APPJSON";
   // $FF: renamed from: g int
   public static int field_88 = 4;
   // $FF: renamed from: h int
   public static int field_89 = 4;
   // $FF: renamed from: i java.lang.String
   public static String field_90 = "ca-app-pub-8587596210307129/3803803295";
   // $FF: renamed from: j java.lang.String
   public static String field_91 = "ca-app-pub-8587596210307129/3489184898";
   // $FF: renamed from: k java.lang.String
   public static String field_92 = ".info/config/conversationgb.txt";
   // $FF: renamed from: l java.lang.String
   public static String field_93 = "DBVersionKey";
   // $FF: renamed from: m java.lang.String
   public static String field_94 = "AppVersionKey";
   // $FF: renamed from: n java.lang.String
   public static String field_95 = "PRApp";
   // $FF: renamed from: o dn.f
   private static class_91 field_96;
   // $FF: renamed from: p android.content.SharedPreferences
   private SharedPreferences field_97 = PreferenceManager.getDefaultSharedPreferences(class_190.method_805());
   // $FF: renamed from: q android.content.SharedPreferences.Editor
   private Editor field_98;

   private class_91() {
      this.field_98 = this.field_97.edit();
   }

   // $FF: renamed from: a () dn.f
   public static class_91 method_281() {
      if (field_96 == null) {
         field_96 = new class_91();
      }

      return field_96;
   }

   // $FF: renamed from: a (java.lang.String, int) dn.f
   public class_91 method_282(String var1, int var2) {
      this.field_98.remove(var1);
      this.field_98.putInt(var1, var2);
      this.field_98.commit();
      return this;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) dn.f
   public class_91 method_283(String var1, String var2) {
      this.field_98.remove(var1);
      this.field_98.putString(var1, var2);
      this.field_98.commit();
      return this;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_284(String var1) {
      return this.field_97.getString(var1, (String)null);
   }

   // $FF: renamed from: a (java.lang.String, boolean) boolean
   public boolean method_285(String var1, boolean var2) {
      return this.field_97.getBoolean(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String) int
   public int method_286(String var1) {
      return this.field_97.getInt(var1, -1);
   }

   // $FF: renamed from: b (java.lang.String, boolean) dn.f
   public class_91 method_287(String var1, boolean var2) {
      this.field_98.remove(var1);
      this.field_98.commit();
      this.field_98.putBoolean(var1, var2);
      this.field_98.commit();
      return this;
   }

   // $FF: renamed from: b () void
   public void method_288() {
      this.method_289("PopupSelectedIndex");
      this.method_289("HeaderName");
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_289(String var1) {
      this.field_98.remove(var1);
      this.field_98.commit();
   }
}
