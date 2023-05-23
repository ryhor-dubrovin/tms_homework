package unittest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnNameLastNameTest {
    ReturnNameLastName r = new ReturnNameLastName();
    @Test
    public void numberIsDivisibleByThreeAndFive() {
        Assert.assertEquals(r.returner(15),"Ryhor Dubrovin", "Method didn't return Full Name");
    }
    @Test
    public void numberIsDivisibleByThree() {
        Assert.assertEquals(r.returner(3),"Ryhor","Method didn't return First Name");
    }
    @Test
    public void numberIsDivisibleByFive() {
        Assert.assertEquals(r.returner(5),"Dubrovin","Method didn't return Last Name");
    }
    @Test
    public void numberIsNotDivisibleByThreeOrFive() {
        Assert.assertEquals(r.returner(2),"Error","Method didn't return Error");
    }
}
