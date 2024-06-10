package edu.mit.application_modeling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class MainActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    paramBundle = ((TelephonyManager)getSystemService("phone")).getDeviceId();
    getApplicationimei = paramBundle;
    new Intent(this, AnotherActivity.class);
  }
}

/* Location:
 * Qualified Name:     edu.mit.application_modeling.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */