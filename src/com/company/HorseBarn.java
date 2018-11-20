package com.company;

public class HorseBarn {

    //fields

    private Horse[] spaces;

    //constructors

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    //methods

    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
                return i;
            }
            return -1;
        }

        public void consolidate()
        {
            Horse[] newSpaces = new Horse[spaces.length];
            int newIndex = 0;

            for(int oldIndex = 0; oldIndex < spaces.length; oldIndex++)
            {
                if(spaces[oldIndex] != null)
                {
                    newSpaces[newIndex] = spaces[oldIndex];
                    newIndex++;
                }
            }

            spaces = newSpaces;
        }

    public String toString() {
        String total = "";

        for (int i = 0; i < this.spaces.length; i++) {
            total += this.spaces[i] + " ";
        }

        return total;
    }
}
