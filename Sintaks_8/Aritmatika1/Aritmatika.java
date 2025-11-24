public class Aritmatika {
    private float bilangan1;  // First number for arithmetic operations
    private float bilangan2;  // Second number for arithmetic operations
    private float hasil;      // Variable to store the result of operations

    // Method to set the values for bilangan1 and bilangan2
    public void setDataBilangan(int bilangan1, int bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    // Method to perform addition and return the result
    public float getHasilJumlah() {
        hasil = bilangan1 + bilangan2;
        return hasil;
    }

    // Method to perform subtraction and return the result
    public float getHasilKurang() {
        hasil = bilangan1 - bilangan2;
        return hasil;
    }

    // Method to perform multiplication and return the result
    public float getHasilKali() {
        hasil = bilangan1 * bilangan2;
        return hasil;
    }

    // Method to perform division and return the result
    public float getHasilBagi() {
        hasil = bilangan1 / bilangan2;
        return hasil;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Aritmatika arit1 = new Aritmatika();  // Create an object of Aritmatika class
        arit1.setDataBilangan(45, 6);         // Set values for bilangan1 and bilangan2
        System.out.println(arit1.getHasilJumlah()); // Print the sum
        System.out.println(arit1.getHasilKurang()); // Print the difference
        System.out.println(arit1.getHasilKali());   // Print the product
        System.out.println(arit1.getHasilBagi());   // Print the quotient
    }
}