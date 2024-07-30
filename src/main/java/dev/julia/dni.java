package dev.julia;

public class dni {
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int numero;

    public dni(int numero) {
        if (!esNumeroValido(numero)) {
            throw new IllegalArgumentException("El número de DNI es incorrecto.");
        }
        this.numero = numero;
    }

    private boolean esNumeroValido(int numero) {
        return numero >= 0 && numero <= 99999999;
    }

    public char calcularLetra() {
        return LETRAS.charAt(numero % 23);
    }

    @Override
    public String toString() {
        return String.format("%08d-%c", numero, calcularLetra());
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (!esNumeroValido(numero)) {
            throw new IllegalArgumentException("El número de DNI es incorrecto.");
        }
        this.numero = numero;
    }
}
