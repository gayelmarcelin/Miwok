package com.example.android.miwok.events;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"activity number",Toast.LENGTH_SHORT).show();
    }
}
