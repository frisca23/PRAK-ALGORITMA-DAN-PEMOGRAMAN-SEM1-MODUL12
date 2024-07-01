import java.util.Scanner;
public class GanjilGenap
{
    public static void main(String[] args) 
    {
        int n = 10; // Jumlah baris yang diinginkan

        for (int i = 1; i <= n; i++) 
        {
            if (i % 2 == 1) 
            {
                System.out.println(i + " adalah Bilangan Ganjil");
            } else {
                System.out.println(i + " adalah Bilangan Genap");
            }
        }
    }
}

