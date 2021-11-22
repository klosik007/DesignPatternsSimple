import kotlin.collections.HashMap
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max



fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashTable: HashMap<Int, Int> = HashMap()
    var foundedPair = false
    val pair = IntArray(2)
    for (i in nums.indices - 1){
        hashTable[nums[i]] = i
    }

    var i = 0
    while((i < nums.size) && (!foundedPair)){
        val subtractVal = target - nums[i]
        if(subtractVal in hashTable){
            if (i != hashTable[subtractVal]){
                pair[0] = i
                pair[1] = hashTable[subtractVal]!!
                foundedPair = true
            }
        }
        i+=1
    }

    return pair
}
class ListNode(var `val`: Int) {
         var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val nodeHead = ListNode(0)
    val l3 = nodeHead;
    var carry = 0

    while(l1 != null || l2 != null){
        val l1Value = l1?.`val` ?: 0
        val l2Value = l2?.`val` ?: 0

        val currentSum = l1Value + l2Value + carry
        carry = currentSum / 10
        val lastDigit = currentSum % 10
        
    }

 return l3.next
}

fun countNodes(head: ListNode?): Int {
    var result = 1
    var current: ListNode? = head

    while(current?.next != null){
        current = current.next
        result+=1
    }

    return result
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val map: MutableMap<Int, Int> = HashMap()
    val mergedArray = arrayListOf<Int>()
    for (i in nums1.indices) {
        map[nums1[i]] = i
    }

    for (i in nums2.indices) {
        map[nums2[i]] = i
    }

    for (entry in map.entries) {
        mergedArray.add(entry.key)
    }

    println(mergedArray)
    mergedArray.sort()
    return if (mergedArray.size % 2 == 0) {
        val middleIndex = ceil(mergedArray.size / 2.0).toInt()
        (mergedArray[middleIndex - 1] + mergedArray[middleIndex]) / 2.0
    } else {
        val middleIndex = ceil(mergedArray.size / 2.0).toInt() - 1
        mergedArray[middleIndex]/1.0
    }
}

class Node(val data: Int){
    var left: Node? = null
    var right: Node? = null
}


fun findSumNodes(root: Node?): Int{
//    return if (root == null)
//        0
//    else
//        root.data + findSumNodes(root.left) + findSumNodes(root.right)
    var result = 0
    var current = root
    while(root?.left != null || root?.right != null){
        if(root.left != null) current = root.left
        if(root.right != null) current = root.right
        
        result += current!!.data
    }
    return result
}

fun LCS(text1: String, text2: String): Int{
    val text1Length = text1.length
    val text2Length = text2.length
    var result = 0
    val array = Array(text1Length) { IntArray(text2Length) }

    if ((text1.isEmpty()) || (text2.isEmpty())) return 0
    else if(text1[text1Length - 1] == text2[text2Length - 1]){
        result =  1 + LCS(text1.substring(0, text1Length - 1), text2.substring(0, text2Length - 1))
    }else if((text1[text1Length-1] != text2[text2Length-1])){
        val tmp1 = LCS(text1.substring(0, text1Length - 1), text2)
        val tmp2 = LCS(text1, text2.substring(0, text2Length - 1))
        result = max(tmp1, tmp2)
    }

    array[text1Length][text2Length] = result
    return result
}

fun ipAdresses(str: String): List<String>{


    return listOf()
}

fun main(args: Array<String>) {
//    val array: IntArray = intArrayOf(1,2,2,7)
//    print(twoSum(array, 4).toUIntArray())

//    val head = ListNode(4)
//    val nodeB = ListNode(2)
//    val nodeC = ListNode(3)
//    val nodeD = ListNode(10)
//
//    head.next = nodeB
//    nodeB.next = nodeC
//    nodeC.next = nodeD

    //print(countNodes(head))

//    println(findMedianSortedArrays(intArrayOf(0,0,0,0,0), intArrayOf(-1,0,0,0,0,0,1)))

    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)
    val node5 = Node(5)
    val node6 = Node(6)

    node2.left = node3
    node2.right = node4
    node3.left = node5
    node3.right = node6

    //println(findSumNodes(node2))
    print(LCS("batd", "abacd"))
}
//    exampel.priceFrom = 5;
//    exampel.priceTo = 10;
//    val dataList = mutableListOf(50, 2, 60, 150)
//    dataList.filter {
//        it in 0..60
//    }
//
//    dataList.remove(50)
//    println("$dataList")