/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.v4.accessibilityservice.AccessibilityServiceInfoCompatIcs;

public class AccessibilityServiceInfoCompat {
    public static final int FEEDBACK_ALL_MASK = -1;
    private static final AccessibilityServiceInfoVersionImpl IMPL = Build.VERSION.SDK_INT >= 14 ? new AccessibilityServiceInfoIcsImpl() : new AccessibilityServiceInfoStubImpl();

    private AccessibilityServiceInfoCompat() {
    }

    public static String feedbackTypeToString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        block7 : while (n > 0) {
            int n2 = 1 << Integer.numberOfTrailingZeros((int)n);
            n &= ~ n2;
            if (stringBuilder.length() > 1) {
                stringBuilder.append(", ");
            }
            switch (n2) {
                default: {
                    continue block7;
                }
                case 1: {
                    stringBuilder.append("FEEDBACK_SPOKEN");
                    continue block7;
                }
                case 4: {
                    stringBuilder.append("FEEDBACK_AUDIBLE");
                    continue block7;
                }
                case 2: {
                    stringBuilder.append("FEEDBACK_HAPTIC");
                    continue block7;
                }
                case 16: {
                    stringBuilder.append("FEEDBACK_GENERIC");
                    continue block7;
                }
                case 8: 
            }
            stringBuilder.append("FEEDBACK_VISUAL");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String flagToString(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: 
        }
        return "DEFAULT";
    }

    public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getCanRetrieveWindowContent(accessibilityServiceInfo);
    }

    public static String getDescription(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getDescription(accessibilityServiceInfo);
    }

    public static String getId(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getId(accessibilityServiceInfo);
    }

    public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getResolveInfo(accessibilityServiceInfo);
    }

    public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityServiceInfo) {
        return IMPL.getSettingsActivityName(accessibilityServiceInfo);
    }

    static class AccessibilityServiceInfoIcsImpl
    extends AccessibilityServiceInfoStubImpl {
        AccessibilityServiceInfoIcsImpl() {
        }

        @Override
        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityServiceInfo);
        }

        @Override
        public String getDescription(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getDescription(accessibilityServiceInfo);
        }

        @Override
        public String getId(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getId(accessibilityServiceInfo);
        }

        @Override
        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getResolveInfo(accessibilityServiceInfo);
        }

        @Override
        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(accessibilityServiceInfo);
        }
    }

    static class AccessibilityServiceInfoStubImpl
    implements AccessibilityServiceInfoVersionImpl {
        AccessibilityServiceInfoStubImpl() {
        }

        @Override
        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityServiceInfo) {
            return false;
        }

        @Override
        public String getDescription(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        @Override
        public String getId(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        @Override
        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        @Override
        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }
    }

    static interface AccessibilityServiceInfoVersionImpl {
        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo var1);

        public String getDescription(AccessibilityServiceInfo var1);

        public String getId(AccessibilityServiceInfo var1);

        public ResolveInfo getResolveInfo(AccessibilityServiceInfo var1);

        public String getSettingsActivityName(AccessibilityServiceInfo var1);
    }

}

