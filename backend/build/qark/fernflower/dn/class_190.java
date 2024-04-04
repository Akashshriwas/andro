package dn;

import android.app.Application;
import android.content.Context;

// $FF: renamed from: dn.hs
public class class_190 extends Application {
   // $FF: renamed from: a android.content.Context
   private static Context field_643;

   // $FF: renamed from: a () android.content.Context
   public static Context method_805() {
      return field_643;
   }

   public void onCreate() {
      super.onCreate();
      field_643 = this.getApplicationContext();
   }
}
