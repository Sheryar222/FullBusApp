package com.example.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Favourite extends Fragment {

    Button b1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.favouritelayout,container,false);

        b1=v.findViewById(R.id.button8);

          b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intent=new Intent(getActivity(),Booking.class);
                  startActivity(intent);
              }
          });
        return v;
    }
}
