MultiplicationTable() {
    if(($2 == 11)) 
    then
        return;
        fi
    
    echo $1 '*' $2 = $(($1*$2));
    MultiplicationTable $1 $(($2+1));
}


MultiplicationTable 4 1