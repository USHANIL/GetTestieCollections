package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList
{
    ArrayList<Integer> newAl = new ArrayList();

    @Test
    public void testAdd()
    {
        for (int i=0; i<10; i++)
        {
            newAl.add(2);
        }
        Assert.assertEquals(10,newAl.size());

    }

    @Test
    public void testRemove()
    {
        for (int i=0; i<10; i++)
        {
            newAl.add(2);
        }
        newAl.remove(2);
        Assert.assertEquals(9,newAl.size());

    }

    @Test
    public void testSize()
    {
        for (int i=0; i<10; i++)
        {
            newAl.add(2);
        }

        //newAl.set();
        Assert.assertEquals(10,newAl.size());

    }

    @Test
    public void testAddAll()
    {
        for (int i=0; i<10; i++)
        {
            newAl.add(2);
        }

        //newAl.set();
        ArrayList newArray = new ArrayList();
        newArray.addAll(newAl);
        Assert.assertEquals(newArray.size(),newAl.size());

    }

    @Test
    public void TestArrayListSubList() {
        for (int i=0; i<10; i++)
        {
            newAl.add(2);
        }


        List<Integer> newArray = new ArrayList<>();
        newArray = newAl.subList(5,8);
        Assert.assertEquals(3,newArray.size());
    }

    @Test
    public void TestArrayListGetIndex() {
        for (int i=0; i<10; i++)
        {
            newAl.add(1000);
        }
        Assert.assertEquals(newAl.get(2), newAl.get(1));
    }

    @Test
    public void TestArrayListContains() {
        for (int i=0; i<10; i++)
        {
            newAl.add(1000);
        }
        Assert.assertEquals(true, newAl.contains(1000));
    }



}
