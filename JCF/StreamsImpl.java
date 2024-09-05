package InterviewPrep.JCF;

import InterviewPrep.LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsImpl {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(100);
        salaryList.add(10);
        salaryList.add(900);
        salaryList.add(200);
        salaryList.add(1300);
        long outPut = salaryList.stream().filter((Integer n) -> n>=900).count();
        System.out.println("count of Employee salary >= 900 : "+outPut);

        System.out.println("....................................................");

        System.out.println("Different ways to create a stream : ");
        System.out.println("From Collection : ");

        List<Integer> salaryList1 = Arrays.asList(100,300,200,700);
        Stream<Integer> streamFromIntegerList = salaryList1.stream();
        System.out.println("No. of stream data elements : "+streamFromIntegerList.count());

        System.out.println("....................................................");

        System.out.println("From Array : ");

        Integer[] salaryArray2 = {-100,-299,7897,-234,34543,75875};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray2);
        List<Integer> l = streamFromIntegerArray.filter((Integer n) -> n<=-200).collect(Collectors.toList());
        System.out.println("Printing data <= -200 : " +l);

        System.out.println("....................................................");

        System.out.println("From Static method : ");
        Stream<Integer> streamFromStaticMethod  = Stream.of(-100,-299,7897,-234,34543,75875); // same as varags input.
        List<Integer> l1 = streamFromStaticMethod.map((Integer n) -> n*n).collect(Collectors.toList());
        System.out.println("Power of 2 of the stream Data : " + l1);

        System.out.println("....................................................");

        System.out.println("From StreamBuilder : ");

        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(-100).add(-200).add(100000).add(-9800);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();
        System.out.println("Count of elements passed through the stream : "+streamFromStreamBuilder.count());

        System.out.println("....................................................");

        System.out.println("From Stream Iterate : ");
        Stream<Integer> streamFromIterate = Stream.iterate(100,(Integer n) -> n+500).limit(10);
        List<Integer> l2 = streamFromIterate.sorted((Integer a,Integer b)->b-a).collect(Collectors.toList());
        System.out.println("Generating numbers from a stream using stream iterator in descending order: " + l2);

        System.out.println("....................................................");
        System.out.println("Different Intermediate Operations Implementations : ");

        System.out.println("filer(Predicate<T>predicate) : ");
        Stream<String> nameStream = Stream.of("Hello","EVERYBODY","HOW","ARE","YOU");
        Stream<String> filteredStream = nameStream.filter((String s) -> s.length()<=3);
        List<String> l4 = filteredStream.collect(Collectors.toList());
        System.out.println("filter intermediate operation implementation : " + l4);


        System.out.println("....................................................");
        System.out.println("Map(Function<T,R>mapper) : ");


        Stream<String> nameStream1 = Stream.of("Hello","EVERYBODY","HOW","ARE","YOU");
        Stream<String> filteredStream1 = nameStream1.map((String s) -> s.toLowerCase());
        List<String> l5 = filteredStream1.collect(Collectors.toList());
        System.out.println("Map intermediate operation implementation : " + l5);

        System.out.println("....................................................");
        System.out.println("flatMap(Function<T,<Stream<R>>mapper) : ");
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I","WRITE","CODE"),
                Arrays.asList("I","DONT","WRITE","C++"),
                Arrays.asList("I","LOVE","JAVA")
        );

        Stream<String> wordStream1 = sentenceList.stream().flatMap((List<String>sentence) -> sentence.stream());
        List<String> l6 = wordStream1.collect(Collectors.toList());
        System.out.println("Elements after implementing flatMap : " + l6);

        Stream<String> wordStream2 = sentenceList.stream().flatMap((List<String> sentenceList2) ->sentenceList2.stream().map((String s)->s.toLowerCase()));
        List<String> l7 = wordStream2.collect(Collectors.toList());
        System.out.println("Elements after implementing flatMap. Example 2 : " + l7);
        System.out.println("....................................................");
        System.out.println("distinct() : ");
        Integer[] arr = {12345678,209876543,1,2,3,4,4,4,5,5,5,56,6,6,66,0};
        Stream<Integer> stream = Arrays.stream(arr).distinct();
        List<Integer> l8 = stream.collect(Collectors.toList());
        System.out.println("Example of distinct() : " +l8);
        Stream<Integer> stream1 = Arrays.stream(arr).distinct().sorted();
        List<Integer> l9 = stream1.collect(Collectors.toList());
        System.out.println("Example of sorted(), ascending order: " +l9);
        Stream<Integer> stream2 = Arrays.stream(arr).distinct().sorted((Integer a,Integer b)->b-a);
        List<Integer> l10 = stream2.collect(Collectors.toList());
        System.out.println("Example of sorted(), descending order: " +l10);
        System.out.println("....................................................");
        System.out.println("peek(Consumer<T>action) : ");
        List<Integer> numbers = Arrays.asList(2,1,3,4,5,6);
        Stream<Integer> numberStream = numbers.stream().
                filter((Integer val) -> val>2)
                .peek((Integer val) -> System.out.println(val))
                .map((Integer val) -> val*val);
        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.print("peek(Consumer<T>action) Impl : " + numberList);
        System.out.println();
        System.out.println("....................................................");
        System.out.println("limit(long maxSize) Impl : ");
        List<Integer> n = Arrays.asList(2,1,3,4,5,6);
        Stream<Integer> q = n.stream().limit(2);
        List<Integer> numberList1 = q.collect(Collectors.toList());
        System.out.println("limit(long maxSize) with example impl : " + numberList1);
        Stream<Integer> q1= n.stream().skip(2);
        List<Integer> numberList2 = q1.collect(Collectors.toList());
        System.out.println("skip(logn) with example impl : " + numberList2);
        System.out.println();
        System.out.println("....................................................");
        System.out.println("mapToInt(ToIntFunction<T>mapper) Impl : ");
        List<String> num = Arrays.asList("2","4","2","1","3");
        IntStream streamMapToInt  = num.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numArr = streamMapToInt.toArray();

        System.out.println("after implementing mapToInt , toArray() with example : " );
        for(int i:numArr){System.out.print(i+" ");}
        System.out.println();

        int[] numarr = {1,2,3,4,5,6,7};

        IntStream numArrStream = Arrays.stream(numarr).filter((int val) -> val>5);

        int[] filteredArray = numArrStream.toArray();

        System.out.println("Filtered array after using IntStream is : ");
        for(int i:filteredArray){
            System.out.println(i+" ");
        }

        System.out.println("....................................................");
        System.out.println("Example for intermediate operation or lazy : ");
        List<Integer> numbers1 = Arrays.asList(2,1,3,4,5,6);
        Stream<Integer> numberStream1= numbers.stream().
                filter((Integer val) -> val>2)
                .peek((Integer val) -> System.out.println(val));
        System.out.println("Goto code, right now, It is not printing the value, because the terminal operation is not implemented");
        System.out.println("terminal operation is implemented : " + numberStream1.count() + ". This is the count of elements that are required and passed through the stream");

        System.out.println("....................................................");

        System.out.println("Sequence of stream operations example : ");
    }
}
