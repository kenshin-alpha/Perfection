isPrime() {
    num=$1;
    for((i=2;i<num;i++))
    do 
    
        if((num%i==0))
        then
            echo "Not Prime";
            return ;
        fi
    done
    echo "Prime";
    return;
}

isPrime 7
isPrime 70