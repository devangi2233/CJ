class NineA{
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Object language");
        System.out.println("Object String : "+ str);
        for(int i = 0; i < str.length(); i++){
            System.out.println("Character at position "+i+" in "+str.charAt(i));
        }

        String a_string = str.toString();
        int pos = a_string.indexOf(" language");
        str.insert(pos, " oriented");
        System.out.println("Modified String : "+str);

        str.setCharAt(6, '_');
        System.out.println("String now : "+ str);

        str.append(" improves security");
        System.out.println("Appended String : "+str);
    }
}