package com.materiales.jrdv.cursojavanewtema1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    //creamos un objeto de l aclass BeerExpert

    private  BeerExpert expertoQueElige=new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //vamos a detcetar el click


    public void onClickFindBeer (View viewpulsada){

        //refereccia al Texto
        TextView brands=(TextView)findViewById(R.id.brands);

        //referencia al spinner
        Spinner color =(Spinner)findViewById(R.id.color);


        //tomamos el texto del espiner

        String beerType=String.valueOf(color.getSelectedItem());

        //ponemos en el texto el item selecionado del spinner

        //brands.setText(beerType);

        //ahora le decimos a la clkase BeerExpert que nos de la respuesta

        List<String> BrandList=expertoQueElige.getBrands(beerType);

        //esto nos devolvera una List!!! y no pdriamos usar lo de brands.setText(BrandList);!!!

        //por lo que tenmos que hacer u String aprtir de una List:

        StringBuilder brandEnString = new StringBuilder();

            for (String brand : BrandList){

                brandEnString.append(brand).append('\n');//con el append \n los separa en lineas

            }


        //una vez el List lo tenemos en un String:

        brands.setText(brandEnString);
    }
}
