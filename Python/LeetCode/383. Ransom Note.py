def canConstruct( ransomNote: str, magazine: str) -> bool:
        if(len(ransomNote) == 0):
            return True

        if (ransomNote[0] in magazine):
            v = magazine.index(ransomNote[0])
            magazine = magazine[:v] + magazine[v+1:]
            ransomNote = ransomNote[1:]
            if(canConstruct(ransomNote,magazine) == True):
                return True

        return False
print(canConstruct("aa","aab"))