
public class DowhileSample {

    public static void main(String[] args) {
        int num = 1; //初期設定
        
        do {
            //2の倍数を計算
            num = num*2;
            //結果を出力
            System.out.println(num);
        }while(num<1024);//繰り返しの条件(numが１０２４より小さい間）
    }

}
