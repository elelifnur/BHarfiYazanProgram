package Diziler;

public class BHarfiYazanProgram {
    public static void main(String[] args){
        String[][] letter= new String[11][4];
        for (int i=0; i < letter.length;i++){
            for(int j =0; j < letter[i].length;j++){
                if(((i==0 && j == 0) || (i== 0 && j ==1))|| (i==1 && j==5) || ((i >= 2 && i<= 8) && j==3) || (i==5 && j==2)){
                    letter[i][j]= " * ";
                }else if(((j==0 && i <= letter.length) || (i == 5 && j==1)) ||( (i==10 && j==1)||(i==1 && j==2)) ||(i==9 && j == 2) ){
                    letter[i][j]=" * ";
                }else{
                    letter[i][j]="   ";
                }
            }
        }
        for(String[] row: letter){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
