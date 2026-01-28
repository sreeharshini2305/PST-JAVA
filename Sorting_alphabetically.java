import java.util.*;
import java.util.stream.*;

class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}

public String getName() {
return name;
}
public int getAge() {
return age;
}
public static boolean isOlderThan(Person p, int ageLimit) {
return p.getAge() > ageLimit;
}
}

public class Sorting_alphabetically {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
List<Person> persons = new ArrayList<>();
for (int i = 0; i < n; i++) {
String name = sc.next();
int age = sc.nextInt();
persons.add(new Person(name, age));
}
int ageLimit = sc.nextInt();

String sortedNames = persons.stream().map(Person::getName).sorted().collect(Collectors.joining(" "));

String filteredNames = persons.stream().filter(p -> Person.isOlderThan(p, ageLimit)).map(Person::getName).collect(Collectors.joining(" "));
String upperCaseNames = persons.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.joining(" "));
System.out.println(sortedNames);
System.out.println(filteredNames);
System.out.println(upperCaseNames);
 }
}
