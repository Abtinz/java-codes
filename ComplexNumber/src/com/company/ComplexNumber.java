package com.company;

public class ComplexNumber {

    private int realNumber ;
    private int intellectualNumber ;

    public ComplexNumber(int a,int b) {
        realNumber=a;
        intellectualNumber=b;
    }

    public ComplexNumber(int a) {
        realNumber=a;
        intellectualNumber=0;
    }

    public ComplexNumber() {
        realNumber=0;
        intellectualNumber=0;
    }

    public int getIntellectualNumber(){
        return intellectualNumber;
    }

    public int getRealNumber(){
        return realNumber;
    }

    public String sumNumbers(int a,int b,int c,int d){
        return  (a+c) +" "+(int)(b+d)+"i";
    }

    public String toprintsum(int a,int b,int c,int d) {
        return "the result of sum of two number : "
                + "\n" + sumNumbers(a,b,c,d);
    }

    public String minusNumbers(int a,int b,int c,int d){
        return  (a-c) +" "+(int)(b-d)+"i";
    }

    public String toprintminus(int a,int b,int c,int d) {
        return "the result of minus of two number : "
                + "\n" + minusNumbers(a,b,c,d);
    }

    public String MultipyNumbers(int a,int b,int c,int d){
        return  ((a*c) - (b*d)) +" "+(int)((a*d) + (b*c))+"i";
    }

    public String toprintMultipy(int a,int b,int c,int d) {
        return "the result of Multipy of two number : "
                + "\n" + MultipyNumbers(a,b,c,d);
    }

    public String DivisionNumbers(int a,int b,int c,int d){
        int head1=((a*(-1*c)) - (b*(-1*d)));
        int head2=((a*(-1*d)) + (b*(-1*c)));
        int down=(c*c)+(d*d);
        int realsec=head1/down;
        int unrealsec=head2/down;
        return  realsec +" "+(int)unrealsec+"i";
    }

    public String toprintDivision(int a,int b,int c,int d) {
        return "the result of Division of two number : "
                + "\n" + MultipyNumbers(a,b,c,d);
    }

}
