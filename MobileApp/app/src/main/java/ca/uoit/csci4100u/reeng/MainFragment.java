package ca.uoit.csci4100u.reeng;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

//import static ca.uoit.csci4100u.reeng.MainActivity.mNavigationView;

public class MainFragment extends Fragment {
    protected static final String TAG = MainFragment.class.getSimpleName();

    private OnFragmentInteractionListener mListener;
    private MenuItem selectedItem;
    protected Adapter mAdapter;

    public MainFragment(){

    }

    public interface OnFragmentInteractionListener{
        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
//        selectedItem = mNavigationView.getMenu().getItem(0);
//        selectedItem.setChecked(true);
        getActivity().setTitle(R.string.events);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mAdapter = new Adapter(getChildFragmentManager());
        mAdapter.addFragment(new EventFragment(), "Events");
        mAdapter.addFragment(new EventFragment(), "Goals");
        mAdapter.addFragment(new EventFragment(), "Sales");
        viewPager.setAdapter(mAdapter);        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    public void onButtonPressed(Uri uri){
        if (mListener != null){
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            mListener = (OnFragmentInteractionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
