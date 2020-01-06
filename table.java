public class DynamicArray<String> {

    private Object[] data;
    private int size; 
    private int initialCapacity;

    public DynamicArray(int initialCapacity){
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity]; 
    }

    public String get(int index) {
        return (String)data[index];
    }

    public void set(int index, String value) {
        data[index] = value; 
    }

    public void insert(int index, String value) { 

        // check size
        if (size == initialCapacity){
            resize(); 
        }
        //copy up
        for (int j = size; j > index; j--){
            data[j] = data [j-1]; 
        }

        // perform insert
        data[index] = value; 
        size++; 
    }

    public void delete(int index) {
    }

    public boolean isEmpty() {
    }

    public boolean Contains(String value){
    }

    private void resize() {
        Object[] newData = new Object[initialCapacity * 2]; 
        for (int i = 0; i < initialCapacity; i++){
            newData[i] = data[i];
        }
        data = newData; 
        initialCapacity = initialCapacity * 2; 
    }

    public int size() { return size; }

}
