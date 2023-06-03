@Entity

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Vehicle {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    // Common properties and getters/setters

}

@Entity

public class Car extends Vehicle {

    private String brand;

    private String model;

    // Car-specific properties and getters/setters

}

@Entity

public class Motorcycle extends Vehicle {

    private String make;

    private String model;

    // Motorcycle-specific properties and getters/setters

}

