package com.example.twu;

public class DiamondExercises {
    public static void main(String[] args) {
        IsoscelesTriangle(3,"");
        Diamond(3,"");
        DiamondWithName(3,"huanglizhen");
    }

    private static void IsoscelesTriangle(int n,String name){
        for(int i = 1;i<=n;i++){
           common(i,n,name);
        }
    }

    private static void Diamond(int n,String name){
        IsoscelesTriangle(n,name);
        for(int i = n-1;i>0;i--){
            common(i,n,name);
        }
    }

    private static void DiamondWithName(int n,String name){
        IsoscelesTriangle(n,name);
        for(int i = n-1;i>0;i--){
            common(i,n,name);
        }
    }

    private static void common(int i,int n,String name){
        String str = "";
        for(int space = i;space<n;space++){
            str+=" ";
        }
        if(name.length()>0 && i==n){
            str+=name;
        }else {
            for(int star = 1;star<=2*i-1;star++){
                str+="*";
            }
        }
        System.out.println(str);
    }
}
