#include<stdio.h>
#include<stdbool.h>

bool CheckEven(int iNo)
{
    return ((iNo % 2) == 0);
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter number to check whether it is even or odd : \n");
    scanf("%d",&iValue);

    bRet = CheckEven(iValue);
    if (bRet == true)
    {
        printf("%d is even number\n",iValue);
    }
    else 
    {
        printf("%d is odd number\n",iValue);
    }

    return 0;
}