/**
 * EncapDemo
 */
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge <= 30 && newAge >= 18){
            age = 30;
        }else{
            System.out.println("Maaf, Umur min 18 dan umur maks 30");
        }
    }
}