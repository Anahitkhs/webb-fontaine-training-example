package HomeworkFunctionsObjects;

/**
 * Created by Anahit Khachatryan  on  29, Sep, 2020
 */
public class MainSolutions {
    public static void main(String[] args) {

        RegardingArrays arrays = new RegardingArrays();
        NumericOprations numericOprations = new NumericOperations();
        Triangles triangles = new Triangles();

        //1. Գրել ֆունկցիա, որը տրված զանգվածի արժեքները կբազմապատկի 2-ով եւ կվերադարձնի այն.

        int arrayLength = arrays.getArrayLength();
        int[] originalArray = arrays.createRandomArray(arrayLength);
        arrays.arrayElementPrintout(originalArray, "Original Array");
        int[] doubledArray = arrays.getdoubledArray(originalArray);
        arrays.arrayElementPrintout(doubledArray, "Doubled Array");

        //2.Գրել ֆունկցիա, որը կգումարի եւ կհաշվի իրեն տրված արգումենտների գումարը եւ կվերադարձնի այն

        int sumOfTwoInt = numericOprations.getSumOfArguments(1, 2);
        System.out.println(sumOfTwoInt);

        int sumwithVarargs = numericOprations.getSumOfArguments(1, 2, 3);
        System.out.println(sumwithVarargs);

        //3. Գրել ֆունկցիա, որը կհաշվի եռանկյան մակերեսը ըստ տրված 3 կողմերի եւ կվերադարձնի այն

        double[] triangle = new triangle.createTriangle();
        boolean validationChecking = triangle.checkTriangleLogic(triangle);
        System.out.println(validationChecking);
        double area = triangle.calculateArea(triangle, validationChecking);
        System.out.println(area);

        //4. Գրել ֆունկցիաներ, որոնք ստանալով երկու զանգված, կմիացնի այդ զանգվածները եւ կվերադարձնի այն. կգումարի առաջի եւ երկրորդ զանգվածների միջին թվաբ-ը եւ կվերադարձնի

        int firstArrayLength = arrays.getArrayLength();
        int[] firstArray = arrays.createArray(firstArrayLength);
        arrays.arrayElementPrintout(firstArray, "First Array");
        int secondArrayLength = arrays.getArrayLength();
        int[] secondArray = arrays.createArray(secondArrayLength);
        arrays.arrayElementPrintout(secondtArray, "Second Array");

        int[] combinedArray = arrays.combineArrays(firstArray, secondArray);
        arrays.arrayElementPrintout(combinedArray, "Combined Array");
        double totalMean = arrays.meanOfElement(firstArray, firstArrayLength) + arrays.meanOfElement(secondArray, secondArrayLength);
        System.out.println(totalMean);

        //5. Գրել ֆունկցիա, որը տրված զանգվածի տրված ինդեքսի արժեքը կմեծացնի 10% -ով.
        int arrayLengthForValueIncrease = arrays.getArrayLength();
        int[] arrayForValue = arrays.createRandomarray(arrayLengthForValueIncrease);
        arrays.arrayElementPrintout(arrayForValue, "Created Array");
        int elementIndex=arrays.findIndex(arrayForValue);
        doublle newElementValue= arrays.increaseElementValue(arrayForValue, elementIndex, 1.1f);
        System.out.println(newElementValue);

        //6. Գտնել Ֆիբոնաչիի n-րդ թիվը օգտագործելով ռեկուրսիա.
        int fibonacciNumber=numericOprations.fibonacciRecursion(5);
        System.out.println("Fibonacci Number is: "+ fibonacciNumber);

        //7. Գտնել 1-ից n  թվերի արտադրյալը օգտագործելով ռեկուրսիա.
        int productOfNumber =numericOperations.productOfNumbersFromOneToN(5);
        System.out.println(productOfNumber);

    }
}