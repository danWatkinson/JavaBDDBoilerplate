package com.boilerplate.stepDefinitions;

import com.boilerplate.app.Codebase;
import com.boilerplate.app.Problem;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class TDDStepDefinitions {

    Problem aProblem;
    Codebase aCodebase;
    
    @Given("^a problem$")
    public void a_problem() throws Throwable {
        aCodebase = mock(Codebase.class);
        aProblem = new Problem( aCodebase );
    }
    
    @When("^I solve the problem$")
    public void i_solve_the_problem() throws Throwable {
        aProblem.solve();
    }

    @Then("^I should write a test before I write any code$")
    public void i_should_write_a_test_before_I_write_any_code() throws Throwable {
        InOrder order = inOrder(aCodebase);

        order.verify( aCodebase ).addATest();
        order.verify( aCodebase ).addSomeProductionCode();
    }
}
