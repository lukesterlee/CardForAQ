package alexqin.awesome.c4q.nyc.cardforaq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoshiko on 7/7/15.
 */
public class CardInfo {

    public static List<CardData> getCardInfo() {
        List<CardData> cardDataList = new ArrayList<>();

        CardData anna = new CardData(CardData.CARD_SEQ_ANNA);
        CardData anthonyf= new CardData(CardData.CARD_SEQ_ANTHONYF);
        CardData charlyn = new CardData(CardData.CARD_SEQ_CHARLYN);
        CardData george = new CardData(CardData.CARD_SEQ_GEORGE);
        CardData hans = new CardData(CardData.CARD_SEQ_HANS);
        CardData hoshiko = new CardData(CardData.CARD_SEQ_HOSHIKO);
        CardData janneisy = new CardData(CardData.CARD_SEQ_JANNEISY);
        CardData john = new CardData(CardData.CARD_SEQ_JOHN);
        CardData jorge = new CardData(CardData.CARD_SEQ_JORGE);
        CardData joshelyn = new CardData(CardData.CARD_SEQ_JOSHELYN);
        CardData kadeem = new CardData(CardData.CARD_SEQ_KADEEM);
        CardData luke = new CardData(CardData.CARD_SEQ_LUKE);
        CardData madelyn = new CardData(CardData.CARD_SEQ_MADELYN);
        CardData marbella = new CardData(CardData.CARD_SEQ_MARBELLA);
        CardData ramona = new CardData(CardData.CARD_SEQ_RAMONA);
        CardData ray = new CardData(CardData.CARD_SEQ_RAY);
        CardData sarah = new CardData(CardData.CARD_SEQ_SARAH);
        CardData tahsa = new CardData(CardData.CARD_SEQ_TASHA);
        CardData vanice = new CardData(CardData.CARD_SEQ_VANICE);
        CardData yuliya = new CardData(CardData.CARD_SEQ_YULIYA);
        CardData jose = new CardData(CardData.CARD_SEQ_JOSE);


        cardDataList.add(anna);
        cardDataList.add(anthonyf);
        cardDataList.add(charlyn);
        cardDataList.add(george);
        cardDataList.add(hans);
        cardDataList.add(hoshiko);
        cardDataList.add(janneisy);
        cardDataList.add(john);
        cardDataList.add(jorge);
        cardDataList.add(joshelyn);
        cardDataList.add(jose);
        cardDataList.add(kadeem);
        cardDataList.add(luke);
        cardDataList.add(madelyn);
        cardDataList.add(marbella);
        cardDataList.add(ramona);
        cardDataList.add(ray);
        cardDataList.add(sarah);
        cardDataList.add(tahsa);
        cardDataList.add(vanice);
        cardDataList.add(yuliya);


        return cardDataList;
    }
}
