isVowel() {
    
    grep -q [aeiou] <<< $1 && echo true || echo false;

}

isVowel "Hdsd"
isVowel "abcd"

# -q to run quietly.. supressess output