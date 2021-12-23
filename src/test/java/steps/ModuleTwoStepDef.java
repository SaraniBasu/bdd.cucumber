package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {
	

@Before(order=1, value="@RegressionTest")
public void initChrome()
{
	System.out.println("init Chrome DB");
	}
@Before(order=2, value="@RegressionTest")
public void setUpDB()
{
	System.out.println("DB configure One");
	}

@Before(order=1, value="@SmokeTest")
public void initEdge()
{
	System.out.println("init Edge DB");
	}
@Before(order=2, value="@SmokeTest")
public void setUpDBTwo()
{
	System.out.println("DB configure Two");
	}

	@When("User create a new task")
	public void user_create_a_new_task() {
	   System.out.println("User create a new task");
	    
	}

	@When("User view task details")
	public void user_view_task_details() {
	 System.out.println("User view a new task");

	}

	@When("User update a task details")
	public void user_update_a_task_details() {
	 System.out.println("User update a new task");

	}
	
	@After
	public void closeDB()
	{
		System.out.println("Close DB");
		}
}
