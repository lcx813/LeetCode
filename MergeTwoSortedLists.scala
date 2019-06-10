/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        var res = new ListNode(0)
        
        if(l1 == null) return l2
        if(l2 == null) return l1
        
        def help_fun(dummy: ListNode, pre: ListNode, l1: ListNode, l2: ListNode): ListNode = {
            if(l1 == null){
                pre.next = l2
                return dummy.next
            }
            if(l2 == null){
                pre.next = l1
                return dummy.next
            }  
            
            if(l1.x < l2.x){
                pre.next = l1
                help_fun(dummy, l1, l1.next, l2)
            }else{
                pre.next = l2
                help_fun(dummy, l2, l1, l2.next)
            }
        }
        
        val dummy = new ListNode(0)
        res = help_fun(dummy, dummy, l1, l2)
        
        return res
    }
}