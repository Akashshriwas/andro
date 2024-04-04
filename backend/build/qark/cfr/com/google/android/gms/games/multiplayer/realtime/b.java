/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;

public final class b {
    public static Bundle a(int n2, int n3, long l2) {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", n2);
        bundle.putInt("max_automatch_players", n3);
        bundle.putLong("exclusive_bit_mask", l2);
        return bundle;
    }
}

