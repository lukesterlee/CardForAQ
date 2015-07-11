package alexqin.awesome.c4q.nyc.cardforaq;

/**
 + * Created by Hoshiko on 7/6/15.
 + */
public class CardData {
    public static final int CARD_SEQ_ANNA = 2 ;
    public static final int CARD_SEQ_ANTHONYF = 3 ;
    public static final int CARD_SEQ_CHARLYN = 1;
    public static final int CARD_SEQ_GEORGE = 6;
    public static final int CARD_SEQ_HANS = 7;
    public static final int CARD_SEQ_HOSHIKO = 8;
    public static final int CARD_SEQ_JANNEISY = 10;
    public static final int CARD_SEQ_JOHN = 11;
    public static final int CARD_SEQ_JORGE = 12;
    public static final int CARD_SEQ_JOSHELYN = 13;
    public static final int CARD_SEQ_KADEEM = 14;
    public static final int CARD_SEQ_LUKE = 15;
    public static final int CARD_SEQ_MADELYN = 16;
    public static final int CARD_SEQ_MARBELLA = 17;
    public static final int CARD_SEQ_RAMONA = 19;
    public static final int CARD_SEQ_RAY = 20;
    public static final int CARD_SEQ_SARAH = 21;
    public static final int CARD_SEQ_TASHA = 23;
    public static final int CARD_SEQ_VANICE = 24;
    public static final int CARD_SEQ_YULIYA = 25;
    public static final int CARD_SEQ_JOSE = 26;

    int studentId;
    public CardData() {
    }
    public CardData(int studentId) {
        this.studentId = studentId;
        }

    public int getStudentId() {
        return studentId;
        }
}
