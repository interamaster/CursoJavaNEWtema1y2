package com.materiales.jrdv.cursojavanewtema1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by invitado on 14/10/15.
 */
public class BeerExpert {

    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<>();

            if (color.equals("dark")){

                brands.add("Jack Dark");
                brands.add("jonnie Negro");
            }

        else {

                brands.add("no negro 1");
                brands.add("no  Negro 2 ");
            }

        return brands;

    }
}
