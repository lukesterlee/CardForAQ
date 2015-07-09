package alexqin.awesome.c4q.nyc.cardforaq;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by c4q-ac35 on 7/9/15.
 */
public class JoseCardActivity extends ActionBarActivity {
    Button feelsButtonJose,noFeelsButtonJose;
    TextView messageJose;
    ImageView twitter,instagram,linkedIn,wordpress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_jose);

        messageJose = (TextView) findViewById(R.id.jose_message);
        messageJose.setVisibility(View.INVISIBLE);

        feelsButtonJose = (Button) findViewById(R.id.feels_button_jose);

        feelsButtonJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageJose.setVisibility(View.VISIBLE);

            }
        });

        noFeelsButtonJose = (Button) findViewById(R.id.no_feels_button_jose);

        noFeelsButtonJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageJose.setVisibility(View.INVISIBLE);

            }
        });

        twitter = (ImageView) findViewById(R.id.twitter);

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.twitter.com/SeeYaGarcia");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        instagram = (ImageView) findViewById(R.id.instagram);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.instagram.com/AyoJoankss");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        linkedIn = (ImageView) findViewById(R.id.linkedIn);

        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/jgarcia162");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        wordpress = (ImageView) findViewById(R.id.wordpress);

        wordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://inwardmovement.wordpress.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
