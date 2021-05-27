package avaliativa3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaForteRegex {

    private static final String PASSWORD_PATTERN =
    "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua senha: "); 
        String pass = in.next();
        while(!validaSenha(pass)){
            System.out.println("A senha não é forte o suficiente!"); 
            System.out.print("\nDigite sua senha: "); 
            pass = in.next();
        }
        System.out.println("Senha aceita!"); 
        in.close();
    }

    public static boolean validaSenha(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
