package alexqin.awesome.c4q.nyc.cardforaq;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void madButtonClick(View view){
        TextView textView= (TextView) findViewById(R.id.fullTextMad);

        textView.setBackgroundColor(Color.BLACK);
        textView.setTextColor(Color.GREEN);
        textView.setText("You definitely had us all at that quote on the first day of class. I want to" +
                " make sure that I let you know you will be missed more than you can imagine and that this mission" +
                " you set for yourself has been complete. You have set our Android souls on fire! I also want to thank you" +
                " for everything you have done for us, for your amazing energy and for just being you! You are an amazing" +
                " human being and I am so glad that I got the opportunity to meet you and to be inspired by your story and how much of" +
                " a badass you are! I know" +
                " that this isn't goodbye but just incase it is a long see ya later, make sure to stay on slack because we still " +
                " need you! I will really miss you tons! C4Q won't be the same without you. \nIf you ever need anything please reach out to me!" +
                "\n\nI love you!" +
                "\n -Madey"+"\n PS. Try to enjoy France while you're there... and my offer still stands ;) See you soon!");
    }
}
