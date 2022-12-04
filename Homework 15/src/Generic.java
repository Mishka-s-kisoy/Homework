public class Generic <T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;
    public Generic(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }
    public void sort(){
        if (first.compareTo(getSecond()) < 0){
            T wow = getFirst();
            setFirst(getSecond());
            setSecond(wow);
        }
        if (first.compareTo(getThird()) < 0){
            T wow = first;
            setFirst(getThird());
            setThird(wow);
        }
        if (second.compareTo(getThird()) < 0){
            T wow = second;
            setSecond(getThird());
            setThird(wow);
        }
    }
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        if (first == null) return;
        this.first = first;
    }

    public void setSecond(T second) {
        if (second == null) return;
        this.second = second;
    }

    public void setThird(T third) {
        if (third == null) return;
        this.third = third;
    }


    @Override
    public String toString() {
        return first + " " + second + " " + third;
    }


}
