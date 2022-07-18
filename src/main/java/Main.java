//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//class Main {
//    public static void main(String[] args) {
//        com.ll.exam.HashMap aMap = new com.ll.exam.HashMap();
//
////        aMap.put(1, "안녕");  // 1번
////        aMap.put("A", false);
////
////        System.out.println(aMap.get("A"));
//
////        aMap.put(1, "안녕");  //3번
////        aMap.put("A", false);
////        aMap.put("A", true);
////
////        System.out.println(aMap.get("A"));
////        // 출력 : true
//        com.ll.exam.HashMap<String, Integer> ages = new com.ll.exam.HashMap<>();
//        ages.put("영희", 22);
//        ages.put("철수", 23);
//        ages.put("민서", 25);
//        ages.put("철수", 27);
//        ages.remove("영희");
//        ages.put("광수", 27);
//        for ( String name : ages.keySet() ) {
//            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
//        }
//        /* 출력결과 */
//        // 이름 : 철수, 나이 : 27
//        // 이름 : 민서, 나이 : 25
//        // 이름 : 광수, 나이 : 27
//        com.ll.exam.HashMap<String, Object> everyone = new com.ll.exam.HashMap<>();
//        everyone.put("사람", new 사람());
//        everyone.put("원숭이", new 원숭이());
//        ((사람)everyone.get("사람")).말하다();
//        // 출력 => 사람이 말합니다.
//        ((원숭이)everyone.get("원숭이")).묘기를_부리다();
//        // 출력 => 원숭이가 묘기를 부립니다.
//    }
//}
//
//class com.ll.exam.HashMap<K,V>{
//    Object [] keys;
//    Object [] values;
//    int lastIndex=-1;
//    public com.ll.exam.HashMap() {
//        keys = new Object[2];
//        values = new Object[2];
//    }
//
//    void put(K key, V value){
//        int idx = getIndex(key);
//        if(idx !=-1){
//            values[idx] = value;
//        }
//        else{
//            lastIndex++;
//            extendDatasSizeIfNeed();
//            keys[lastIndex] = key;
//            values[lastIndex] = value;
//        }
//    }
//    void extendDatasSizeIfNeed() {
//        if ( lastIndex >= keys.length ) {
//            Object[] newArr = Arrays.copyOf(keys, keys.length*2);
//            keys = newArr;
//            Object[] newArr2 = Arrays.copyOf(values, values.length*2);
//            values = newArr2;
//        }
//    }
//
//    void remove(K key){
//        int idx = getIndex(key);
//        for(int i=idx;i<=lastIndex;i++){
//            values[i]=values[i+1];
//            keys[i] = keys[i+1];
//        }
//        lastIndex--;
//    }
//
//    Set<K> keySet(){
//        Set<K> set = new HashSet<>();
//        for(int i=0;i<=lastIndex;i++){
//            set.add((K) keys[i]);
//        }
//        return set;
//    }
//
//    V get(K key){
//        int idx = getIndex(key);
//        return (V)values[idx];
//    }
//    int getIndex(K key){
//        for(int i=0;i<lastIndex+1;i++){
//            if(keys[i].equals(key)){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//
//
//class 사람{
//    void 말하다(){
//        System.out.println("사람이 말합니다.");
//    }
//}
//
//class 원숭이{
//    void 묘기를_부리다(){
//        System.out.println("원숭이가 묘기 부립니다.");
//    }
//}