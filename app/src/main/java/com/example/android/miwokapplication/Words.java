package com.example.android.miwokapplication;

import java.security.PublicKey;

public class Words {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourseId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId ;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Words (String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Words (String defaultTranslation, String miwokTranslation, int imageResourseId,int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourseId = imageResourseId;
        mAudioResourceId = audioResourceId;
    }
    public String getDegaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourseId(){
        return mImageResourseId;
    }
    public boolean hasImage(){
        return mImageResourseId != NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
