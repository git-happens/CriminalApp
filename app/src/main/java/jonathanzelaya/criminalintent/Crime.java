package jonathanzelaya.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Jonathan on 9/26/16.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean getSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
