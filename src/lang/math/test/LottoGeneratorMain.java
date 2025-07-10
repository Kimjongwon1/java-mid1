package lang.math.test;

public class LottoGeneratorMain
{
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumebers = generator.generate();


            //생성된 로또 번호 출력
        System.out.print("로또번호 : ");
        for (int lottoNumber: lottoNumebers) {
            System.out.print(lottoNumber + " ");
            }
        }

}
