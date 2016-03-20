package com.szamani.beatbox;

import android.support.v4.app.Fragment;

/**
 * Created by Szamani on 3/20/2016.
 *
 *   **** I have deleted the assets folder files ****
 *   **** You may want to fill it with your own .wav files in the "sample_sounds" folder ****
 *
 * Key features of this app:
 * * Using of SoundPool class to play a sound in android
 *   which is the most efficient in the android sdk probably
 * * Using of setRetainInstance() method to show how to keep
 *   the fragment itself alive while the view is recreating because
 *   of rotation or something else
 * * Using of assets folder to store the files in a nice tidy way
 *   instead of copying everything in the raw folder and mess everything up
 * * Heavy use of styles and themes in android to make every piece
 *   look better in an efficient way
 * * Using of XML drawable and the combination of them to
 *   make the views look better
 *
 */

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
