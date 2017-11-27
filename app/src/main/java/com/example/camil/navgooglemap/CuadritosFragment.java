package com.example.camil.navgooglemap;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class CuadritosFragment extends Fragment {

    private FragmentActivity myContext;
    View view;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
    ImageButton bmap1,bmap2,bmap3,bmap4,bmap5,bmap6,bmap7,bmap8,bmap9,bmap10,bmap11;


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    public CuadritosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view= inflater.inflate(R.layout.fragment_cuadritos, container, false);


        btn2 = (Button) view.findViewById(R.id.bvm2);
        bmap2 = (ImageButton) view.findViewById(R.id.bmap2);
        btn3 = (Button) view.findViewById(R.id.bvm3);
        bmap3 = (ImageButton) view.findViewById(R.id.bmap3);
        btn4 = (Button) view.findViewById(R.id.bvm4);
        bmap4 = (ImageButton) view.findViewById(R.id.bmap4);
        btn5 = (Button) view.findViewById(R.id.bvm5);
        bmap5 = (ImageButton) view.findViewById(R.id.bmap5);
        btn6 = (Button) view.findViewById(R.id.bvm6);
        bmap6 = (ImageButton) view.findViewById(R.id.bmap6);
        btn7 = (Button) view.findViewById(R.id.bvm7);
        bmap7 = (ImageButton) view.findViewById(R.id.bmap7);
        btn8 = (Button) view.findViewById(R.id.bvm8);
        bmap8 = (ImageButton) view.findViewById(R.id.bmap8);
        btn9 = (Button) view.findViewById(R.id.bvm9);
        bmap9 = (ImageButton) view.findViewById(R.id.bmap9);
        btn10 = (Button) view.findViewById(R.id.bvm10);
        bmap10 = (ImageButton) view.findViewById(R.id.bmap10);
        btn11 = (Button) view.findViewById(R.id.bvm11);
        bmap11 = (ImageButton) view.findViewById(R.id.bmap11);





        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contraloria-pasto-narino.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://contraloriatunja.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://contraloriadearauca.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.contraloriabga.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contralorianeiva.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contraloriamanizales.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://contraloria-cucuta-nortedesantander.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contraloriabogota.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contraloriacali.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("http://www.contraloriavillavicencio.gov.co/");
                //Especificamos la accion a realizar con el ACTION_VIEW
                //para que elija lo mas razonable
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
        ///para el mapa

        bmap2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",1);
                miIntent.putExtra("titulo_l",R.string.cp);

                startActivity(miIntent);
            }
        });
        bmap3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",2);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",3);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",3);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",3);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",4);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",5);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",6);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",6);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });

        bmap11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapsCuadritos.class);
                miIntent.putExtra("lugar",6);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");

                startActivity(miIntent);
            }
        });
        return view;


    }

}

// Inflate the layout for this fragment








