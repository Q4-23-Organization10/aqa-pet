public class HW7task5 {
    public static void main(String[] args) {
        int [][] matr = {{5,7,3,17,-98,77}, {-7,0,1,12,80,-11}, {8,11,2,3,680,-44},
                {88,34,-1,172,40,661}, {23,-35,-1,12,80,-11}, {-43,80,18,12,80,-11}};

        int count = 0;
        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < i; j++) {
                if (matr[i][j] < 0) {
                    count++;
                }

            }
        }
        System.out.println("Кількість відємних елементів нище головної діагоналі: " + count);

        int sum = 0;
        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < i; j++) {
                if (matr[i][j] % 2 != 0) {
                    sum += matr[i][j];
                }

            }
        }
        System.out.println("Сума не парних елементів вище головної діагоналі: " + sum);
    }
}
