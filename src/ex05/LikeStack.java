package ex05;

import ex04.LikeList;

public class LikeStack {

    private LikeList list;

    // 추가
    public void push(int value) {
        list.insert(0, value);
    }
    // 삭제
    public void pop() {
        list.delete(0);
    }
    // 스택의 마지막 값 조회
    public int peek() {
        return list.get(0);
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        if (list.getSize() == 0)
            return true;
        return false;
    }
}