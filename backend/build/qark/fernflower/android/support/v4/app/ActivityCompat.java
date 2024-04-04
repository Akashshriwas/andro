package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;

public class ActivityCompat extends ContextCompat {
   public static boolean invalidateOptionsMenu(Activity var0) {
      if (VERSION.SDK_INT >= 11) {
         ActivityCompatHoneycomb.invalidateOptionsMenu(var0);
         return true;
      } else {
         return false;
      }
   }
}
