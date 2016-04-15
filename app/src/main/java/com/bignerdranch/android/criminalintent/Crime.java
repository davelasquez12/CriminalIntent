package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by David on 12/24/2015.
 */
public class Crime
{
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
	private String mSuspect;

    public Crime()
    {
        //generates unique identifier
		this(UUID.randomUUID());
    }

    public Crime(UUID id)
	{
		mId = id;
		mDate = new Date();
	}

    public boolean isSolved()
    {
        return mSolved;
    }

    public void setSolved(boolean solved)
    {
        mSolved = solved;
    }

    public Date getDate()
    {
        return mDate;
    }

    public void setDate(Date date)
    {
        mDate = date;
    }

    public UUID getId() { return mId; }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

	public String getSuspect()
	{
		return mSuspect;
	}

	public void setSuspect(String suspect)
	{
		mSuspect = suspect;
	}

	public String getPhotoFilename()
	{
		return "IMG_" + getId().toString() + ".jpg";
	}
}
