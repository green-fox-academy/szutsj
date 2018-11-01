public class ToDoPrint {

    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        todoText = todoText.concat(" - Download games\n").concat("\t - Diablo\n");
        todoText = "My todo:\n" + todoText;
        System.out.println(todoText);
    }
}
