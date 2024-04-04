/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.support.v4.app.u;
import android.support.v4.app.v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class t
extends Fragment {
    ListAdapter N;
    ListView O;
    View P;
    TextView Q;
    View R;
    View S;
    CharSequence T;
    boolean U;
    private final Handler V = new Handler();
    private final Runnable W;
    private final AdapterView.OnItemClickListener X;

    public t() {
        this.W = new u(this);
        this.X = new v(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(boolean bl2, boolean bl3) {
        this.s();
        if (this.R == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.U == bl2) {
            return;
        }
        this.U = bl2;
        if (bl2) {
            if (bl3) {
                this.R.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), (int)17432577));
                this.S.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), (int)17432576));
            } else {
                this.R.clearAnimation();
                this.S.clearAnimation();
            }
            this.R.setVisibility(8);
            this.S.setVisibility(0);
            return;
        }
        if (bl3) {
            this.R.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), (int)17432576));
            this.S.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), (int)17432577));
        } else {
            this.R.clearAnimation();
            this.S.clearAnimation();
        }
        this.R.setVisibility(0);
        this.S.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void s() {
        if (this.O != null) {
            return;
        }
        View view = this.d();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.O = (ListView)view;
        } else {
            this.Q = (TextView)view.findViewById(16711681);
            if (this.Q == null) {
                this.P = view.findViewById(16908292);
            } else {
                this.Q.setVisibility(8);
            }
            this.R = view.findViewById(16711682);
            this.S = view.findViewById(16711683);
            if (!((view = view.findViewById(16908298)) instanceof ListView)) {
                if (view == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            this.O = (ListView)view;
            if (this.P != null) {
                this.O.setEmptyView(this.P);
            } else if (this.T != null) {
                this.Q.setText(this.T);
                this.O.setEmptyView((View)this.Q);
            }
        }
        this.U = true;
        this.O.setOnItemClickListener(this.X);
        if (this.N != null) {
            view = this.N;
            this.N = null;
            this.a((ListAdapter)view);
        } else if (this.R != null) {
            this.a(false, false);
        }
        this.V.post(this.W);
    }

    @Override
    public View a(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        object = this.c();
        layoutInflater = new FrameLayout((Context)object);
        bundle = new LinearLayout((Context)object);
        bundle.setId(16711682);
        bundle.setOrientation(1);
        bundle.setVisibility(8);
        bundle.setGravity(17);
        bundle.addView((View)new ProgressBar((Context)object, null, 16842874), (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
        layoutInflater.addView((View)bundle, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        object = new FrameLayout((Context)object);
        object.setId(16711683);
        bundle = new TextView((Context)this.c());
        bundle.setId(16711681);
        bundle.setGravity(17);
        object.addView((View)bundle, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        bundle = new ListView((Context)this.c());
        bundle.setId(16908298);
        bundle.setDrawSelectorOnTop(false);
        object.addView((View)bundle, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        layoutInflater.addView((View)object, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        layoutInflater.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        return layoutInflater;
    }

    @Override
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.s();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(ListAdapter listAdapter) {
        boolean bl2 = false;
        boolean bl3 = this.N != null;
        this.N = listAdapter;
        if (this.O != null) {
            this.O.setAdapter(listAdapter);
            if (!this.U && !bl3) {
                if (this.d().getWindowToken() != null) {
                    bl2 = true;
                }
                this.a(true, bl2);
            }
        }
    }

    public void a(ListView listView, View view, int n2, long l2) {
    }

    @Override
    public void i() {
        this.V.removeCallbacks(this.W);
        this.O = null;
        this.U = false;
        this.S = null;
        this.R = null;
        this.P = null;
        this.Q = null;
        super.i();
    }

    public ListView r() {
        this.s();
        return this.O;
    }
}

