// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.accessibilityservice;

import android.content.pm.ResolveInfo;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build$VERSION;

public class AccessibilityServiceInfoCompat
{
    public static final int FEEDBACK_ALL_MASK = -1;
    private static final AccessibilityServiceInfoVersionImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 14) {
            IMPL = (AccessibilityServiceInfoVersionImpl)new AccessibilityServiceInfoIcsImpl();
            return;
        }
        IMPL = (AccessibilityServiceInfoVersionImpl)new AccessibilityServiceInfoStubImpl();
    }
    
    private AccessibilityServiceInfoCompat() {
    }
    
    public static String feedbackTypeToString(int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            final int n = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~n;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            switch (n) {
                default: {
                    continue;
                }
                case 1: {
                    sb.append("FEEDBACK_SPOKEN");
                    continue;
                }
                case 4: {
                    sb.append("FEEDBACK_AUDIBLE");
                    continue;
                }
                case 2: {
                    sb.append("FEEDBACK_HAPTIC");
                    continue;
                }
                case 16: {
                    sb.append("FEEDBACK_GENERIC");
                    continue;
                }
                case 8: {
                    sb.append("FEEDBACK_VISUAL");
                    continue;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static String flagToString(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return "DEFAULT";
            }
        }
    }
    
    public static boolean getCanRetrieveWindowContent(final AccessibilityServiceInfo accessibilityServiceInfo) {
        return AccessibilityServiceInfoCompat.IMPL.getCanRetrieveWindowContent(accessibilityServiceInfo);
    }
    
    public static String getDescription(final AccessibilityServiceInfo accessibilityServiceInfo) {
        return AccessibilityServiceInfoCompat.IMPL.getDescription(accessibilityServiceInfo);
    }
    
    public static String getId(final AccessibilityServiceInfo accessibilityServiceInfo) {
        return AccessibilityServiceInfoCompat.IMPL.getId(accessibilityServiceInfo);
    }
    
    public static ResolveInfo getResolveInfo(final AccessibilityServiceInfo accessibilityServiceInfo) {
        return AccessibilityServiceInfoCompat.IMPL.getResolveInfo(accessibilityServiceInfo);
    }
    
    public static String getSettingsActivityName(final AccessibilityServiceInfo accessibilityServiceInfo) {
        return AccessibilityServiceInfoCompat.IMPL.getSettingsActivityName(accessibilityServiceInfo);
    }
    
    static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoStubImpl
    {
        @Override
        public boolean getCanRetrieveWindowContent(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityServiceInfo);
        }
        
        @Override
        public String getDescription(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getDescription(accessibilityServiceInfo);
        }
        
        @Override
        public String getId(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getId(accessibilityServiceInfo);
        }
        
        @Override
        public ResolveInfo getResolveInfo(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getResolveInfo(accessibilityServiceInfo);
        }
        
        @Override
        public String getSettingsActivityName(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(accessibilityServiceInfo);
        }
    }
    
    static class AccessibilityServiceInfoStubImpl implements AccessibilityServiceInfoVersionImpl
    {
        @Override
        public boolean getCanRetrieveWindowContent(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return false;
        }
        
        @Override
        public String getDescription(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }
        
        @Override
        public String getId(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }
        
        @Override
        public ResolveInfo getResolveInfo(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }
        
        @Override
        public String getSettingsActivityName(final AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }
    }
    
    interface AccessibilityServiceInfoVersionImpl
    {
        boolean getCanRetrieveWindowContent(final AccessibilityServiceInfo p0);
        
        String getDescription(final AccessibilityServiceInfo p0);
        
        String getId(final AccessibilityServiceInfo p0);
        
        ResolveInfo getResolveInfo(final AccessibilityServiceInfo p0);
        
        String getSettingsActivityName(final AccessibilityServiceInfo p0);
    }
}
