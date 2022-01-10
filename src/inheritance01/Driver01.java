package inheritance01;

public class Driver01 {
    public static void main(String[] args) {
        //1번 예시

//        동물 animal = new 동물();
//        포유류 mamalia = new 포유류();
//        조류 bird = new 조류();
//        고래 whale = new 고래();
//        박쥐 bat = new 박쥐();
//        참새 sparrow = new 참새();
//        펭귄 penguin = new 펭귄();
//
//        animal.showMe();
//        mamalia.showMe();
//        bird.showMe();
//        whale.showMe();
//        bat.showMe();
//        sparrow.showMe();
//        penguin.showMe();

        //2번 예시
//        동물 animal = new 동물();
//        동물 mamalia = new 포유류();
//        동물 bird = new 조류();
//        동물 whale = new 고래();
//        동물 bat = new 박쥐();
//        동물 sparrow = new 참새();
//        동물 penguin = new 펭귄();
//
//        animal.showMe();
//        mamalia.showMe();
//        bird.showMe();
//        whale.showMe();
//        bat.showMe();
//        sparrow.showMe();
//        penguin.showMe();

        //3번 예시
        동물[] animals = new 동물[7];
        animals[0] = new 동물();
        animals[1] = new 포유류();
        animals[2] = new 조류();
        animals[3] = new 고래();
        animals[4] = new 박쥐();
        animals[5] = new 참새();
        animals[6] = new 펭귄();

        for(int i=0; i<7; i++) {
            animals[i].showMe();
        }
    }
}
