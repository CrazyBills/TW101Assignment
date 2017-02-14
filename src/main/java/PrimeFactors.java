import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrimeFactors {

    public List<Integer> primeFactors(int num) {

        List<Integer> resultList = new ArrayList<>();

        int i = 2;
        while (i <= num) {

            if (num % i == 0) {

                resultList.add(i);

                num = num / i;

                i = 2;
            } else {

                // 若无法整除，则i 自增
                i++;
            }
        }

        resultList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        return resultList;
    }

    public static void main(String[] args){

        PrimeFactors primeFactors = new PrimeFactors();

        List<Integer> integers = primeFactors.primeFactors(30);
        for(Integer i: integers){
            System.out.print(i+" ");
        }

    }
}
