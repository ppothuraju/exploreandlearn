package com.mudra.learn.module4;

class ExceptionTest{
@SuppressWarnings("finally")
public int printNumber()
{
int retVal = 0;
try{
//retVal = Integer.parseInt("hello");
retVal++;
return retVal;
}
catch(Exception ex){
return 10;
}
finally{
return 20;
}
}
public static void main(String[] args) {
int num = new ExceptionTest().printNumber();
System.out.println(num);
} }