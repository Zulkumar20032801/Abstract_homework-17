public class Cow  extends Farm{
    private int age;
    private int weight;
    private String gender;
    private String nickName;

    public Cow( int age, int weight, String gender, String nickName) {
        super();

        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
