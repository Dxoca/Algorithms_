package Algorithms.LinearAlgebra;
public class N_ary_arrangement {
    /**
     * 第二章 n 阶行列式
     * S1：n元排列
     * 1.判断 是奇、偶排列
     * 2.求逆序数（逆序对 的数目 ）τ（拼音tao）
     * Such as: τ(2431)= 4 >(21 43 41 31)
     * if τ is odd number the det is - else + τ的奇偶决定行列式该项的正负
     * @param args
     */
    public static void main(String[] args) {
        int[] series= {2,4,3,1};//数列
        int o=0; //Initialize Order Number
        int t=0; //Initialize Reverse Order Number(τ)

        // Calculus the Order Number and the Reverse Order Number:
        // 计算顺序数个逆序数的个数
        for(int i=0; i<series.length-1;i++) {//共 n-1个数字比较
            for (int j = i; j < series.length - 1; j++) {//每个数字要比较的次数
                if (series[i] < series[j + 1]) //顺序
                    o++;
                else if (series[i] > series[j + 1])
                    t++;
            }
        }
        System.out.println("逆序数："+t);//τ
        System.out.println("顺序数："+o);
        if(t%2==0){
            System.out.println("是偶排列");
        }else
            System.out.println("是奇排列");

    }
}
