public class Task11 {
    public static void main(String[] args) {
        String[][] greetings={{"Hello","hi","hi","bye","bye","yo","sup","sup"},
                {"greetings","salutations","hola","hola"}
        };
        String duplicate=greetings[0][0];
        String duplicate2;
        for(int i=0;i< greetings.length;i++){
            for (int j = 1; j < greetings[i].length; j++) {
                duplicate2=duplicate;
                duplicate=greetings[i][j];
                if(duplicate==duplicate2){
                    System.out.println(greetings[i][j]+" is a duplicate Element");
            }
            }
        }

    }
}
