// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.KeyEvent;
import android.os.Build$VERSION;

public class KeyEventCompat
{
    static final KeyEventVersionImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            IMPL = (KeyEventVersionImpl)new HoneycombKeyEventVersionImpl();
            return;
        }
        IMPL = (KeyEventVersionImpl)new BaseKeyEventVersionImpl();
    }
    
    public static boolean hasModifiers(final KeyEvent keyEvent, final int n) {
        return KeyEventCompat.IMPL.metaStateHasModifiers(keyEvent.getMetaState(), n);
    }
    
    public static boolean hasNoModifiers(final KeyEvent keyEvent) {
        return KeyEventCompat.IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }
    
    public static boolean metaStateHasModifiers(final int n, final int n2) {
        return KeyEventCompat.IMPL.metaStateHasModifiers(n, n2);
    }
    
    public static boolean metaStateHasNoModifiers(final int n) {
        return KeyEventCompat.IMPL.metaStateHasNoModifiers(n);
    }
    
    public static int normalizeMetaState(final int n) {
        return KeyEventCompat.IMPL.normalizeMetaState(n);
    }
    
    static class BaseKeyEventVersionImpl implements KeyEventVersionImpl
    {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;
        
        private static int metaStateFilterDirectionalModifiers(final int n, int n2, final int n3, int n4, final int n5) {
            final int n6 = 1;
            int n7;
            if ((n2 & n3) != 0x0) {
                n7 = 1;
            }
            else {
                n7 = 0;
            }
            n4 |= n5;
            if ((n2 & n4) != 0x0) {
                n2 = n6;
            }
            else {
                n2 = 0;
            }
            if (n7 != 0) {
                if (n2 != 0) {
                    throw new IllegalArgumentException("bad arguments");
                }
                n4 = (n & ~n4);
            }
            else {
                n4 = n;
                if (n2 != 0) {
                    return n & ~n3;
                }
            }
            return n4;
        }
        
        @Override
        public boolean metaStateHasModifiers(final int n, final int n2) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(this.normalizeMetaState(n) & 0xF7, n2, 1, 64, 128), n2, 2, 16, 32) == n2;
        }
        
        @Override
        public boolean metaStateHasNoModifiers(final int n) {
            return (this.normalizeMetaState(n) & 0xF7) == 0x0;
        }
        
        @Override
        public int normalizeMetaState(int n) {
            int n2 = n;
            if ((n & 0xC0) != 0x0) {
                n2 = (n | 0x1);
            }
            n = n2;
            if ((n2 & 0x30) != 0x0) {
                n = (n2 | 0x2);
            }
            return n & 0xF7;
        }
    }
    
    static class HoneycombKeyEventVersionImpl implements KeyEventVersionImpl
    {
        @Override
        public boolean metaStateHasModifiers(final int n, final int n2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(n, n2);
        }
        
        @Override
        public boolean metaStateHasNoModifiers(final int n) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(n);
        }
        
        @Override
        public int normalizeMetaState(final int n) {
            return KeyEventCompatHoneycomb.normalizeMetaState(n);
        }
    }
    
    interface KeyEventVersionImpl
    {
        boolean metaStateHasModifiers(final int p0, final int p1);
        
        boolean metaStateHasNoModifiers(final int p0);
        
        int normalizeMetaState(final int p0);
    }
}
