/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final String APTO = "SI es bisiesto";
        final String NO_APTO = "NO es bisiesto";

        int any;
        String mensajeAptitud;

        try {
            System.out.println("Alternativa Bisiesta");
            System.out.println("====================");

            System.out.print("Análisis año ...: ");
            any = SCN.nextInt();
            SCN.nextLine();

            System.out.println("---");

            if (any % 400 == 0) {
                mensajeAptitud = APTO;

            } else if (any % 100 == 0) {
                mensajeAptitud = NO_APTO;
            } else if (any % 4 == 0) {
                mensajeAptitud = APTO;
            } else {
                mensajeAptitud = NO_APTO;
            }

            System.out.printf("El año %d ....: %s%n", any, mensajeAptitud);

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
            SCN.nextLine();

        } finally {

        }

    }

}
