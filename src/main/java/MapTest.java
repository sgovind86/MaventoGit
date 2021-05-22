import java.util.*;

public class MapTest {
    private SortedMap<String, TreeSet<Integer>> crimeTable;

    public  MapTest(){

        TreeSet<Integer> littleNewarkCc = new TreeSet<>(Arrays.asList(8, 77, 93));
        TreeSet<Integer> springFieldHeightsCc = new TreeSet<>(Arrays.asList(8, 14, 15, 31, 33, 47, 77));
        TreeSet<Integer> sqidPortCc = new TreeSet<>(Arrays.asList(5,8,14,27,31,47,93));
        TreeSet<Integer> waterFrontCc = new TreeSet<>(Arrays.asList(2));

        this.crimeTable = new TreeMap<>();

        crimeTable.put("Little Newark", littleNewarkCc);
        crimeTable.put("Springfield Heights", springFieldHeightsCc);
        crimeTable.put("Sqidport", sqidPortCc);
        crimeTable.put("Waterfront", waterFrontCc);

    }

    public List<Integer> crimeList(){

        List<Integer> cityCrime = new ArrayList<>();

        for(Map.Entry<String, TreeSet<Integer>>  mycrime: crimeTable.entrySet()){

            for(Integer mycode : mycrime.getValue()){
                cityCrime.add(mycode);
                //System.out.println("City Name is" + mycrime.getKey() + " : " + "Crime Codes are" + " :" + mycode);
            }

        }

        return cityCrime;
    }

    public List<Integer> highlyLocalisedCrime (){

        List<Integer> localCrime = new ArrayList<>();
        System.out.println("Highly Localised Crime code are");
        for(Integer crimeCode : crimeList()){
            int a = Collections.frequency(crimeList(), crimeCode);
            if (a == 1){
                localCrime.add(crimeCode);

                System.out.print(crimeCode + ", ");
            }

        }
        return localCrime;
    }


}
