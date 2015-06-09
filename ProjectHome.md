program = block '.' .
> block =  { declaration } statement .
> > declaration = constant | variable | function .
> > > constant = CONST constant\_definition { ',' constant\_definition } ';' .
> > > > constant\_definition = NAME '=' NUMBER .

> > > variable = VAR NAME { ',' NAME } ';' .
> > > function = FUNCTION NAME '(' [NAME { ',' NAME } ](.md)  ')' block ';' .
> > > > expression = [( '-' | '+' ) ](.md) term { ( '-' | '+' ) term } .
> > > > > term = factor { ( '