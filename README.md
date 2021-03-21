# 자바의 정석 스터디
> ### 5장 배열
1.1 **배열이란**     
* "배열은 **같은 타입**의 여러 변수를 하나의 묶음으로 다루는 것"

1.2 **배열의 선언과 생성**
```
int[] score = new int[5];  //5개의 int 값을 지정할 수 있는 배열을 생성
```

1.3 **배열의 길이와 인덱스**   
* **인덱스(index)** 는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용   
"인덱스의 범위는 **0부터** '배열의 길이 - 1'까지"

* **배열의 길이**  
배열의 길이는 배열의 요소의 갯수, 즉 값을 저장할 수 있는 공간의 개수   
배열의 길이가 **0**일 수도 있다.

* **배열이름.length**   
배열의 길이는 한번 생성하는 변경할 수 없기 때문에 상수다.   
즉, 값을 읽을 수만 있고 변경은 불강능하다.

1.4 **배열의 초기화**   
배열을 출력 시 for문도 가능하나 Arrays.toString() 메서드를 활용해서 출력이 가능하다.
만약 바로 배열을 출력하면 배열의 주소값이 찍히게 되고, 예외적으로 char타입을 출력하면 각 요소가 구분자
없이 그래도 출력된다.    

1.5 **배열의 복사**   
* for문은 비효율적이기 때문에 System.arraycopy()메서드를 활용하자.
```
System.arraycopy(num, 0 , newNum, 0, num,length);
```
* num[0]에서 newNum[0]으로 num.length개의 데이터를 복사

1.6 배열의 활용







 