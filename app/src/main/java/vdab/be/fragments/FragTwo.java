package vdab.be.fragments;

import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragTwo extends android.support.v4.app.Fragment {
    private String title;
    private int page;

    public int getPage() {
        return page;
    }

    public static FragTwo newInstance(int page, String title) {
        FragTwo fragTwo = new FragTwo();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragTwo.setArguments(args);
        return fragTwo;
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
        View view = inflater.inflate(R.layout.frag_two, container, false);
        TextView name = (TextView) view.findViewById(R.id.textView2);
        name.setText(page + " -- " + title);
        return view;
    }

}
