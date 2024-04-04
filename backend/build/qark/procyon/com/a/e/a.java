// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.e;

import dn.f;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import java.util.Timer;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.Fragment;

public class a extends Fragment
{
    public EditText N;
    protected Button O;
    private Timer P;
    private TextView$OnEditorActionListener Q;
    private TextWatcher R;
    private View$OnClickListener S;
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130903065, viewGroup, false);
        this.O = (Button)inflate.findViewById(2131165246);
        if (this.O != null) {
            this.O.setVisibility(8);
            this.O.setOnClickListener(this.S);
        }
        this.N = (EditText)inflate.findViewById(2131165245);
        if (this.N != null) {
            final String a = dn.f.a().a(dn.f.d);
            if (a != null) {
                this.N.setText((CharSequence)a);
                this.O.setVisibility(0);
                this.N.setSelection(a.length());
            }
            this.N.addTextChangedListener(this.R);
            this.N.setOnEditorActionListener(this.Q);
        }
        return inflate;
    }
    
    @Override
    public void b(final Bundle bundle) {
        super.b(bundle);
        this.P = new Timer();
    }
}
