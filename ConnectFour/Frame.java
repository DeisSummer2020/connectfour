package ConnectFour;


public class Frame{
    //matrix is actual gameboard
    Piece[][] frame = new Piece[6][7];
    



    //constructor
    public Frame(){

    }

    
    /** 
     * @param column
     * @param insert
     */
    public void insert(int column, Piece insert){
        boolean placed = false; 
        int slot = 5;
        //while piece has not been placed & while there is room in column
        while(!placed&&slot>=0){
            //if slot is empty, place in given spot
            if(frame[column][slot]!=null){
                frame[column][slot] = insert; 
                placed = true;
            }
            //if slot !empty, we check the slot immedietly above
            else{
                slot--;
            }
        }
        if(slot<0){
            //error
        }
    }
    
}