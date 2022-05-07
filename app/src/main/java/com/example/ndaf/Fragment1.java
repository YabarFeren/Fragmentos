package com.example.ndaf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.gson.Gson;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton chichenitza=view.findViewById(R.id.btnChichenitza);
        ImageButton coliseo=view.findViewById(R.id.btnColiseo);
        ImageButton machupicchu=view.findViewById(R.id.btnMachupicchu);
        ImageButton cristoredento=view.findViewById(R.id.btnCristo);
        ImageButton muralla=view.findViewById(R.id.btnMuralla);
        ImageButton petra=view.findViewById(R.id.btnPetra);
        ImageButton tajmahal=view.findViewById(R.id.btnTajmahal);

        chichenitza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://www.viator.com/Cancun-tourism/d631-r21527463491-s190916291?mcid=28353&tsem=true&supci=1053694567&supag=21527463491&supsc=kwd-258733525&supai=275935107752&supap=&supdv=c&supnt=g&supti=kwd-258733525&suplp=9060927&supli=20725&m=28353&supag=21527463491&supsc=kwd-258733525&supai=275935107752&supap=&supdv=c&supnt=nt%3Ag&suplp=9060927&supli=20725&supti=kwd-258733525&tsem=true&supci=kwd-258733525&supap1=&supap2=&gclid=CjwKCAjw3cSSBhBGEiwAVII0Z26cPCXk8jNmCDoRdwkwIQfLqMnZ12_nf-jhQzHKmhb9eWmQrAHaNRoCmagQAvD_BwE";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        coliseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://romesite.com/colosseum.html?gclid=CjwKCAjw3cSSBhBGEiwAVII0Z9W3rzmu5c47ZTO-yvI5DFKRwsrNTwWIa2I8knJGIs2gcObs7uAGQhoC004QAvD_BwE";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        machupicchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://www.machupicchu.gob.pe/";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        cristoredento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://www.viator.com/Rio-de-Janeiro-attractions/Statue-of-Christ-the-Redeemer-Cristo-Redentor/d712-a1325?mcid=28353&tsem=true&supci=-1790753117&supag=17772320051&supsc=kwd-320409022754&supai=161707650617&supap=&supdv=c&supnt=g&supti=kwd-320409022754&suplp=9060927&supli=1001655&m=28353&supag=17772320051&supsc=kwd-320409022754&supai=161707650617&supap=&supdv=c&supnt=nt%3Ag&suplp=9060927&supli=1001655&supti=kwd-320409022754&tsem=true&supci=kwd-320409022754&supap1=&supap2=&gclid=CjwKCAjw3cSSBhBGEiwAVII0Z8vOf0WT87IxPbuPWqhR_YBl2LWIFigZy0kN-l0OgDWgeXnxY5AAJRoCljgQAvD_BwE";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        muralla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://historia.nationalgeographic.com.es/a/gran-muralla-china-mayor-obra-ingenieria-mundo_8272";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        petra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://universes.art/es/art-destinations/jordania/petra";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        tajmahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url="https://www.maravillas-del-mundo.com/Taj-Mahal/";
                Uri uri = Uri.parse(url);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}