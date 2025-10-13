class Overriding {
    public int add(int n1, int n2){
        int res = n1+n2;
        return res;
    }
    public int add(int n1, int n2, int n3){
        int res = n1 + n2 + n3;
        return res;
    }
    public static void main(String str[]){
        Overriding obj = new Overriding();
        int ans = obj.add(2, 3, 3);
        int another = obj.add(4, 5);
        System.out.println(ans);
        System.out.println(another);
    }
}
