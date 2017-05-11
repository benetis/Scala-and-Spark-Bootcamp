def isEven(num:Int):Boolean = {
    if (num % 2 == 0)
        return true
    else false
}

def isEven2(num:Int):Boolean = {
    return if (num % 2 == 0) true else false;
}

//isEven2(2)
//isEven2(3)


// ==============
def isListEven(list:List[Int]):Boolean = {
    for(num <- list){
        if(isEven2(num))
            return true
    }
    return false
}

val even_List = List(1,1,1,1,1,1)
val odd_List = List(1,1,1,2)

//isListEven(even_List)
//isListEven(odd_List)


// =========

def luckySum(list:List[Int]):Int = {
    var result = 0

    for(num <- list){
        if( num == 7){
            result += 14
        }else {
            result += num
        }
    }

    return result
}

val lucky_List = List(1,2,3,4,5,5,6,7,8,9)

//luckySum(lucky_List);


// ========
def balanceList(list:List[Int]):Boolean = {
    if(isEven(list.sum)){
        val middle = (list.sum / 2)
        var id = 0
        var tmp = list(id)

        while(tmp <= middle){
            if(tmp == middle){
                return true
            }else {
                id += 1
                tmp += list(id)
            }
        }
        return false

    }else {
        return false
    }
}

// list (1,5,3,3) would return true
// example (7,3,4)
val list1 = List(1,5,3,3)
val list2 = List(7,3,4)
val list3 = List(7,3,3)
val list4 = List(1,8,3,3)

//balanceList(list1)
//balanceList(list2)
//balanceList(list3)
//balanceList(list4)


// ========
def palindromeCheck(st: String): Boolean = {
  return (st == st.reverse)
}
palindromeCheck("abccba")
palindromeCheck("abc")
