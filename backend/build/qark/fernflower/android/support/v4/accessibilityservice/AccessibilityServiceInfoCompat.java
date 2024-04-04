package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;

public class AccessibilityServiceInfoCompat {
   public static final int FEEDBACK_ALL_MASK = -1;
   private static final AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl IMPL;

   static {
      if (VERSION.SDK_INT >= 14) {
         IMPL = new AccessibilityServiceInfoCompat.AccessibilityServiceInfoIcsImpl();
      } else {
         IMPL = new AccessibilityServiceInfoCompat.AccessibilityServiceInfoStubImpl();
      }
   }

   private AccessibilityServiceInfoCompat() {
   }

   public static String feedbackTypeToString(int var0) {
      StringBuilder var2 = new StringBuilder();
      var2.append("[");

      while(var0 > 0) {
         int var1 = 1 << Integer.numberOfTrailingZeros(var0);
         var0 &= ~var1;
         if (var2.length() > 1) {
            var2.append(", ");
         }

         switch(var1) {
         case 1:
            var2.append("FEEDBACK_SPOKEN");
            break;
         case 2:
            var2.append("FEEDBACK_HAPTIC");
            break;
         case 4:
            var2.append("FEEDBACK_AUDIBLE");
            break;
         case 8:
            var2.append("FEEDBACK_VISUAL");
            break;
         case 16:
            var2.append("FEEDBACK_GENERIC");
         }
      }

      var2.append("]");
      return var2.toString();
   }

   public static String flagToString(int var0) {
      switch(var0) {
      case 1:
         return "DEFAULT";
      default:
         return null;
      }
   }

   public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo var0) {
      return IMPL.getCanRetrieveWindowContent(var0);
   }

   public static String getDescription(AccessibilityServiceInfo var0) {
      return IMPL.getDescription(var0);
   }

   public static String getId(AccessibilityServiceInfo var0) {
      return IMPL.getId(var0);
   }

   public static ResolveInfo getResolveInfo(AccessibilityServiceInfo var0) {
      return IMPL.getResolveInfo(var0);
   }

   public static String getSettingsActivityName(AccessibilityServiceInfo var0) {
      return IMPL.getSettingsActivityName(var0);
   }

   static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoCompat.AccessibilityServiceInfoStubImpl {
      public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo var1) {
         return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(var1);
      }

      public String getDescription(AccessibilityServiceInfo var1) {
         return AccessibilityServiceInfoCompatIcs.getDescription(var1);
      }

      public String getId(AccessibilityServiceInfo var1) {
         return AccessibilityServiceInfoCompatIcs.getId(var1);
      }

      public ResolveInfo getResolveInfo(AccessibilityServiceInfo var1) {
         return AccessibilityServiceInfoCompatIcs.getResolveInfo(var1);
      }

      public String getSettingsActivityName(AccessibilityServiceInfo var1) {
         return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(var1);
      }
   }

   static class AccessibilityServiceInfoStubImpl implements AccessibilityServiceInfoCompat.AccessibilityServiceInfoVersionImpl {
      public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo var1) {
         return false;
      }

      public String getDescription(AccessibilityServiceInfo var1) {
         return null;
      }

      public String getId(AccessibilityServiceInfo var1) {
         return null;
      }

      public ResolveInfo getResolveInfo(AccessibilityServiceInfo var1) {
         return null;
      }

      public String getSettingsActivityName(AccessibilityServiceInfo var1) {
         return null;
      }
   }

   interface AccessibilityServiceInfoVersionImpl {
      boolean getCanRetrieveWindowContent(AccessibilityServiceInfo var1);

      String getDescription(AccessibilityServiceInfo var1);

      String getId(AccessibilityServiceInfo var1);

      ResolveInfo getResolveInfo(AccessibilityServiceInfo var1);

      String getSettingsActivityName(AccessibilityServiceInfo var1);
   }
}
