public class DynamicArrayTest{

    private DynamicArray array; 

    @Before
    public void SetUp() throws Exception {
        array = new DynamicArray<String>( initialCapacity: 2);
    }

    @Test
    public void GetAndSet() throws Exception {
        array.set(0, "a");
        Assert.assertEquals( expected: "a", array.get(0)); 
    }

    @Test
    public void Insert() throws Exception {
        array.add("b"); //0
        array.add("c"); //1
        array.add("d"); //2

        array.insert( index: 1, value: "d");

        Assert.assertEquals( expected: 4, array.size());
        Assert.assertEquals( expected: "a", array.get(0));
        Assert.assertEquals( expected: "b", array.get(1)); 
        Assert.assertEquals( expected: "c", array.get(2)); 
        Assert.assertEquals( expected: "d", array.get(3)); 
    }

    @Test
    public void Delete() throws Exception {
        array.add("a");
        array.add("b"); 
        array.add("c"); 

        array.delete( index: 1); 

        Assert.assertEquals( expected: 2, array.size()); 
        Assert.assertEquals( expected: "a", array.get(0)); 
        Assert.assertEquals( expected: "b", array.get(1)); 
    }

}
