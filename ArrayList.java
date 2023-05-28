
public class ArrayList{
    public static void main(String[] args){

        //inside <> this we have to put wrapper class or keep it as blank
        ArrayList<Integer> list = new ArrayList<>();

        // .add  : to add the element we to use 
        list.add(22);
        System.out.println(list);

        //.contains() : for checking the value is present or not
        System.out.println(list.contains(22));

        //.set(index,element value for it) for update the value
        list.set(0,55);
        System.out.println(list);

        //remove() : to remove the value from list.
        list.remove(0,23);

        //taking the input from the user
        for(int i =0; i<5; i++){
            list.add(in.nextInt());
        }

        //output the element using for loop;
        for(int i = 0; i<5 ; i++){
            System.out.println(list.get(i));
        }
    }
}