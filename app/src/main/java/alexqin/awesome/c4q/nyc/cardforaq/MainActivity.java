package alexqin.awesome.c4q.nyc.cardforaq;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvFeedCards = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvFeedCards.setLayoutManager(llm);

        FeedCardsAdapter feedCardsAdapter = new FeedCardsAdapter();
        rvFeedCards.setAdapter(feedCardsAdapter);

        List<CardData> cardDataList = CardInfo.getCardInfo();

        feedCardsAdapter.setCardDataList(cardDataList);


        //touch funstions are still work in progress.

//        ItemTouchHelper.Callback callback =
//                new SimpleItemTouchHelperCallback(feedCardsAdapter);
//        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
//        touchHelper.attachToRecyclerView(rvFeedCards);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
