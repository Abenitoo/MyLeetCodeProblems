package medium.add_two_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import medium.add_two_numbers.AddTwoNumbers.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersTest {

    @Test
    void test1(){
        ListNode l1_3 = new ListNode(3, null);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1 = new ListNode(2, l1_2);

        ListNode l2_3 = new ListNode(4, null);
        ListNode l2_2 = new ListNode(6, l2_3);
        ListNode l2 = new ListNode(5, l2_2);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        List<Integer> resultInList = new ArrayList<>();
        while(result != null){
            resultInList.add(result.val);
            result = result.next;
        }
        List<Integer> expectedResult = List.of(7,0,8);
        Assertions.assertEquals(expectedResult, resultInList);
    }

    @Test
    void test2(){
        ListNode l1 = new ListNode(0, null);
        ListNode l2 = new ListNode(0, null);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        List<Integer> resultInList = new ArrayList<>();
        while(result != null){
            resultInList.add(result.val);
            result = result.next;
        }
        List<Integer> expectedResult = List.of(0);
        Assertions.assertEquals(expectedResult, resultInList);

    }

    @Test
    void test3(){
        ListNode l1_6 = new ListNode(9, null);
        ListNode l1_5 = new ListNode(9, l1_6);
        ListNode l1_4 = new ListNode(9, l1_5);
        ListNode l1_3 = new ListNode(9, l1_4);
        ListNode l1_2 = new ListNode(9, l1_3);
        ListNode l1_1 = new ListNode(9, l1_2);
        ListNode l1 = new ListNode(9, l1_1);

        ListNode l2_3 = new ListNode(9, null);
        ListNode l2_2 = new ListNode(9, l2_3);
        ListNode l2_1 = new ListNode(9, l2_2);
        ListNode l2 = new ListNode(9, l2_1);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        List<Integer> resultInList = new ArrayList<>();
        while(result != null){
            resultInList.add(result.val);
            result = result.next;
        }
        List<Integer> expectedResult = List.of(8,9,9,9,0,0,0,1);
        Assertions.assertEquals(expectedResult, resultInList);

    }
}
