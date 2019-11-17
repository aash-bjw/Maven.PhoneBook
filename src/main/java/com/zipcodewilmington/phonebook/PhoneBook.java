package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String,List<String>> phoneBook;

    public PhoneBook(Map<String, List<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook() {

        phoneBook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phoneBook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {

        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        for(String s : phoneBook.keySet()) {
            if (phoneBook.get(s).contains(phoneNumber)) {
                return s;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {

        ArrayList<String> contactList = new ArrayList<>(phoneBook.keySet());
        return contactList;
    }

    public Map<String, List<String>> getMap() {

        return phoneBook;
    }
}
