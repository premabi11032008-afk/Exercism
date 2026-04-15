class Badge {
    public String print(Integer id, String name, String department) {
        String num = id==null?"":"["+String.valueOf(id)+"] - ";
        String dpt = department==null?"OWNER":department.toUpperCase();

        return num+name+" - "+dpt;
    }
}
