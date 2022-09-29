public class go_ban_phim {

    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        Stack ds1=new Stack();
        Stack ds2=new Stack();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x>='a'&&x<='z') ds1.push(x);
            if(x>='A'&&x<='Z') ds2.push(x);
            if(x=='>'){
                if(!ds2.empty()){
                    ds1.push(ds2.pop());
                }
            }
            if(x=='<'){
                if(!ds1.empty()){
                    ds2.push(ds1.pop());
                }
            }
            if(x=='-'){
                if(!ds1.empty()) ds1.pop();
            }
        }
        String kq="";
        while(!ds2.empty()){
            ds1.push(ds2.pop());
        }
        while(!ds1.empty()){
            char x=(char) ds1.pop();
            System.out.print(x);
        }
    }
}