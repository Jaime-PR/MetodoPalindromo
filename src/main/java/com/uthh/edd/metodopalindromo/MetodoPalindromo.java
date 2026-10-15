/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.edd.metodopalindromo;

/**
 * Jaime Alfredo Perez Rivera
 * -Metodo recursivo de un palindromo-
 */
public class MetodoPalindromo {

    // Método Wrapper (Público)
    public static boolean esPalindromo(String palabra) {
        // Inicializa el índice 'fin' en la última posición válida
        return esPalindromoAuxiliar(palabra, 0, palabra.length() - 1); 
    }

    // Método Recursivo (Privado)
    private static boolean esPalindromoAuxiliar(String palabra, int inicio, int fin) {
        // Caso Base 1: Los índices se cruzaron o están en la misma letra
        if (inicio >= fin) {
            return true;
        }

        // Caso Base 2: Los caracteres no coinciden
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // Paso Recursivo: Acercar los índices hacia el centro
        return esPalindromoAuxiliar(palabra, inicio + 1, fin - 1);
    }
}
