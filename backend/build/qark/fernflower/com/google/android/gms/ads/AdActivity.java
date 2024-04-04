package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.class_379;
import com.google.android.gms.internal.class_467;
import com.google.android.gms.internal.class_49;

public final class AdActivity extends Activity {
   // $FF: renamed from: a com.google.android.gms.internal.cp
   private class_49 field_2066;

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.field_2066 = class_379.method_1300(this);
      if (this.field_2066 == null) {
         class_467.method_1610("Could not create ad overlay.");
         this.finish();
      } else {
         try {
            this.field_2066.method_141(var1);
         } catch (RemoteException var2) {
            class_467.method_1607("Could not forward onCreate to ad overlay:", var2);
            this.finish();
         }
      }
   }

   protected void onDestroy() {
      try {
         if (this.field_2066 != null) {
            this.field_2066.method_148();
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onDestroy to ad overlay:", var2);
      }

      super.onDestroy();
   }

   protected void onPause() {
      try {
         if (this.field_2066 != null) {
            this.field_2066.method_146();
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onPause to ad overlay:", var2);
         this.finish();
      }

      super.onPause();
   }

   protected void onRestart() {
      super.onRestart();

      try {
         if (this.field_2066 != null) {
            this.field_2066.method_143();
         }

      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onRestart to ad overlay:", var2);
         this.finish();
      }
   }

   protected void onResume() {
      super.onResume();

      try {
         if (this.field_2066 != null) {
            this.field_2066.method_145();
         }

      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onResume to ad overlay:", var2);
         this.finish();
      }
   }

   protected void onSaveInstanceState(Bundle var1) {
      try {
         if (this.field_2066 != null) {
            this.field_2066.method_142(var1);
         }
      } catch (RemoteException var3) {
         class_467.method_1607("Could not forward onSaveInstanceState to ad overlay:", var3);
         this.finish();
      }

      super.onSaveInstanceState(var1);
   }

   protected void onStart() {
      super.onStart();

      try {
         if (this.field_2066 != null) {
            this.field_2066.method_144();
         }

      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onStart to ad overlay:", var2);
         this.finish();
      }
   }

   protected void onStop() {
      try {
         if (this.field_2066 != null) {
            this.field_2066.method_147();
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Could not forward onStop to ad overlay:", var2);
         this.finish();
      }

      super.onStop();
   }
}
