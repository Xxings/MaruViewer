package ind.simsim.maruViewer.Event;

/**
 * Created by jack on 2017. 1. 26..
 */

public class FavoriteEvent {
    private boolean succeed;

    public FavoriteEvent(boolean succeed) {
        this.succeed = succeed;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }
}