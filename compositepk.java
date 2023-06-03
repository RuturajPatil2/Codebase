@Entity
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Common properties and getters/setters
}

@Entity
@IdClass(CarPK.class)
public class Car extends Vehicle {
    @Id
    private String carChassisNo;

    // Car-specific properties and getters/setters

    // Constructors

    // Equals and HashCode methods

    // Other methods
}

public class CarPK implements Serializable {
    private Long id;
    private String carChassisNo;

    // Constructors, equals, and hashCode methods
    // Getters and setters for id and carChassisNo
}
