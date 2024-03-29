package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class MyTextView1 extends android.support.v7.widget.AppCompatTextView {

    public MyTextView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView1(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }

}