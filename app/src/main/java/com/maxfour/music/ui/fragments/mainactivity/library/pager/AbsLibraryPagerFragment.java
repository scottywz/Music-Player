package com.maxfour.music.ui.fragments.mainactivity.library.pager;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;

import com.maxfour.music.ui.fragments.AbsMusicServiceFragment;
import com.maxfour.music.ui.fragments.mainactivity.library.LibraryFragment;

public class AbsLibraryPagerFragment extends AbsMusicServiceFragment {

    /* http://stackoverflow.com/a/2888433 */
    @Override
    public LoaderManager getLoaderManager() {
        return getParentFragment().getLoaderManager();
    }

    public LibraryFragment getLibraryFragment() {
        return (LibraryFragment) getParentFragment();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }
}
