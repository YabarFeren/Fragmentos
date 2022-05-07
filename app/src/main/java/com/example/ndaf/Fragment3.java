package com.example.ndaf;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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

    //declarando variables
    private Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero, btnBorrar, btnRaiz, btnPotencia, btnPorcentaje, btnDiv, btnMul, btnResta, btnSuma, btnMasmenos, btnPunto, btnIgual;
    private EditText txtnumero1;
    private double num1, num2, res;
    private String Operador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_3, container, false);
        View view = inflater.inflate(R.layout.fragment_3,container, false);
        txtnumero1 = view.findViewById(R.id.numero1);
        btnUno =  view.findViewById(R.id.btnuno);
        btnDos =  view.findViewById(R.id.btndos);
        btnTres =  view.findViewById(R.id.btntres);
        btnCuatro =  view.findViewById(R.id.btncuatro);
        btnCinco =  view.findViewById(R.id.btncinco);
        btnSeis =  view.findViewById(R.id.btnseis);
        btnSiete =  view.findViewById(R.id.btnsiete);
        btnOcho =  view.findViewById(R.id.btnocho);
        btnNueve =  view.findViewById(R.id.btnnueve);
        btnCero =  view.findViewById(R.id.btncero);
        btnBorrar =  view.findViewById(R.id.btnborrar);
        btnRaiz =  view.findViewById(R.id.btnraiz);
        btnPotencia =  view.findViewById(R.id.btnpotencia);
        btnPorcentaje =  view.findViewById(R.id.btnporcentaje);
        btnDiv =view.findViewById(R.id.btndiv);
        btnMul =  view.findViewById(R.id.btnmul);
        btnResta =  view.findViewById(R.id.btnresta);
        btnSuma =  view.findViewById(R.id.btnsuma);
        btnMasmenos =  view.findViewById(R.id.btnmasmenos);
        btnPunto =  view.findViewById(R.id.btnpunto);
        btnIgual =  view.findViewById(R.id.btnigual);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "1");
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + "9");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText(txtnumero1.getText() + ".");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "+";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "-";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "*";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "/";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnMasmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "+/-";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                num1 = num1 * (-1);
                txtnumero1.setText(" " + num1);
            }
        });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "%";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText("");
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "()";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador = "^";
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });


        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(txtnumero1.getText().toString());
                if (Operador.equals("+")) {
                    res = num1 + num2;
                } else if (Operador.equals("-")) {
                    res = num1 - num2;
                } else if (Operador.equals("*")) {
                    res = num1 * num2;
                } else if (Operador.equals("/")) {
                    res = num1 / num2;
                } else if (Operador.equals("%")) {
                    res = (num1 / 100) * num2;
                } else if (Operador.equals("()")) {
                    res = Math.pow(num1, 1 / num2);
                } else if (Operador.equals("^")) {
                    res = Math.pow(num1, num2);
                }
                txtnumero1.setText(" " + res);
            }
        });
        return view;

    }
}