package com.samsung.android.graphics.spr.animation.interpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import com.samsung.android.graphics.spr.document.SprDocument;

public class QuintEaseInOut implements Interpolator {
    public QuintEaseInOut(Context context, AttributeSet attributeSet) {
    }

    private float inout(float f) {
        f *= SprDocument.DEFAULT_DENSITY_SCALE;
        if (f < 1.0f) {
            return ((((0.5f * f) * f) * f) * f) * f;
        }
        f -= SprDocument.DEFAULT_DENSITY_SCALE;
        return (((((f * f) * f) * f) * f) + SprDocument.DEFAULT_DENSITY_SCALE) * 0.5f;
    }

    public float getInterpolation(float f) {
        return inout(f);
    }
}
