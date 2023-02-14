#!/bin/bash

sumOfNaturalNumbers() {
    sum=${2:0}
    n=$1
    if [ $n -eq 0 ];
    then
        echo $sum
        return 
    fi
    sumOfNaturalNumbers $((n-1)) $(( sum + n ));
}

echo $( sumOfNaturalNumbers $1 )

# add_recursively () {
#     local n=$1
#     local sum=${2:-0}
#     if (( n == 0 )); then
#         echo $sum
#         return
#     fi
#     $FUNCNAME $((n - 1)) $((sum + n))
# }

# # input validation
# if ! [[ $1 =~ ^[[:digit:]]+$ ]]; then
#     echo "I need a non-negative integer, not $1"
#     exit 1
# fi

# echo $(add_recursively $1)