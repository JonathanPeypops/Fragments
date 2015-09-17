package vdab.be.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragOne extends android.support.v4.app.Fragment {

    private String title;
    private int page;

    public static FragOne newInstance(int page, String title) {
        FragOne fragOne = new FragOne();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragOne.setArguments(args);
        return fragOne;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_one, container, false);
        TextView name = (TextView) view.findViewById(R.id.textView1);
        name.setText(page + " -- " + title);
        return view;
    }
}
