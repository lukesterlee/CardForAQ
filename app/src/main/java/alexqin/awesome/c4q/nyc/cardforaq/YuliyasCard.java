package alexqin.awesome.c4q.nyc.cardforaq;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/**
 * Created by July on 7/9/15.
 */
public class YuliyasCard extends Activity {
    private String textToShow[];
    private int currentIndex;
    private int messageCount;
    private TextSwitcher textSwitcher;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yuliya_layout);

        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        btnNext = (Button) findViewById(R.id.buttonNext);
        textToShow = getResources().getStringArray(R.array.qualities);
        messageCount=textToShow.length;
        currentIndex = -1;
        // Set the ViewFactory of the TextSwitcher that will create TextView object when asked
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                // create new textView and set the properties like color, size etc
                TextView myText = new TextView(YuliyasCard.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(36);
                myText.setTextColor(getResources().getColor(R.color.white));
                return myText;
            }
        });

        // Declare the in and out animations and initialize them
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        // set the animation type of textSwitcher
        textSwitcher.setInAnimation(in);
        textSwitcher.setOutAnimation(out);

        // When clicked on Button TextSwitcher will switch between texts
        btnNext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                currentIndex++;
                // If index reaches maximum reset it
                if(currentIndex==messageCount)
                    currentIndex=0;
                textSwitcher.setText(textToShow[currentIndex]);
            }
        });
    }
}

