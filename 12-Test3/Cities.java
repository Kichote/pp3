
public class Cities
{
    private String[] cities;
    
    public Cities(String[] cities) {
        this.cities = cities;
    }
    
    public Cities filter(char letter) {
        String[] filteredCities = new String[cities.length];
        int count = 0;
        for(int i = 0; i < cities.length; i++) {
            if(cities[i].charAt(0) == letter) {
                filteredCities[count] = cities[i];
                count ++;
            }
        }
        return new Cities(filteredCities);
    }
    
    public String cities() {
        String list = "";
        for(int i = 0; i < cities.length; i++) {
            list += cities[i] + " ";
        }
        return list;
    }
}
