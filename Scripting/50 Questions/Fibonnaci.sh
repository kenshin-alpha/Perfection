fibonnaci() {
    a=0;
    b=1;
    num=$1
    while((num > 0))
    do
        c=$((a+b))
        echo $c;
        a=$b;
        b=$c;
        num=$((num-1));
    done
}

fibonnaci 10