import java.util.ArrayList;
public class InitializeClass {
    static ArrayList<RecepientSuperClass> int_objects = new ArrayList<RecepientSuperClass>();
    static ArrayList<Personal> pers_objects = new ArrayList<Personal>();
    static ArrayList<OfficeFriend> ofp_objects = new ArrayList<OfficeFriend>();
    static ArrayList<Official> off_objects = new ArrayList<Official>();
    static ArrayList<String> pers_strings = new ArrayList<String>();
    public static int func(){
        ArrayList<String> st0 = FileHandle.ReadFile();
        for(String item : st0){
            String first = item.substring(0,10);
            if( first.equals("Official: ")){
                int l = item.length();
                String[] String_list = item.substring(9,l).split(",");
                Official append_item = new Official(item.substring(0,7),  String_list[0], String_list[1],  String_list[2]);
                int_objects.add(append_item);
                off_objects.add(append_item);
            }else if(item.substring(0,15).equals("Office_friend: ")){
                int l1 = item.length();
                String[] String_list1 = item.substring(14,l1).split(",");
                OfficeFriend append_item = new OfficeFriend(item.substring(0,12), String_list1[0],  String_list1[1],  String_list1[2], String_list1[3]);
                int_objects.add(append_item);
                ofp_objects.add(append_item);
            }else if(item.substring(0,10).equals("Personal: ")){
                int l2 = item.length();
                String[] String_list2 = item.substring(10,l2).split(",");
                Personal append_item = new Personal(item.substring(0,8), String_list2[0],  String_list2[2],  String_list2[1], String_list2[3]);
                int_objects.add(append_item);
                pers_objects.add(append_item);
                pers_strings.add(item);
            }else{
                System.out.println("error in intialize class logic");
            }
            
        }
        return int_objects.size();
    }
}
