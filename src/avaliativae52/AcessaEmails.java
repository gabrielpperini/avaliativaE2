package avaliativae52;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Run Emails Program
 * 
 * @author Gabriel Perini and Camila Ilges
 */
public class AcessaEmails {

    public static final Scanner terminal = new Scanner(System.in);
    public static final CaixaDeEntrada mailBox = new CaixaDeEntrada();

    /**
     * Start the program
     * 
     * @param args
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        clearScreen();
        addDefaultsEmails();
        System.out.println("Bem vindo a sua Caixa de Emails!");
        int choice = mainMenu();
        selectOption(choice);
    }

    /**
     * Run a function based in a int choice
     * 
     * @param opt
     * @throws InterruptedException
     */
    public static void selectOption(int opt) throws InterruptedException {
        boolean finish = false;
        switch (opt) {
            case 1:
                fakeLoading(3);
                addEmail();
                break;
            case 2:
                fakeLoading(3);
                removeEmail();
                break;
            case 3:
                fakeLoading(3);
                readEmail();
                break;
            case 4:
                finish = true;
                break;

            default:
                clearScreen();
                System.out.println("Escolha Inválida!\n");
                break;
        }

        if (!finish) {
            int choice = mainMenu();
            selectOption(choice);
        }
    }

    /**
     * Add an email to the mailBox
     * 
     * @throws InterruptedException
     */
    public static void addEmail() throws InterruptedException {
        System.out.print("Qual é o Destinatário? ");
        terminal.nextLine();
        String dest = terminal.nextLine();
        System.out.print("Qual é o Remetente? ");
        String rem = terminal.nextLine();
        System.out.println("Escreva sua mensagem: (Para Finalizar escreva \"END\")");
        Mensagem newMessage = new Mensagem(dest, rem);
        String messageLine = terminal.nextLine();
        while (!messageLine.equals("END")) {
            newMessage.writeLine(messageLine);
            messageLine = terminal.nextLine();
        }
        clearScreen();
        System.out.println("Verifique sua mensagem:\n");
        System.out.println("//////////////////////////////////////////////////////\n");
        System.out.println(newMessage.toString());
        System.out.println("\n//////////////////////////////////////////////////////\n");
        System.out.print("Quer adicionar a sua lista? [yes] ");
        String res = terminal.next();
        if (res.equals("yes")) {
            mailBox.adicionaMensagem(newMessage);
            fakeLoading(6);
            System.out.println("Email adicionado com sucesso!\n");
        }
    }

    /**
     * Remove an email from mailBox
     * 
     * @throws InterruptedException
     */
    public static void removeEmail() throws InterruptedException {
        mailBox.mailList();
        System.out.print("Qual email deseja excluir? ");
        int emailToRemove = terminal.nextInt();
        fakeLoading(6);
        mailBox.removeMessage(emailToRemove);
    }

    /**
     * Read an Email from mailBox
     * 
     * @throws InterruptedException
     */
    public static void readEmail() throws InterruptedException {
        mailBox.mailList();
        System.out.print("Qual email deseja ler? ");
        int emailToRead = terminal.nextInt();
        fakeLoading(3);
        System.out.print(mailBox.acessaMensagem(emailToRead).toString());
        terminal.nextLine();
        System.out.println("\n\nClique em enter para sair!");
        terminal.nextLine();
        fakeLoading(6);
    }

    /**
     * Add Default Emails to the malBox from the file defaultEmails.txt
     * 
     * @throws FileNotFoundException
     */
    public static void addDefaultsEmails() throws FileNotFoundException {
        File file = new File("defaultEmails.txt");
        Scanner fileOut = new Scanner(file);
        String dest = fileOut.nextLine();
        String rem = fileOut.nextLine();
        while (!rem.equals("==END==")) {
            Mensagem newMessage = new Mensagem(dest, rem);
            String messageLine = fileOut.nextLine();
            while (!messageLine.equals("///END MESSAGE///")) {
                newMessage.writeLine(messageLine);
                messageLine = fileOut.nextLine();
            }
            fileOut.nextLine();
            dest = fileOut.nextLine();
            rem = fileOut.nextLine();
            mailBox.adicionaMensagem(newMessage);
        }

        fileOut.close();

    }

    /**
     * Do a fake loading
     * 
     * @param time
     * @throws InterruptedException
     */
    private static void fakeLoading(int time) throws InterruptedException {
        String dots = ".";
        for (int i = 0; i < time; i++) {
            clearScreen();
            System.out.println("Loading" + dots);
            if (dots.equals("...")) {
                dots = ".";
            } else {
                dots += ".";
            }
            Thread.sleep(500);
        }
        clearScreen();
    }

    /**
     * Print the menu and ask the choice
     * 
     * @return
     */
    private static int mainMenu() {
        System.out.println("Escolha alguma opção: ");
        System.out.println("1 - Adicionar Email");
        System.out.println("2 - Excluir Email");
        System.out.println("3 - Ler Email");
        System.out.println("4 - Finalizar Programa");
        System.out.print("Sua escolha: ");
        return terminal.nextInt();
    }

    /**
     * Clear Screen
     * 
     * @return
     */
    private static void clearScreen() {
        System.out.print('\u000C');
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
