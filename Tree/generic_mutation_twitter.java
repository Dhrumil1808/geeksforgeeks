package Tree;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by dhrumil on 9/6/17.
 */

public class generic_mutation_twitter {

    static int findMutationDistance(String start, String end, String[] bank) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<start.length();i++)
        {
            str.append(start.charAt(i));
        }
        //System.out.println(str.toString());
        ArrayList<Integer> arrays=new ArrayList<Integer>();
    int result=0;

        if(start.length()!=end.length() || start.length()!=8)
            return -1;

        int k=start.length();
            for(int i=0;i<start.length();i++)
            {
                boolean bool=false;
                k--;
                    if (str.charAt(k) != end.charAt(k)) {
                        //System.out.println(end.charAt(i));

                        str.setCharAt(k, end.charAt(k));
                        //System.out.println(str.toString());

                        for (int j = 0; j < bank.length; j++) {
                            if (bank[j].equals(str.toString())) {
                                bool = true;
                                arrays.add(j);
                                result++;
                            }
                        }
                        if(!bool)
                            str.setCharAt(i,start.charAt(i));


                    }




            if (str.charAt(i) != end.charAt(i))

            {
                //System.out.println(end.charAt(i));
                //result++;
                str.setCharAt(i, end.charAt(i));
                //System.out.println(str.toString());

                for (int j = 0; j < bank.length; j++) {
                    if (bank[j].equals(str.toString())) {
                        bool = true;
                        arrays.add(j);
                        result++;
                    }
                }

                if(!bool)
                    str.setCharAt(i,start.charAt(i));


            }

            }


        for (int i = 0; i < arrays.size()-1; i++) {
            if (arrays.get(i) > arrays.get(i+1)) {
                return -1;
            }
        }


        return result;

    }




    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        String output=in.nextLine();


        int _bank_size = 0;
        _bank_size = Integer.parseInt(in.nextLine().trim());
        String[] _bank = new String[_bank_size];
        String _bank_item;
        for(int _bank_i = 0; _bank_i < _bank_size; _bank_i++) {
            try {
                _bank_item = in.nextLine();
            } catch (Exception e) {
                _bank_item = null;
            }
            _bank[_bank_i] = _bank_item;
        }

       int res = findMutationDistance(input, output, _bank);
        System.out.println(res);

    }
}

