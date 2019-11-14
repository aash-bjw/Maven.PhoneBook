package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String,List<String>> phoneBook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {

        this.phoneBook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> pNumbers = new ArrayList<>();
        pNumbers.add(phoneNumber);
        phoneBook.put(name, pNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        phoneBook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        if(phoneBook.containsKey(name))
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {

        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result = "";

        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                result = entry.getKey();
            }
        }
        return result;
    }

    public List<String> getAllContactNames() {

        ArrayList<String> contactList = new ArrayList<>(phoneBook.keySet());
        return contactList;
    }

    public Map<String, List<String>> getMap() {

        return phoneBook;
    }
}
