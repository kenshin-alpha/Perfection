a=5
b=2
b=$((b+a))
a=$((b-a))
b=$((b-a))
echo $a
echo $b