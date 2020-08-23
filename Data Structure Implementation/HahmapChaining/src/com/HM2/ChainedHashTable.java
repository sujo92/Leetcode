package com.HM2;


import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for(int i=0;i<hashtable.length;i++){
            hashtable[i]= new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key,Employee employee){
        int hashedkey= hashKey(key);
        hashtable[hashedkey].add(new StoredEmployee(key,employee));
    }

    public Employee get(String key){
        int hashedkey=hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee emp =null;
        while (iterator.hasNext()){
            emp =iterator.next();
            if(emp.key.equals(key)){
                return emp.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedkey=hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee emp =null;
        int index=-1;
        while (iterator.hasNext()){
            emp =iterator.next();
            index++;
            if(emp.key.equals(key)){
                break;
            }
        }
        if (emp == null || !emp.key.equals(key))
            return null;
        else{
            hashtable[hashedkey].remove(index);
            return emp.employee;
        }
    }

    public int hashKey(String key){
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printhashtable(){
        for (int i=0;i<hashtable.length;i++){
            if(hashtable[i].isEmpty())
                System.out.println("position:"+i+" empty");
            else
                System.out.print("position:"+i+": ");
            ListIterator<StoredEmployee> iterator=hashtable[i].listIterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next().employee);
                System.out.print("-->");
            }
            System.out.println("null");
        }
    }
}

