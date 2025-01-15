class Solution {
    public int minimizeXor(int num1, int num2) {
        int count1=countBits(num1);
        int count2=countBits(num2);
        int res=num1;

        if(count1 == count2)
        return res;

        else if(count1 < count2)     // add extra bits to num 1 to get answer
        {
             res=addBits(num1,(count2-count1));
        }
        else // remove some MSB bits from num1 to get answer
        {
       res=removeBits(num1,(count1-count2));
        }
    
        return res;
    }
    public int removeBits(int num1,int count)
    {
     int temp=num1;
     int index=0;
      while(count > 0)
        {
              if((temp & 1 )==1)
              {
              num1= num1 - (1<<index);
              count--;
              }
             temp=temp>>1;
             index++;
        }
        return num1;
    }

      public int addBits(int num1,int count)
    {
     int temp=num1;
     int index=0;
      while(count > 0)
        {
              if((temp & 1 )!=1)
              {
              num1= num1 + (1<<index);
              count--;
              }
             temp=temp>>1;
             index++;
        }
        return num1;
    }
    public int countBits(int num)
    {
        int temp=num;
        int count=0;
   while(temp!=0)
        {
             count+= temp & 1;
             temp=temp>>1;
        }
        return count;
    }
}