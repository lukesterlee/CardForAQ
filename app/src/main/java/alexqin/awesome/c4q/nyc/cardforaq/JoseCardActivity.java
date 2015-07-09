package alexqin.awesome.c4q.nyc.cardforaq;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by c4q-ac35 on 7/9/15.
 */
public class JoseCardActivity extends ActionBarActivity {
    Button feelsButtonJose,noFeelsButtonJose;
    TextView messageJose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_jose);

        messageJose = (TextView) findViewById(R.id.jose_message);
        messageJose.setVisibility(View.INVISIBLE);
        noFeelsButtonJose.setVisibility(View.INVISIBLE);

        feelsButtonJose = (Button) findViewById(R.id.feels_button_jose);

        feelsButtonJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageJose.setVisibility(View.VISIBLE);
                feelsButtonJose.setVisibility(View.INVISIBLE);
                noFeelsButtonJose.setVisibility(View.VISIBLE);
            }
        });

        noFeelsButtonJose = (Button) findViewById(R.id.no_feels_button_jose);

        noFeelsButtonJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageJose.setVisibility(View.INVISIBLE);
                noFeelsButtonJose.setVisibility(View.INVISIBLE);
                feelsButtonJose.setVisibility(View.VISIBLE);
            }
        });
    }
}
