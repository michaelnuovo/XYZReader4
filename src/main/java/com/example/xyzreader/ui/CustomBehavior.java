package com.example.xyzreader.ui;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

class CustomBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /**
     * Default constructor for instantiating a CustomBehavior in code.
     */
    public CustomBehavior() {
    }

    /**
     * Default constructor for inflating a CustomBehavior from layout.
     *
     * @param context The {@link Context}.
     * @param attrs The {@link AttributeSet}.
     */
    public CustomBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        // Extract any custom attributes out
        // preferably prefixed with behavior_ to denote they
        // belong to a behavior
    }
}
