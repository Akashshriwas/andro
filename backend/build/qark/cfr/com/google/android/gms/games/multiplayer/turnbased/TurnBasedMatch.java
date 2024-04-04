/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.f;

public interface TurnBasedMatch
extends Parcelable,
d,
f {
    public static final int[] a_ = new int[]{0, 1, 2, 3};

    public Game b();

    public String c();

    public String d();

    public long e();

    public int f();

    public int g();

    public int h();

    public String j();

    public long k();

    public String l();

    public byte[] m();

    public int n();

    public String o();

    public byte[] p();

    public int q();

    public Bundle r();

    public int s();

    public boolean t();
}

