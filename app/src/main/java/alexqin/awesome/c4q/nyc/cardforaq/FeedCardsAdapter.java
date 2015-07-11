package alexqin.awesome.c4q.nyc.cardforaq;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Hoshiko on 7/7/15.
 */
public class FeedCardsAdapter extends RecyclerView.Adapter<FeedCardsAdapter.CardViewHolder>
        implements ItemTouchHelperAdapter {

    /**
     * Listener for manual initiation of a drag.
     */
    public interface OnStartDragListener {

        /**
         * Called when a view is requesting a start of a drag.
         *
         * @param viewHolder The holder of the view to drag.
         */
        void onStartDrag(RecyclerView.ViewHolder viewHolder);
    }


    private List<CardData> cardDataList;
    private Context context;
    private int currentIndex;

    public FeedCardsAdapter(Context context) {
        cardDataList = new ArrayList<>();
        this.context = context;
    }

    public List<CardData> getCardDataList() {
        return cardDataList;
    }

    public void setCardDataList(List<CardData> cardDataList) {
        this.cardDataList = cardDataList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {


            case CardData.CARD_SEQ_ANNA:
                View annaCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_anna, parent, false);

                CardViewHolder annaCardViewHolder = new CardViewHolder(annaCard);
                return annaCardViewHolder;

            case CardData.CARD_SEQ_ANTHONYF:
                View anthonyfCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_anthonyf, parent, false);

                CardViewHolder anthonyfCardViewHolder = new CardViewHolder(anthonyfCard);
                return anthonyfCardViewHolder;

            case CardData.CARD_SEQ_CHARLYN:
                View charlynCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_charlyn, parent, false);
                ImageView i3 = (ImageView) charlynCard.findViewById(R.id.group);
                Picasso.with(context).load(R.drawable.group).into(i3);
                ImageView i4 = (ImageView) charlynCard.findViewById(R.id.classgrid);
                Picasso.with(context).load(R.drawable.classgrid).into(i4);
                ImageView i5 = (ImageView) charlynCard.findViewById(R.id.sufei);
                Picasso.with(context).load(R.drawable.sufei).into(i5);
                CardViewHolder charlynCardViewHolder = new CardViewHolder(charlynCard);
                return charlynCardViewHolder;

            case CardData.CARD_SEQ_GEORGE:
                View georgeCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_george, parent, false);
                CardViewHolder georgeCardViewHolder = new CardViewHolder(georgeCard);
                return georgeCardViewHolder;

            case CardData.CARD_SEQ_HANS:
                View hansCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_hans, parent, false);
                CardViewHolder hansCardViewHolder = new CardViewHolder(hansCard);
                return hansCardViewHolder;

            case CardData.CARD_SEQ_HOSHIKO:
                View hoshikoCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_hoshiko, parent, false);
                CardViewHolder hoshikoCardViewHolder = new CardViewHolder(hoshikoCard);
                return hoshikoCardViewHolder;



            case CardData.CARD_SEQ_JANNEISY:
                View janneisyCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_janneisy, parent, false);
                ImageView i8 = (ImageView) janneisyCard.findViewById(R.id.jannImage);
                Picasso.with(context).load(R.drawable.jann3).resize(550,550).into(i8);
                CardViewHolder janneisyCardViewHolder = new CardViewHolder(janneisyCard);
                return janneisyCardViewHolder;

            case CardData.CARD_SEQ_JOHN:
                View johnCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_john, parent, false);
                CardViewHolder johnCardViewHolder = new CardViewHolder(johnCard);
                return johnCardViewHolder;

            case CardData.CARD_SEQ_JORGE:
                View jorgeCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_jorge, parent, false);
                CardViewHolder jorgeCardViewHolder = new CardViewHolder(jorgeCard);
                return jorgeCardViewHolder;

            case CardData.CARD_SEQ_JOSE:
                View joseCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_jose, parent, false);
                CardViewHolder joseCardViewHolder = new CardViewHolder(joseCard);
                return joseCardViewHolder;

            case CardData.CARD_SEQ_JOSHELYN:
                View joshelynCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_joshelyn, parent, false);

                ImageView i9 = (ImageView) joshelynCard.findViewById(R.id.sailor);
                Picasso.with(context).load(R.drawable.joshelyn_sailor_cats).resize(550,550).into(i9);

                ImageView i10 = (ImageView) joshelynCard.findViewById(R.id.jvimageView);
                Picasso.with(context).load(R.drawable.pic_joshelyn).resize(550,550).into(i10);

                CardViewHolder joshelynCardViewHolder = new CardViewHolder(joshelynCard);
                return joshelynCardViewHolder;

            case CardData.CARD_SEQ_KADEEM:
                View kadeemCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_kadeem, parent, false);
                CardViewHolder kadeemCardViewHolder = new CardViewHolder(kadeemCard);
                return kadeemCardViewHolder;

            case CardData.CARD_SEQ_LUKE:
                View lukeCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_luke, parent, false);
                ImageView i6 = (ImageView) lukeCard.findViewById(R.id.luke);
                Picasso.with(context).load(R.drawable.luke).resize(550,550).into(i6);
                CardViewHolder lukeCardViewHolder = new CardViewHolder(lukeCard);
                return lukeCardViewHolder;

            case CardData.CARD_SEQ_MADELYN:
                View madelynCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_madelyn, parent, false);
                CardViewHolder madelynCardViewHolder = new CardViewHolder(madelynCard);
                return madelynCardViewHolder;

            case CardData.CARD_SEQ_MARBELLA:
                View marbellaCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_marbella, parent, false);
                CardViewHolder marbellaCardViewHolder = new CardViewHolder(marbellaCard);
                return marbellaCardViewHolder;


            case CardData.CARD_SEQ_RAMONA:
                View ramonaCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_ramona, parent, false);
                CardViewHolder ramonaCardViewHolder = new CardViewHolder(ramonaCard);
                return ramonaCardViewHolder;

            case CardData.CARD_SEQ_RAY:
                View rayCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_ray, parent, false);
                CardViewHolder rayCardViewHolder = new CardViewHolder(rayCard);
                return rayCardViewHolder;

            case CardData.CARD_SEQ_SARAH:
                View sarahCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_sarah, parent, false);
                CardViewHolder sarahCardViewHolder = new CardViewHolder(sarahCard);
                return sarahCardViewHolder;


            case CardData.CARD_SEQ_TASHA:
                View tashaCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasha, parent, false);
                CardViewHolder tashaCardViewHolder = new CardViewHolder(tashaCard);
                return tashaCardViewHolder;

            case CardData.CARD_SEQ_VANICE:
                View vaniceCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_vanice, parent, false);
                CardViewHolder vaniceCardViewHolder = new CardViewHolder(vaniceCard);
                return vaniceCardViewHolder;

            case CardData.CARD_SEQ_YULIYA:
                View yuliyaCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_yuliya, parent, false);
                CardViewHolder yuliyaCardViewHolder = new CardViewHolder(yuliyaCard);
                return yuliyaCardViewHolder;




            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return cardDataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        CardData cardData = cardDataList.get(position);
        return cardData.getStudentId();
    }


    @Override
    public void onItemDismiss(int position) {
        cardDataList.remove(position);
        notifyItemRemoved(position);
    }


    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        Collections.swap(cardDataList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }


    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public CardViewHolder(View itemView) {
            super(itemView);
        }

    }
}
