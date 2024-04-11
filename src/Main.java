import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //int[] a = {1, 2, 10, 3, 5, 6, 2, 7, 1, 9, 10};
        // System.out.println(Arrays.toString(a));
        //  removeDuplicateElement(a);
        //  int[] b = {3, 5, 10, 2, 4, 20, 9};
        //   secondSmallest(b);
        // int[][] m1 = {{4, 2, 3, 3}, {2, 1, 3, 3}, {0, 1, 2, 3}};
        //int[][] m2 = {{5, 1, 2, 3}, {3, 1, 2, 4}, {1, 2, 3, 5}};
        // sumTwoMatricesOfTheSameSize(m1, m2);
        //  convertArrayToArrayList(a);
        //Scanner s = new Scanner(System.in);
        //System.out.println("Enter a spec number to check if sum exist for that number");
        //  int b = s.nextInt();
        //checkIfSumExist(a, b);
//        int[] array1 = {2, 0, 11, 0, 25, 0, 26};
//        int[] array2 = {3, 5, 7, 8, 25};
//        int[] array3 = {2, 5, 7, 9, 11, 12, 18, 25};
        //  areArraysEqual(array2,array3);
        //commonElementsOf3Arrays(array1, array2, array3);
        //allZeroToEnd(array1);
        // sumTwoMatricesOfTheSameSize(m1,m2);
        //commonElementsOf3Arrays(array1,array2,array3);
//        int[] numbers = {5, 7, 2, 4, 9};
//        //numberOfEvenAndOddInteger(numbers);
//        // differenceBetweenMaxAndMin(numbers);
//        // summOfAverageBetweenMaxAndMin(numbers);
//        //  int[] nums = {20, 30, 30, 40, 50, 50, 40, 50};
//        // removeDuplicatesAndRetNewLengt(nums);
//        int[] array_nums = {50, 77, 12, 54, -11};
//        //System.out.println(checkIfContainsZeroAndMinusOne(array_nums));
//        int[] array_10 = {10, 77, 67, 10, 10, 54, -11, 10};
//        //System.out.println(checkIsAll10Equal30(array_10));
//        // System.out.println(checkContains65and67(array_10));
//        Scanner s = new Scanner(System.in);
//        //  System.out.println("Enter target value to find sum of pairs");
//        //  int b = s.nextInt();
//        //  findSumForTarget(array_10, b);
//
//        // int[] res = optimalFindSumForTarget(array, target);
//    /*    if (res != null) {
//            System.out.println("Elements with sum " + target + " found: " + res[0] + " and " + res[1]);
//        }*/
//        // myoptimalFindSumForTarget(array, target);
//
//        //   optimalFindSumForTargetTT(array, target);
//
//
////         int nums[] = {2, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
////         findMajorityDuplicate(nums);
////        int[] array = {28, 22, 24, 10, 15, 26, 20};
////        int target = 46;
//        //  optimalFindSumForTargetTT(array, target);
//        // int[] a = {15, 2, 1, 3, 17, 6, 5, 4, 12};
//        // findAllLeaders(a);
//        int[] zeroOne = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0};
//        // sort0And1(zeroOne);
//        //sumCloseToZero(a);
//        //findAllLeaders(a);
//        int[] arr = {5, 7, -8, 5, 14, 2, 3};
//        //  System.out.println(Arrays.toString(findFirstAndSecondSmallest(arr)));
//        // int[] cyc = {10, 20, 30, 40, 50, 60};
//        // cyclicallyRotate(cyc);
//        int arr_int[] = {22, 25, 17, 18, 19, 20};
//        // specifiedSortedRotated(arr_int, 42);
//
//        // int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
//        // positiveBeforeNegative(nums);
//
//        // int[] bigs = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        //System.out.println(bigAndSmall(bigs));
//
//        //int nums[] = {45, 20, 100, 23, -5, 2, -6};
//        //replaceElementWithNextBiggestRight(nums);
//        // int[] nums1 = {2, 2, -3, 3, 4, 6};
//        // checkArrayContainsSub0(nums1);
//
//        //  int b_nums[] = {1, 1, 0, 1, 0, 1, 1, 0, 1, 1};
//        //sortBinaryArrayLinearTime(b_nums);
//        //System.out.println(Arrays.toString(b_nums));
//        //int[] a = {1, 5, 6, 7, 8, 10};
//        // int[] b = {2, 4, 9};
//        //  aAndbSwap(a,b);
//        // int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
//        //maxProduct(nums);
//        //  int[] array = {1, 2, 3, 4, 5};
//        // shuffle(array);
//
//
//        //int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
//        //evenThenOdd(nums);
//        //int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
//        // subArrayWithSum0(nums1);
//       /* Student student = new Student("Milan", 24);
//        Student student1 = new Student("Jovannnnnnnnnnnnnnnnn", 20);
//        Student student2 = new Student("Zikasssssss", 22);
//        String fileName = "studenti.ser";
//
//        ArrayList<Student> studenti = new ArrayList<Student>();
//        studenti.add(student);
//        studenti.add(student1);
//        studenti.add(student2);
//        try (FileOutputStream fileOut = new FileOutputStream(fileName);
//             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
//
//
//            File file = new File(fileName);
//            if (file.exists()) {
//                System.out.println("Datoteka " + fileName + " ves postoji. Azuriranje sadrzaja...");
//
//
//                objectOut.writeObject(studenti);
//                System.out.println("Objekat je uspesno azuriran.");
//
//            } else {
//
//                objectOut.writeObject(student);
//                System.out.println("Objekat je uspesno serijaliziran.");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//*/
//
//
//        // int[] nule = {0, 0, 1, 1, 1, 0, 1, 0, 1};
//        // separateZerosAndOnes(nule);
//
//
//        // System.out.println("aaaa" + 100 + 100);
//        // int[] z = {7, 15, 4, 26, 37, 96};
//        // evenThenOdd(z);
//
//     /*  int number = 4;
//        if (isPrime(number)) {
//            System.out.println(number + " je prost broj.");
//        } else {
//            System.out.println(number + " nije prost broj.");
//        }
//
//       */
//
//      /* int[] a = {1,1,2,3,1,4,2,1,1};
//       findMajorityDuplicate(a);*/


        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj ljudi koji kupuje");

        int brojLjudi=50;
        brojLjudi = ulaz.nextInt();
        if(brojLjudi<=0) {
            throw new ArithmeticException("Broj ljudi mora biti veci od 0");
        }
        int[] a = new int[brojLjudi];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Unesite vreme za kupca br " + (i + 1));
            //niz sa vremenima

                a[i] = ulaz.nextInt();
               if(a[i]<=0){
                   throw new ArithmeticException("Vremena moraju biti veca od 0");
               }


        }

        System.out.println(Arrays.toString(a));
        int brojKasa = 0;
        System.out.println("Unesite broj kasa koji trenutno radi");

            brojKasa = ulaz.nextInt();
            if (brojKasa <= 0) {
                throw new ArithmeticException("Broj kasa mora biti veci od 0");
            }


        //ovo dovrsiti da vrati samo najveci broj iz niz kasa
        //broj kasa tj zbirova na koje ce da dodajemo
        int[] kase = new int[brojKasa];
        if (brojKasa > brojLjudi) {
            Integer[] pomocniNiz = new Integer[brojLjudi];
            for (int i = 0; i < a.length; i++) {
                pomocniNiz[i] = a[i];
            }
            System.out.println(nadjiMax(pomocniNiz));
            //  System.out.println(Arrays.toString(pomocniNiz));
        } else if (brojKasa <= brojLjudi) {
            int min = Integer.MAX_VALUE;
            int counter = 0;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            //popunjavanje pocetno
            for (int i = 0; i < kase.length; i++) {
                if (kase[i] == 0) {
                    kase[i] = a[i];
                    counter++;
                }
            }
            for (int i = 0; i < kase.length; i++) {
                priorityQueue.add(kase[i]);
            }
            System.out.println("priority que");
            System.out.println(priorityQueue);

            for (int i = counter; i < a.length; i++) {
                int smallest = priorityQueue.poll();
                int sum = smallest + a[i];

                priorityQueue.add(sum);
            }

            System.out.println("Prioriet kase " + priorityQueue);


            Integer[] potrebnoVreme = priorityQueue.toArray(new Integer[priorityQueue.size()]);

            System.out.println(Arrays.toString(potrebnoVreme));
            Integer minimum = nadjiMax(potrebnoVreme);
            System.out.println(minimum);
        }
       /* int x = 5;

         x = uvecajZaJedan(x);
        int b;
        System.out.println(x);

*/

    }

   /* public static int uvecajZaJedan(int broj) {
        // Vraćamo novu vrednost
        return broj + 1;
    }*/

    public static int nadjiMax(Integer[] a) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > min) {
                min = a[i];
            }
        }
        //System.out.println(min);
        return min;
    }


    public static void findMajorityDuplicate(int[] a) {
        boolean foundMajor = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else
                map.put(a[i], 1);
        }

        // Creating entrySet to store keys and values as pairs.
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        // creating iterator, iterating through the set using for-each loop.
        Iterator<Map.Entry<Integer, Integer>> iterr = entrySet.iterator();

        while (iterr.hasNext()) {
            //Map.Entry is interface to get keys and values from the map
            Map.Entry<Integer, Integer> entry = iterr.next();

            int key = entry.getKey();
            int value = entry.getValue();
            if (value > a.length / 2) {
                foundMajor = true;
                System.out.println("The key with the highest frequency is: " + "Key: " + key + ", " + value + " * times");
            }

        }

        if (!foundMajor) {
            System.out.println("There is no key with the highest frequency");
        }        /*for (Map.Entry<Integer, Integer> entry : entrySet){
    int key = entry.getKey();
    int value = entry.getValue();

    // Check if the value is greater than half the length of the array.
    if (value > a.length / 2) {
        foundMajor = true;
        System.out.println("The key with the highest frequency is: " + "Key: " + key + ", " + value + " times");
    }
}}*/
    }

    //ako broj nije deljiv ni sa jednim brojem od BROJA 2 do granice gde je on tj do svoje vrednosti je prost broj
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Brojevi manji od 2 nisu prosti
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // Ako je broj deljiv s nekim brojem, nije prost
            }
        }
        return true; // Ako broj nije bio deljiv s nijednim brojem, onda je prost
    }


    private static void separateZerosAndOnes(int[] a) {
        int left = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                int temp = a[i];
                a[i] = a[left];
                a[left] = temp;
                left++;
            }

        }
        System.out.println(Arrays.toString(a));
    }


    public static void zeroThenOne(int[] a) {

        List<Integer> list = new LinkedList<Integer>();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                list.addFirst(a[i]);
//            } else list.addLast(a[i]);
//        }
        int i = 0;
        while (i < a.length) {
            if (a[i] == 0) {
                list.addFirst(a[i]);
            } else {
                list.addLast(a[i]);
            }
            i++;
        }

        System.out.println(list);
    }


    public static ArrayList<ArrayList<Integer>> subArrayWithSum0(int[] a) {
        var toReturn = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a.length - 1; i++) {
            var sum = a[i];
            var currentSubArray = new ArrayList<Integer>();
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                currentSubArray.add(a[j]);
                if (sum == 0)
                    toReturn.add(new ArrayList<Integer>(currentSubArray));
            }
        }
        System.out.println(toReturn);
        return toReturn;
    }


    public static void evenThenOdd(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 != 0 && a[j] % 2 == 0) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    /*public static void evenThenOdd(int[] a) {
        int counter = 0;
        int end = a.length - 1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){

            }
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                a[counter++] = a[i];
            } else {
                a[end] = a[i];
                end--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
*/

    public static void shuffle(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i); //


            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));

    }


    public static void maxProduct(int[] a) {
        int max = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] * a[j] > max && a[i] != a[j]) {
                    max = a[i] * a[j];
                    num1 = a[i];
                    num2 = a[j];
                }
            }
        }

        System.out.println(num1 + " * " + num2 + " = " + max);
    }




   /* public static void aAndbSwap(int[] a, int[] b) {
        int[] save = new int[a.length+b.length];

        for (int i = 0; i < save.length; i++) {
            save[i] = a[i];

        }
        for(int i=0;i<a.length;i++){

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }*/


    public static void sortBinaryArrayLinearTime(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                counter++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i < counter) {
                a[i] = 0;
            } else a[i] = 1;
        }
    }


    public static void checkArrayContainsSub0(int[] a) {

    }
  /*  public static void replaceElementWithNextBiggestRight(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int temp=a[i];
            if (a[i] > temp && a[i] !=temp) {
                a[i - 1] = a[i];
            }
        }
        a[a.length - 1] = -1;
        System.out.println(Arrays.toString(a));

    }*/


    //zadatak samo za prikaz nikakvo znanje jer je sve po redosledu i nema smisla raditi ovo (prelako)
    public static List<Integer> bigAndSmall(int[] a) {
        int min = a[0];
        int max = a[a.length - 1];
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            list.add(a[a.length - 1 - i]);
            list.add(a[i]);
        }
        return list;
    }


    public static void negativeBeforePositive(int[] a) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                list.add(a[i]);

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }

    public static void positiveBeforeNegative(int[] a) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                list.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }


    public static void specifiedSortedRotated(int[] a, int target) {
        boolean found = false;
        for (int i = 0; i < a.length + 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target && a[i] != a[j]) {
                    found = true;
                    System.out.println(a[i] + " + " + a[j]);
                }
            }
        }
        if (!found) {
            System.out.println("No pairs");
        }

    }


    public static void cyclicallyRotate(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        System.out.println(Arrays.toString(a));
    }

    public static int[] findFirstAndSecondSmallest(int[] a) {
        int min = a[0];
        int sec = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                for (int j = 0; j < a.length; j++) {
                    if (a[j] < sec && a[j] != min) {
                        sec = a[j];
                    }
                }
            }
        }

        return new int[]{min, sec};
    }


    public static void findAllLeaders(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                System.out.println(max);
            }
        }
    }

    public static void sumCloseToZero(int[] a) {
        int min = a[0] + a[1];
        int ai = 0;
        int aj = 0;
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] < min) {
                    min = a[i] + a[j];
                    ai = a[i];
                    aj = a[j];
                }
            }
        }
        System.out.println("Closest sum to zero" + ai + " + " + aj);

    }


    public static void sort0And1(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            a[i] = 0;
        }
        for (int i = index; i < a.length; i++) {
            a[i] = 1;
        }
        System.out.println(Arrays.toString(a));
    }


    public static void optimalFindSumForTargetTT(int[] a, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //{1,2,3} target= 5
        for (int i = 0; i < a.length; i++) {
            int neededNumber = target - a[i];

            if (!map.containsKey(neededNumber)) {
                map.put(a[i], i);
            } else {
                System.out.println("Elements with sum " + target + " found: " + neededNumber + " and " + a[i]);
            }
        }
        if (map.isEmpty()) {
            System.out.println("There is no sum of pairs for that target " + target);
        }

    }




 /*   public static void optimalFindSumForTarget(int[] a, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] + a[j] == target && a[i] != a[j]) {
                    map.put(a[i], a[j]);
                    System.out.println("Target = " + a[i] + " + " + a[j]);
                }
            }
        }

        if (map.isEmpty()) {
            System.out.println("No pairs found for that sum");
        } else {
            System.out.println("All values in the map:");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        }
    }*/

    public static void optimalFindSumForTarget(int[] a, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            int neededNumber = target - a[i];
            if (!set.contains(neededNumber)) {
                set.add(a[i]);

            } else {
                System.out.println("Sum target  " + target + " = " + a[i] + " + " + neededNumber);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No pairs found for that sum");
        } /*else {
            // Ispisivanje svih vrijednosti u setu
            System.out.println("Values in the set:");
            for (int value : set) {
                System.out.println(value);
            }

        }
    }




   /* public static void myoptimalFindSumForTarget(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(i, a[i]);
        }
        for (int i = 0; i < map.size(); i++) {
            for(int j=i+1;j<map.size();j++){
                if(map.get(i)+ map.get(j)==target){
                    System.out.println("Elements with sum " + target + " found: " + map.get(i) + " and " + map.get(j));
                }
            }

        }
    }
*/

    }

    public static int[] findSumForTarget(int[] a, int b) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {

                    System.out.println(a[i] + " + " + a[j] + " Target: " + (a[i] + a[j]));

                    return new int[]{a[i], a[j]};
                }
            }
        }


        System.out.println("There is no sum of pairs for that target " + b);
        return null;
    }


    public static void longestConsecutiveElementsSequenceFromAnUnSortedArrayofIntegers(int[] a) {


    }


    public static boolean checkContains65and67(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 65) {
                    return false;
                } else if (a[j] == 67) {
                    return false;
                }
            }

        }

        return true;
    }

    public static boolean checkIsAll10Equal30(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                sum += a[i];
            }
        }
        if (sum > 30) {
            System.out.println("Sum is more then 30 " + "Sum = " + sum);
            return false;
        } else {

            System.out.println("Sum is exactly " + sum);
            return true;
        }
    }

    public static boolean checkIfContainsZeroAndMinusOne(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 || a[i] == -1) {
                return false;
            }
        }
        return true;
    }


    public static void removeDuplicatesAndRetNewLength(int[] a) {
        Set<Integer> numbers = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            numbers.add(a[i]);
        }

        System.out.println(numbers);
    }

    public static void summOfAverageBetweenMaxAndMin(int[] a) {

        int min = a[0];
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max && a[i] != min) {
                sum += a[i];
            }
        }
        System.out.println("SummBetweenMaxAndMin " + sum / (a.length - 2));
    }

    public static void differenceBetweenMaxAndMin(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Difference between maximum and minimum is " + (max - min));
    }

    public static void numberOfEvenAndOddInteger(int[] numbers) {
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }
        System.out.println("Even numbers = " + evenCounter);
        System.out.println("Odd numbers = " + oddCounter);
    }


    public static void allZeroToEnd(int[] arr) {
        int notNullindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[notNullindex] = arr[i];
                notNullindex++;
            }
        }
        for (int i = notNullindex; i < arr.length; i++) {
            arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }


    public static void commonElementsOf3Arrays(int[] a, int[] b, int[] c) {
        int x = 0;
        int y = 0;
        int z = 0;
        ArrayList<Integer> commonElements = new ArrayList<Integer>();
        while (x < a.length && y < b.length && z < c.length) {
            if (a[x] == b[y] && b[y] == c[z]) {
                commonElements.add(a[x]);
                x++;
                y++;
                z++;
                // in sorted list, we must increment index of array with a smallest value inside until we get elements of same value
                // sto bi znacilo da u sortiranom nizu da bi smo nasli zajednicke elemente mi uporedjujemo njihove vrednosti svaki sa svakim prvo a i b pa onda b i c
                //
            } else if (a[x] < b[y]) {
                x++;
            } else if (b[y] < c[z]) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println(commonElements);
    }


    public static void areArraysEqual(int[] a, int[] b) {
        boolean notEqual = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                notEqual = true;
                break;
            }
        }
        if (!notEqual) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }
    }

    public static void checkIfSumExist(int[] a, int b) {
        boolean found = false;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {

                    System.out.println(a[i] + " + " + a[j] + " = " + b);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("This number does not have a pair of sum");
        }
    }

    public static void sumTwoMatricesOfTheSameSize(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {

            int[][] sum = new int[m1.length][m1[i].length];

            for (int j = 0; j < m1[i].length; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); //separate rows
        }
    }

    public static void convertArrayToArrayList(int[] a) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new)));
        System.out.println(arrList);
    }

    public static void removeDuplicateElement(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    for (int z = j; z < a.length - 1; z++) {
                        a[z] = a[z + 1];
                    }
                    a[a.length - 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

    public static void secondLargest(int[] a) {
        Arrays.sort(a);
        System.out.println("Second largest element " + (a[a.length - 2]));

    }

    public static void secondSmallest(int[] a) {
        Arrays.sort(a);
        int b = a[1];
        System.out.println("Second smallest element " + (b));

    }

}