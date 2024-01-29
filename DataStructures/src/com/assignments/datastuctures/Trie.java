package com.assignments.datastuctures;

import java.util.ArrayList;
import java.util.List;

class Unit{
	Unit children[];
	int isWord;
	int isPrefix;
	Unit(){
		this.isWord=0;
		this.children=new Unit[26];
		this.isPrefix=0;
	}
}

public class Trie {
	private Unit root;
	private int wordCount;
	private List<String>allWords;
	public Trie() {
		this.root=new Unit();
		this.wordCount=0;
		this.allWords=new ArrayList<>();
	}
	public void insert(String word) {
		word=word.toLowerCase();
//		int level=0;
//		int len=word.length();
		int index=0;
		Unit temp=root;
		
		for(char ch:word.toCharArray()) {
			index=ch-'a';
			if(temp.children[index]==null) {
				temp.children[index]=new Unit();
			}
			temp=temp.children[index];
			temp.isPrefix++;
		}
		temp.isWord++;
		this.wordCount++;
		allWords.add(word);
	}
	public Object[] searchStub(String word) {
		Object[]ret=new Object[2];
		word=word.toLowerCase();
		int index=0;
		Unit temp=root;
		
		for(char ch:word.toCharArray()) {
			index=ch-'a';
			if(temp.children[index]==null) {
				ret[0]=false;
				ret[1]=temp;
				return ret;
			}
			temp=temp.children[index];
		}
		ret[0]=temp.isWord>0;
		ret[1]=temp;
		return ret;
	}
	public boolean search(String word) {
		return (boolean) searchStub(word)[0];
	}
	public void deleteDep(String word) {
		int index=0;
		Unit temp=root;
		word=word.toLowerCase();
		for(char ch:word.toCharArray()) {
			index=ch-'a';
			if(temp.children[index]==null) {
				System.out.println("No such word present");
				return;
			}
			temp=temp.children[index];
			
		}
		temp=root;
		for(char ch:word.toCharArray()) {
			index=ch-'a';
			temp.children[index].isPrefix--;
			temp=temp.children[index];
			
		}
		temp.isWord--;
		this.wordCount--;
		allWords.remove(word);
	}
	public void remove(String word) {
		if(!search(word)) {
			System.out.println("No such word present in the Trie");
			return;
		}
		int index=0;
		Unit temp=root;
		word=word.toLowerCase();
		for(char ch:word.toCharArray()) {
			index=ch-'a';
			temp.children[index].isPrefix--;
			if(temp.children[index].isPrefix==0) {
				temp.children[index]=null;
				this.wordCount--;
				allWords.remove(word);
				return;
			}
			temp=temp.children[index];
			
		}
		temp.isWord--;
		this.wordCount--;
		allWords.remove(word);
	}
	public boolean isPrefix(String pre) {
		pre=pre.toLowerCase();
		int index=0;
		Unit temp=root;
		
		for(char ch:pre.toCharArray()) {
			index=ch-'a';
			if(temp.children[index]==null) {
				return false;
			}
			temp=temp.children[index];
		}
		return temp.isPrefix>0;
	}
	public int getWordCount() {
		return wordCount;
	}
	public List<String> getAllWords() {
		return allWords;
	}
	
	public String toString() {
		return allWords.toString();
	}
	
	
}
