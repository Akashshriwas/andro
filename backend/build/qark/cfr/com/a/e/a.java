/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Timer
 */
package com.a.e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import dn.f;
import java.util.Timer;

public class a
extends Fragment {
    public EditText N;
    protected Button O;
    private Timer P;
    private TextView.OnEditorActionListener Q;
    private TextWatcher R;
    private View.OnClickListener S;

    @Override
    public View a(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2130903065, (ViewGroup)object, false);
        this.O = (Button)layoutInflater.findViewById(2131165246);
        if (this.O != null) {
            this.O.setVisibility(8);
            this.O.setOnClickListener(this.S);
        }
        this.N = (EditText)layoutInflater.findViewById(2131165245);
        if (this.N != null) {
            object = f.a().a(f.d);
            if (object != null) {
                this.N.setText((CharSequence)object);
                this.O.setVisibility(0);
                this.N.setSelection(object.length());
            }
            this.N.addTextChangedListener(this.R);
            this.N.setOnEditorActionListener(this.Q);
        }
        return layoutInflater;
    }

    @Override
    public void b(Bundle bundle) {
        super.b(bundle);
        this.P = new Timer();
    }
}

