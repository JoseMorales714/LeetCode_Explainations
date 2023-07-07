class prefix_sum {
    public int largestAltitude(int[] gain) {
        
        int rtn_highest = 0;
        int hold_current = 0;

        for(int ix = 0; ix < gain.length; ix++){

            hold_current += gain[ix];
            if(hold_current > rtn_highest){
                rtn_highest = hold_current;
            }

        }



        return rtn_highest;

    }
}