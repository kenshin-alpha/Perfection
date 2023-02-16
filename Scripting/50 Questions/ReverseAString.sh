str="Hello World"
# slicing
# echo ${str:3:5}


strlen=${#str}

for(( i=$strlen-1;i>=0;i--))
do 
revstr=$revstr${str:$i:1}
done

echo $revstr

echo $str | rev

