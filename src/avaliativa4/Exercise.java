package avaliativa4;

public class Exercise {
    
    private String name;
    private int repeats;
    private double caloriesPerRepeat;

    public Exercise (String name, int repeats, double caloriesPerRepeat)
    {
        this.name = name;
        this.repeats = repeats;
        this.caloriesPerRepeat = caloriesPerRepeat;
    }

    /**
     * Get Name
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     * Get Repeats
     * @return int
     */
    public int getRepeats() {
        return repeats;
    }
    /**
     * Get Effort Value
     * @return double
     */
    public double getcaloriesPerRepeat() {
        return caloriesPerRepeat;
    }

    public double CalcPerformece() {
        return caloriesPerRepeat * repeats;
    }
}
