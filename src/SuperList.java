import java.util.Iterator;

public class SuperList extends ListManager{




    @Override
    public void addElement(Object element) {

     list.add(element);

    }

    @Override
    public Object removeElement(int position) {
        list.remove(position);
        return null;
    }

    @Override
    public void showElements() {
        Iterator<String> readList = list.iterator();

        for (int i = 0; i <= list.size(); i++) {
            System.out.println(readList.next());

        }


    }

    @Override
    public void showReversedElements() {
        Iterator<String> readList = list.iterator();

        for (int i = list.size(); i <= 0; i--) {
            System.out.println(readList.next());

        }

    }

}


