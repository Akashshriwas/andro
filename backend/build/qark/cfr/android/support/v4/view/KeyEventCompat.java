/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.KeyEventCompatHoneycomb;
import android.view.KeyEvent;

public class KeyEventCompat {
    static final KeyEventVersionImpl IMPL = Build.VERSION.SDK_INT >= 11 ? new HoneycombKeyEventVersionImpl() : new BaseKeyEventVersionImpl();

    public static boolean hasModifiers(KeyEvent keyEvent, int n) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), n);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean metaStateHasModifiers(int n, int n2) {
        return IMPL.metaStateHasModifiers(n, n2);
    }

    public static boolean metaStateHasNoModifiers(int n) {
        return IMPL.metaStateHasNoModifiers(n);
    }

    public static int normalizeMetaState(int n) {
        return IMPL.normalizeMetaState(n);
    }

    static class BaseKeyEventVersionImpl
    implements KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        BaseKeyEventVersionImpl() {
        }

        /*
         * Enabled aggressive block sorting
         */
        private static int metaStateFilterDirectionalModifiers(int n, int n2, int n3, int n4, int n5) {
            int n6 = 1;
            boolean bl = (n2 & n3) != 0;
            n2 = (n2 & (n4 |= n5)) != 0 ? n6 : 0;
            if (bl) {
                if (n2 == 0) return n & ~ n4;
                throw new IllegalArgumentException("bad arguments");
            }
            n4 = n;
            if (n2 == 0) return n4;
            return n & ~ n3;
        }

        @Override
        public boolean metaStateHasModifiers(int n, int n2) {
            if (BaseKeyEventVersionImpl.metaStateFilterDirectionalModifiers(BaseKeyEventVersionImpl.metaStateFilterDirectionalModifiers(this.normalizeMetaState(n) & 247, n2, 1, 64, 128), n2, 2, 16, 32) == n2) {
                return true;
            }
            return false;
        }

        @Override
        public boolean metaStateHasNoModifiers(int n) {
            if ((this.normalizeMetaState(n) & 247) == 0) {
                return true;
            }
            return false;
        }

        @Override
        public int normalizeMetaState(int n) {
            int n2 = n;
            if ((n & 192) != 0) {
                n2 = n | 1;
            }
            n = n2;
            if ((n2 & 48) != 0) {
                n = n2 | 2;
            }
            return n & 247;
        }
    }

    static class HoneycombKeyEventVersionImpl
    implements KeyEventVersionImpl {
        HoneycombKeyEventVersionImpl() {
        }

        @Override
        public boolean metaStateHasModifiers(int n, int n2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(n, n2);
        }

        @Override
        public boolean metaStateHasNoModifiers(int n) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(n);
        }

        @Override
        public int normalizeMetaState(int n) {
            return KeyEventCompatHoneycomb.normalizeMetaState(n);
        }
    }

    static interface KeyEventVersionImpl {
        public boolean metaStateHasModifiers(int var1, int var2);

        public boolean metaStateHasNoModifiers(int var1);

        public int normalizeMetaState(int var1);
    }

}

