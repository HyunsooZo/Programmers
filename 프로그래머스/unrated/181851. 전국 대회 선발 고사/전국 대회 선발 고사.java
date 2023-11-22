import java.util.*;
class Student implements Comparable<Student>{
    int seq;
    int name;
    
    public Student(int seq, int name){
        this.seq = seq;
        this.name = name;
    }
    
    @Override
    public int compareTo(Student other){
        return this.name-other.name;
    }
}
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Student> list = new ArrayList<>();
        int answer = 0;
        for(int i = 0 ; i < rank.length ; i++){
            if(attendance[i]){
                list.add(new Student(i,rank[i]));
            }
        }
        Collections.sort(list);
        
        System.out.println(list.get(0).seq);
        System.out.println(list.get(1).seq);
        System.out.println(list.get(2).seq);
        
        return list.get(0).seq *10000 + 
            list.get(1).seq*100 + 
            list.get(2).seq;
    }
}