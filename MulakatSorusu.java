public class MulakatSorusu {
    public static void main(String[] args) {
        //  İki boyutlu, her elemanında iki değer olan array'i birinci ikili eleman barındıran array ilk satır olmak üzere alt alta sıralayarak bir tablo
        // olsun. Bu tabloda komşu olanlar (yan yana ya da alt alta) için 1, olmayanlar için sıfır yazdırır.

        int[][] mainArray = {{9,4}, {6,3}, {5,8}};
        System.out.print("# ");

        for (int[] ints : mainArray) {            // Tablonun üst kısmını yazdırıyor

            for (int k = 0; (k < mainArray.length - 1); k++) {
                System.out.print(ints[k] + " ");
            }
        }
        System.out.println();

        for(int i = 0; i <mainArray.length; i++) { // Karşılaştırma için alınacak elemanın olduğu array'i seçiyor

            for(int k = 0; k <(mainArray.length-1); k++) { // Karşılaştırılacak elemanı seçiyor
                System.out.print(mainArray[i][k] + " ");
                for(int z = 0; z < mainArray.length; z++) { // Sırayla karşılaştırılacak elemanları seçmek için ilk boyut

                    for(int x = 0; x < (mainArray.length-1); x++) { // Sırayla karşılaştırılacak elemanları seçmek için ikinci boyut
                        if( ( ((i == z) && (k != x) ) || ((Math.abs(i - z) == 1) && (k == x)) ) )
                            System.out.print(1 + " ");
                        else
                            System.out.print(0 + " ");
                    }


                }
                System.out.println();
            }

        }

    }
}
