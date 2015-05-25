Reversed the book-buying process using FSM behaviours.
After behaviours declaration, executes first state where book buyers is generated.
At this state user enters book name which buyer should look for, and answers whether to look for another one.
If user choose to add another book, state of generating buyers will execute one more time.
This process will be repeated till user choose No.
After that, state will be switched to new, and seller generator will be executed.
Seller generator will generate only one seller, which will the only book provider.
Next state will end FSM behaviour.