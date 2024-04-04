// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Handler;
import android.widget.TextView;
import android.view.View;
import android.widget.ListView;
import android.widget.ListAdapter;

public class t extends Fragment
{
    ListAdapter N;
    ListView O;
    View P;
    TextView Q;
    View R;
    View S;
    CharSequence T;
    boolean U;
    private final Handler V;
    private final Runnable W;
    private final AdapterView$OnItemClickListener X;
    
    public t() {
        this.V = new Handler();
        this.W = new u(this);
        this.X = (AdapterView$OnItemClickListener)new v(this);
    }
    
    private void a(final boolean u, final boolean b) {
        this.s();
        if (this.R == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.U == u) {
            return;
        }
        this.U = u;
        if (u) {
            if (b) {
                this.R.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), 17432577));
                this.S.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), 17432576));
            }
            else {
                this.R.clearAnimation();
                this.S.clearAnimation();
            }
            this.R.setVisibility(8);
            this.S.setVisibility(0);
            return;
        }
        if (b) {
            this.R.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), 17432576));
            this.S.startAnimation(AnimationUtils.loadAnimation((Context)this.c(), 17432577));
        }
        else {
            this.R.clearAnimation();
            this.S.clearAnimation();
        }
        this.R.setVisibility(0);
        this.S.setVisibility(8);
    }
    
    private void s() {
        if (this.O != null) {
            return;
        }
        final View d = this.d();
        if (d == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (d instanceof ListView) {
            this.O = (ListView)d;
        }
        else {
            this.Q = (TextView)d.findViewById(16711681);
            if (this.Q == null) {
                this.P = d.findViewById(16908292);
            }
            else {
                this.Q.setVisibility(8);
            }
            this.R = d.findViewById(16711682);
            this.S = d.findViewById(16711683);
            final View viewById = d.findViewById(16908298);
            if (!(viewById instanceof ListView)) {
                if (viewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            else {
                this.O = (ListView)viewById;
                if (this.P != null) {
                    this.O.setEmptyView(this.P);
                }
                else if (this.T != null) {
                    this.Q.setText(this.T);
                    this.O.setEmptyView((View)this.Q);
                }
            }
        }
        this.U = true;
        this.O.setOnItemClickListener(this.X);
        if (this.N != null) {
            final ListAdapter n = this.N;
            this.N = null;
            this.a(n);
        }
        else if (this.R != null) {
            this.a(false, false);
        }
        this.V.post(this.W);
    }
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final g c = this.c();
        final FrameLayout frameLayout = new FrameLayout((Context)c);
        final LinearLayout linearLayout = new LinearLayout((Context)c);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView((View)new ProgressBar((Context)c, (AttributeSet)null, 16842874), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final FrameLayout frameLayout2 = new FrameLayout((Context)c);
        frameLayout2.setId(16711683);
        final TextView textView = new TextView((Context)this.c());
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView((View)textView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final ListView listView = new ListView((Context)this.c());
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView((View)listView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        return (View)frameLayout;
    }
    
    @Override
    public void a(final View view, final Bundle bundle) {
        super.a(view, bundle);
        this.s();
    }
    
    public void a(final ListAdapter listAdapter) {
        boolean b = false;
        boolean b2;
        if (this.N != null) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.N = listAdapter;
        if (this.O != null) {
            this.O.setAdapter(listAdapter);
            if (!this.U && !b2) {
                if (this.d().getWindowToken() != null) {
                    b = true;
                }
                this.a(true, b);
            }
        }
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
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
