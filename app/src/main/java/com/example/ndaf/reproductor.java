package com.example.ndaf;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link reproductor#newInstance} factory method to
 * create an instance of this fragment.
 */
public class reproductor extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public reproductor() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment reproductor.
     */
    // TODO: Rename and change types and number of parameters
    public static reproductor newInstance(String param1, String param2) {
        reproductor fragment = new reproductor();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_reproductor, container, false);
        View view = inflater.inflate(R.layout.fragment_reproductor,container, false);

        Button btn1 = view.findViewById(R.id.btn1);
        Button btn2 = view.findViewById(R.id.btn2);
        Button btn3 = view.findViewById(R.id.btn3);
        Button btn4 = view.findViewById(R.id.btn4);
        Button btn5 = view.findViewById(R.id.btn5);
        Button parar1=view.findViewById(R.id.btn6);
        Button parar2=view.findViewById(R.id.btn7);
        Button parar3=view.findViewById(R.id.btn8);
        Button parar4=view.findViewById(R.id.btn9);
        Button parar5=view.findViewById(R.id.btn10);

        mp1=MediaPlayer.create(getContext(),R.raw.que_linda_flor);
        mp2=MediaPlayer.create(getContext(),R.raw.deja_vu);
        mp3=MediaPlayer.create(getContext(),R.raw.taboo);
        mp4=MediaPlayer.create(getContext(),R.raw.fireflies);
        mp5=MediaPlayer.create(getContext(),R.raw.mevasaextranar);

        parar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.stop();
            }
        });
        parar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.stop();
            }
        });

        parar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.stop();
            }
        });

        parar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.stop();
            }
        });

        parar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.stop();
            }
        });



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp1.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        return view;

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}