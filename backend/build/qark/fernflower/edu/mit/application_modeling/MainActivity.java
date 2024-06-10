package edu.mit.application_modeling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class MainActivity extends Activity {
   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903040);
      String var2 = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
      ((MyApplication)this.getApplication()).imei = var2;
      new Intent(this, AnotherActivity.class);
   }
}
