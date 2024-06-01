package sesion2;

/**
 *
 * @author Darkness02r
 */
public class Person {
    private String name;
    private String lastname;
    private float heigth;
    private int age;
/**
 * constructor vacio
 */
public Person(){

}

/**
 * constructor con parametros
 * @param name
 * @param lastname
 * @param heigth
 * @param age 
 */


public Person(String name, String lastname, float heigth, int age){
    this.name = name;
    this.lastname = lastname;
    this.heigth = heigth;
    this.age = age;
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "\nNombre= " + name + "\nApellido= " + lastname + "\nAltura= "
                + heigth + "\nEdad= " + age + '\n';
    }

    
}