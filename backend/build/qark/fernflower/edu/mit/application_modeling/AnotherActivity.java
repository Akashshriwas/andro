package edu.mit.application_modeling;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends Activity {
   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903040);
      Log.i("DroidBench", ((MyApplication)this.getApplication()).imei);
   }
}
