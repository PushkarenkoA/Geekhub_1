package com.pushkarenko.geekhub.screentab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pushkarenko.geekhub.R;

public class DetailsFragment extends Fragment {



    public static DetailsFragment newInstance(int pos) {
        DetailsFragment details = new DetailsFragment();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        details.setArguments(args);
        return details;
    }

    int getPosition() {
        return getArguments().getInt("position", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.detals, container, false);
        TextView tv = (TextView) v.findViewById(R.id.tvText);
        tv.setText(getResources().getStringArray(R.array.group)[getPosition()]);




        return v;
    }
}
