package edu.swun.anoclass;

public class PersonTest {

    //方案一
//    public void getRead(Man man){
//        man.Read();
//    }
//
//    public void getRead(Woman woman){
//        woman.Read();
//    }
    //方案二
    public void getRead(Person person){
        person.Read();
    }
    public static void main(String[] args) {
        PersonTest test = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);
        test.getRead(new Person() {
            @Override
            public void Read() {
                System.out.println("男生喜欢科幻小说");
            }
        });
        test.getRead(new Person() {
            @Override
            public void Read() {
                System.out.println("女生喜欢言情小说");
            }
        });

    }
}
