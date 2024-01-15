package Section6.FlorPacker;

public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigWeight = bigCount * 5;
        if(bigCount < 0 || smallCount < 0 || goal < 0 || (bigWeight + smallCount < goal)){
            return false;
        }

        if(bigWeight + smallCount == goal){
            return true;
        } else {
            
            int bigNumber = 0;
            if(bigCount > 0){
                if(bigWeight < goal){
                    bigNumber = bigCount;

                } else{
                    while(bigWeight > goal){
                        bigWeight -= 5;
                        bigNumber++;
                    
                    }
                }
                
            }
            
            int smallGoal = goal - bigNumber*5;
            if(smallGoal < 0 || smallCount < smallGoal){
                return false;
            } else{
                return true;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));//false
        System.out.println(canPack (1, 0, 5));//true
        System.out.println(canPack (0, 5, 4));//true
        System.out.println(canPack (2, 2, 11));//true
        System.out.println(canPack (-3, 2, 12));//false
        System.out.println(canPack (2, 1, 5));//true

    }
}
