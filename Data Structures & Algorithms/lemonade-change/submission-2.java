class Solution {
    public boolean lemonadeChange(int[] bills) {
        Boolean b=true;
        int fi=0;
        int te=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fi+=1;
            }else if(bills[i]==10){
                if(fi==0){
                    b=false;
                }
                te+=1;
                fi-=1;
            }else if(bills[i]==20){
                if(fi>0&&te>0){
                te-=1;
                fi-=1;
                }
                else if(fi>=3){
                    fi-=3;
                }
                else{
                    b=false;
                }
            }
        }
        return b;
    }
}