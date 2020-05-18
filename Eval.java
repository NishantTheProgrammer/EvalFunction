import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Eval
{
    public static void main(String args[])
    {
        int low=-1,high=-1;
        Cal c=new Cal();
        System.out.print("Enter an Expression: ");
        String ex=new Scanner(System.in).nextLine();
        if(ex.charAt(0)=='/' || ex.charAt(0)=='*' ||ex.charAt(0)=='-' || ex.charAt(0)=='+')
            System.out.println("Invalid Expression");
        else if(ex.charAt(ex.length()-1)=='/' || ex.charAt(ex.length()-1)=='*' || ex.charAt(ex.length()-1)=='-' || ex.charAt(ex.length()-1)=='+')
            System.out.println("Invalid Expression");
        else
        {
            while(ex.indexOf('/')!=-1)  //this condition will true when we have / symbol in our ex
            {
                for(int i=ex.indexOf('/')-1;i>0;i--) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        low=i;
                        break; //here we'll end the loop;
                    }
                    else
                        low=-1;
                }
                low++; //because we need next possion from operator
                for(int i=ex.indexOf('/')+1;i<ex.length();i++) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        high=i;
                        break; //here we'll end the loop;
                    }
                    else
                        high=ex.length();
                }

                float a=Float.parseFloat(ex.substring(low, ex.indexOf('/')));
                float b=Float.parseFloat(ex.substring(ex.indexOf('/')+1, high));
                float res=c.div(a,b);
                ex=ex.substring(0,low)+Float.toString(res)+ex.substring(high,ex.length());
            }
            while(ex.indexOf('*')!=-1)  //this condition will true when we have / symbol in our ex
            {
                for(int i=ex.indexOf('*')-1;i>0;i--) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        low=i;
                        break; //here we'll end the loop;
                    }
                    else 
                        low=-1;
                }
                low++; //because we need next possion from operator
                for(int i=ex.indexOf('*')+1;i<ex.length();i++) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        high=i;
                        break; //here we'll end the loop;
                    }
                    else
                        high=ex.length();
                }

                float a=Float.parseFloat(ex.substring(low, ex.indexOf('*')));
                float b=Float.parseFloat(ex.substring(ex.indexOf('*')+1, high));
                float res=c.mul(a,b);
                ex=ex.substring(0,low)+Float.toString(res)+ex.substring(high,ex.length());
            }        
            while(ex.indexOf('-')!=-1)  //this condition will true when we have / symbol in our ex
            {
                for(int i=ex.indexOf('-')-1;i>0;i--) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        low=i;
                        break; //here we'll end the loop;
                    }
                    else
                        low=-1;
                }
                low++; //because we need next possion from operator
                for(int i=ex.indexOf('-')+1;i<ex.length();i++) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        high=i;
                        break; //here we'll end the loop;
                    }
                    else
                        high=ex.length();
                }

                float a=Float.parseFloat(ex.substring(low, ex.indexOf('-')));
                float b=Float.parseFloat(ex.substring(ex.indexOf('-')+1, high));
                float res=c.sub(a,b);
                ex=ex.substring(0,low)+Float.toString(res)+ex.substring(high,ex.length());
            }
            while(ex.indexOf('+')!=-1)  //this condition will true when we have / symbol in our ex
            {
                for(int i=ex.indexOf('+')-1;i>0;i--) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        low=i;
                        break; //here we'll end the loop;
                    }
                    else
                        low=-1;
                }
                low++; //because we need next possion from operator
                for(int i=ex.indexOf('+')+1;i<ex.length();i++) //this loop will run till i of ex to 0
                {
                    if(ex.charAt(i)=='/' ||ex.charAt(i)=='*' ||ex.charAt(i)=='-' ||ex.charAt(i)=='+') //if /*- or +
                    {
                        high=i;
                        break; //here we'll end the loop;
                    }
                    else
                        high=ex.length();
                }

                float a=Float.parseFloat(ex.substring(low, ex.indexOf('+')));
                float b=Float.parseFloat(ex.substring(ex.indexOf('+')+1, high));
                float res=c.add(a,b);
                ex=ex.substring(0,low)+Float.toString(res)+ex.substring(high,ex.length());       
            } 
            System.out.println("Result="+ex);       
        }
    }
}
class Cal
{
    float div(float a, float b)
    {return a/b;}
    float mul(float a, float b)
    {return a*b;}
    float sub(float a, float b)
    {return a-b;}
    float add(float a, float b)
    {return a+b;}
}