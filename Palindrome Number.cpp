class Solution {
public:
    bool isPalindrome(int x) {
        bool condition = false;
        if(x > -1){
            if(x < 10){
                condition = true;
            }
            else{
                long temp = 0;
                int tempX = x;
                while(tempX > 0){
                    int current = tempX % 10;
                    temp = temp * 10 + current;
                    tempX = tempX / 10;
                    
                }
                if(x == temp){
                    condition = true;
                } 
            }
            
        }
        return condition;
    }
};
